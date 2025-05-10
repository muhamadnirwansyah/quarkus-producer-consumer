package org.app.producer;

import jakarta.enterprise.context.ApplicationScoped;
import io.smallrye.reactive.messaging.annotations.Emitter;
import io.smallrye.reactive.messaging.annotations.Channel;
import org.app.model.Polis;


@ApplicationScoped
public class PolisProducer {

    @Channel("polis-out")
    Emitter<String> emitter;

    public void sendPolis(Polis polis){
        /** expected format polis|polis_holder **/
        System.out.println("###### Sending message : "+polis.toString());
        String payload = polis.getPolisNumber()+"|"+polis.getPolisHolder()+"|"+polis.getProduct()+"|"+polis.getPremium();
        emitter.send(payload);
    }

}
