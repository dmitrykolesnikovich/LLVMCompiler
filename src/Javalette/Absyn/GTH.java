package Javalette.Absyn; // Java Package generated by the BNF Converter.

public class GTH extends RelOp {
  public GTH() { }

  public <R,A> R accept(Javalette.Absyn.RelOp.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof Javalette.Absyn.GTH) {
      return true;
    }
    return false;
  }

  public int hashCode() {
    return 37;
  }


}