package org.rowan.filterspike.blue;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Order
@Component
class BlueFilter extends OncePerRequestFilter {
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        String name = "X-Color-Blue";
        if (response.getHeader(name) != null && response.getHeader(name).equals("green")) {
            response.setHeader(name, "teal");
        } else {
            response.addHeader(name, "blue");
        }
        filterChain.doFilter(request, response);
    }
}
