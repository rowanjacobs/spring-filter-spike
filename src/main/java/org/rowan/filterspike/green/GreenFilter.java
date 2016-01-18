package org.rowan.filterspike.green;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@Component
class GreenFilter extends OncePerRequestFilter {
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        String name = "X-Color-Green";
        if (response.getHeader(name) != null && response.getHeader(name).equals("blue")) {
            response.setHeader(name, "turquoise");
        } else {
            response.addHeader(name, "green");
        }
        filterChain.doFilter(request, response);
    }
}
