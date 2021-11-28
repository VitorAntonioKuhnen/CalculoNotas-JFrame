/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.entidade;

/**
 *
 * @author vitor.kuhnen
 */
public class Aluno {

    private String alunos;
    private String professor;
    private float media;
    private int qtdAlunos;
    private String historico = "";
    private int qtdNotas;
    private float defMedia;
    private String matricula;
    
    
    
    public String getAlunos() {
        return alunos;
    }

    public void setAluno(String alunos) {
        this.alunos = alunos;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }

    public int getQtdAlunos() {
        return qtdAlunos;
    }

    public void setQtdAlunos(int qtdAlunos) {
        this.qtdAlunos = qtdAlunos;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public int getQtdNotas() {
        return qtdNotas;
    }

    public void setQtdNotas(int qtdNotas) {
        this.qtdNotas = qtdNotas;
    }

    public float getDefMedia() {
        return defMedia;
    }

    public void setDefMedia(float defMedia) {
        this.defMedia = defMedia;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

}
