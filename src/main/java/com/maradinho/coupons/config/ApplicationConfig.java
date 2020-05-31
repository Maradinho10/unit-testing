package com.maradinho.coupons.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EntityScan("com.maradinho.coupons.model.entities")
@EnableJpaRepositories("com.maradinho.coupons.model.daos")
public class ApplicationConfig {

}
