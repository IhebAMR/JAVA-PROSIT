package tn.esprit.gestionzoo.entities;

public class Animal {
private String family;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       
private String name;
private int age;
private boolean isMammal;
 
public Animal(String family,String name,int age,boolean isMammal ) {
    this.family=family;
    this.name=name;
    this.age=age;
    this.isMammal=isMammal;
}          

public String getFamily() {
    return family;
}

public void setFamily(String family) {
    this.family = family;
}

public String getName() {
    return name;
}

public void setName(String name) {
    if (name != null && !name.isEmpty()) {
        this.name = name;
    } else {
        System.out.println("Le nom de l'animal ne peut pas être vide.");
    }
}

public int getAge() {
    return age;
}

public void setAge(int age) {
    if (age >= 0) {
        this.age = age;
    } else {
        System.out.println("L'âge de l'animal ne peut pas être négatif.");
    }
}

public boolean isMammal() {
    return isMammal;
}

public void setMammal(boolean isMammal) {
    this.isMammal = isMammal;
}

@Override
public String toString() {
    return "family: " + family + ", name: " + name + ",age:" + age+ ",ismamal:"+ isMammal;
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      

public static void main(String[] args) {
    
    Animal horse=new Animal("horses","zen", 5, true);
    Animal aigle=new Animal("birds","aze", 1, false);
    
    
    System.out.println(horse);
    System.out.println(aigle.toString());
 
        
    }
    
}
    

