

import java.util.Scanner;
public class  zooManagement {
    static int nbrcages;
    static String zooname;
    public static void main(String[] args) {
      zooManagement  zm= new zooManagement();
/*System.out.println( zm.zooname+ " " +"comporte" +" " + zm.nbrcages + " " +"cages");*/
  Scanner scan= new Scanner(System.in);
  do {
    System.out.println("Veuillez saisir le nombre de cages du zoo (un nombre entier positif) : ");
 while (!scan.hasNextInt() ){
  System.out.println("Veuillez saisir un nombre entier positif.");
   scan.next();
 }
  nbrcages = scan.nextInt();
 }while (nbrcages<=0) ;
  
  
  Scanner scan1= new Scanner(System.in);
  System.out.println("entrer le nom du zoo ");
  zooname=scan1.nextLine();
  System.out.println(zm.zooname+ " " +"comporte" +" " + zm.nbrcages + " " +"cages");
  

}
}
    



