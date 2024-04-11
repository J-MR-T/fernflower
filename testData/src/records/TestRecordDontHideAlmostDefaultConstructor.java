package records;

public record TestRecordDontHideAlmostDefaultConstructor(int x, int y) {
  public TestRecordDontHideAlmostDefaultConstructor(int x, int y){
    this.x = y;
    this.y = x;
  }
}