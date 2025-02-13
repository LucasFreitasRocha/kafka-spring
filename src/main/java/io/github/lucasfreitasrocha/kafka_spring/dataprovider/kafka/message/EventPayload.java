package io.github.lucasfreitasrocha.kafka_spring.dataprovider.kafka.message;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import static org.springframework.kafka.support.KafkaHeaders.KEY;

public interface EventPayload {
    String bindingName();
    default Object data() {return this;}
    String partitionKey();
    default Map<String, Object> headers(){
        final Map<String, Object> headers = new HashMap<String, Object>();
        headers.put("transactionId", UUID.randomUUID().toString().getBytes(StandardCharsets.UTF_8));
        headers.put(KEY, partitionKey().getBytes(StandardCharsets.UTF_8));
        return headers;
    }
}
