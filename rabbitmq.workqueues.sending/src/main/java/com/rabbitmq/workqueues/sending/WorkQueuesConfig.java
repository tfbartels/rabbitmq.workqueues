package com.rabbitmq.workqueues.sending;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile({"work-queues"})
@Configuration
public class WorkQueuesConfig {

    @Bean
    public Queue work() {
        return new Queue("work");
    }

    @Profile("sender")
    @Bean
    public WorkQueuesSender sender() {
        return new WorkQueuesSender();
    }
}