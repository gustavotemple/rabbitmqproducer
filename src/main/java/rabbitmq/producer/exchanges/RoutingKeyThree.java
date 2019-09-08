package rabbitmq.producer.exchanges;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public abstract class RoutingKeyThree {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Value("${destinations.queues.q3.exchange}")
    private String exchange;

    @Value("${destinations.queues.q3.routing-key}")
    private String routingKey;

    public void send(String message) {
        rabbitTemplate.convertAndSend(exchange, routingKey, message);
    }

}
