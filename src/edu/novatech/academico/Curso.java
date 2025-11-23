package src.edu.novatech.academico;

import java.util.ArrayList;

import src.edu.novatech.personas.*;

public class Curso {

    private int codigoCurso;
    private String nombreDelCurso;
    private byte cantidadDeCreditos;
    private Docente docente;
    ArrayList<Estudiante> estudiantesDelCurso;

    public Curso (int codigoCurso, String nombreDelCurso, int cantidadDeCreditos) {
       
        if(codigoCurso < 0 || nombreDelCurso == null || cantidadDeCreditos < 0) throw new IllegalArgumentException("Ingrese datos válidos por favor");
        
        this.codigoCurso = codigoCurso;
        this.nombreDelCurso = nombreDelCurso;
        this.cantidadDeCreditos = (byte)(cantidadDeCreditos);
        estudiantesDelCurso = new ArrayList<Estudiante>();

    }

    public void agregarEstudiante(Estudiante estudiante) {
       if(estudiante == null) throw new IllegalArgumentException("Ingrese datos válidos");
       estudiantesDelCurso.add(estudiante);
    }

    public void removerEstudiante(String idEstudiante) {
       
        if(idEstudiante == null) throw new IllegalArgumentException("Ingrese datos válidos");
    
        int id = Integer.parseInt(idEstudiante);
       
        if(id < 0) return;

        int N = estudiantesDelCurso.size();

        for(int i = 0; i < N; i++) {

            if(estudiantesDelCurso.get(i).getIdEstudiante() == id) {
                estudiantesDelCurso.remove(i);
            }

        }
   
    }

    public String listarParticipantes() {
        String participantes = "";

        for (Estudiante estudiante : estudiantesDelCurso) {
            participantes += estudiante.getNombre() + "\n";
        }

        return participantes;

    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj != null && this.getClass() != obj.getClass()) {
            
            Curso curso = (Curso) obj;
            return this.codigoCurso == curso.codigoCurso;
        }

        return false;
    }

    @Override
    public String toString() {
        
        return "Nombre del curso: " + nombreDelCurso + "\n" + "Codigo del curso: " + codigoCurso + "\n" +
        "Docente: " + docente.getNombre() + "\n" + "Créditos del curso: " + cantidadDeCreditos;
    }

    public String getNombreDelCurso() {
        return nombreDelCurso;
    }

    public int getCodigoCurso() {
        return codigoCurso;
    }

    public void setDocente(Docente docente) {
        if(docente == null) throw new IllegalArgumentException("Ingrese datos válidos");
        this.docente = docente;
    }

}