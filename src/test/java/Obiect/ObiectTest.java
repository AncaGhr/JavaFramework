package Obiect;

import org.testng.annotations.Test;

public class ObiectTest {

    @Test

    public void TestMethod(){
        FabricaMasini HyundaiElantra =new FabricaMasini("Toyota","Elantra","Hybrid","Automata", 2023, 2.6);

        HyundaiElantra.prezentare_masina();
        HyundaiElantra.calculimpozit();

        System.out.println("=====================================");

        FabricaMasini RenaultLagunaCoupe = new FabricaMasini("Renault","Laguna Coupe Monaco Gp","Benzina","Manuala", 2012, 2.8);

        RenaultLagunaCoupe.prezentare_masina();
     RenaultLagunaCoupe.calculimpozit();

        System.out.println("=====================================");

        FabricaMasini AudiS8 = new FabricaMasini("Audi", "S8", "Electric", "Automata",2023, 3.5, 80000);

        AudiS8.prezentare_masina();
        System.out.println("=====================================");
        AudiS8.calculimpozit();
    }
}
