package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@SpringBootApplication
@EnableSwagger2
public class TopicApiDatabaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(TopicApiDatabaseApplication.class, args);
    }

    @Bean
    public Docket swaggerConfiguration(){
        return new Docket(DocumentationType.SWAGGER_2).select().paths(PathSelectors.ant("/api/*")).apis(RequestHandlerSelectors.basePackage("com.example.demo")).build().apiInfo(apiDetails());
    }

    private ApiInfo apiDetails(){
        return new ApiInfo("Product API","Sample API","1.0","Free to use",new springfox.documentation.service.Contact("Sneha Dhapola","http://google.com","dhapolasneha3699@gmail.com"),"API License","http://www.apache.org/licenses/LICENSE-2.0", Collections.emptyList());
    }
}
