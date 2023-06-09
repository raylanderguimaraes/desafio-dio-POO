import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
public class Main {
	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("curso java");
		curso1.setDescricao("descriçao curso java");
		curso1.setCargaHoraria(8);
		
		
		Curso curso2 = new Curso();
		curso2.setTitulo("curso js");
		curso2.setDescricao("descriçao curso js");
		curso2.setCargaHoraria(4);
		
		Conteudo conteudo = new Curso();
		Conteudo mentoria = new Mentoria();
		
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("mentoria java");
		mentoria1.setDescricao("descrição mentoria java");
		mentoria1.setData(LocalDate.now());
		
		
//		System.out.println(curso1);
//		System.out.println(curso2);
//		
//		System.out.println(mentoria1);
//		
//		System.out.println(conteudo);
//		System.out.println(mentoria);
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Develeper");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria1);
		
		Dev devRaylander = new Dev();
		devRaylander.setNome("Raylander");
		devRaylander.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos Raylander: " + devRaylander.getConteudosInscritos());
		
		devRaylander.progredir();
		devRaylander.progredir();
		System.out.println("-");
		
		System.out.println("Conteudos Inscritos Raylander: " + devRaylander.getConteudosInscritos());
		System.out.println("Conteudos Concluidos Raylander: " + devRaylander.getConteudosConcluidos());
		System.out.println("XP: " + devRaylander.calcularTotalXp());
		
		System.out.println("-------------------");
		
		Dev devJoao = new Dev();
		devJoao.setNome("Joao");
		devJoao.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos João: " + devJoao.getConteudosInscritos());
		devJoao.progredir();
		devJoao.progredir();
		devJoao.progredir();
		System.out.println("-");
		System.out.println("Conteudos Inscritos João: " + devJoao.getConteudosInscritos());
		System.out.println("Conteudos Concluidos João: " + devJoao.getConteudosConcluidos());
		System.out.println("XP: " + devJoao.calcularTotalXp());
		
	}
}
