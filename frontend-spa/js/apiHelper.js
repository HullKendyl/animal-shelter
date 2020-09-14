export const fetchSpecies = async () => {
    return fetch("http://localhost:8080/api/species").then((response) => 
    response.json());
};