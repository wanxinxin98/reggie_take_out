package com.wan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wan.entity.AddressBook;
import com.wan.mapper.AddressBookMapper;
import com.wan.service.AddressBookService;
import org.springframework.stereotype.Service;

@Service
public class AddressBookServiceImpl extends ServiceImpl<AddressBookMapper, AddressBook> implements AddressBookService {

}
