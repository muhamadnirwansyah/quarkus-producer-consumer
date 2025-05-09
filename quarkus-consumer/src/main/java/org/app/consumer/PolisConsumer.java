package org.app.consumer;

import jakarta.enterprise.context.ApplicationScoped;
import org.app.model.Polis;
import org.eclipse.microprofile.reactive.messaging.Incoming;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ApplicationScoped
public class PolisConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(PolisConsumer.class);

    @Incoming("polis-in")
    public void consume(String message){
        LOGGER.info("###### Received message polis : {} ######",message);
        String[] datas = message.split("|");
        if (datas.length > 0){
            String polisNumber = datas[0];
            String polisHolder = datas[1];
            String product = datas[2];

            Polis polis = new Polis();
            polis.setPolisNumber(polisNumber);
            polis.setPolisHolder(polisHolder);
            polis.setProduct(product);

            LOGGER.info("result final : {}", polis);
        }
    }
}
