package org.app.consumer;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;
import org.app.model.Polis;
import org.app.service.PolisService;
import org.eclipse.microprofile.reactive.messaging.Incoming;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

@ApplicationScoped
public class PolisConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(PolisConsumer.class);
    private final PolisService polisService;

    public PolisConsumer(PolisService polisService){
        this.polisService = polisService;
    }

    @Incoming("polis-in")
    @Transactional
    public void consume(String message){
        LOGGER.info("###### Received message polis : {} ######",message);
        String[] parseData = message.split("\\|");

        if (parseData.length == 4){
            String polisNumber = parseData[0];
            String polisHolder = parseData[1];
            String product = parseData[2];
            BigDecimal premiumAmount = new BigDecimal(parseData[3]);

            Polis polis = new Polis();
            polis.setPolisNumber(polisNumber);
            polis.setPolisHolder(polisHolder);
            polis.setProduct(product);
            polis.setPremium(premiumAmount);
            polisService.savePolis(polis);
        }
    }
}
