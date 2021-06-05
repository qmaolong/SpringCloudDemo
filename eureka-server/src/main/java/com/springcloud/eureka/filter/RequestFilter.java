package com.springcloud.eureka.filter;

import org.apache.catalina.connector.RequestFacade;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.GenericFilterBean;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

/**
 * @author qiumaolong
 * @date 2020/11/4
 */
@Component
public class RequestFilter extends GenericFilterBean {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        String requestURI = ((RequestFacade) request).getRequestURI();
        System.out.println("------------RequestFilter收到请求--------");
        System.out.println(requestURI);
        chain.doFilter(request, response);
    }
}
