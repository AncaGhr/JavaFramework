package OOPConcepte;

import java.util.List;


public class FabricaBMW extends FabricaMasina {


    private Integer pretStandard;
    private Integer pretFinal;
    private List<String> dotariexterioare;
    private List<String> dotariInterioare;

    public FabricaBMW(String model, String sasiu, String culoare,
                      Integer motorizare, List<String> dotariexterioare, List<String> dotariInterioare) {
        super("BMW", model, sasiu, culoare, motorizare);

        this.dotariexterioare = dotariexterioare;
        this.dotariInterioare = dotariInterioare;
    }

    public void prezentareBMW() {

        prezentareMasina();
        definirePretModel();
        calculdotariexterioare();
        calculdotariinterioare();


        System.out.println("pretul va fi standard " + pretStandard);
        System.out.println("pretul va fi final " + pretFinal);


    }

    public void definirePretModel() {

        switch (getModel()) {
            case "Seria5":
                pretStandard = 60500;
                break;
            case "X7":
                pretStandard = 80200;
                break;

            default:
                System.out.println("Nu mai avem pe stoc acest model.");

        }
    }

    public void calculdotariexterioare() {
        Integer pretDotari = 0;
        for (Integer i = 0; i < dotariexterioare.size(); i++) {
            switch (dotariexterioare.get(i)) {
                case "bixenon":
                    pretDotari = pretDotari + 200;
                    break;

                case "trapa":
                    pretDotari = pretDotari + 900;
                    break;

                case "ionizare geamuri":
                    pretDotari = pretDotari + 350;
                    break;

                case "eleron":
                    pretDotari = pretDotari + 500;
                    break;

                case "spoiler":
                    pretDotari = pretDotari + 100;
                    break;

            }
        }
    }


    public void calculdotariinterioare() {
        Integer pretDotari = 0;
        for (Integer i = 0; i < dotariInterioare.size(); i++) {
            switch (dotariInterioare.get(i)) {
                case "bixenon":
                    pretDotari = pretDotari + 200;
                    break;

                case "trapa":
                    pretDotari = pretDotari + 900;
                    break;

                case "ionizare geamuri":
                    pretDotari = pretDotari + 350;
                    break;

                case "eleron":
                    pretDotari = pretDotari + 500;
                    break;

                case "spoiler":
                    pretDotari = pretDotari + 100;
                    break;

            }
        }
    }

    public Integer getPretStandard() {
        return pretStandard;
    }

    public Integer getPretFinal() {
        return pretFinal;
    }

    public List<String> getDotariexterioare() {
        return dotariexterioare;
    }

    public List<String> getDotariInterioare() {
        return dotariInterioare;
    }

    public void setDotariexterioare(List<String> dotariexterioare) {
        this.dotariexterioare = dotariexterioare;
    }

    public void setDotariInterioare(List<String> dotariInterioare) {
        this.dotariInterioare = dotariInterioare;
    }

    public void AngajariFirma(){

        System.out.println("Nu sunt posturi pentru angajare la fabrica BMW");
        super.AngajariFirma();
    }

}




