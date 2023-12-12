package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic{
    private float swimmingDepth;
    public Penguin(){

    }
    public void swim(){
        System.out.println("This Penguin animal is swimming");
    }
    public Penguin(String family, String name, int age, boolean isMammal, String habitat, float swimmingDepth) {
        super(family,name ,age,isMammal,habitat);
        this.swimmingDepth = swimmingDepth;
    }
    @Override
    public String toString() {
        return "tn.esprit.gestionzoo.entities.Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                "habitat="+ habitat+
                "swimmingDepth" + swimmingDepth +
                '}';
    }
}
