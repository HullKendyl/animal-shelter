export const speciesGallery = (element, species) => {
    const speciesSection = document.createElement("section");
    const speciesHeader = document.createElement("div");
    speciesHeader.classList.add("species-list");
    speciesHeader.innerHTML = `
        <h3>Critter Species</h3>
        `;

    const allSpecies = document.createElement("div");
    allSpecies.classList.add("species-types");

    speciesSection.append(speciesHeader);
    for (let i = 0; i < species.length; i++) {
        const allSpeciesGallery = document.createElement("div");
        allSpeciesGallery.classList.add("artist-div");
        allSpeciesGallery.innerHTML += `
            <img class = "species-image" src="${species[i].speciesImage}">
            <div class="species-span">
                <span class="species-type-span">${species[i].speciesType}</span>
            </div>
        `;

    allSpecies.append(allSpeciesGallery);
    }

    speciesSection.append(allSpecies);

    return speciesSection;


}