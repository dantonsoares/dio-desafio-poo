package equipamentos.aparelhoTelefonico;

public class Telefone implements AparelhoTelefonico {
    public void ligar(String numero){
        System.out.println("LIGANDO");
    }

    public void atender(){
        System.out.println("ATENDENDO");
    }

    public void iniciarCorreioVoz(){
        System.out.println("INICIANDO O CORREIO DE VOZ");
    }
}
