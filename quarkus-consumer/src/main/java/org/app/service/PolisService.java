package org.app.service;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;
import org.app.model.Polis;

@ApplicationScoped
public class PolisService implements PanacheRepository<Polis> {

    @Transactional
    public void savePolis(Polis polis){
        System.out.println("save data polis : "+polis);
        persist(polis);
    }
}
