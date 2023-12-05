package StructuriRepetitive;

import org.testng.annotations.Test;

public class ForWhile {
    //Structuri repetitive= for, while, for each;

    @Test

    public void metodatest(){
        //afisare_numere_for();
        //afisare_numere_while();
        //afisare_nume();
        //suma_numere();
        afisare_nr_div5();
    }

    // Afisam primele 10 numere

    //for = (definesti interval) - nr finit de pasi - de la cat pornesti, pana la cat te duci, si cu cat cresti (din cat in cat sa creasca)
    //while = nr infinit de pasi - se poate intra in bucla infinita - de la cat pornesti , ultima linie trebuie sa fie incrementarea, dupa sout
    //index ++ si index -- creste si scade cu 1


    public void afisare_numere_for() {

        for (Integer index = 0; index < 50; index++) {

            System.out.println(index);
        }
    }

    public void afisare_numere_while(){
        Integer index = 0;
        while(index<50){
            System.out.println(index);
            index++;
        }
    }

    // Afisam numele nostru de 5 ori

    public void afisare_nume(){
        for ( Integer index=0;index<5; index++){
            System.out.println("Anca Gherghisan");
        }

    }

    //Calculam suma primelor 10 numere

    public void suma_numere(){
        Integer index = 0;
        Integer index1=index;
        while (index <10){
            index1 = index+index1;
            index++;
        }
        System.out.println("Suma numerelor este:" + index1);
    }
    // afisam primele 3 numere divizibile cu 5

    public void afisare_nr_div5(){
        Integer a=0;
        for (Integer index= 0; index<21; index++){
            if (index%5==0 && a<3){ // nu punem =< 3 pentru ne va afisa 4 numere, fiindca incepe de la 0
                a++;
                System.out.println(index);
            }
//            if(a==3){
//                break;      //"break" = opreste for cand conditia a fost indeplinita
//            }
        }
    }
}
