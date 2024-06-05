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

        aparelhoTelefonico.ligar("123456");
        aparelhoTelefonico.iniciarCorreioVoz();
        aparelhoTelefonico.atender();

        navegadorInternet.exibirPagina("www.google.com");
        navegadorInternet.atualizarPagina();
        navegadorInternet.adicionarNovaAba();

        reprodutorMusical.tocar();
        reprodutorMusical.pausar();
        reprodutorMusical.selecionarMusica("parabens pra voce");

        iphone.ligar("123456");
        iphone.iniciarCorreioVoz();
        iphone.atender();
        iphone.exibirPagina("www.google.com");
        iphone.atualizarPagina();
        iphone.adicionarNovaAba();
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("parabens pra voce");


    }
}
