package dispositivos.iphone;

import dispositivos.funcoes.internet.Internet;
import dispositivos.funcoes.musica.Musica;
import dispositivos.funcoes.telefone.Telefone;

public class Iphone implements Telefone,Internet,Musica {
    
    public void tocarMusica(){
        System.err.println("tocando musica");
    }

    public void pausarMusica(){
        System.err.println("pausando a musica");
    }

    public void escolherMusica(){
        System.out.println("escolhendo a musica");
    }

    public void novaAba(){
        System.out.println("abrindo nova aba");
    }

    public void acessar(){
        System.out.println("acessando o site");
    }

    public void recarregar(){
        System.out.println("recarregando pagina");
    }

    public void ligar(){
        System.err.println("ligando para o numero ");
    }

    public void chamar(){
        System.out.println("seu telefone está tocando");
    }

    public void atender(){
        System.out.println("chamada atendida");
    }
}
