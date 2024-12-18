package com.work.refactor.user.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MybatisConfig
 *
 * @author zhoug
 * @date 2024/12/18 18:40
 */


@MapperScan("com.work.refactor.user.mapper")
@Configuration
public class MybatisConfig {
}
