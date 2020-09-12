import { clearElementChildren } from "./domHelper.js";
import { navBarHeader } from "./components/header.js";

const container = document.querySelector(".container");

export const renderPage = (element, species) => {
    // clearElementChildren(element);

    container.prepend(navBarHeader());

    
};

renderPage();