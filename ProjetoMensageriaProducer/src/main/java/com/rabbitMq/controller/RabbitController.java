package com.rabbitMq.controller;

import com.rabbitMq.domain.NotaFiscalRequest;
import com.rabbitMq.service.NotaFiscalService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/rabbit")
public class RabbitController {

    private final NotaFiscalService notaFiscalService;

    @PostMapping
    public void sendMessage(@RequestBody NotaFiscalRequest notaFiscalRequest){
        log.info("Nota fiscal: {} ",notaFiscalRequest);
        notaFiscalService.sendMessage(notaFiscalRequest);
    }
}
