package org.rowan.filterspike.green;

import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

class GreenFilter extends OncePerRequestFilter {
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        if (response.getHeader("X-Color") != null && response.getHeader("X-Color").equals("blue")) {
            response.setHeader("X-Color", "turquoise");
        } else {
            response.addHeader("X-Color", "green");
        }
        filterChain.doFilter(request, response);
    }
}
