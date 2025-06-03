package com.indra;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;

public class Evento {
    private String nombre;
    private LocalDateTime fecha;
    private LocalTime duracion;
    private Ubicacion ubicacion;
    private final String TIPO;
    private final Organizador ORGANIZADOR;
    private final ArrayList<Usuario> ASISTENTES;

    public Evento(String nombre, LocalDateTime fecha, LocalTime duracion, Ubicacion ubicacion, String tipo, Organizador organizador) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.duracion = duracion;
        this.ubicacion = ubicacion;
        this.TIPO = tipo;
        this.ORGANIZADOR = organizador;
        this.ASISTENTES = new ArrayList<>();
    }

    public String getNombre() {
        return this.nombre;
    }

    public boolean setNombre(String nombre, Organizador o) {
        if (o.equals(this.ORGANIZADOR)) {
            this.nombre = nombre;
            return true;
        }
        return false;
    }

    public LocalDateTime getFecha() {
        return this.fecha;
    }

    public boolean setFecha(LocalDateTime fecha, Organizador o) {
        if (o.equals(this.ORGANIZADOR)) {
            this.fecha = fecha;
            return true;
        }
        return false;
    }

    public LocalTime getDuracion() {
        return this.duracion;
    }

    public boolean setDuracion(LocalTime duracion, Organizador o) {
        if (o.equals(this.ORGANIZADOR)) {
            this.duracion = duracion;
            return true;
        }
        return false;
    }

    public Ubicacion getUbicacion() {
        return this.ubicacion;
    }

    public boolean setUbicacion(Ubicacion ubicacion, Organizador o) {
        if (o.equals(this.ORGANIZADOR)) {
            this.ubicacion = ubicacion;
            return true;
        }
        return false;
    }

    public String getTipo() {
        return this.TIPO;
    }

    public Organizador getOrganizador() {
        return this.ORGANIZADOR;
    }

    public ArrayList<Usuario> getAsistentes() {
        return this.ASISTENTES;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
        result = prime * result + ((ubicacion == null) ? 0 : ubicacion.hashCode());
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
        Evento other = (Evento) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (fecha == null) {
            if (other.fecha != null)
                return false;
        } else if (!fecha.equals(other.fecha))
            return false;
        if (ubicacion == null) {
            if (other.ubicacion != null)
                return false;
        } else if (!ubicacion.equals(other.ubicacion))
            return false;
        return true;
    }

    
}
