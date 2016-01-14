package org.rowan.filterspike.blue;

import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

class BlueFilter extends OncePerRequestFilter {
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        if (response.getHeader("X-Color") != null && response.getHeader("X-Color").equals("green")) {
            response.setHeader("X-Color", "teal");
        } else {
            response.addHeader("X-Color", "blue");
        }
        filterChain.doFilter(request, response);
    }
}
