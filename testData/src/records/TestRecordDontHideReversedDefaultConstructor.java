package records;

public record TestRecordDontHideReversedDefaultConstructor(int x, int y) {
  public TestRecordDontHideReversedDefaultConstructor(int x, int y){
    this.y = y;
    this.x = x;
  }
}