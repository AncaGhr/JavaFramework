package Structuri_alternative;

import org.testng.annotations.Test;

public class Curs {
    //Structurile pot fi de doua feluri : alternative si repetitive;
    //Structuri alternative : if... then... else..., switch.... case;

    @Test
    public void test_method(){
//        verific_nr_mai_mare(9);
//        verific_nr_mai_mare(1);
//        verific_nr_mai_mare(5);
//        verific_nr_mai_mare(-6);
//        verific_nr_mai_mare(4);
//        verific_nr_mai_mare(6);
//        verific_nr_par(10);
//        verific_nr_par(3);
//        verific_nr_par(2);
//        verific_nr_par(0);
//        verific_nr_par(-2);
//        verific_nr_par(-5);
//        verific_nr_par(5996);
        persoana_majora(17);
        persoana_majora(18);
        persoana_majora(19);
    }
    //verificam daca un nr mare decat 5

    public void verific_nr_mai_mare(Integer nr){
        if (nr>5){
            System.out.println("Numarul " + nr + " este mai mare decat 5");
        }
        else{
            System.out.println("Numarul " + nr + " este mai mic decat 5");
        }
    }
    //verificam daca un nr este par si pozitiv
    public void verific_nr_par(Integer nr) {
        //daca vreau catul = / (div)
        //daca vreau restul = % (mod) = (modul)

        if (nr > 0) { // egal in prigramare este atribuire si == este echivalent cu = in viata reala // && =  si
            if (nr % 2 == 0) {
                System.out.println(("Numarul" + nr + " este par si pozitiv"));
            } else {
                System.out.println(("Numarul " + nr + "este impar si pozitiv"));
            }
        } else if (nr < 0) {
            //System.out.println("Numarul" + nr +" este impar");

            if (nr % 2 == 0) {
                System.out.println(("Numarul" + nr + " este par si negativ"));
            } else {
                System.out.println(("Numarul " + nr + "este impar si negativ"));
            }
        } else {
            System.out.println("Numarul este 0");
        }
    }


    //verificam daca o persoana este majora

    public void persoana_majora(Integer varsta) {
        if (varsta >= 18) {
            System.out.println("Persoana cu varsta " + varsta + "este majora");
        } else {
            System.out.println("Persoana cu varsta " + varsta + "este minora");
        }
    }
}



