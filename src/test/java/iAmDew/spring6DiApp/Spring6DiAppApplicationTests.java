package iAmDew.spring6DiApp;

import iAmDew.spring6DiApp.controllers.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class Spring6DiAppApplicationTests {

	@Autowired
	ApplicationContext applicationContext;

	@Autowired
	MyController myController;

	// two different ways to do the same:
	@Test
	void testAutowiredOfController() {
		System.out.println(myController.sayHello());
	}

	@Test
	void testGetControllerFromCtx() {
		MyController myController = applicationContext.getBean(MyController.class);

		System.out.println(myController.sayHello());
	}

	@Test
	void contextLoads() {
	}

}
