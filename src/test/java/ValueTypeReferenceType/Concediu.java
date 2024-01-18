package ValueTypeReferenceType;

import org.testng.annotations.Test;

public class Concediu {

    public Integer value1; // se apeleaza clasa si iti da valoarea
    public int value2; //primitiva
    public Double value3;
    public double value4; // primitiva

    // variabilele sunt primitive si neprimitive, respectiv referencetype sunt cu litera mare

    @Test
    public void testMethod(){

        value1 = 10;
        value2 = 10;
        value3 = 10.0;
        value4 = 10.4;
        int rezultat = value1.compareTo(value2);
    }
}
