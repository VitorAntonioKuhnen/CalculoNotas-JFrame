/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.negocio;

import br.com.senac.entidade.Aluno;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author vitor.kuhnen
 */
public class AlunoNegocio {

    private Aluno aluno;

//  Verifica se foi informado e salva na entidade
    public static boolean validarInfo(String professor, int qtdAlunos, float media, int qtdNotas, String matricula, Aluno aluno) {

        if (professor.length() >= 4 && qtdAlunos >= 1 && media >= 1 && qtdNotas >= 1) {
            aluno.setProfessor(professor);
            aluno.setQtdAlunos(qtdAlunos);
            aluno.setDefMedia(media);
            aluno.setQtdNotas(qtdNotas);
            aluno.setMatricula(matricula);
            return true;

        } else {
            return false;
        }

    }
//  Faz o calculo e salva na entidade

    public void calcularNota(float notas, Aluno aluno) {
        float not = (notas / aluno.getQtdNotas());
        aluno.setMedia(not);

    }

//  Le o arquivo Json
    public static String lerJson(String matricula) {
        String historicoJson = "";

        try {
            JSONObject jSONObject;
            JSONParser parser = new JSONParser();
            jSONObject = (JSONObject) parser.parse(new FileReader(matricula + ".json"));
            historicoJson = (String) jSONObject.get("historico");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return historicoJson;
    }

    public void salvarJson(Aluno aluno, String historicoJson) {

        JSONObject objetoJson = new JSONObject();
        historicoJson += aluno.getHistorico() + "\n" + "\n";
        FileWriter writerFile = null;
        objetoJson.put("historico", historicoJson);
        try {
            writerFile = new FileWriter(aluno.getMatricula() + ".json");
            writerFile.write(objetoJson.toJSONString());
            writerFile.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String deletarJson(String matricula) {
        File file = new File(matricula + ".json");

        if (file.delete()) {
            return "Matricula deletada!";
        } else {
            return "1";
        }
    }
}
