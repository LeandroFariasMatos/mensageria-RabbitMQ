package com.rabbitMq.service;



import com.rabbitMq.domain.NotaFiscalRequest;
import com.rabbitMq.producer.NotaFiscalProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NotaFiscalService {
    private final NotaFiscalProducer notaFiscalProducer;

    public void sendMessage(NotaFiscalRequest notaFiscalRequest){
        notaFiscalProducer.sendMessage(notaFiscalRequest);
    }
}
