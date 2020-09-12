import { clearElementChildren } from "./domHelper.js";

const container = document.querySelector(".container");

export const renderPage = (element, species) => {
    clearElementChildren(element);
}