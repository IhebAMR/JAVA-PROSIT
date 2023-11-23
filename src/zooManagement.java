

import java.util.Scanner;
public class  zooManagement {
    static int nbrcages;
    static String zooname;
    public static void main(String[] args) {
      zooManagement  zm= new zooManagement();
/*System.out.println( zm.zooname+ " " +"comporte" +" " + zm.nbrcages + " " +"cages");*/
  Scanner scan= new Scanner(System.in);
  System.out.println("entrer le nombre des cages:");
  nbrcages = scan.nextInt();
  Scanner scan1= new Scanner(System.in);
  System.out.println("entrer le nom du zoo ");
  zooname=scan1.nextLine();
  System.out.println(zm.zooname+ " " +"comporte" +" " + zm.nbrcages + " " +"cages");

}
}
    



