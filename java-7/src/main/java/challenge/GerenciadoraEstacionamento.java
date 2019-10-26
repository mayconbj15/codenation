package challenge;

import java.util.ArrayList;
import java.util.List;

public class GerenciadoraEstacionamento {
    List<Carro> carrosEstacionados;

    public GerenciadoraEstacionamento(){
        carrosEstacionados = new ArrayList<>();
    }

    public List<Carro> getCarrosEstacionados() {
        return carrosEstacionados;
    }

    public void adicionaCarro(Carro carro){
        this.carrosEstacionados.add(carro);
    }

    public static boolean podeEstacionar(Carro carro){
        return  carroIsValid(carro);
    }

    public static boolean motoristaValido(Carro carro){
        if(carro.getMotorista() == null)
            throw new EstacionamentoException("Carro sem motorista");

        if(carro.getMotorista().getNome() == null)
            throw new NullPointerException("Motorista do carro sem nome");

        return true;
    }

    public static boolean motoristaEhMaior(Motorista motorista){
        if(motorista == null || motorista.getIdade() < 18)
            throw new EstacionamentoException("Motorista menor de idade");

        return true;
    }

    public static boolean motoristaEhHabilitado(Motorista motorista){
        if(motorista.getHabilitacao() == null)
            throw new NullPointerException("Motorista habilitado");

        return true;
    }

    public static boolean carteiraSuspensa(Motorista motorista){
        if(motorista == null || motorista.getPontos() > 20)
            throw new EstacionamentoException("Carteira suspensa");

        return true;
    }

    public static boolean carroIsValid(Carro carro){
        return carro != null &&
                motoristaValido(carro)
                && motoristaEhMaior(carro.getMotorista())
                && motoristaEhHabilitado(carro.getMotorista())
                && carteiraSuspensa(carro.getMotorista());

    }

    public boolean allSenior(){
        boolean allSenior = true;

        for(int i=0; i < carrosEstacionados.size(); i++){
            if(carrosEstacionados.get(i).getMotorista().getIdade() < 55)
                allSenior = false;
        }

        return allSenior;
    }
    public void novoCarroEstacionamentoLotado(Carro carro){
        boolean removido = false;

        if(carrosEstacionados.get(0).getMotorista().getIdade() < 55){
            carrosEstacionados.remove(0);
            carrosEstacionados.add(carro);
        }else{
            for(int i=0; removido == false && i < carrosEstacionados.size(); i++){
                if(carrosEstacionados.get(i).getMotorista().getIdade() < 55){
                    carrosEstacionados.remove(i);
                    carrosEstacionados.add(carro);
                    removido = true;
                }
            }
        }
    }


}
