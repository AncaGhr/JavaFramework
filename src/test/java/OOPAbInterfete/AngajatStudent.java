package OOPAbInterfete;

public class AngajatStudent extends Persoana implements StudentInt, AngajatInt {


    public AngajatStudent(String nume, String prenume, Integer varsta) {
        super(nume, prenume, varsta);
    }


    @Override
    public void munceste() {
        System.out.println("AngajatulStudent munceste");
    }

    @Override
    public void primesteSalariu() {
        System.out.println("AngajatulStudent primeste salariu");
    }

    @Override
    public void areConcediu() {
        System.out.println("AngajatulStudent are concediu");
    }

    @Override
    public void mergeLaFacultate() {
        System.out.println("AngajatulStudent merge la facultate");
    }

    @Override
    public void participaLaCursuri() {
        System.out.println("AngajatulStudent participa la cursuri");
    }

    @Override
    public void sustineExamene() {
        System.out.println("AngajatulStudentsustine examene");
    }

    @Override
    public void mergeInVacanta() {
        System.out.println("AngajatulStudent merge in vacanta");
    }

    @Override
    public void treceRestante() {
        System.out.println("AngajatulStudent trece restantele");
    }

    //
}
