package org.rowan.filterspike.blue;

import org.springframework.boot.context.embedded.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class BlueConfiguration {

    @Bean(name = "2")
    public FilterRegistrationBean filterRegistrationBean() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new BlueFilter());
//        filterRegistrationBean.setName("blue");
        filterRegistrationBean.setOrder(2);
        return filterRegistrationBean;
    }
}
