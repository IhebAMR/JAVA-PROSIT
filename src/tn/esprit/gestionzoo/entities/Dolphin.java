package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatic{
    private float swimmingSpeed;
    public Dolphin(){

    }
    public Dolphin(String family, String name, int age, boolean isMammal, String habitat, float swimmingSpeed) {
        super(family,name ,age,isMammal,habitat);
        this.swimmingSpeed = swimmingSpeed;
    }
    public void swim(){
        System.out.println("This dolphin animal is swimming");
    }
    @Override
    public String toString() {
        return "tn.esprit.gestionzoo.entities.Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                "habitat="+ habitat+
                "swimmingSpeed" + swimmingSpeed +
                '}';
    }
}
