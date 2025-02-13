package io.github.lucasfreitasrocha.kafka_spring.dataprovider.kafka.message;

import io.github.lucasfreitasrocha.kafka_spring.core.domain.EventDomain;
import lombok.AllArgsConstructor;
import lombok.Builder;

import java.util.UUID;

@Builder
@AllArgsConstructor
public class NotificationMessage implements EventPayload{
    private static final String BINDING_NAME = "notification-event-out-0";
    private final EventDomain eventDomain;
    @Override
    public String bindingName() {
        return BINDING_NAME;
    }

    @Override
    public String partitionKey() {
        return this.eventDomain.getTitle() + UUID.randomUUID().toString();
    }
}
