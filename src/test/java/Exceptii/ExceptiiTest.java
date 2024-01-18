package Exceptii;

import org.testng.annotations.Test;

import java.io.FileNotFoundException;

public class ExceptiiTest {

    @Test
    public void checkedExceptionType(){

        ExceptionConcept exceptionConcept = new ExceptionConcept();
        exceptionConcept.checkedExample("src/test/java/Exceptii/exception.txt");
        exceptionConcept.checkedExample("src/test/ja/Exceptii/exception.txt");
    }

    @Test
    public void uncheckedExceptionTypeV1(){

        ExceptionConcept exceptionConcept = new ExceptionConcept();
        exceptionConcept.uncheckedExampleV1();
    }

    @Test
    public void uncheckedExceptionTypeV2(){

        ExceptionConcept exceptionConcept = new ExceptionConcept();
        exceptionConcept.uncheckedExampleV2();
    }
    @Test
    public void throwException(){

        ExceptionConcept exceptionConcept = new ExceptionConcept();
        exceptionConcept.verificareVarsta(20);
        exceptionConcept.verificareVarsta(15);
    }

    @Test

    public  void throwsException() throws FileNotFoundException {

        ExceptionConcept exceptionConcept = new ExceptionConcept();
        exceptionConcept.throwsExample("");
    }
}
