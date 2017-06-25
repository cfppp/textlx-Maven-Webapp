package usertest;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import com.alibaba.fastjson.JSON;
import com.ht.bean.User;
import com.ht.service.UserService;

@Controller
public class UserTest {

	private static Logger logger = Logger.getLogger(UserTest.class);
	// privateApplicationContext ac = null;
	@Resource
	private UserService userService = null;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        UserService userservice=(UserService) context.getBean("userService");
        User user= userservice.getUserById(1);
        logger.info(user.getUsername()+"======================");
	}

}
