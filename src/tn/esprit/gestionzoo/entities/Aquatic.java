package tn.esprit.gestionzoo.entities;

public abstract class Aquatic extends Animal{
    protected String habitat ;

    public Aquatic(){
    }
    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family,name ,age,isMammal);
        this.habitat = habitat;
    }
    public abstract void swim();
    @Override
    public String toString() {
        return "tn.esprit.gestionzoo.entities.Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                "habitat="+ habitat+
                '}';
    }
    @Override
    public boolean equals (Object obj){
        if(null == obj) return false ;
        if(obj instanceof Aquatic aquatic){
            return age==aquatic.age && name.equals(aquatic.name) && habitat.equals(aquatic.habitat);
        }
        return false;
    }


}
