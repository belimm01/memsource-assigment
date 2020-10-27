package com.memsource.assignments.config;

import com.memsource.assignments.project.Project;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

@Configuration
public class RestConfigurer implements RepositoryRestConfigurer {

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.getCorsRegistry()
                .addMapping("/**")
                .allowedOrigins("*")
                .allowedMethods("OPTIONS", "HEAD", "GET", "PUT", "POST", "DELETE", "PATCH")
                .allowedHeaders("*");
        config.exposeIdsFor(Project.class);
    }
}
