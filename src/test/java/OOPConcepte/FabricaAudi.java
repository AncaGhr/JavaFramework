package OOPConcepte;

import java.util.List;

public class FabricaAudi  extends FabricaMasina{

    private Integer pretStandard;
    private Integer pretFinal;
    private List<String> dotariexterioare;

    public FabricaAudi( String model, String sasiu, String culoare,
                       Integer motorizare, List<String> dotariexterioare){
        super("Audi", model, sasiu, culoare, motorizare);
        this.dotariexterioare = dotariexterioare;
    }

    public void prezentareAudi(){

        prezentareMasina();
        definirePretModel();
        calculPretFinal();
        if(dotariexterioare == null) {
            System.out.println("pretul standard este " + pretStandard);
        }
        else{
            System.out.println("pretul va fi standard " + pretStandard);
            System.out.println("pretul va fi final " + pretFinal);

        }

    }

    public void definirePretModel(){

        switch (getModel()){
            case "A7":
                pretStandard = 40000;
                break;
            case "S8" :
                    pretStandard = 80000;
                    break;

            default:
                System.out.println("Nu mai avem pe stoc acest model.");

        }
    }

    public void calculPretFinal(){
        Integer pretDotari =0;
        for(Integer i=0; i < dotariexterioare.size(); i++){
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
        pretFinal = pretStandard + pretDotari;
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

    public void setDotariexterioare(List<String> dotariexterioare) {
        this.dotariexterioare = dotariexterioare;
    }

    //Suprascriem metoda Angajari din parinte - propria implementare a fabricii cu acelasi nume

    public void AngajariFirma(){

        System.out.println("Fabrica Audi are 4 locuri disponibile");
    }

    //Polimorfism static

    public void AfisareRezultate(){

        System.out.println("Fabrica a produs 15 masini");
    }

    public void AfisareRezultate(String marca){

        System.out.println("Fabrica a produs 10 bucati  cu marca X");
    }

    public void AfisareRezultate(String marca, Integer an){

        System.out.println("Fabrica a produs 10 bucati  cu marca X din anul 2022");
    }

    public void AfisareRezultate(Integer an){

        System.out.println("Fabrica a produs 10 bucati  cu din anul 2022");
    }


}
