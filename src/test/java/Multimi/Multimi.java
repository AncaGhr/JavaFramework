package Multimi;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class Multimi {

    // o multime = o colectie de elemente de acelasi tip

    @Test
    public void metoda_test(){
        // nume_cursanti_array();
        // nume_cursanti_lista();
        //obiecte_hashmap();
        //tari_orase();
        reteta_gatit("Prajitura tiramisu");


    }
        //Afisam numele cursantilor  - RECUNOASTEM UN ARRAY DUPA [], DACA NU AI SPATIU II FACI CU LENGTH

    public void nume_cursanti_array(){
        //o multime de tipul x
        String [] nume_cursanti = new String[4]; // <- o multime de stringuri si trebuie tinut cont de pozitie:
        nume_cursanti [0] = "Adi";
        nume_cursanti [1] = "Anca";
        nume_cursanti [2] = "Andreea"; // multimea trebuie parcursa; si pt parcurgere trb for/while
        nume_cursanti [3] = "Claudia";
        for (Integer index = 0; index < nume_cursanti.length; index++){ // lenght= DIMENSIUNEA MULTIMII
            System.out.println(nume_cursanti[index]); //trebuie chemata multimea ,nu indexul care arata potitia, apoi  pozitia
            //astfel s-a accesat valoarea din multime..
        }
    }

    public void nume_cursanti_lista(){ // recunoastem o lista dupa <> si list
        List<String> nume_cursanti = new ArrayList<>(); //== linia 22 - stie sa isi creeze spatiu de care ai nevoie in lista
        nume_cursanti.add("Cosmin");
        nume_cursanti.add("Diana");
        nume_cursanti.add("Letitia");
        nume_cursanti.add("Oana");
        for (Integer index = 0; index < nume_cursanti.size(); index++){ // size= DIMENSIUNEA LISTEI
            System.out.println(nume_cursanti.get(index));
        }
    }

    // hashmap = key-value, o multime mai complexa unde key = valoare
    public void obiecte_hashmap(){
        HashMap<String,String> obiecte = new HashMap<>();
        obiecte.put("electronic","telefon"); // intai categoria, apoi valoarea
        obiecte.put("aliment","supa");
        obiecte.put("automobile","Hyundai");
        for(String key:obiecte.keySet()) {//pentru fiecare x din multime ( pt fiecare keye, din multimea de key)
            System.out.println("Cheia este"+ ' ' + key);
            System.out.println("Valoarea este"+ ' ' + obiecte.get(key));
        }
    }

    //reprezentam niste tari cu orasele aferente

    public void tari_orase() {
        HashMap<String,List<String>> testData = new HashMap<>();

        List<String> orase_Romania = new ArrayList<>();
        orase_Romania.add("Bucuresti");
        orase_Romania.add("Timisoara");
        orase_Romania.add("Constanta");

        List<String> orase_Italia = new ArrayList<>();
        orase_Italia.add("Roma");
        orase_Italia.add("Bari");
        orase_Italia.add("Milano");

        List<String> orase_Spania = new ArrayList<>();
        orase_Spania.add("Barcelona");
        orase_Spania.add("Cordoba");
        orase_Spania.add("Valencia");

        testData.put("Romania",orase_Romania);
        testData.put("Italia",orase_Italia);
        testData.put("Spania",orase_Spania);

        for(String key:testData.keySet()) {//pentru fiecare x din multime ( pt fiecare keye, din multimea de key)
            System.out.println("Tara este"+ ' ' + key);
            System.out.println("Orasele sunt urmatoarele: ");

            List<String > orasele_Curente = testData.get(key);

            for (Integer index = 0; index < orasele_Curente.size(); index++){ // size= DIMENSIUNEA LISTEI
                System.out.println(orasele_Curente.get(index));
            }
        }
    }

    // definim retete de gatit

    public void reteta_gatit(String reteta) {
        HashMap<String,List<String>> cartedebucate = new LinkedHashMap<>();

        List<String> ciorbaradauteana = new ArrayList<>();
        ciorbaradauteana.add("Morcovi - 2 bucati");
        ciorbaradauteana.add("Ceapa - 2 bucati");
        ciorbaradauteana.add("Telina- 1/2 bucati");
        ciorbaradauteana.add("Smantana");
        ciorbaradauteana.add("Apa 4L");
        ciorbaradauteana.add("Carne de pui - 1 kg");
        ciorbaradauteana.add("Sare si piper dupa gust ");

        List<String> tiramisu = new ArrayList<>();
        tiramisu.add("Piscoturi 400g");
        tiramisu.add("Mascarpone 500g");
        tiramisu.add("Cafea 50 ml");
        tiramisu.add("Amareto 20ml");
        tiramisu.add("Oua 3 buc.");
        tiramisu.add("Zahar 3 linguri");

        cartedebucate.put("Ciorba radauteana", ciorbaradauteana);
        cartedebucate.put("Prajitura tiramisu ", tiramisu);

        for(String key: cartedebucate.keySet()) {//pentru fiecare x din multime ( pt fiecare keye, din multimea de key)
            if (key.equals(reteta)){
                System.out.println("Reteta de astazi este:" + ' ' + key);
                System.out.println("Ingredientele sunt urmatoarele:" + cartedebucate.get(key));
            }

        }

    }
}




