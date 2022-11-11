import java.time.LocalDate;

import dio.desafio.dominio.Bootcamp;
import dio.desafio.dominio.Curso;
import dio.desafio.dominio.Dev;
import dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {
        
      Curso curso = new Curso();

      curso.setTitulo("Curso Java");
      curso.setDescricao("Curso Java Begginers");
      curso.setCargaHoraria(90);

      Mentoria mentoria = new Mentoria();

      mentoria.setTitulo("Mentoria de Java");
      mentoria.setDescricao("Mentoria bootcamp Java");
      mentoria.setData(LocalDate.now());

      Bootcamp bootcamp = new Bootcamp();
      bootcamp.setNome("Bootcamp Java");
      bootcamp.setDescricao("Bootcamp Java Begginers");
      bootcamp.getConteudos().add(curso);
      bootcamp.getConteudos().add(mentoria);

      Dev devCarlos = new Dev();
      devCarlos.setNome("Carlos");
      devCarlos.inscreverBootcamp(bootcamp);
      devCarlos.progredir();
      devCarlos.progredir();

      System.out.println("Conteudos inscritos: " + devCarlos.getConteudosInscritos());
      System.out.println("Conteudos concluidos: " + devCarlos.getConteudosConcluidos());
      System.out.println("XP: " + devCarlos.calcularTotalXp());



    }
}
