function botonModoOscuro() {
    document.body.classList.toggle("darkMode");
    localStorage.setItem("darkMode", document.body.classList.contains("darkMode") ? 'dark' : 'light');
}