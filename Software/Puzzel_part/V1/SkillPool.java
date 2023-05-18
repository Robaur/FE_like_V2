//============================================================================//
//
//  Xteck Aka Robaur is the architect of this project
//
//If you want more information, go see https://github.com/Robaur/FE_like_V2
//
//============================================================================//
private class SkillPool{


int YES=1;
int NO=0;

//================================================= THIS IS ALL THE WAY TO BUILD A SKILLPOOL ============================

public SkillPool(){
  this.list=[];
}

//================================================= THIS IS ALL THE FUNCTION ============================================

private AddSkill_SP(Skill add){
  this.list=this.list+{add};
}

private SupSkill_SP(Skill sup){

}

private int SearchSkill_SP(Skill hide){
  for(Skill clue:this.list){
      if (clue==hide){
        return(YES);
      }
  }
  return(NO);
}

////private Skill ReturnSkill_SP(Skill hide) NEED WRITE

//=================================================== THIS IS ALL THE ARGUMENT ===========================================

private Skill[] list;
}
