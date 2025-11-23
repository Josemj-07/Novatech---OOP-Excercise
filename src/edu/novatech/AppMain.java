package src.edu.novatech;

import java.util.ArrayList;

import src.edu.novatech.academico.*;
import src.edu.novatech.personas.*;
import src.edu.novatech.servicios.*;

public class AppMain {
    
    public static void main(String args[]) {

        //ESTA ES UNA SIUTE DE PRUEBAS UNITARIAS BASICAS PARA VERIFICAR EL FUNCIONAMIENTO DEL SISTEMA, 
        //LAS CUALES PUEDEN SER EXPANDIDAS O MODIFICADAS SEGUN SEA NECESARIO

        // === Instancias de estudiantes ===
        Estudiante e1 = new Estudiante(123, "Ingenieria en sistemas e informatica", (float)4.8, "Jose Muñoz", "jose.munozj@nova.edu.co", 1027661440);
      
        Estudiante e2 = new Estudiante(321, "Ingenieria en sistemas e informatica", (float)4.2, "Pelu", "peludo@nova.edu.co", 42675216);


        // === Instancias de profesores ==
        Docente d1 = new Docente("TIC", 150000, 120, "CesarLopezProfe", 15506371, "cesarlopezprofe@nova.edu.co");

        Docente d2 = new Docente("TIC", 120000, 137, "Elviejoleo", 4269313, "leonardo.agudelo@nova.edu.co");

        // === Instancias de cursos ==
        Curso c1 = new Curso(15506, "Arquitectura de software", 3);

        Curso c2 = new Curso(15507, "Telemática", 3);

        // == Instancia del sistema academico ===
        SistemaAcademico sistemaAcademico = new SistemaAcademico();


        sistemaAcademico.registrarPersona((Persona)e1);
        sistemaAcademico.registrarPersona((Persona)e2);
        sistemaAcademico.registrarPersona((Persona)d1);
        sistemaAcademico.registrarPersona((Persona)d2);
        sistemaAcademico.registrarCurso(c1);
        sistemaAcademico.registrarCurso(c2);

        sistemaAcademico.asignarDocenteAlCurso(c1, d1);
        sistemaAcademico.asignarDocenteAlCurso(c2, d2);

        sistemaAcademico.inscribirEstudianteACurso(e1, c1);
        sistemaAcademico.inscribirEstudianteACurso(e2, c1);
        sistemaAcademico.inscribirEstudianteACurso(e1, c2);
        sistemaAcademico.inscribirEstudianteACurso(e2, c2);


        
        // === Pruebas de métodos sobrescritos ===
        System.out.println("---- Prueba toString() ----");
        System.out.println(e1);
        System.out.println();
        System.out.println(d1);
        System.out.println();
        System.out.println(c1);

        System.out.println("\n---- Prueba equals() ----");
        Estudiante e3 = new Estudiante(123, "Ciencia de datos", (float)4.8, "Jose Muñoz", "jose.munozj@nova.edu.co", 1027661440);
        System.out.println("¿e1 es igual a e3? " + e1.equals(e3)); // Debe ser true por tener mismo documento

        // === Pruebas de sobrecarga y búsqueda ===
        System.out.println("\n---- Prueba de búsquedas ----");
        System.out.println("Buscar estudiante por documento:");
        System.out.println(sistemaAcademico.buscar("Pelu"));
        System.out.println();
        System.out.println("Buscar curso por código:");
        System.out.println(sistemaAcademico.buscarCurso(15507));

        
        // === Prueba de polimorfismo ===
        System.out.println("\n---- Prueba de polimorfismo (mostrarInformacionGeneral) ----");
        ArrayList<Persona> personas= new ArrayList<Persona>();
        personas.add(e1);
        personas.add(e2);
        personas.add(d1);
        personas.add(d2);

        System.out.println(sistemaAcademico.mostrarInformacion(personas));

        // === Pruebas de operaciones de negocio ===
        System.out.println("\n---- Prueba de operaciones adicionales ----");
        e1.actualizarPromedio(4.0);
        System.out.println("Nuevo promedio de " + e1.getNombre() + ": " + e1.getPromedio());

        System.out.println("Salario total de " + d2.getNombre() + ": " + d2.calcularSalario());

        System.out.println("\nListado de cursos de " + e1.getNombre() + ":" + "\n" + e1.listarCursos());
        

        System.out.println("\n==== PRUEBAS FINALIZADAS CON ÉXITO ====");

    }

}
