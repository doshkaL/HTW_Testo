package com.CRUD.CRUD_Test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootApplication
public class CrudTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudTestApplication.class, args);
	}

	/**
	 * @Bean
	 * ist eine Annotation in der Spring Framework Bibliothek,
	 * die verwendet wird, um eine Methode als Factory-Methode
	 * für das Erstellen und Konfigurieren eines Objekts zu markieren.
	 *
	 */

	@Bean
	/**
	 * LettuceConnectionFactory ist eine Klasse in der Spring Data Redis-Bibliothek
	 * Sie stellt eine Verbindung zu einer Redis-Datenbank mit der Lettuce-Clientbibliothek her
	 */
	/**
	 * jedisConnectionFactory() ist eine Factory-Methode,
	 * die eine Instanz von LettuceConnectionFactory erstellt und zurückgibt.
	 */
	/**
	 * Die Verwendung von LettuceConnectionFactory ermöglicht Entwicklern,
	 * mit Redis-Datenbanken zu interagieren und die verschiedenen Datenstrukturen,
	 * die Redis bietet, zu nutzen.
	 */
	LettuceConnectionFactory jedisConnectionFactory(){
		return new LettuceConnectionFactory();
}
@Bean
	RedisTemplate redisTemplate(){
		RedisTemplate redisTemplate = new RedisTemplate();
		redisTemplate.setConnectionFactory(jedisConnectionFactory());
		return  redisTemplate;
}
}
