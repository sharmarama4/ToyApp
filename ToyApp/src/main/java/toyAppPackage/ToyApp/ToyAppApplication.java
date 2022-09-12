package toyAppPackage.ToyApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication


public class ToyAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ToyAppApplication.class, args);
	}

}
