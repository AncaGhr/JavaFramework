package VariabilaMetoda;

import org.testng.annotations.Test;

public class Student {

    @Test

    public void metodaTest(){

        // get_marire();
        System.out.println(get_marire(30));
        calcul_media(8.5, 9.2, "semestrul 1");

        //Metoda care calculeaza salariul unei persoane dupa o marire

    }

    public  Integer get_marire (Integer Procent){
        Integer Salariu = 15000;
        Integer Marire = (Salariu * Procent)/ 100 ;
        //Integer Salariu_Final = Salariu+Marire;
        return Salariu+Marire;

    }

    public Double get_medie(Double nota1, Double nota2){
    return (nota1+nota2)/2;
    }

    public  void calcul_media(Double nota1, Double nota2, String text){

        System.out.println(" Media pe "+text+" este: "+ get_medie(nota1,nota2));
    }


}
