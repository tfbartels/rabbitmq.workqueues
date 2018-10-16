package com.rabbitmq.workqueue.receiving;

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

    @Profile("receiver")
    private static class ReceiverConfig {

    	@Bean
        public WorkQueuesReceiver receiver1() {
            return new WorkQueuesReceiver(1);
        }
    	
    	@Bean
        public WorkQueuesReceiver receiver2() {
            return new WorkQueuesReceiver(2);
        }
    	

    	@Bean
        public WorkQueuesReceiver receiver3() {
            return new WorkQueuesReceiver(3);
        }
    	

    }

}