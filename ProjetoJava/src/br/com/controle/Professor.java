/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controle;

/**
 *
 * @author My&Lucas
 */
public class Professor extends Pessoa {
    private int linhas = 0;
    private String nomeD;

    public String getNomeD() {
        return nomeD;
    }

    public void setNomeD(String nomeD) {
        this.nomeD = nomeD;
    }
    

    public int getLinhas() {
        return linhas;
    }

    public void setLinhas(int linhas) {
        this.linhas = linhas + 1;
    }

    @Override
    public String toString() {
        return getNomeD(); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
