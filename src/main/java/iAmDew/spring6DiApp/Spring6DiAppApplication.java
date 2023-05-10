package iAmDew.spring6DiApp;

import iAmDew.spring6DiApp.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring6DiAppApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Spring6DiAppApplication.class, args);

		MyController controller = ctx.getBean(MyController.class);

		System.out.println("In a Main Method");

		System.out.println(controller.sayHello());
	}

}
