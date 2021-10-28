/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.negocio;

import br.com.senac.entidade.Aluno;

/**
 *
 * @author vitor.kuhnen
 */
public class AlunoNegocio {

    public static boolean validarInfo(String professor, int qtdAlunos, float media, int qtdNotas, Aluno aluno) {

        if (professor.length() >= 4 && qtdAlunos >= 1 && media >= 1 && qtdNotas >= 1) {
            aluno.setProfessor(professor);
            aluno.setQtdAlunos(qtdAlunos);
            aluno.setDefMedia(media);
            aluno.setQtdNotas(qtdNotas);
            return true;

        } else {
            return false;
        }

    }

    public void calcularNota(float notas, Aluno aluno) {
        float not = (notas / aluno.getQtdNotas());
        aluno.setMedia(not);

    }
}
