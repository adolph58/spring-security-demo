package com.example.security;

import com.example.security.entity.Book;
import com.example.security.entity.Role;
import com.example.security.entity.User;
import com.example.security.repository.BookRepository;
import com.example.security.repository.RoleRepository;
import com.example.security.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringSecurityDemoApplicationTests {

	@Autowired
	private UserService userService;

	@Autowired
	private RoleRepository roleRepository;

	@Autowired
	private BookRepository bookRepository;

	@Test
	public void addRole() {
		Role role1 = new Role();
		role1.setName("ROLE_ADMIN");
		role1.setDescription("管理员");
		roleRepository.save(role1);

		Role role2 = new Role();
		role2.setName("ROLE_USER");
		role2.setDescription("普通用户");
		roleRepository.save(role2);

	}

	@Test
	public void addUser() {
		User user1 = new User();
		user1.setUsername("admin");
		user1.setPassword("123456");
		user1.setMobile("18612345678");
		userService.addUser(user1);

		User user2 = new User();
		user2.setUsername("arte");
		user2.setPassword("123456");
		user2.setMobile("18612345679");
		userService.addUser(user2);
	}

	@Test
	public void addBook() {
		Book book1 = new Book();
		book1.setName("Java 编程思想");
		book1.setPublisher("图灵出版社");
		book1.setPrice(99.00);
		bookRepository.save(book1);

		Book book2 = new Book();
		book2.setName("Spring 源码分析");
		book2.setPublisher("图灵出版社");
		book2.setPrice(88.00);
		bookRepository.save(book2);
	}

}
