package src.edu.novatech.personas;

import java.util.ArrayList;

import src.edu.novatech.academico.Curso;

public class Estudiante extends Persona {
    
    private int idEstudiante;
    private String programa;
    private float promedio;
    private ArrayList<Curso> cursos;

    public Estudiante(int idEstudiante, String programa, float promedio, String nombre, String email, int documento ) {
        
        super(nombre, documento, email); //llamada al constructor de la clase padre Persona
        if(programa == null || promedio < 0 || idEstudiante < 0) throw new IllegalArgumentException("Ingresa datos válidos");
        this.idEstudiante = idEstudiante;
        this.programa = programa;
        this.promedio = promedio;  
        cursos = new ArrayList<Curso>(); 

    }

    @Override
    public String mostrarInformacion() { 

        return super.mostrarInformacion() + "\n" +
        "Id del estudiante: " + this.idEstudiante + "\n" +
        "Programa: " + this.programa + "\n" +
        "Promedio: " + this.promedio;

    }

    public void actualizarPromedio(double nuevaNota) {
        if(nuevaNota < 0) throw new IllegalArgumentException("Ingresa un valor válido para la nota");
        promedio = (float)(promedio + nuevaNota)/2;
    }

    public int getIdEstudiante() { 
        return this.idEstudiante;
    }
    
    public String getPrograma() {
        return this.programa;
    }
    
    public float getPromedio() {
        return this.promedio;
    }
    
    public void setPrograma(String nuevoPrograma) {
        if(nuevoPrograma == null) throw new IllegalArgumentException("Ingresa un valor válido");
        this.programa = nuevoPrograma;
    }

    public void inscribirCurso(Curso curso) {
        if(curso == null) throw new IllegalArgumentException("Ingrese datos válidos");
        cursos.add(curso);
    }

    public String listarCursos() {

        StringBuilder cursosBuilder = new StringBuilder(); // Usar StringBuilder para eficiencia

        for(int i = 0; i < this.cursos.size(); i++) {
            cursosBuilder.append(this.cursos.get(i).getNombreDelCurso()).append(" \n");
        }

        return cursosBuilder.toString();

    }

}