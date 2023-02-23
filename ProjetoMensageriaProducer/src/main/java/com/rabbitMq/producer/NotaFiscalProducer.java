package com.rabbitMq.producer;

import com.rabbitMq.domain.NotaFiscalRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

import java.io.Serializable;

import static com.rabbitMq.config.NotaFiscalExchangeConfig.EXCHANGE_NAME;
import static com.rabbitMq.config.NotaFiscalRabbitConfig.ROUTING_KEY_NAME;

@Component
@RequiredArgsConstructor
public class NotaFiscalProducer {
    private final RabbitTemplate rabbitTemplate;

    public void sendMessage(NotaFiscalRequest notaFiscalRequest){
        rabbitTemplate.convertAndSend(EXCHANGE_NAME,ROUTING_KEY_NAME,notaFiscalRequest);
    }
}
