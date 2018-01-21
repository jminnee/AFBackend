package com.actionfigures;

import com.actionfigures.model.User;
import com.actionfigures.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AFApplication {
	
	private static final Logger logger = LoggerFactory.getLogger(AFApplication.class);


	public static void main(String[] args) {
		SpringApplication.run(AFApplication.class, args);
	}

    @Bean
    public CommandLineRunner setup(UserRepository userRepository) {
        return (args) -> {
            userRepository.save(new User("Jeroen", "", "Minnee", true));
            userRepository.save(new User("Marco", "van", "Bon", true));
            userRepository.save(new User("Jim ", "", "Morrison", false));
            userRepository.save(new User("David", "", "Gilmour", false));
            logger.info("The sample data has been generated");
        };
    }

}
