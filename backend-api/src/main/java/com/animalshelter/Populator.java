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
        Species species1 = new Species("Cat", "","/images/kitten-flowers.jpg");
        Species species2 = new Species("Dog", "", "/images/dog.jpg");
        Species species3 = new Species("Rabbit", "", "/images/rabbit.jpg");
        Species species4 = new Species("Ferret", "", "/images/ferret.jpg");
        Species species5 = new Species("Guinea Pig", "", "/images/guinea-pig.jpg");


        speciesStorage.save(species1);
        speciesStorage.save(species2);
        speciesStorage.save(species3);
        speciesStorage.save(species4);
        speciesStorage.save(species5);
    }

}
