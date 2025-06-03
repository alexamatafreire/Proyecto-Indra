package com.indra;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;

public class Organizador {
    private String nombre;
    private String correo;
    private final ArrayList<String> TELEFONOS;
    private final ArrayList<Evento> EVENTOS;

    public Organizador(String n, String c) {
        this.nombre = n;
        this.correo = c;
        this.TELEFONOS = new ArrayList<>();
        this.EVENTOS = new ArrayList<>();
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return this.correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public ArrayList<String> getTelefonos() {
        return this.TELEFONOS;
    }

    public ArrayList<Evento> getEventos() {
        return this.EVENTOS;
    }

    public void crearEvento(String n, LocalDateTime f, LocalTime d, Ubicacion u, String t) {
        EVENTOS.add(new Evento(n,f,d,u,t,this));
    }

    public boolean cambiarNombreEvento(Evento e, String n) {
        return e.setNombre(n, this);
    }

    public boolean cambiarFechaEvento(Evento e, LocalDateTime f) {
        return e.setFecha(f, this);
    }

    public boolean cambiarDuracionEvento(Evento e, LocalTime d) {
        return e.setDuracion(d, this);
    }

    public boolean cambiarUbicacionEvento(Evento e, Ubicacion u) {
        return e.setUbicacion(u, this);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + ((correo == null) ? 0 : correo.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Organizador other = (Organizador) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (correo == null) {
            if (other.correo != null)
                return false;
        } else if (!correo.equals(other.correo))
            return false;
        return true;
    }

}
