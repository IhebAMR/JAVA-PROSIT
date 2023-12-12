package tn.esprit.gestionzoo.entities;

public class Terrestrial extends Animal{
    private int nbrLegs ;
    public Terrestrial(){}
    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family,name ,age,isMammal);
        this.nbrLegs = nbrLegs;
    }
    @Override
    public String toString() {
        return "tn.esprit.gestionzoo.entities.Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                "nbrLegs="+ nbrLegs+
                '}';
    }
}
