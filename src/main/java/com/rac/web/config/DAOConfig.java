package com.rac.web.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableJpaRepositories(basePackages = { "com.rac.web.dao" })
@EnableAutoConfiguration
@ComponentScan(basePackages = { "com.rac.web" })
@EntityScan(basePackages = { "com.rac.web.domain" })
@EnableTransactionManagement
public class DAOConfig {

	// la source de données MySQL
	@Bean
	public DataSource dataSource() {
		final BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/portal");
		dataSource.setUsername("portal");
		dataSource.setPassword("portal");
		return dataSource;
	}

	// le provider JPA - n'est pas nécessaire si on est satisfait des valeurs
	// par
	// défaut utilisées par Spring boot
	// ici on le définit pour activer / désactiver les logs SQL
	@Bean
	public JpaVendorAdapter jpaVendorAdapter() {
		final HibernateJpaVendorAdapter hibernateJpaVendorAdapter = new HibernateJpaVendorAdapter();
		hibernateJpaVendorAdapter.setShowSql(true);
		hibernateJpaVendorAdapter.setGenerateDdl(false);
		hibernateJpaVendorAdapter.setDatabase(Database.MYSQL);
		return hibernateJpaVendorAdapter;
	}

	// l'EntityManageFactory et le TransactionManager sont définis avec des
	// valeurs par défaut par Spring boot

}
