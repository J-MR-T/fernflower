package records;

public record TestRecordDontHideEmptyConstructor(int x, int y) {
  public TestRecordDontHideEmptyConstructor(){
    this(0, 0);
  }
}
