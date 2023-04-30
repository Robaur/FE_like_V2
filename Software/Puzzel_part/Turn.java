// Code fait par ROBIN AURIAC ENSEA 2023

// Turn est une class qui a pour but de cree un tour de jeu n qui sera donc numéroté n 

public class Turn{

  public Turn(Tab plat,Character Cha_select){
    this.nbTurn=0;
    this.plat=plat;
    this.Cha_select=Cha_select;
    System.out.println("Debut de la Partie");
    while()
  }

  public Action_faite(int Order_Conv){
    switch(Order_Conv){
      case 1:
        move(1,this.Cha_select);
      break;
      default:
      System.out.println("bro ... wtf");
      break;




    }
  }


private int nbTurn;
private Character Cha_select;
private Tab plat;
}
