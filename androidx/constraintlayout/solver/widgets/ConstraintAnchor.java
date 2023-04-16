package androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type;
import java.lang.Object;
import java.util.HashSet;
import java.util.ArrayList;
import i1.j;
import java.util.Iterator;
import i1.g;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor$a;
import java.lang.Enum;
import java.lang.AssertionError;
import java.lang.String;
import androidx.constraintlayout.solver.SolverVariable;
import androidx.constraintlayout.solver.widgets.f;
import f1.a;
import androidx.constraintlayout.solver.SolverVariable$Type;
import java.lang.StringBuilder;

public class ConstraintAnchor	// class@00068c
{
    public HashSet a;
    public int b;
    public boolean c;
    public final ConstraintWidget d;
    public final ConstraintAnchor$Type e;
    public ConstraintAnchor f;
    public int g;
    public int h;
    public SolverVariable i;

    public void ConstraintAnchor(ConstraintWidget p0,ConstraintAnchor$Type p1){
       super();
       this.a = null;
       this.g = 0;
       this.h = -1;
       this.d = p0;
       this.e = p1;
    }
    public boolean a(ConstraintAnchor p0,int p1){
       return this.b(p0, p1, -1, false);
    }
    public boolean b(ConstraintAnchor p0,int p1,int p2,boolean p3){
       if (p0 == null) {
          this.q();
          return true;
       }else if(!p3 && !this.p(p0)){
          return false;
       }else {
          this.f = p0;
          if (p0.a == null) {
             p0.a = new HashSet();
          }
          p0 = this.f.a;
          if (p0 != null) {
             p0.add(this);
          }
          this.g = (p1 > 0)? p1: 0;
          this.h = p2;
          return true;
       }
    }
    public void c(int p0,ArrayList p1,j p2){
       ConstraintAnchor ta = this.a;
       if (ta != null) {
          Iterator iterator = ta.iterator();
          while (iterator.hasNext()) {
             g.a(iterator.next().d, p0, p1, p2);
          }
       }
       return;
    }
    public HashSet d(){
       return this.a;
    }
    public int e(){
       if (this.c == null) {
          return 0;
       }
       return this.b;
    }
    public int f(){
       if (this.d.T() == 8) {
          return 0;
       }
       if (this.h > -1) {
          ConstraintAnchor tf = this.f;
          if (tf != null && tf.d.T() == 8) {
             return this.h;
          }
       }
       return this.g;
    }
    public final ConstraintAnchor g(){
       switch (ConstraintAnchor$a.a[this.e.ordinal()]){
           case 1:
           case 6:
           case 7:
           case 8:
           case 9:
             return null;
           case 2:
             return this.d.L;
           case 3:
             return this.d.J;
           case 4:
             return this.d.M;
           case 5:
             return this.d.K;
           default:
             throw new AssertionError(this.e.name());
       }
    }
    public ConstraintWidget h(){
       return this.d;
    }
    public SolverVariable i(){
       return this.i;
    }
    public ConstraintAnchor j(){
       return this.f;
    }
    public ConstraintAnchor$Type k(){
       return this.e;
    }
    public boolean l(){
       ConstraintAnchor ta = this.a;
       if (ta == null) {
          return false;
       }
       Iterator iterator = ta.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return false;
          }
          if (iterator.next().g().o()) {
             break ;
          }
       }
       return true;
    }
    public boolean m(){
       ConstraintAnchor ta = this.a;
       boolean b = false;
       if (ta == null) {
          return b;
       }
       if (ta.size() > 0) {
          b = true;
       }
       return b;
    }
    public boolean n(){
       return this.c;
    }
    public boolean o(){
       boolean b = (this.f != null)? true: false;
       return b;
    }
    public boolean p(ConstraintAnchor p0){
       boolean b1;
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       ConstraintAnchor$Type type = p0.k();
       ConstraintAnchor te = this.e;
       if (type == te) {
          if (te == ConstraintAnchor$Type.BASELINE && (!p0.h().X() || !this.h().X())) {
             return b;
          }else {
             return true;
          }
       }else {
          switch (ConstraintAnchor$a.a[te.ordinal()]){
              case 1:
                if (type != ConstraintAnchor$Type.BASELINE && (type != ConstraintAnchor$Type.CENTER_X && type != ConstraintAnchor$Type.CENTER_Y)) {
                   b = true;
                }
                break;
              case 2:
              case 3:
                b1 = (type == ConstraintAnchor$Type.LEFT || type == ConstraintAnchor$Type.RIGHT)? true: false;
                if (p0.h() instanceof f) {
                   if (b1 || type == ConstraintAnchor$Type.CENTER_X) {
                      b = 1;
                   }
                   b1 = b;
                }
                return b1;
                break;
              case 4:
              case 5:
                b1 = (type == ConstraintAnchor$Type.TOP || type == ConstraintAnchor$Type.BOTTOM)? true: false;
                if (p0.h() instanceof f) {
                   if (b1 || type == ConstraintAnchor$Type.CENTER_Y) {
                      b = 1;
                   }
                   b1 = b;
                }
                return b1;
                break;
              case 6:
              case 8:
              case 9:
              case 7:
                return b;
              default:
                throw new AssertionError(this.e.name());
          }
          return b;
       }
    }
    public void q(){
       ConstraintAnchor tf = this.f;
       HashSet hashSet = null;
       if (tf != null) {
          tf = tf.a;
          if (tf != null) {
             tf.remove(this);
             if (!this.f.a.size()) {
                this.f.a = hashSet;
             }
          }
       }
       this.a = hashSet;
       this.f = hashSet;
       this.g = 0;
       this.h = -1;
       this.c = false;
       this.b = 0;
       return;
    }
    public void r(){
       this.c = false;
       this.b = 0;
    }
    public void s(a p0){
       ConstraintAnchor ti = this.i;
       if (ti == null) {
          this.i = new SolverVariable(SolverVariable$Type.UNRESTRICTED, null);
       }else {
          ti.d();
       }
       return;
    }
    public void t(int p0){
       this.b = p0;
       this.c = true;
    }
    public String toString(){
       return this.d.u()+":"+this.e.toString();
    }
    public void u(int p0){
       if (this.o()) {
          this.h = p0;
       }
       return;
    }
}
