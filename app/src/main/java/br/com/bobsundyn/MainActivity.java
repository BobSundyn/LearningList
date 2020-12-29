package br.com.bobsundyn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> alunos = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "Quantidade de alunos: " + alunos.size(), Toast.LENGTH_SHORT).show();

        alunos.add("Ronaldo");
        String nome = "Ana";
        alunos.add(nome);

        Toast.makeText(this, "Quantidade de alunos: " + alunos.size(), Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "1° aluno da lista: " + alunos.get(0), Toast.LENGTH_SHORT).show();

        alunos.remove(0);

        Toast.makeText(this, "1° aluno da lista: " + alunos.get(0), Toast.LENGTH_SHORT).show();

        alunos.add("Bernardo");
        alunos.add("Carolina");
        alunos.add("Daniel");
        alunos.add("Elizabeth");
        alunos.add("Fábio");

        Log.d("debugqi", "Quantidade de alunos na lista: " + alunos.size());

        for (int i = 0; i < alunos.size(); i++) {
            Log.d("debugqi", "Aluno número " + i + " : " +alunos.get(i));
        }

        for (String aluno : alunos) {
            Log.d("debugqi", aluno);
        }

        for (int i = alunos.size() -1; i >= 0; i--) {
            Log.d("debugqi", "Aluno número " + i + " : " + alunos.get(i));
        }

        Collections.sort(alunos);
        for (int i = 0; i < alunos.size(); i++) {
            Log.d("debugqi", "Aluno número " + i + " : " + alunos.get(i).toUpperCase());
        }

        alunos.add("carlos");
        alunos.add("Carlos Henrique");
        alunos.add("José Carlos");
        int quantidadeDeCarlos = 0;
        for (String aluno : alunos) {
            if (aluno.toUpperCase().contains("CARLOS")) {
                quantidadeDeCarlos++;
            }
        }
        Log.d("debugqi", "Quantidade de Carlos: " + quantidadeDeCarlos);

        // Comandos para Strings:

        // String.toUpperCase() -> vai colocar o texto inteiro em letras maiúsculas
        // String.toLowerCase() -> vai colocar o texto inteiro em letras minúsculas
        // String.equals(outraString) -> vai retornar true (verdadeiro) se a String for exatamente igual a outra,
        //                               caso contrário, retorna false
        // String.equalsIgnoreCase(outraString) -> vai retornar true (verdeiro) se a String for igual, desconsiderando
        //                                         diferenças entre letras maiúsculas e minúsculas
        // String.contains(outraString) -> verificar se aquela String contém o conteúdo da outra String em
        //                                 qualquer lugar dentro de si (retorna true ou false)
        // String.startsWith(outraString) -> verifica se a String começa com exatamente o conteúdo da outra String
        //                                   (retorna true ou false)
        // String.endsWith(outraString) -> verificar se a String termina com exatamente o conteúdo da outra String
        //                                 (retorna true ou false)
        // String.trim() -> remove espaços em branco desnecessários do início e do fim da String
        // String.replaceAll(stringProcurar, stringTrocar) -> substitui todas as palavras iguais a stringProcurar
        //                                                    pela palavra stringTrocar

        String escola = "     Escola QI    ";
        Log.d("debugqi", escola);
        Log.d("debugqi", escola.trim());
        Log.d("debugqi", escola.trim().replaceAll("QI", "do Carlos"));

    }
}
