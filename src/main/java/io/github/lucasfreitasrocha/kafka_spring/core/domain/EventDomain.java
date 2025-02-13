package io.github.lucasfreitasrocha.kafka_spring.core.domain;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Builder
public class EventDomain {
    private String title;
    private String message;
    private LocalDateTime createdAt;
}
