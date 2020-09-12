export const navBarHeader = () => {
    const header = document.createElement("header");
    header.classList.add("header");
    header.innerHTML = `
        <nav>
            <div class="menu">
                <ul>
                    <li><a href="#">HOME</a></li>
                    <li><a href="#">ADOPTION</a></li>
                    <li><a href="#">ANIMALS</a></li>
                    <li><a href="#">CONTACT</a></li>
                </ul>
            </div>
            <div class="logo">
                <img src="images/critter-companion-logo.png" alt="Logo">
            </div>
        </nav>
    `;

    return header;
};