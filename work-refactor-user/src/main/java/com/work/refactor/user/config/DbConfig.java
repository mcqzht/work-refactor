package com.work.refactor.user.config;

import com.alibaba.druid.spring.boot3.autoconfigure.DruidDataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * Dbconfig
 *
 * @author zhoug
 * @date 2024/12/18 18:31
 */



@Configuration
public class DbConfig {

    @Bean
    @ConfigurationProperties("spring.datasource.druid.user")
    public DataSource druidDataSource() {
        return DruidDataSourceBuilder.create().build();
    }

}
