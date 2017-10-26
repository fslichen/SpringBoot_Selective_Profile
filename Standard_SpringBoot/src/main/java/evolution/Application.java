package evolution;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {
	@Value("${name}")
	private String name;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args).close();
	}

	@Override
	public void run(String... arg0) throws Exception {
		System.out.println(name);
	}
}
