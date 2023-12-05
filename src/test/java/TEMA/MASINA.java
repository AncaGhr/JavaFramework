package TEMA;

import org.checkerframework.checker.units.qual.C;
import org.testng.annotations.Test;

public class MASINA {
    public String marca;
    public String model;
    public Integer an_fabricatie;
    public String combustibil;
    public Double motorizare;
    public Character norma_de_poluare;
    public Boolean disponibilitate_actuala;
    public Boolean disponibilitate_testdrive;


    @Test
    public void Caracteristici_Auto() {
        marca = "Toyota";
        model = "Camry";
        an_fabricatie = 2021;
        combustibil = "hybrid+gasoline";
        motorizare = 2.5;
        norma_de_poluare = '6';
        disponibilitate_actuala = true;
        disponibilitate_testdrive = false;


        System.out.println("Urmeaza sa configurati autoturismul dorit:");
        System.out.println("Aceasta este o" + ' ' + marca + ' ' + ", iar modelul prezentat este" + ' ' + model);
        System.out.println("Motorizarea aleasa va fi" + ' ' + motorizare);
        System.out.println("Anul fabricatiei :" + ' ' + an_fabricatie);
        System.out.println("Se afla in showroom?" + ' ' + disponibilitate_actuala);
        System.out.println(combustibil + ' ' + "este singura varianta disponibila");
        System.out.println("Disponibilitate testdrive :" + ' ' + disponibilitate_testdrive);

    }
}
