// Code fait par ROBIN AURIAC ENSEA 2023


import java.util.Scanner;
public class Order{
  /*
  Cette classe a pour but de recevoir, de traduire et de transcrire a la marchine les ordres du joueur
  elle est le premier lien entre le joueur et le jeu
  */
  private String order;
  /*
Représente les odres qui peuvent etre donner par le joueur par la console (system provisoire), elle comporte les mot clef suivant
MENU- menu qui amènera vers les options
HELP- Qui affichera les aides/ indication possible + le lexique
NORTH/SOUTH/EST/WEST - qui donne un deplacement
SWITCH - qui donne l'ordre de changer de personnage
END - Fin de tour
  */
  public Order(){
    String order = new String();
    this.order=this.SettingOrder();
    this.Conv=this.ConversionOrder();
  }

  public String SettingOrder(){
    Scanner in = new Scanner(System.in);
    this.order = in.nextLine();
    this.order =this.order.toUpperCase(); //met tout en majuscule --- On peut tout mettre en minuscule avec toLowerCase()
    return(this.order);
  }
  /*  private String WashingOrder(String order){

      Traite l'information donner pour que cette dernier puissent etre

     char[]

je ne sait pas si j'utilise les fonctions comme tirm()(enleve les espaces avant et après le mot)  ou juste toUpperCase()
autres bonne fonctions length() endsWith() equals()
     */
     private int ConversionOrder(){
       if(this.order.equals("NORTH")){return(1);}
       if(this.order.equals("SOUTH")){return(2);}
       if(this.order.equals("WEST")){return(3);}
      if(this.order.equals("EST")){return(4);}
      if(this.order.equals("SWITCH")){return(5);}
      if(this.order.equals("MENU")){return(6);}
      if(this.order.equals("HELP")){return(7);}
      if(this.order.equals("END")){return(8);}
      return(66);
     }

     private int Conv;

     public int gettingOrderConv(){
       return(this.Conv);
     }
}
