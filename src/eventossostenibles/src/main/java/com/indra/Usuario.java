package com.indra;

import java.util.ArrayList;

public class Usuario {
    private String correo;
    private String contraseña;
    private String nombre;
    private final ArrayList<Evento> eventos;

    public Usuario(String contraseña, String correo, String nombre) {
        this.contraseña = contraseña;
        this.correo = correo;
        this.nombre = nombre;
        this.eventos = new ArrayList<>();
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

    public String getContraseña() {
        return this.contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public boolean indicarAsistencia(Evento evento) {
        if (evento != null && !evento.getAsistentes().contains(this)) {
            evento.getAsistentes().add(this);
            this.eventos.add(evento);
            return true;
        }
        return false;
    }

    public boolean cancelarAsistencia(Evento evento) {
        if (evento != null && evento.getAsistentes().contains(this)) {
            evento.getAsistentes().remove(this);
            this.eventos.remove(evento);
            return true;
        }
        return false;
    }
}
