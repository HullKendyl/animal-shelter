export const welcomeVideo = () => {
    const welcomeVideo = document.createElement("section");
    welcomeVideo.classList.add("section");
    welcomeVideo.innerHTML = `
        <div class="video">
            <div class="color-block"></div>
            <iframe src="https://giphy.com/embed/fvwOxjwlzR7yUuC88c" width="478" height="480" frameBorder="0" class="giphy-embed" allowFullScreen></iframe>
        </div>
    `;

    return welcomeVideo;
}