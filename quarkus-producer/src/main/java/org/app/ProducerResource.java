package org.app;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.app.model.Polis;
import org.app.producer.PolisProducer;

@Path("/api/polis")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ProducerResource {

    @Inject
    PolisProducer polisProducer;

    @POST
    public String createPolis(Polis polis){
        polisProducer.sendPolis(polis);
        return "Polis sent to kafka topic !";
    }
}
