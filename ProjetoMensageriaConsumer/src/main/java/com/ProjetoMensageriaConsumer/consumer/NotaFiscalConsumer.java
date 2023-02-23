package com.ProjetoMensageriaConsumer.consumer;

import com.ProjetoMensageriaConsumer.domain.NotaFiscalRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class NotaFiscalConsumer {
    public static final String QUEUE_NAME = "pdev.nf.queue";

    @RabbitListener(queues = QUEUE_NAME)
    public void listener(Message message, NotaFiscalRequest notaFiscalRequest){
        log.info("Mensagem recebida: {}",notaFiscalRequest);
    }
}
