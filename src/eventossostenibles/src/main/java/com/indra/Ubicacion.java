package com.indra;
public class Ubicacion {
    private String nombre;
    private boolean online;
    private String direccion;

    public Ubicacion(String c, String n, boolean o, String d) {
        this.nombre = n;
        this.online = o;
        this.direccion = d;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isOnline() {
        return this.online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
