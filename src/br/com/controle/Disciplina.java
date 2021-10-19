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
public class Disciplina {
        private int codigoT;
        private String nomeT;
        private String nomeD;
        private int hora;
        private int sala;
        private int linhas = 0; 

    public int getCodigoT() {
        return codigoT;
    }

    public void setCodigoT(int codigoT) {
        this.codigoT = codigoT;
    }

    public String getNomeD() {
        return nomeD;
    }

    public void setNomeD(String nomeD) {
        this.nomeD = nomeD;
    }

    public String getNomeT() {
        return nomeT;
    }

    public void setNomeT(String nomeT) {
        this.nomeT = nomeT;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public int getLinhas() {
        return linhas;
    }

    public void setLinhas(int linhas) {
        this.linhas = linhas + 1;
    }

    @Override
    public String toString() {
        return getNomeT();
    }
        
}
