package com.animalshelter.entities;

import javax.persistence.*;

@Entity
public class Species {

    @Id
    @GeneratedValue
    private long id;
    private String speciesType;
    private String description;
    private String speciesImage;

    protected Species() {}

    public Species(String speciesType, String description, String speciesImage) {
        this.speciesType = speciesType;
        this.description = description;
        this.speciesImage = speciesImage;
    }

    public long getId() {
        return id;
    }

    public String getSpeciesType() {
        return speciesType;
    }

    public String getDescription() {
        return description;
    }

    public String getSpeciesImage() {
        return speciesImage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Species)) return false;
        Species species = (Species) o;

        if (id != species.id) return false;
        if(speciesType != null ? !speciesType.equals(species.speciesType) : species.speciesType != null) return false;
        if(description != null ? !description.equals(species.description) : species.description != null) return false;
        return speciesImage != null ? speciesImage.equals(species.speciesImage) : species.speciesImage == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (speciesType != null ? speciesType.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (speciesImage != null ? speciesImage.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Species{" +
                "id=" + id +
                ", speciesType='" + speciesType + '\'' +
                ", description='" + description + '\'' +
                ", speciesImage='" + speciesImage + '\'' +
                "}";

    }
}
