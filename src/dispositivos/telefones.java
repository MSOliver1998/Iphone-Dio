package dispositivos;

import dispositivos.iphone.Iphone;

public class telefones {
    public static void main(String[] args){
        Iphone iphone1=new Iphone();
        iphone1.acessar();
        iphone1.escolherMusica();
        iphone1.tocarMusica();
        iphone1.chamar();
        iphone1.atender();
    }
}
