
// Code fait par ROBIN AURIAC ENSEA 2023
// cette partie permet de code l'objet Tableaux appeller ici Tab, sur cette objet nous allons avoir


public class Tab{       // private is like to the encapulation -- the choise of what is
  private int[][] plat;  // final : can't be change
  private int Size;     // you can have a class in a class
                        //ArratList<String>



  public Tab(int Size){ // the first methode is name the CONSTRUCTOR to construct the object, and fell every attribute
    this.Size=Size;
    this.plat = new int[Size][Size];
  }

  public Tab(){
    this.Size=20;
    this.plat = new int[20][20];
  }

  public int[][] first_set_Tab(){
    for(int y=0;y<this.Size;y++){
      for(int x=0;x<this.Size;x++){
        this.plat[x][y]=0;
      }
    }
    return(this.plat);
  }

  public void print_plat(){
    for(int y=0;y<this.Size;y++){
      for(int x=0;x<this.Size;x++){
        System.out.print("["+plat[x][y]+"]");
      }
      System.out.print("\n");
    }
    System.out.print("\n");
  }

  public void print_plat(Character boy){
    for(int y=0;y<this.Size;y++){
      for(int x=0;x<this.Size;x++){
        if(detec_Char_position(boy,x,y)==1){System.out.print("["+boy.gettingFace()+"]");}
        else{System.out.print("["+plat[x][y]+"]");}
      }
      System.out.print("\n");
    }
    System.out.print("\n");
  }

  public int detec_Char_position(Character boy, int x,int y){
    if(x==boy.gettingX() && y==boy.gettingY()){return(1);}
    return(0);
  }
  public int gettingTabSize(){
    return(this.Size);
  }
}


// Local.ROOT
// check the equality is not the best because if they are a problem
// @Override back word compatibility, should be usee to cast an now string
// key words is extend 
