public class Animal {
String family;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       
String name;
int age;
boolean isMammal;
public Animal(String family,String name,int age,boolean isMammal ) {
    this.family=family;
    this.name=name;
    this.age=age;
    this.isMammal=isMammal;
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
    

