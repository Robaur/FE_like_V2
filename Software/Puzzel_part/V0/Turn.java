// Code fait par ROBIN AURIAC ENSEA 2023

// Turn est une class qui a pour but de cree un tour de jeu n qui sera donc numéroté n

public class Turn{

  public Turn(Tab plat){
    this.nbTurn=0;
    this.plat=plat;
    System.out.println("Debut de la Partie");
    while()
  }


  public Turn(){
    this.nbTurn=intiat_NB();
    this.plat=Tab();
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


  private intiat_NB(void){
    this.nbTurn=0;
  }

  private NextTurn(void){
    this.nbTurn++1;
  }




private int nbTurn;
private Tab plat;
}
