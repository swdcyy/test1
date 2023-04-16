package g1.a;
import java.lang.Object;
import androidx.constraintlayout.solver.state.State;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour;
import java.lang.Integer;

public class a	// class@002030
{
    public final int a;
    public int b;
    public int c;
    public float d;
    public int e;
    public float f;
    public Object g;
    public boolean h;
    public static final Object i;
    public static final Object j;
    public static final Object k;
    public static final Object l;
    public static final Object m;

    static {
       a.i = new Object();
       a.j = new Object();
       a.k = new Object();
       a.l = new Object();
       a.m = new Object();
    }
    public void a(){
       super();
       this.a = -2;
       this.b = 0;
       this.c = Integer.MAX_VALUE;
       this.d = 0x3f800000;
       this.e = 0;
       this.f = 0x3f800000;
       this.g = a.j;
       this.h = false;
    }
    public void a(Object p0){
       super();
       this.a = -2;
       this.b = 0;
       this.c = Integer.MAX_VALUE;
       this.d = 0x3f800000;
       this.e = 0;
       this.f = 0x3f800000;
       this.g = a.j;
       this.h = false;
       this.g = p0;
    }
    public static a a(Object p0){
       a uoa = new a(a.i);
       uoa.c(p0);
       return uoa;
    }
    public void b(State p0,ConstraintWidget p1,int p2){
       a tg;
       a tb;
       int i = 2;
       Object obj = Integer.MAX_VALUE;
       if (!p2) {
          if (this.h != null) {
             p1.D0(ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT);
             tg = this.g;
             if (tg == a.j) {
                i = 1;
             }else if(tg == a.m){
                i = 0;
             }
             p1.E0(i, this.b, this.c, this.d);
          }else {
             tb = this.b;
             if (tb > null) {
                p1.O0(tb);
             }
             tb = this.c;
             if (tb < obj) {
                p1.L0(tb);
             }
             tb = this.g;
             if (tb == a.j) {
                p1.D0(ConstraintWidget$DimensionBehaviour.WRAP_CONTENT);
             }else if(tb == a.l){
                p1.D0(ConstraintWidget$DimensionBehaviour.MATCH_PARENT);
             }else if(tb == null){
                p1.D0(ConstraintWidget$DimensionBehaviour.FIXED);
                p1.Y0(this.e);
             }
          }
       }else if(this.h != null){
          p1.U0(ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT);
          tg = this.g;
          if (tg == a.j) {
             i = 1;
          }else if(tg == a.m){
             i = 0;
          }
          p1.V0(i, this.b, this.c, this.d);
       }else {
          tb = this.b;
          if (tb > null) {
             p1.N0(tb);
          }
          tb = this.c;
          if (tb < obj) {
             p1.K0(tb);
          }
          tb = this.g;
          if (tb == a.j) {
             p1.U0(ConstraintWidget$DimensionBehaviour.WRAP_CONTENT);
          }else if(tb == a.l){
             p1.U0(ConstraintWidget$DimensionBehaviour.MATCH_PARENT);
          }else if(tb == null){
             p1.U0(ConstraintWidget$DimensionBehaviour.FIXED);
             p1.z0(this.e);
          }
       }
       return;
    }
    public a c(Object p0){
       this.g = p0;
       if (p0 instanceof Integer) {
          this.e = p0.intValue();
          this.g = 0;
       }
       return this;
    }
    public int d(){
       return this.e;
    }
}
