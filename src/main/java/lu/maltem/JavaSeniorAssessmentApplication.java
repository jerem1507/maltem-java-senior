package lu.maltem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "lu.maltem")
public class JavaSeniorAssessmentApplication extends SpringBootServletInitializer {

    // This is a Logger, this is another way (and better way) to write logs into console and/or files.
    private static final Logger LOGGER = LoggerFactory.getLogger(JavaSeniorAssessmentApplication.class);


    public static void main(String[] args) {

        ConfigurableApplicationContext context = new SpringApplicationBuilder(JavaSeniorAssessmentApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);

        LOGGER.info("This is the application");

    }

}
