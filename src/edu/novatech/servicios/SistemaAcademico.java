package src.edu.novatech.servicios;

import java.util.ArrayList;

import src.edu.novatech.academico.*;
import src.edu.novatech.personas.*;

public class SistemaAcademico {
    
    private ArrayList<Persona> personas;
    private ArrayList<Curso> cursos;
    private static int tamañoArregloPersonas;
    private static int tamañoArregloCursos;

    public SistemaAcademico(){
        personas = new ArrayList<Persona>();
        cursos = new ArrayList<Curso>();
    } 

    public void registrarPersona(Persona persona) {
        
        if(persona == null) throw new IllegalArgumentException("Ingrese datos válidos");
        personas.add(persona);
        tamañoArregloPersonas++;

    }

    public void registrarCurso(Curso curso) {
        
        if(curso == null) throw new IllegalArgumentException("Ingrese datos válidos");
        cursos.add(curso);
        tamañoArregloCursos++;
    
    }

    public String buscar(String nombre) {
        
        if(nombre == null) throw new IllegalArgumentException("Ingrese datos válidos");

        for(int i = 0; i < tamañoArregloPersonas; i++) {

            if(personas.get(i).getNombre().equals(nombre)) {
                return personas.get(i).toString();
            }

        }
        
        return "La persona que estás buscando no se encuentra registrada";

    }

    public String buscar(int documento) {

        if(documento < 0) throw new IllegalArgumentException("Ingrese datos válidos");

        for(int i = 0; i < tamañoArregloPersonas; i++) {

            if(personas.get(i).getDocumento() == documento) {
              
                return personas.get(i).toString();
            
            }

        }

        return "La persona que estás buscando no se encuentra registrada";

    }

    public String buscarCurso(int codigoCurso) {

        if(codigoCurso < 0) throw new IllegalArgumentException("Ingrese datos válidos");

        for(int i = 0; i < tamañoArregloCursos; i ++) {

            if(cursos.get(i).getCodigoCurso() == codigoCurso) {
                return cursos.get(i).toString();
            }

        }

        return "El curso que estás buscando existe";

    }

    public void asignarDocenteAlCurso(Curso curso, Docente docente) {

        if(curso == null || docente == null) throw new IllegalArgumentException("Ingrese datos válidos por favor");

        curso.setDocente(docente);
        docente.inscribirCurso(curso);

    }

    public void inscribirEstudianteACurso(Estudiante estudiante, Curso curso) {

        if(curso == null || estudiante == null) throw new IllegalArgumentException("Ingrese datos válidos por favor");      

        curso.agregarEstudiante(estudiante);
        estudiante.inscribirCurso(curso);

    }

    public String listarEstudiantes() {
        String estudiantes = "";

        for(int i = 0; i < tamañoArregloPersonas; i++) {

            if(personas.get(i).getClass() == Estudiante.class) {

                estudiantes += personas.get(i).getNombre() + "\n";

            }

        }

        return estudiantes;

    }

    public String listarDocentes() {
        String docentes = "";

        for(int i = 0; i < tamañoArregloPersonas; i++) {

            if(personas.get(i).getClass() == Docente.class) {

                docentes += personas.get(i).getNombre() + "\n";

            }

        }

        return docentes;

    }

    public String listarCursos() {

        String cursos = "";

        for(int i = 0; i < tamañoArregloCursos; i++) {

            cursos += this.cursos.get(i).getNombreDelCurso() + "\n";

        }

        return cursos;

    }

    public String mostrarInformacion(ArrayList<Persona> listaPersonas) {

        String informacionPersonas = "";

        for(int i = 0; i < listaPersonas.size(); i ++) {

        informacionPersonas += listaPersonas.get(i).mostrarInformacion() +"\n" +"\n";
        }

        return informacionPersonas;
        
    }

}
