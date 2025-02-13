package io.github.lucasfreitasrocha.kafka_spring.dataprovider.kafka;

import io.github.lucasfreitasrocha.kafka_spring.core.domain.EventDomain;
import io.github.lucasfreitasrocha.kafka_spring.core.gateway.EventGateway;
import io.github.lucasfreitasrocha.kafka_spring.dataprovider.kafka.message.EventPayload;
import io.github.lucasfreitasrocha.kafka_spring.dataprovider.kafka.message.NotificationMessage;
import lombok.AllArgsConstructor;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class KafkaService  implements EventGateway {

    private final StreamBridge streamBridge;
    @Override
    public void sendNotification(EventDomain eventDomain) {
        NotificationMessage message = NotificationMessage.builder()
                .eventDomain(eventDomain)
                .build();
        
    }
}
