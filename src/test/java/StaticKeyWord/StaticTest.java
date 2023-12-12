package StaticKeyWord;

import org.testng.annotations.Test;

public class StaticTest {

    @Test
    public void testmethod(){

        Elev unu= new Elev("Popescu", "Mihai");
        unu.prezentareElev();

        Elev doi = new Elev("Popescu2", "Mihai2");
        doi.prezentareElev();

        Elev trei = new Elev("Popescu3", "Mihai3");
        trei.prezentareElev();

    }
}
