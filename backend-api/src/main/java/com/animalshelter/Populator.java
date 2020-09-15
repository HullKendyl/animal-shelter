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
        Species species6 = new Species("Hedgehog", "", "/images/hedgehog.jpg");
        Species species7 = new Species("Hamster", "", "/images/hamster.jpg");
        Species species8 = new Species("Bird", "", "/images/bird.jpg");


        speciesStorage.save(species1);
        speciesStorage.save(species2);
        speciesStorage.save(species3);
        speciesStorage.save(species4);
        speciesStorage.save(species5);
        speciesStorage.save(species6);
        speciesStorage.save(species7);
        speciesStorage.save(species8);
    }

}
