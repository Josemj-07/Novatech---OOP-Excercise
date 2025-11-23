package src.edu.novatech.personas;

public class Persona {

    //atributos de Persona
    protected String nombre;
    protected int documento;
    protected String email;

    //Constructor de la clase Persona
    public Persona (String nombre, int documento, String email) {

        if(nombre == null || email == null || documento < 0 || !email.contains("@")) throw new IllegalArgumentException("Ingrese información válida para los datos de la persona"); 
        this.nombre = nombre;
        this.documento = documento;
        this.email = email;

    }

    //métodos sobreescritos de la clase Objetc
    @Override 
    public String toString() {

        return "Nombre: " + nombre + "\n" +
        "Documento de identidad: " + documento + "\n";


    }

    @Override
    public boolean equals(Object object) {

        if(this == object) return true;

        if(object != null && this.getClass() == object.getClass()) {
            Persona p1 = (Persona) object;
            return this.documento == p1.documento;
        }

        return false;


    }
 
    public String mostrarInformacion() { 

        return toString() +
        "Correo electrónico: " + email;

    }

    public String getNombre() {
        return nombre;
    }
    
    public String getEmail() {
        return email;
    }

    public int getDocumento() {
        return documento;
    }

    public void setEmail(String newEmail) {
        if(newEmail == null || !newEmail.contains("@")) throw new IllegalArgumentException("Ingresa datos válidos por favor");
        this.email = newEmail;
    }

}