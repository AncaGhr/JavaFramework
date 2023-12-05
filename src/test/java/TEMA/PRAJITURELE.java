package TEMA;

import org.checkerframework.checker.units.qual.C;
import org.testng.annotations.Test;

public class PRAJITURELE {

    public String nume_prajitura0;
    public String nume_prajitura1;
    public String nume_prajitura2;
    public String nume_prajitura3;
    public Integer componenta0;
    public Integer componenta1;
    public Integer componenta2;
    public Integer componenta3;
    public String continut0;
    public String continut1;
    public String continut2;
    public String continut3;
    public Double greutate11;
    public Double greutate22;
    public Double greutate33;
    public Double greutate44;
    public Boolean disponibilitate_vanzare1;
    public Boolean disponibilitate_vanzare2;
    public Boolean disponibilitate_comanda1;
    public Boolean disponibilitate_comanda2;
    public Boolean disponibilitate_catalog1;
    public Boolean disponibilitate_catalog2;

    @Test
    public void COMANDA_PRAJITURICA() {

        nume_prajitura0 = "Tiramisu";
        nume_prajitura1 = "Tort";
        nume_prajitura2 = "Profiterol";
        nume_prajitura3 = "Fantezii";
        componenta0 = 2;
        componenta1= 8;
        componenta2 = 5;
        componenta3 = 2;
        continut0 = "Piscoturi, crema de mascarpone, amaretto, cacao";
        continut1 = "Blat, crema de ciocolata, crema de cafea, mousse de lapte";
        continut2 = "Choux, crema de vanilie, inghetata, topping de ciocolata";
        continut3 = "Aluat, rahat turcesc, zahar pudra";
        greutate11 = 0.75;
        greutate22 = 1.2;
        greutate33 = 0.80;
        greutate44 = 1.55;
        disponibilitate_vanzare1 = true;
        disponibilitate_vanzare2 = false;
        disponibilitate_comanda1 = true;
        disponibilitate_comanda2 = false;
        disponibilitate_catalog1 = true;
        disponibilitate_catalog2  = false;

        System.out.println("Comanda dumneavoastra este:");
        System.out.println(nume_prajitura1+' '+"si va fi in numar de"+' '+componenta1+' '+"bucati");
        System.out.println("Il gasiti la vanzare?");
        System.out.println(disponibilitate_vanzare1);
        System.out.println("Mai doriti si"+' '+ continut2 +' '+"adica"+' '+nume_prajitura2+ "?");
        System.out.println("Care sa cantareasca"+' '+ greutate22+ "?");
        System.out.println("Il gasiti in catalogul de produse?");
        System.out.println(disponibilitate_catalog2);
        System.out.println("Dar la comanda?");
        System.out.println(disponibilitate_comanda1);







    }






}
