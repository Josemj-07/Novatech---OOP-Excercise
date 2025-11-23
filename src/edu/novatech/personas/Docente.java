package src.edu.novatech.personas;

import java.util.ArrayList;

import src.edu.novatech.academico.Curso;

import java.text.DecimalFormat;

public class Docente extends Persona {

    private String facultad;
    private double salarioBase; // se asume un salario base por hora
    private double horasDictadas;
    private ArrayList<Curso> cursosQueDicta;

    public Docente (String departamento, double salarioBase, double horasDictadas, String nombre, int documento, String email) {

        super(nombre, documento, email);
        
        if(departamento == null || salarioBase < 0 || horasDictadas < 0) throw new IllegalArgumentException("Ingrese datos válidos por favor");
        this.facultad = departamento;
        this.salarioBase = salarioBase;
        this.horasDictadas = horasDictadas;
        cursosQueDicta = new ArrayList<Curso>();
        
    }

    @Override
    public String mostrarInformacion() {

        return super.mostrarInformacion() + "\n" +
        "Facultad a la que pertenece: " + this.facultad + "\n" +
        "Salario base: " + this.salarioBase + "\n" +
        "Horas de clase dictadas: " + this.horasDictadas;

    }
    
    public String calcularSalario() {

        DecimalFormat df = new DecimalFormat("$###,###.##");
        double salarioCalculado = salarioBase * horasDictadas;
        
        return df.format(salarioCalculado);
        
    }

    public void inscribirCurso(Curso curso) {
        if(curso == null) throw new IllegalArgumentException("Ingrese datos válidos");
        cursosQueDicta.add(curso);
    }

    public String listarCursos() {

        String cursos = "";

        for (Curso curso : cursosQueDicta) {
            cursos += curso.getNombreDelCurso() + "\n";
        }

        return cursos;

    }

}