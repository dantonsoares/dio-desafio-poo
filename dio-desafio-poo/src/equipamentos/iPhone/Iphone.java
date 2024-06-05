package equipamentos.iPhone;

import equipamentos.aparelhoTelefonico.AparelhoTelefonico;
import equipamentos.navegadorInternet.NavegadorInternet;
import equipamentos.reprodutorMusical.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{
    public void ligar(String numero){
        System.out.println("LIGANDO");
    }

    public void atender(){
        System.out.println("ATENDENDO");
    }

    public void iniciarCorreioVoz(){
        System.out.println("INICIANDO O CORREIO DE VOZ");
    }

    public void exibirPagina(String url){
        System.out.println("EXIBINDO PÁGINA");
    }

    public void adicionarNovaAba(){
        System.out.println("ADICIONANDO UMA NOVA ABA");
    }

    public void atualizarPagina(){
        System.out.println("ATUALIZANDO PÁGINA");
    }

    public void tocar(){
        System.out.println("TOCANDO MÚSICA");
    }

    public void pausar(){
        System.out.println("PAUSANDO MÚSICA");
    }

    public void selecionarMusica(String musica){
        System.out.println("SELECIONANDO MÚSICA");
    }
}
