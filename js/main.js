document.addEventListener("DOMContentLoaded", function() {
    const listaTarjetas = document.getElementById("listatarjetas");
    const botonDerecha = document.getElementById("listaDerecha");
    const botonIzquierda = document.getElementById("listaIzquierda");
    const cantDesplazar = 365;
    const delay = 150;

    botonDerecha.style.transition = `opacity ${delay}ms`;
    botonIzquierda.style.transition = `opacity ${delay}ms`;

    botonDerecha.addEventListener("click", function() {
        const posScroll = listaTarjetas.scrollLeft;
        listaTarjetas.scrollTo((Math.trunc(posScroll/cantDesplazar)+1)*cantDesplazar, 0);
    });

    botonIzquierda.addEventListener("click", function() {
        console.log(listaTarjetas.clientWidth);
        const posScroll = listaTarjetas.scrollLeft;
        if (posScroll%cantDesplazar==0) {
            listaTarjetas.scrollTo((Math.trunc(posScroll/cantDesplazar)-1)*cantDesplazar, 0);
        } else {
            listaTarjetas.scrollTo(Math.trunc(posScroll/cantDesplazar)*cantDesplazar, 0);
        }
    });

    listaTarjetas.addEventListener("scroll", function() {
        console.log(listaTarjetas.scrollLeft);
        if (listaTarjetas.scrollLeft == 0) {
            botonIzquierda.style.opacity = "0";
            setTimeout(function(){botonIzquierda.style.visibility = "hidden";}, delay);
        } else if (listaTarjetas.scrollLeft+listaTarjetas.clientWidth == listaTarjetas.scrollWidth) {
            botonDerecha.style.opacity = "0";
            setTimeout(function(){botonDerecha.style.visibility = "hidden";}, delay);
        } else {
            botonIzquierda.style.visibility = "visible";
            botonIzquierda.style.opacity = "1";
            botonDerecha.style.visibility = "visible";
            botonDerecha.style.opacity = "1";
        }
    });
});