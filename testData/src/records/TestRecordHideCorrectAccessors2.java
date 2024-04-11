public record TestRecordHideCorrectAccessors2(int x, int y){
  public int x(){
    return y;
  }
}
