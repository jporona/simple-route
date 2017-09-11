import org.apache.camel.RoutesBuilder;
import org.apache.camel.spring.SpringCamelContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class Application extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(
			SpringApplicationBuilder application) {
		return application.sources(Application.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public SpringCamelContext camelContext(
			org.springframework.context.ApplicationContext ctx) throws Exception {
		SpringCamelContext camelCtx = new SpringCamelContext(ctx);
		camelCtx.addRoutes(routerBuilder());

		return camelCtx;

	}

	@Bean
	public RoutesBuilder routerBuilder() {
		// TODO Auto-generated method stub
		return new SimpleRoute();
	}

}
