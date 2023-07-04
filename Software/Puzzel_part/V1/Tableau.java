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
    for( int j=0;j<20;j++){
		this.Tab[j][i] = new Case(j,i);
    }
  }
  this.size = new int[2];
  this.changeIntSize(20,0);
  this.changeIntSize(20,1);
}

public Tableau(int n){
  for( int i=0;i<n;i++){
    for( int j=0;j<n;j++){
      this.Tab[i][j]=new Case();
    
  }
  this.size = new int[2];
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
    this.size = new int[2];
    this.changeIntSize(n,0);
    this.changeIntSize(m,1);
  }
  


//================================================= THIS IS ALL THE METHODE ============================
public void PrintTab(){
  for(int i=0;i<this.size[0];i++){
	  System.out.print("\n");
    for(int j=0;j<this.size[1];j++){
		System.out.print("["+this.Tab[i][j].Boy.ReturnREP()+"]");
    }
  }
  System.out.print("\n");
}

public void changeIntSize(int n,int sizeplace){
	this.size[sizeplace]=n;
	
	}
public void PoppingChar(int x,int y,Character BOY){
	this.Tab[x][y].AttribBOY(BOY);
	}

public void Depla_1_BOY(int x, int y,int order){ 
	switch (order){
		case 0: // go north 
			this.Tab[x][y].ChangeCaseCharact(this.Tab[x][y+1]);
			break;
		case 1: // go left 
			this.Tab[x][y].ChangeCaseCharact(this.Tab[x-1][y]);
			break;
		case 2: // go south 
			this.Tab[x][y].ChangeCaseCharact(this.Tab[x][y-1]);
			break;
		default: // go right
			this.Tab[x][y].ChangeCaseCharact(this.Tab[x+1][y]);
			break;
		}
	}

//================================================== THIS IS ALL THE ARGUMENT =====================================


public Case[][] Tab;
private int[] size;
}
