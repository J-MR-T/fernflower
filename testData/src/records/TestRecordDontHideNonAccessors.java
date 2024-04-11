public record TestRecordDontHideNonAccessors(int x, int y){
  // returns x, but isnt the auto generated accessor
  public int theX(){
    return x;
  }
}
