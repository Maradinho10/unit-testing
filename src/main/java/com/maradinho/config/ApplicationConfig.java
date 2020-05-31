package com.maradinho.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EntityScan("com.maradinho.model.entities")
@EnableJpaRepositories("com.maradinho.model.daos")
public class ApplicationConfig {

}
