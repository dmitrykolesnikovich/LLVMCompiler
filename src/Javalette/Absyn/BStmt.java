package Javalette.Absyn; // Java Package generated by the BNF Converter.

public class BStmt extends Stmt {
  public final Blk blk_;
  public BStmt(Blk p1) { blk_ = p1; }

  public <R,A> R accept(Javalette.Absyn.Stmt.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof Javalette.Absyn.BStmt) {
      Javalette.Absyn.BStmt x = (Javalette.Absyn.BStmt)o;
      return this.blk_.equals(x.blk_);
    }
    return false;
  }

  public int hashCode() {
    return this.blk_.hashCode();
  }


}
