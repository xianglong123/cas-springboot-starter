package com.cas.autoconfiguration;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author xiang_long
 * @version 1.0
 * @date 2021/7/26 2:48 下午
 * @desc 获取配置
 */
@ConfigurationProperties(prefix = "cas.service")
public class MyServiceProperties {
    private MyServiceProperties.MyProperties myProperties = new MyServiceProperties.MyProperties();

    public MyProperties getMyProperties() {
        return myProperties;
    }

    public void setMyProperties(MyProperties myProperties) {
        this.myProperties = myProperties;
    }


    public static class MyProperties {
        public static final String DEFAULT_NAME;
        private String author;
        private String age;

        static {
            DEFAULT_NAME = "xianglong";
        }

        public String getAuthor() {
            return "".equals(author) || author == null ? DEFAULT_NAME : author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }
    }





}
