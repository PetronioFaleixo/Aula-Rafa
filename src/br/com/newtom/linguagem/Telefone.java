package br.com.newtom.linguagem;

public class Telefone {
    Contato contato1;
    Contato contato2, contato3;
    public String cor;
    public String marca;

    public void Tocar(String estiloMusica){
        System.out.print("Tocando" + estiloMusica);
    }
    public void Ligar(Contato contato)
    {
        if(cor.equals("Preto"))
        {
            if(contato.nome.equals("Juliana")){
                System.out.print("Liando para Julia");
            }
        }

    }
}
