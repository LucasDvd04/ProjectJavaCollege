package br.com.controle;

public class Nota {
    private String nomeCTD;
    private int codigoCTD;
    private float nota1;
    private float nota2;
    private float mediaF;
    private float media;
    private int linhas = 0;

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }

    public int getLinhas() {
        return linhas;
    }

    public void setLinhas(int linhas) {
        this.linhas = linhas + 1;
    }

    public String getNomeCTD() {
        return nomeCTD;
    }

    public void setNomeCTD(String nomeCTD) {
        this.nomeCTD = nomeCTD;
    }

    public int getCodigoCTD() {
        return codigoCTD;
    }

    public void setCodigoCTD(int codigoCTD) {
        this.codigoCTD = codigoCTD;
    }

   

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getMediaF() {
        return mediaF;
    }

    public void setMediaF(float nota1, float nota2) {
        this.mediaF = (nota1 + nota2)/2;
    }
    

    @Override
    public String toString() {
        return getNomeCTD(); //To change body of generated methods, choose Tools | Templates.
    }


    
}
