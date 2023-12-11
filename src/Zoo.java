public class Zoo {
Animal [] animals;
String name;
String city;
int nbrCages;

public Zoo( String name, String city, int nbrCages) {
    this.name = name;
    this.city = city;
    this.nbrCages = nbrCages;
    this.animals= new Animal[25];
}
@Override
public String toString() {
    return "Zoo: " + name + ", City: " + city + ", Number of Cages: " + nbrCages;
}

public boolean addAnimal(Animal animal) {
    for (int i = 0; i < animals.length; i++) {
        if (animals[i] == null) {
            animals[i] = animal;
            return true;
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
                if (animals[i] != null && animals[i].name.equals(animalName)) {
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
        
    


public static void main(String[] args) {
   
    Zoo myZoo=new Zoo("wild zoo", "tunis", 25);
   
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
   
    

    
    }
}



