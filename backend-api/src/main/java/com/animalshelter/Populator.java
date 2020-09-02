package com.animalshelter;

import com.animalshelter.entities.Species;
import com.animalshelter.storages.SpeciesStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Populator implements CommandLineRunner {

    @Autowired
    SpeciesStorage speciesStorage;

    @Override
    public void run(String... args) throws Exception {
        Species species1 = new Species("Cat", "","/images/species-images/kitten-flowers/jpg");

        speciesStorage.save(species1);
    }

}
