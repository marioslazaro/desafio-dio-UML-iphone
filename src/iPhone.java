

public class iPhone implements reprodutorMusical, aparelhoTelefonico, navegadorInternet {

    public void tocar() {
        System.out.println("TOCANDO...");
    }
    public void pausar() {
        System.out.println("PAUSANDO...");
    }
    public void selecionarMusica() {
        System.out.println("SELECIONANDO MUSICA...");
    }

    public void ligar() {
        System.out.println("LIGANDO.");
    }
    public void atender() {
        System.out.println("ATENDENDO...");
    }
    public void iniciarCorreioVoz() {
        System.out.println("INICIANDO CORREIO DE VOZ...");
    };


    public void exibirPagina() {
        System.out.println("EXIBINDO PAGINA...");
    }
    public void adicionarNovaAba() {
        System.out.println("ADICIONANDO NOVA ABA...");
    }
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PAGINA...");
    }


    public static void main(String[] args) throws Exception {
     
        iPhone myiPhone = new iPhone();
        myiPhone.tocar();
        myiPhone.pausar();
        myiPhone.selecionarMusica();
        myiPhone.ligar();
        myiPhone.atender();
        myiPhone.iniciarCorreioVoz();
        myiPhone.exibirPagina();
        myiPhone.adicionarNovaAba();
        myiPhone.atualizarPagina();

    }

}
