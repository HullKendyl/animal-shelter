export const adoptionInfo = () => {
    const adoption = document.createElement("div");
    adoption.classList.add("adoption-section");
    adoption.innerHTML = `
        <div class="adoptionInfo">
            <h3>Adoption</h3>
            <p>The decision to own a new animal is both a responsibility and happiness. Once you have made a careful decision to adopt an animal for life and have planned how to care for them, please contact us to move forward with the adoption process.</p>
        </div>
    `;

    return adoptionInfo;
}