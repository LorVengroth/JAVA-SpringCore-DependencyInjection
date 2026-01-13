package learning.dependency.injection.DI.feildInjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(DiApplication.class, args);

		Dev obj = context.getBean(Dev.class);


		// must to add @Component on the Dev class
		// if not it wil not be work

		obj.build();
		obj.DateILearn();



	}

}
