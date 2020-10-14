import { clearElementChildren } from "./domHelper.js";
import { navBarHeader } from "./components/header.js";
import { welcome } from "./components/welcome.js";
import { speciesGallery } from "./components/species.js";
import { fetchSpecies } from "./apiHelper.js";

const container = document.querySelector(".container");

export const renderPage = (species) => {
    // clearElementChildren(element);

    container.prepend(navBarHeader());
    container.append(welcome());
    container.appendChild(speciesGallery(species));

};

fetchSpecies().then((species) => {
    renderPage(species);
});