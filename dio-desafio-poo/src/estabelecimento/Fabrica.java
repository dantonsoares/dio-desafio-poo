package estabelecimento;

import equipamentos.aparelhoTelefonico.AparelhoTelefonico;
import equipamentos.aparelhoTelefonico.Telefone;
import equipamentos.navegadorInternet.NavegadorInternet;
import equipamentos.navegadorInternet.Chrome;
import equipamentos.reprodutorMusical.ReprodutorMusical;
import equipamentos.reprodutorMusical.Spotify;
import equipamentos.iPhone.Iphone;

public class Fabrica {
    public static void main(String[] args) {
        AparelhoTelefonico aparelhoTelefonico = new Telefone();
        NavegadorInternet navegadorInternet = new Chrome();
        ReprodutorMusical reprodutorMusical = new Spotify();
        Iphone iphone = new Iphone();

        System.out.println("Aparelho Telefonico");
        aparelhoTelefonico.ligar("123456");
        aparelhoTelefonico.iniciarCorreioVoz();
        aparelhoTelefonico.atender();
        System.out.println("-------------------------");

        System.out.println("NavegadorInternet");
        navegadorInternet.exibirPagina("www.google.com");
        navegadorInternet.atualizarPagina();
        navegadorInternet.adicionarNovaAba();
        System.out.println("-------------------------");

        System.out.println("ReprodutorMusical");
        reprodutorMusical.tocar();
        reprodutorMusical.pausar();
        reprodutorMusical.selecionarMusica("parabens pra voce");
        System.out.println("-------------------------");

        System.out.println("Iphone");
        iphone.ligar("123456");
        iphone.iniciarCorreioVoz();
        iphone.atender();
        iphone.exibirPagina("www.google.com");
        iphone.atualizarPagina();
        iphone.adicionarNovaAba();
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("parabens pra voce");
        System.out.println("-------------------------");


    }
}
