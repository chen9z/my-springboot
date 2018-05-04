package com.yclooper.myspringboot.core.mybatis;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import javax.sql.DataSource;

/**
 *
 * Created by chen on 2018/5/4.
 */
@Configuration
public class MybatisConfig {
    @Bean
    public SqlSessionFactory sqlSessionFactoryBean(DataSource dataSource) throws  Exception{
        SqlSessionFactoryBean factory = new SqlSessionFactoryBean();
        factory.setDataSource(dataSource);
        factory.setTypeAliasesPackage("com.yclooper.myspringboot.entity");
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        factory.setMapperLocations(resolver.getResources("classpath:mapper/*.xml"));
        return factory.getObject();
    }

    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer scannerConfigurer=new MapperScannerConfigurer();
        scannerConfigurer.setBeanName("sqlSessionFactoryBean");
        scannerConfigurer.setBasePackage("com.yclooper.myspringboot.dao");
        return scannerConfigurer;
    }

}
