package tn.esprit.gestionzoo.entities;
public class zoo {
private Animal [] animals;
private String name;
private String city;
 public static final int MAX_CAGES = 25;
private int nbrAnimals;

public zoo( String name, String city,int MAX_CAGES) {
    this.name = name;
    this.city = city;
    this.animals= new Animal[MAX_CAGES];
}
public Animal[] getAnimals() {
    return animals;
}
public void setAnimals(Animal[] animals) {
    this.animals = animals;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public String getCity() {
    return city;
}
public void setCity(String city) {
    this.city = city;
}
public int getNbrAnimals() {
    return nbrAnimals;
}
public void setNbrAnimals(int nbrAnimals) {
    this.nbrAnimals = nbrAnimals;
}
@Override
public String toString() {
    return "Zoo: " + name + ", City: " + city + ", Number of Cages: " + MAX_CAGES;
}

public boolean addAnimal(Animal animal) {
    if (!isZooFull()) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] == null) {
                animals[i] = animal;
                return true;
            }
        }
    }
    return false;
}

public void displayAnimals() {
    for (int i = 0; i < animals.length; i++) {
        if (animals[i] != null) {
            System.out.println(animals[i]);
        }
    }
}

        public int searchAnimal(String animalName) {
            for (int i = 0; i < animals.length; i++) {
                if (animals[i] != null && animals[i].getName().equals(animalName)) {
                    return i;
                }
            }
            return -1; 
        }
        
        public boolean removeAnimal(Animal animal) {
            for (int i = 0; i < animals.length; i++) {
                if (animals[i] != null && animals[i].equals(animal)) {
                    animals[i] = null;
                    return true;
                }
            }
            return false;
        }

        public boolean isZooFull() {
            int count = 0;
            for (int i = 0; i < animals.length; i++) {
                if (animals[i] != null) {
                    count++;
                }
            }
            return count == MAX_CAGES;
        }

            public static zoo comparerZoo(zoo z1, zoo z2) {
                if (z1.nbrAnimals > z2.nbrAnimals)
                    return z1;
                return z2;
            }
    
        
        
    


public static void main(String[] args) {
   
    zoo myZoo=new zoo("wild zoo", "tunis",MAX_CAGES);
   
    System.out.println(myZoo);
    System.out.println(myZoo.toString());
    Animal lion=new Animal("lions","lion",10, true);
    Animal giraffe=new Animal("lions","giraffe",10, true);
    Animal elephant=new Animal("fish","elephant",5, true);
    Animal tiger=new Animal("tigers","tiger",1 ,true);

   myZoo.addAnimal(lion);
    myZoo.addAnimal(giraffe);
     myZoo.addAnimal(elephant);
      myZoo.addAnimal(tiger);


     int lionIndex = myZoo.searchAnimal("lion");
    int giraffeIndex = myZoo.searchAnimal("giraffe");
    int elephantIndex = myZoo.searchAnimal("elephant");
    int tigerIndex = myZoo.searchAnimal("tiger");

    System.out.println("lion found at index: " + lionIndex);
    System.out.println("Giraffe found at index: " + giraffeIndex);
    System.out.println("Elephant found at index: " + elephantIndex);
  System.out.println("tiger found at index: " + tigerIndex);
    myZoo.displayAnimals();
    myZoo.removeAnimal(giraffe);
      myZoo.displayAnimals();
      boolean isFull = myZoo.isZooFull(); //tester la méthode isZooFull
      System.out.println("Le zoo est-il plein ? " + isFull);
  }


}
  