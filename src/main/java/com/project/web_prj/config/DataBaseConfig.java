package com.project.web_prj.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

// DB 관련 설정 클래스
@Configuration
@ComponentScan(basePackages = "com.project.web_prj")
public class DataBaseConfig {

    // DB접속 정보 설정 (DataSource설정)
    @Bean
    public DataSource dataSource() {

        HikariConfig config = new HikariConfig();

        config.setUsername("goguma");
        config.setPassword("hsg88490!");
        config.setJdbcUrl("jdbc:mariadb://goguma-dev-database.cbcszxd0fody.ap-northeast-2.rds.amazonaws.com:3306/spring4");
        config.setDriverClassName("org.mariadb.jdbc.Driver");

        return new HikariDataSource(config);
    }
}
