package br.com.alura.mapa;

import java.util.HashMap;
import java.util.Map;

public class TesteMapa {

    public static void main(String[] args) {

        //Criando mapa, onde chave será do tipo Integer e tem que ser único, e o valor será do tipo String
        Map<Integer,String> mapa = new HashMap<>();
        mapa.put(1,"Rodrigo");
        mapa.put(2,"Gabriella");
        mapa.put(3,"Reinaldo");
        mapa.put(4,"Carlos");
        mapa.put(5,"Carioca");

        //Pegando elemento via chave
        System.out.println(mapa.get(1));

        //Percorrendo todos valores do mapa sem chave!
        for (String valoreMapa : mapa.values()){
            System.out.println(valoreMapa);
        }

        //Percorrendo todos valores do mapa com chave!
        for (Integer chave : mapa.keySet()){
            System.out.println("Chave é: "+ chave + " - Valor é: "+ mapa.get(chave));
        }
    }

}
