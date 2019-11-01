package br.com.codenation;

import br.com.codenation.entidades.JogadorDeFutebol;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args){
        DesafioMeuTimeApplication desafio = new DesafioMeuTimeApplication();

        desafio.incluirTime(4L, "Tabajara", LocalDate.now(), "Amarelo", "Azul");
        desafio.incluirTime(3L, "Franguin", LocalDate.now(), "Rosa", "Preto");

        desafio.incluirJogador(3L, 4L, "Joao fe de feijao", LocalDate.now(), 80, new BigDecimal(500));
        desafio.incluirJogador(5L, 4L, "Ronaldo", LocalDate.now(), 69, new BigDecimal(600));
        desafio.incluirJogador(6L, 4L, "Rivaldo", LocalDate.now(), 85, new BigDecimal(1000));
        desafio.incluirJogador(4L, 3L, "Ed Motta", LocalDate.now(), 75, new BigDecimal(400));
        desafio.incluirJogador(1L, 3L, "Cuzao", LocalDate.now(), 81, new BigDecimal(550));
        desafio.incluirJogador(2L, 3L, "Fraco", LocalDate.now(), 67, new BigDecimal(700));

        desafio.definirCapitao(2L);

        System.out.println(desafio.buscarCapitaoDoTime(3l));

        System.out.println(desafio.buscarNomeJogador(3l));

        System.out.println(desafio.buscarNomeTime(4l));

        List<Long> jogadores = desafio.buscarJogadoresDoTime(3l);

        for(Long id : jogadores){
            System.out.println(id);
        }

        System.out.println("MELHORES " + desafio.buscarMelhorJogadorDoTime(3l));

        System.out.println("MELHORES " + desafio.buscarJogadorMaisVelho(8l));
    }

}
