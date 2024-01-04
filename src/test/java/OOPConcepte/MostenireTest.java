package OOPConcepte;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class MostenireTest {

    @Test

    public void testMethod(){

        List<String> dotariaudiA7 = new ArrayList<>();
        dotariaudiA7.add("bixenon");
        dotariaudiA7.add("trapa");
        dotariaudiA7.add("ionizare geamuri");

        List<String> dotariaudiS8 = new ArrayList<>();
        dotariaudiS8.add("bixenon");
        dotariaudiS8.add("trapa");
        dotariaudiS8.add("ionizare geamuri");
        dotariaudiS8.add("eleron");
        dotariaudiS8.add("spoiler");


        List<String> dotariBMWSeria5interior = new ArrayList<>();
        dotariBMWSeria5interior.add("bixenon");
        dotariBMWSeria5interior.add("trapa");
        dotariBMWSeria5interior.add("ionizare geamuri");

        List<String> dotariBMWSeria5exterior = new ArrayList<>();
        dotariBMWSeria5exterior.add("bixenon");
        dotariBMWSeria5exterior.add("trapa");
        dotariBMWSeria5exterior.add("ionizare geamuri");
        dotariBMWSeria5exterior.add("eleron");
        dotariBMWSeria5exterior.add("spoiler");

        FabricaAudi audiA7 = new FabricaAudi( "A7","Sedan",
                "StarDust", 5, dotariaudiA7);

        audiA7.prezentareAudi();

        audiA7.setModel("a8");

        audiA7.prezentareAudi();

        audiA7.AfisareRezultate();
        audiA7.AfisareRezultate(2022);
        audiA7.AfisareRezultate("X");

        System.out.println(5);
        System.out.println("5");


        audiA7.AngajariFirma();

        FabricaBMW Seria5 = new FabricaBMW("Seria5", "Sedan", "negru", 30, dotariBMWSeria5exterior, dotariBMWSeria5interior);

        Seria5.prezentareBMW();

        Seria5.AngajariFirma();



//        FabricaAudi audiS8 = new FabricaAudi( "S8","RacingCar",
//                "Rosu", 3,dotariaudiS8);
//
//        audiS8.prezentareAudi();
    }


//
}
