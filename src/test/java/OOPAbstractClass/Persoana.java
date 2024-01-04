package OOPAbstractClass;

public abstract class Persoana {

    //Pentru a face o clasa sa fie abstracta, trebuie adaugat intre public si class cuvantul abstract"
    //O clasa abstracta poate sau nu sa contina metode abstracte
    //O clasa abstracta se mosteneste
    //O clasa abstracta poate implementa o interfata
    //O clasa abstracta poate avea un constructor insa nu putem face un obiect
    //Putem avea metode/variabile cu diferite tipuri de acces control (private, public, protected)
    //Metodele abstracte trebuie sa contina cuvantul "abstract"
    //Trebuie sa specificam access control pentru metodele abstracte

    public abstract void munceste();
    public abstract void primesteSalariu();
    public abstract void areConcediu();
    public abstract void mergeLaFacultate();
    public abstract void participaLaCursuri();
    public abstract void sustineExamene();
    public abstract void mergeInVacanta();
    public abstract void treceRestante();

    public void verificaVarsta(Integer varsta){
        if(varsta >= 18){
            System.out.println("Persoana e majora");
        }
        else {
            System.out.println("Persoana este minora");
        }
    }
}
