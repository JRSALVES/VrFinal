package com.jrs.pdv.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

public class DataBaseConfig {
    @Bean
    public DataSource dataSource() {
        DataSourceBuilder<?> dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName("org.postgresql.Driver");
        dataSourceBuilder.url("jdbc:postgresql://grudgingly-enlivened-albacore.data-1.use1.tembo.io:5432/jrs_locadora");
        dataSourceBuilder.username("postgres");
        dataSourceBuilder.password("WiGOd14WQgNMMyaZ");

        return dataSourceBuilder.build();
    }
}
