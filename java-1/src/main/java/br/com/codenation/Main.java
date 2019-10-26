import br.com.codenation.DesafioMeuTimeApplication;
import br.com.codenation.entidades.JogadorDeFutebol;
import br.com.codenation.entidades.TimeDeFutebol;
import br.com.codenation.gerenciadoras.GerenciadorTime;
import br.com.codenation.suite.teste.Detonado;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    DesafioMeuTimeApplication desafioMeuTimeApplication = new DesafioMeuTimeApplication();

    public static void main(String[] args){
        Main main = new Main();
        main.incluirTime();
        main.incluirJogador();
        main.definirCapitao();



    }

    public void incluirTime(){
        TimeDeFutebol timeDeFutebol = GerenciadorTime.buscarTime(new Long(1));
        desafioMeuTimeApplication.incluirTime(new Long(1), "flamengo", LocalDate.now(), "vermelho", "branco");
        desafioMeuTimeApplication.incluirTime(new Long(2), "cruzeiro", LocalDate.now(), "azul", "vermelho");
        desafioMeuTimeApplication.incluirTime(new Long(3), "atletico", LocalDate.now(), "preto", "rosa");
        System.out.println(GerenciadorTime.buscarTime(new Long(1)));
        System.out.println(GerenciadorTime.buscarTime(new Long(2)));
        System.out.println(GerenciadorTime.buscarTime(new Long(3)));

        //System.out.println(GerenciadorTime.buscarTime(new Long(5)));
        //desafioMeuTimeApplication.incluirTime(new Long(3), "atletico", LocalDate.now(), "preto", "rosa");
    }

    public void incluirJogador(){
        desafioMeuTimeApplication.incluirJogador(new Long(2), new Long(1), "gabiGol", LocalDate.now(), 50, new BigDecimal(85486));
        desafioMeuTimeApplication.incluirJogador(new Long(3), new Long(2), "neves", LocalDate.now(), 100, new BigDecimal(93784));
        desafioMeuTimeApplication.incluirJogador(new Long(1), new Long(2), "ronaldo", LocalDate.now(), 100, new BigDecimal(93784));

      //  desafioMeuTimeApplication.incluirJogador(new Long(1), new Long(2), "ronaldo", LocalDate.now(), 100, new BigDecimal(93784));
       // desafioMeuTimeApplication.incluirJogador(new Long(1), new Long(6), "ronaldo", LocalDate.now(), 100, new BigDecimal(93784));

    }

    public void definirCapitao(){
        desafioMeuTimeApplication.definirCapitao(new Long(2));
        desafioMeuTimeApplication.definirCapitao(new Long(10));
    }
}
