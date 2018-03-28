package com.example.kafka.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by leolius on 2018-3-25.
 */
@Configuration
@PropertySource("classpath:kafka/kafka.properties")
//@ImportResource("classpath:dubbo/*.xml")
public class KafkaConfig {
}
