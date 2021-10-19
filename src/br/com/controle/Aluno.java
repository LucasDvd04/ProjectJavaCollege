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
public class Aluno extends Pessoa{
    private int linhas = 0;
    private String nomeCT;

    public String getNomeCT() {
        return nomeCT;
    }

    public void setNomeCT(String nomeCT) {
        this.nomeCT = nomeCT;
    }
    
    public int getLinhas() {
        return linhas;
    }

    public void setLinhas(int linhas) {
        this.linhas = linhas + 1;
    }

    @Override
    public String toString() {
        return getNomeCT(); 
    }

    
    
}
