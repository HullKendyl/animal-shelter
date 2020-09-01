package entities;

import org.junit.jupiter.api.Test;

public class SpeciesTest {

    @Test
    public void speciesShouldExist() {
        Species underTest = new Species("Dog","Domesticated canine.","image");
    }
}
