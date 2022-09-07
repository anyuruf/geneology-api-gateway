package net.anyuruf.geneology.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApplication.class, args);
	}
	
	@Configuration
	public class GraphQlConfig {
		@Bean
		public RuntimeWiringConfigurer runtimeWiringConfigurer() {
			return wiringBuilder -> wiringBuilder.scalar(ExtendedScalars.Date);
		}
	}

}
