//============================================================================//
//
//  Xteck Aka Robaur is the architect of this project
//
//If you want more information, go see https://github.com/Robaur/FE_like_V2
//
//============================================================================//

public class Tableau{

//================================================= THIS IS ALL THE WAY TO BUILD A TABLEAU ============================

public Tableau(){
	this.Tab = new Case[20][20];
  for( int i=0;i<20;i++){
	  System.out.println("\n"); // useless    debug
	  System.out.println(i); // debug
    for( int j=0;j<20;j++){
		System.out.println(j);    // debug
		this.Tab[j][i] = new Case(j,i);
    }
  }
  this.changeIntSize(20,0);
  this.changeIntSize(20,1);
}

public Tableau(int n){
  for( int i=0;i<n;i++){
    for( int j=0;j<n;j++){
      this.Tab[i][j]=new Case();
    
  }
  this.changeIntSize(n,0);
  this.changeIntSize(n,1);
}
}

public Tableau(int n,int m){
  for(int i=0;i<n;i++){
    for(int j=0;j<m;j++){
      this.Tab[i][j]=new Case();
      }
    }
    this.changeIntSize(n,0);
    this.changeIntSize(m,1);
  }
  


//================================================= THIS IS ALL THE METHODE ============================
public void PrintTab(){
  for(int i=0;i<this.size[0];i++){
    for(int j=0;j<this.size[1];j++){
        System.out.println("["+this.Tab[i][j].type+"]");
    }
  }
}

public void changeIntSize(int n,int sizeplace){
	this.size[sizeplace]=n;
	
	}



public Case[][] Tab;
private int[] size;
}
