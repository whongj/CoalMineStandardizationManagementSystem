package com.tsinghua.mem.configuration;

import ch.mfrey.thymeleaf.extras.with.WithDialect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import nz.net.ultraq.thymeleaf.layoutdialect.LayoutDialect;


@Configuration
public class ViewConfiguration {

//    @Bean
//    public LayoutDialect layoutDialect() {
//        return new LayoutDialect();
//    }

    @Bean
    public WithDialect withDialect() {
        return new WithDialect();
    }

}