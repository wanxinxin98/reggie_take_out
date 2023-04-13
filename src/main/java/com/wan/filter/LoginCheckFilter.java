package com.wan.filter;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wan.common.BaseContext;
import com.wan.common.R;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.springframework.util.AntPathMatcher;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author moxinxin
 * @Date 2023/3/30 23:00
 * @Version 1.0
 */
@WebFilter(filterName = "loginCheckFilter",urlPatterns = "/*")
@Slf4j
public class LoginCheckFilter implements Filter {
    //路径通配符
    public static final AntPathMatcher PATH_MATCHER = new AntPathMatcher();

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest)servletRequest;
        HttpServletResponse response = (HttpServletResponse)servletResponse;
        //1、获取本次请求uri
        String requestURI = request.getRequestURI();
        //2、判断本次请求是否需要处理
        String[] urls = new String[]{
                "/employee/login",
                "/employee/logout",
                "/backend/**",
                "/front/**",
                "/common/**",
                "/user/sendMsg",
                "/user/login",
                "/doc.html",
                "/webjars/**",
                "/swagger-resources",
                "/v2/api-docs"
        };
        boolean check = check(urls, requestURI);
        //3、如果不需要处理，则直接放行
        if(check){
            log.info("本次请求不需要处理，{}",requestURI);
            filterChain.doFilter(request,response);
            return;
        }
        //4-1、判断登录状态，如果已登录则放行
        if (request.getSession().getAttribute("employee") != null){
            Long empId = (Long) request.getSession().getAttribute("employee");
            log.info("用户已登录，用户id：{}",empId);
            BaseContext.setCurrentId(empId);
            filterChain.doFilter(request,response);
            return;
        }
        //4-2、判断登录状态，如果已登录则放行
        if (request.getSession().getAttribute("user") != null){
            Long userId = (Long) request.getSession().getAttribute("user");
            log.info("用户已登录，用户id：{}",userId);
            BaseContext.setCurrentId(userId);
            filterChain.doFilter(request,response);
            return;
        }
        //5、如果未登录，则返回未登录结果，通过输出流的方式向页面响应数据
        response.getWriter().write(JSON.toJSONString(R.error("NOTLOGIN")));
        log.info("未登录，请求路径{}",requestURI);
        return;
    }

    /**
     * 检查本次请求是否需要放行
     * @param requestURI
     * @return
     */
    public boolean check(String[] urls,String requestURI){
        for (String url : urls) {
            boolean match = PATH_MATCHER.match(url, requestURI);
            if (match){
                return true;
            }
        }
        return false;
    }
}
