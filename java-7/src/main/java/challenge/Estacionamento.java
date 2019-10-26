package challenge;

import java.util.ArrayList;
import java.util.List;

public class Estacionamento {
    GerenciadoraEstacionamento gerenciadora;

    public Estacionamento(){
        gerenciadora = new GerenciadoraEstacionamento();
    }

    public void estacionar(Carro carro) {
        if(gerenciadora.getCarrosEstacionados().size() >= 10 && gerenciadora.allSenior()){
            throw new EstacionamentoException("Estacionamento cheio");
        }

        if(gerenciadora.carrosEstacionados.size() < 10 ){
            if(carro != null && gerenciadora.podeEstacionar(carro))//pode estacionar
                gerenciadora.adicionaCarro(carro);
        }else{
            gerenciadora.novoCarroEstacionamentoLotado(carro);
        }

        // ver se tem que colocar a exceção
    }

    public int carrosEstacionados() {
        return gerenciadora.getCarrosEstacionados().size();
    }

    public boolean carroEstacionado(Carro carro) {
        return gerenciadora.carrosEstacionados.get(0).equals(carro);
    }
}
