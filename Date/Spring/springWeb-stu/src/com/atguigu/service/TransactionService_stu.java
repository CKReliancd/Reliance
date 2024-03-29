package com.atguigu.service;

import java.io.FileNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.dao.BookDao_stu;
import com.atguigu.dao.UserDao_stu;

@Service
public class TransactionService_stu {

	@Autowired
	private UserDao_stu userDao_stu;

	@Autowired
	private BookDao_stu bookDao_stu;
	
	@Autowired
	private BookService_stu bookService_stu;
	
	@Autowired
	private UserService_stu userService_stu;
	
	public void multiUpdate(){
		
		bookService_stu.updateBook();
		userService_stu.updateUser();
	}
	
	public void updateTwoTable() throws FileNotFoundException {
		userDao_stu.updateUser();
//		int i = 12 / 0;
		bookDao_stu.updateBook();
	}
	
	
}
