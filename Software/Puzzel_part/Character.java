// Code fait par ROBIN AURIAC ENSEA 2023

public class Character{
  private int[] position;
  // 0 est X et 1 est Y
  private int[] stat;
  /*
  Cette variable appeller stat représente les statistique du caracter
  c'est un tobleau par soucis de practiciter, elle peut donc ainsi varier en toute liberté et
  l'on peut en ajouter aux desir du développer
  pour le moment cette liste présente les valeurs suivante
  0=Life, représente la vie du personnage
  1=ATK, représente l'attaque d'un personnage
  2=Def représente la defence du personnage
  3=Armure, représente la capactité a ignorer des point de dégat mais aug les dégat magic
  4=Mouvement, de combient de case on peut se déplacer aux maximun
  */
  private int[] Action;
  /*
  Cette liste permet de savoir si le personnage a deja "fait ces actions"
  Un personnage par tour peut faire normalement deux choses
  Action[0] correspond a bouger sur la carte
  Action[1] correspond a Agir : Atk, se mouvoir a nouveau, Garder, Utiliser un objet, utiliser de la magic ect..
  Action[2] correspond a Overcome: Elle permet d'Agir a nouveau mais fait prendre des dégat a ajoute un malus de Stat
  */
private String name;
private char face;

public Character(int Life,int ATK,int Def, int Arm,String name){
  this.initialCaracCar();
  this.name=name;
  this.stat[0]=Life;
  this.stat[1]=ATK;
  this.stat[2]=Def;
  this.stat[3]=Arm;
  this.face=name.charAt(0);
}

public Character(){
  this.name="Open";
  this.initialCaracCar();
  this.face='O';
}

public Character(String name){
  this.name=name;
  this.initialCaracCar();
  this.face=name.charAt(0);
}

private void initialCaracCar(){
  this.position= new int[2];
  this.position[0]=3;
  this.position[1]=3;
  this.stat= new int[4];
  this.stat[0]=1;
  this.stat[1]=2;
  this.stat[2]=3;
  this.stat[3]=4;
  this.Action= new int[3];
  this.Action[0]=0;
  this.Action[1]=0;
  this.Action[2]=0;
}


  public char gettingFace(){
    return(this.face);
  }

  public String getnameCha(){
    return(this.name);
  }

 public void move(int order_conv,Tab plat){
    switch(order_conv){
    case 1:
    if((this.position[0]+1)>Tab.gettingTabSize()){System.out.println("Impossible");}
    else{this.postion[0]=this.postion[0]+1;}
    break;
    default:
    break;
  }
  }
  public int gettingX(){
    return(this.position[0]);
  }
  public int gettingY(){
    return(this.position[1]);
  }
}
