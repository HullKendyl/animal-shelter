export const welcome = () => {
    const welcome = document.createElement("div");
    welcome.classList.add("welcome-section");
    welcome.innerHTML = `
        <div class="video">
            <div class="color-block"></div>
            <iframe src="https://giphy.com/embed/fvwOxjwlzR7yUuC88c" width="478" height="480" frameBorder="0" class="giphy-embed" allowFullScreen></iframe>
        </div>

        <div class="welcome">
            <h3>Welcome!</h3>
            <p>Here at Critter Companion, we aim to match cute critters with loving humans that will cultivate a furever home. While critters are at our facility, we provide compassionate care, adoption and lost animal services to the community.</p>
            <p>Check out our critters and contact us if you are interested!</p>
        </div>

        <div class="adoptionInfo">
            <h3>Adoption</h3>
            <p>The decision to own a new animal is both a responsibility and happiness. Once you have made a careful decision to adopt an animal for life and have planned how to care for them, please contact us to move forward with the adoption process.</p>
        </div>
    `;

    return welcome;
}