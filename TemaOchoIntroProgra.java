package org.openbootcamp;

public class TemaOchoIntroProgra {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setEdad(12);
        persona.setNombre("Tiago");
        persona.setTelefono(918273);

        System.out.println(persona.getNombre());
        System.out.println(persona.getEdad());
        System.out.println(persona.getTelefono());
    }
}

class Persona {
    private int edad;
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    private String nombre;
        public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    private long telefono;
    public long getTelefono() {
        return telefono;
    }
    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }
}