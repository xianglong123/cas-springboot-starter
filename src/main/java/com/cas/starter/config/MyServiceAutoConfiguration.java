package com.cas.starter.config;

import com.cas.autoconfiguration.MyService;
import com.cas.autoconfiguration.MyServiceProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author xiang_long
 * @version 1.0
 * @date 2021/7/26 2:53 下午
 * @desc
 */
@Configuration
@EnableConfigurationProperties(MyServiceProperties.class)
@ConditionalOnClass(MyService.class)
@ConditionalOnProperty(prefix = "cas.service", value = "enabled", matchIfMissing = true)
public class MyServiceAutoConfiguration {

    private MyServiceProperties.MyProperties properties;

    public MyServiceAutoConfiguration(MyServiceProperties properties) {
        this.properties = properties.getMyProperties();
    }

    @Bean
    @ConditionalOnMissingBean(MyService.class)
    public MyService myService() {
        MyService myService = new MyService();
        myService.setName(properties.getAuthor());
        myService.setAge(properties.getAge());
        return myService;
    }

}
