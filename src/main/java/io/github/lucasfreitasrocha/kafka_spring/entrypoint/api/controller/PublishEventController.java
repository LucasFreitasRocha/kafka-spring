package io.github.lucasfreitasrocha.kafka_spring.entrypoint.api.controller;

import io.github.lucasfreitasrocha.kafka_spring.entrypoint.api.dto.EventPublishDto;
import io.github.lucasfreitasrocha.kafka_spring.entrypoint.api.facade.PublishEventFacade;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class PublishEventController implements PublishEventApi{
    private final PublishEventFacade publishEventFacade;
    @Override
    public ResponseEntity<Void> publish(EventPublishDto dto) {
        publishEventFacade.send(dto);
        return ResponseEntity.ok().build();
    }
}
