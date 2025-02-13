package io.github.lucasfreitasrocha.kafka_spring.entrypoint.api.facade;

import io.github.lucasfreitasrocha.kafka_spring.core.domain.EventDomain;
import io.github.lucasfreitasrocha.kafka_spring.core.usecase.SendEventUseCase;
import io.github.lucasfreitasrocha.kafka_spring.entrypoint.api.dto.EventPublishDto;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class PublishEventFacade {
    private final SendEventUseCase sendEventUseCase;


    public void send(EventPublishDto dto) {
        sendEventUseCase.send(EventDomain.builder()
                        .title(dto.title())
                        .message(dto.message())
                        .createdAt(LocalDateTime.now())
                .build());
    }
}
