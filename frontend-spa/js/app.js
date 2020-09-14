import { clearElementChildren } from "./domHelper.js";
import { navBarHeader } from "./components/header.js";
import { welcomeVideo } from "./components/welcome.js";

const container = document.querySelector(".container");

export const renderPage = (element, species) => {
    // clearElementChildren(element);

    container.prepend(navBarHeader());
    container.append(welcomeVideo());

    
};

renderPage();