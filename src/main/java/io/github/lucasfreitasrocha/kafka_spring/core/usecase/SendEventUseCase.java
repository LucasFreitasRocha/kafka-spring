package io.github.lucasfreitasrocha.kafka_spring.core.usecase;

import io.github.lucasfreitasrocha.kafka_spring.core.domain.EventDomain;
import io.github.lucasfreitasrocha.kafka_spring.core.gateway.EventGateway;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class SendEventUseCase {
    private final EventGateway eventGateway;
    public void send(EventDomain domain) {
        eventGateway.sendNotification(domain);
    }
}
