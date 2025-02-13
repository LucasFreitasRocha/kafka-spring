package io.github.lucasfreitasrocha.kafka_spring.core.gateway;

import io.github.lucasfreitasrocha.kafka_spring.core.domain.EventDomain;

public interface EventGateway {
    void sendNotification(EventDomain eventDomain);
}
