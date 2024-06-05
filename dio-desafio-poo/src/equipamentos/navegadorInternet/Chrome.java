package equipamentos.navegadorInternet;

public class Chrome implements NavegadorInternet{
    public void exibirPagina(String url){
        System.out.println("EXIBINDO PÁGINA");
    }

    public void adicionarNovaAba(){
        System.out.println("ADICIONANDO UMA NOVA ABA");
    }

    public void atualizarPagina(){
        System.out.println("ATUALIZANDO PÁGINA");
    }
}
