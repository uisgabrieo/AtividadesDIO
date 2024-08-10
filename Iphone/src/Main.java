import aparelho.IPhone;

public class Main {
    public static void main(String[] args) {

        var iPhone = new IPhone();

        iPhone.atender();
        iPhone.ligar("(00) 9 9988-8888");
        iPhone.iniciarCorreioVoz();

        iPhone.adicionarNovaAba();
        iPhone.exibirPagina("web.dio.me/");
        iPhone.atualizarPagina();

        iPhone.tocar();
        iPhone.pausar();
        iPhone.slecionarMusica("Formation");
    }
}