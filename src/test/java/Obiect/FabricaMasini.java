package Obiect;

import com.beust.ah.A;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class FabricaMasini {

    //constructor = are ca rol sa initializeze atributele unei clase
    //un constructor este public si are acelasi nume cu clasa
    //un constructor poate sa fie de doua feluri - cu parametri si fara parametri
    //un constructor fara prametri  = "deafult"
    // daca nu am definit noi un contructor  avem unul  deafult fara parametri.
    //Intr-o clasa putem avea n constructori, diferentiati prin numar sau tip de parametri

    // Obiect = instanta unei clase
    //Un obiect reprezinta o structura pe care o are clasa si din care poate accesa variabilele si metodele respective

    //Dintr-o clasa putem initializa n obiecte
    //In momentul in care initializam un obiect apelam constructorul din clasa

    public String marca;
    public String model;
    public String combustibil;
    public String transmisie;
    public Integer an;
    public Double motorizare;
    public Integer pret;


//    public FabricaMasini(String Marca, String Model, String Combustibil, String Transmisie, Integer An, Double Motorizare){

//        this.Marca = Marca; // this =  identifica o variabila cu parametrusi  stie sa faca diferenta intre ele
//        this.Model = Model;
//        this.Combustibil = Combustibil;
//        this.Transmisie = Transmisie;
//        this.An = A;
//        this.Motorizare = Motorizare;

// variabilele sunt mereu cu litera mica in java

    public FabricaMasini(String marca, String model, String combustibil, String transmisie, Integer an, Double motorizare) {
        this.marca = marca; // click dreapta - Generate - Constructor - Click + Ctrl toate - done
        this.model = model;
        this.combustibil = combustibil; // mov edin clasa, albul e input, de afara
        this.transmisie = transmisie;
        this.an = an;
        this.motorizare = motorizare;
    }

    public FabricaMasini(String marca, String model, String combustibil, String transmisie, Integer an, Double motorizare, Integer pret) {
        this.marca = marca;
        this.model = model;
        this.combustibil = combustibil;
        this.transmisie = transmisie;
        this.an = an;
        this.motorizare = motorizare;
        this.pret = pret;
    }

    public void prezentare_masina(){
        System.out.println("Marca masinii este "+ marca);
        System.out.println("Modelul masinii este "+ model);
        System.out.println("Tipul de combustibilfolosit este "+ combustibil);
        System.out.println("Tipul transmisiei masinii este "+ transmisie);
        System.out.println("Anul de fabricatie al masinii este "+ an);
        System.out.println("Motorizarea masinii este "+ motorizare);
        if(pret != null ) { //!= diferit
            System.out.println("Pretul masinii este " + pret);
        }

    }

    public void calculimpozit() {

        if (an >= 2020 && combustibil.equals("Electric")) {
            System.out.println("Clientul trebuie sa plateasca 5 ron");
        }
        else {
            System.out.println("Clientul trebuie sa plateasca in functie de anul masinii");
        }

    }

}



