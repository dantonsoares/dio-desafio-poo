package equipamentos.reprodutorMusical;

public class Spotify implements ReprodutorMusical{
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
