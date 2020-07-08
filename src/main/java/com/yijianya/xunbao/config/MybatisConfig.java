package com.yijianya.xunbao.config;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * Mybatis配置
 */
@Configuration
@MapperScan(basePackages = "com.yijianya.xunbao.dao.mybatis.mapper", basePackageClasses = Mapper.class)
public class MybatisConfig {
}
