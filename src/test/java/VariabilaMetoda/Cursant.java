package VariabilaMetoda;

import org.testng.annotations.Test;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Cursant {
    //Primul curs
    //Clasa = Cu sablon specific unui obiect care contine variabile si metode
    //Identificam o clasa dupa cuvantul class
    //O clasa trebuie sa aiba un nume
    //Continutul unei clase se regaseste intre {}
    //Intr-un fisier Java putem avea mai multe clase
    //Variabila = Proprietate a unei clase(nume,prenume,varsta)-variabilele clasei "cursant"
    //Variabilele sunt de doua feluri: global si local
    //Variabila globala = vizibila peste tot in clasa (nume si prenume- le spune general)
    //Variabila locala = vizibila doar in locul declarat (restrictiva)- (ex:cat castigi tu la munca)
    //Variabila globala = "public" - tip de data ("string") - nume variabila ";"
    //Variabila poate sau nu sa primeasca o valoare !!!
    //Metoda = actiunea unei clase - actiuni in programare - specifice actiunii cursantului
    //Metodele sunt de doua feluri : "void" si "return"
    //"Void" = metoda care executa si arata actiunea
    //"Return" = Metoda care returneaza actiunea
    public String nume;
    public String prenume;
    public Integer varsta;
    public String adresa;
    public Double inaltime;
    public Float greutate;
    public Character sex;
    public Boolean areStudii;


    @Test
    public void Metoda_Test(){

        afisaredate();
        calcul_medie("Semestru1",7.5,9.2 );
        calcul_medie("Semestru2",8.7,10.0 );
        calcul_pret(10);
        calcul_pret(50);

    }
    public void afisaredate(){
        nume = "Gherghisan";
        prenume = "Anca";
        varsta = 28;
        adresa = "Drumul Manastirea Varatec, Nr. 7-11, Bl. C1";
        inaltime = 1.64;
        greutate = 54.0f;
        sex = 'F'; // la character ai 'caracter'-ghilimele simple iar la string ghilimele duble "caracterele";
        areStudii = true; // poate fi si false

        System.out.println(nume+' '+prenume); // println-printeaza linia urmatoare si
        //System.out.print(prenume); print- printeaza linia curenta
        System.out.println(varsta);
        System.out.println(adresa);
        //sout = System.out.print();

    }

    public void calcul_medie (String tipnote,Double nota1,Double nota2)
    {

        Double rezultat = (nota1+nota2)/2;

        System.out.println("Media examenelor la "+tipnote+" este"+' '+rezultat);
    }

    public void calcul_pret(Integer reducere){
        Integer pret = 1000;

        System.out.println("Pretul initial al cursului este"+' '+pret);
        Integer diferenta = (pret *reducere)/100;
        Integer pretfinal = pret-diferenta;
        System.out.println("Pretul final al cursului dupa aplicarea reducerii este"+' '+pretfinal);



    }



}
