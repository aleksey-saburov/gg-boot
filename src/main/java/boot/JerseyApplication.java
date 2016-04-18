package boot;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@Configuration
@ImportResource("/ignite-config.xml")
public class JerseyApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(JerseyApplication.class);
	}

	public static void main(String[] args) {
		new JerseyApplication().configure(new SpringApplicationBuilder(JerseyApplication.class)).run(args);
	}
}
