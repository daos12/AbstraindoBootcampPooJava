import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("Descrição do curso js");
        curso2.setCargaHoraria(4);

        //Conteudo conteudo   = new Curso(); //polimorfismo
        //Conteudo conteudo1  = new Mentoria(); //polimorfismo

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Descrição do curso java");
        mentoria1.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");

        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev dev1 = new Dev();
        dev1.setNome("Diego Antonio");
        dev1.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos Insritos "+ dev1.getNome()+dev1.getConteudosInscritos());
        System.out.println("-");
        dev1.progredir();
        System.out.println("Conteúdos Insritos "+ dev1.getNome()+dev1.getConteudosInscritos());
        System.out.println("Conteúdos Conluidos "+ dev1.getNome()+dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularTotalXp());

        System.out.println("-------------------");

        Dev dev2 = new Dev();
        dev2.setNome("Aparecida Santilha");
        dev2.inscreverBootcamp(bootcamp);
        dev2.progredir();

        System.out.println("Conteúdos Insritos "+ dev2.getNome()+" "+dev2.getConteudosInscritos());
        System.out.println("-");
        dev2.progredir();
        System.out.println("Conteúdos Insritos "+ dev2.getNome()+" "+dev2.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos "+ dev2.getNome()+" "+dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularTotalXp());


    }
}