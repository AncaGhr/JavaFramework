package Exceptii;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionConcept {

    //Exceptie = eroare care apare in momentul cand programul ruleaza
    //Exceptiile trebuie tratate deoarece pot sa contina informatii din interior care pot sa fie exploatate
    //Poate sa apara o exceptie atunci cand vrem sa citim un fisier
    //Citim datele dintr-un tabel din DB care nu exista
    //Exceptiile sunt de doua tipuri: checked si unchecked
        //~~"CHECKED"~~
    //-----exceptii care se trataeaza in timpul compilarii
    //----acest tip de exceptii mostenesc clasa Exception
        //~~"UNCHECKED"~~
    //-----exceptii care nu se trateaza in timpul compilarii
    //-----acest tip de exceptii mostenesc clasa "Runtime Exception"
    //Exista 2 keyword foarte importante pentru a trata exceptiile: throw si throws
    //Orice tip de exceptie se trateaza folosind structurile : Try....Catch.....Finally

    public void checkedExample(String path){

        File file = new File(path);
        try{
            FileInputStream fileInputStream = new FileInputStream(file);
            System.out.println("Am gasit fisierul.");
        }
        catch (FileNotFoundException exception){
            System.out.println("A intrat pe clauza catch");
        }
       finally {
            System.out.println("A mai icnercat o data sa gaseasca fisierul");
        }
    }

    public void uncheckedExampleV1(){

        System.out.println("Acest cod va produce o exceptie");
        Integer calcul = 7/0;
        System.out.println(calcul);
    }

    public void uncheckedExampleV2(){

        String[] colegi = new String[2];
        colegi[0] = "Anca";
        colegi[1] = "Claudia";
        colegi[2] = "Olivia";
        colegi[3] = "Alin";
        System.out.println("Acest cod va produce o exceptie");

        for( Integer index = 0; index<colegi.length;index++){
            System.out.println(colegi[index]);
        }
    }

            //~~~~"THROW"~~~~
    //==== keyword folosit sa arunce o exceptie specifica
    //==== se regaseste in interiorul unei metode

    public void verificareVarsta(Integer varsta){

        if(varsta<18){
            throw new RuntimeException("Nu iti voi da tigari fiindca esti minor");
        }
        else {
            System.out.println("Iti voi da fiindca esti major");
        }
    }

            //~~~~"THROWS"~~~~
    //=== keyword folosit in semnatura metodei care sa arate faptul ca o metoda poate sa arunce o exceptie
    //=== poate sa fie urmat de o multime de exceptii delimitate cu virgula

    public void throwsExample(String path) throws FileNotFoundException{
        File file = new File(path);
        FileInputStream fileInputStream = new FileInputStream(file);
        System.out.println("Am gasit fisierul.");
    }

}



