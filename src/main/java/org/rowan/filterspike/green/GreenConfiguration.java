package org.rowan.filterspike.green;

import org.springframework.boot.context.embedded.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class GreenConfiguration {

    @Bean(name = "1")
    public FilterRegistrationBean filterRegistrationBean() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new GreenFilter());
//        filterRegistrationBean.setName("green");
        filterRegistrationBean.setOrder(1);
        return filterRegistrationBean;
    }
}
