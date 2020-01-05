package com.atguigu.dao.Test;

import java.math.BigDecimal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.atguigu.dao.BookDao_stu;
import com.atguigu.pojo.Book;

@ContextConfiguration(locations = "classpath:springmvc_stu.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class BookDaoTest_stu {

	@Autowired
	private BookDao_stu bookDao;

	@Test
	public void testSaveBook() {
		System.out.println(bookDao.saveBook(new Book(null, "xxx",
				"chengmotong", new BigDecimal(199), 1234, 1235)));
	}

	@Test
	public void testDeleteBookById() {
		System.out.println(bookDao.deleteBookById(21));
	}

	@Test
	public void testUpdateBook() {
		System.out.println(bookDao.updateBook(new Book(22, "黑月之潮", "江南",
				new BigDecimal(1952), 2366, 3154)));
	}

	@Test
	public void testQueryBookById(){
		System.out.println(bookDao.queryBookById(22));
	}
	
	@Test
	public void testQueryList(){
		System.out.println( bookDao.queryList().size());
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
