package io.github.lucasfreitasrocha.kafka_spring.entrypoint.api.controller;

import io.github.lucasfreitasrocha.kafka_spring.entrypoint.api.dto.EventPublishDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/event")
public interface PublishEventApi {

    @PostMapping
    ResponseEntity<Void> publish(@RequestBody EventPublishDto dto);
}
