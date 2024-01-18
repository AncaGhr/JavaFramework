package ValueTypeReferenceType;

import org.testng.annotations.Test;

public class Vacanta {

    public Integer value1 = 10;
    public String value2 = "Anca";

    //Primitive : int, boolean, char, float, double, short, long;
    //Non-primitive: restul ( ex.: string, multimi, objects)

    public static Integer value3 = 10;

    public final Integer value4 = 50;


    @Test
    public void testMethod() {
        changevaluetype(value1);
        System.out.println("Valoarea actuala este: " +value1);

        changestringtype(value2);
        System.out.println("Valoarea actuala este: " +value2);

        changestatictype(value3);
        System.out.println("Valoarea actuala este: " +value3);

        
    }

    public void changevaluetype(Integer x){
        x = x+20;
        System.out.println("Noua valoare este: " +x);
    }

    public void changestringtype (String z){
        value2 = value2+z;
        System.out.println("Noua valoare este: " +value2);
    }

    public void changestatictype(Integer x){
        value3 = value3+x;
        System.out.println("Noua valoare este: " +x);
    }
}
