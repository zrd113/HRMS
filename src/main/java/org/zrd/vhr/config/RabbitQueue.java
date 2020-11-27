package org.zrd.vhr.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author zrd
 * @Date 2020/11/24
 */
@Configuration
public class RabbitQueue {

    @Bean
    Queue queue() {
        return new Queue("zrd.mail.welcome");
    }
}
