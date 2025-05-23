function navegar(url){
    if (document.body.classList.contains("darkMode")) {
        document.location = url + "?darkmode=true";
    } else {
        document.location = url;
    }
}