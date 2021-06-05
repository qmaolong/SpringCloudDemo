package com.springcloud.zuul.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;

import java.util.List;
import java.util.stream.Collectors;

@Component
@Primary
public class SwaggerConfiguration implements SwaggerResourcesProvider {
    @Autowired
    private DiscoveryClient discoveryClient;
    @Value("${spring.application.name}")
    private String applicationName;

    @Override
    public List<SwaggerResource> get() {
        return discoveryClient.getServices().stream()
                .filter(sname -> !sname.equals(applicationName))
                .map(sname -> swaggerResource(sname, "/" + sname + "/v2/api-docs", "2.0")).collect(Collectors.toList());
    }

    private SwaggerResource swaggerResource(String name, String location, String version){
        SwaggerResource resource = new SwaggerResource();
        resource.setName(name);
        resource.setLocation(location);
        resource.setSwaggerVersion(version);
        return resource;
    }
}
