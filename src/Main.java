import br.com.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso javaScript");
        curso2.setDescricao("descrição curso javaScript");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        DesafioCodigo desafio1 = new DesafioCodigo();
        desafio1.setTitulo("Desafio da Tabuada");
        desafio1.setDescricao("Entre com um numero inteiro entre 1 a 10 e calcule a tabuada deste numero");
        desafio1.setTempoMinutos(60);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
        bootcamp.getConteudos().add(desafio1);

        Dev dev1 = new Dev();
        dev1.setNome("Rosangela");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Rosangela" + dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        dev1.progredir();
        dev1.progredir();
        System.out.println("---após progredir---");
        System.out.println("Conteudos Inscritos Rosangela" + dev1.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Rosangela" + dev1.getConteudosConcluidos());
        System.out.println("Xps" + dev1.calcularTotalXP());
        System.out.println("--------------------------------");

        Dev dev2 = new Dev();
        dev2.setNome("João");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos João" + dev2.getConteudosInscritos());
        dev2.progredir();

        System.out.println("---após progredir---");
        System.out.println("Conteudos Inscritos João" + dev2.getConteudosInscritos());
        System.out.println("Conteudos Concluidos João" + dev2.getConteudosConcluidos());
        System.out.println("Xps" + dev2.calcularTotalXP());
        System.out.println("--------------------------------");

    }
}
