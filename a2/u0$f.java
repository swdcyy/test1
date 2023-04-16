package a2.u0$f;
import a2.u0;
import java.lang.Object;
import a2.u0$m;
import p1.b;

public class u0$f	// class@0000b0
{
    public final u0 a;
    public b[] b;

    public void u0$f(){
       super(new u0(null));
    }
    public void u0$f(u0 p0){
       super();
       this.a = p0;
    }
    public final void a(){
       u0$f tb = this.b;
       if (tb != null) {
          object oobject = tb[u0$m.a(1)];
          object oobject1 = this.b[u0$m.a(2)];
          if (oobject != null && oobject1 != null) {
             this.g(b.a(oobject, oobject1));
          }else if(oobject != null){
             this.g(oobject);
          }else if(oobject1 != null){
             this.g(oobject1);
          }
          oobject = this.b[u0$m.a(16)];
          if (oobject != null) {
             this.f(oobject);
          }
          oobject = this.b[u0$m.a(32)];
          if (oobject != null) {
             this.d(oobject);
          }
          oobject = this.b[u0$m.a(64)];
          if (oobject != null) {
             this.h(oobject);
          }
       }
       return;
    }
    public u0 b(){
       this.a();
       return this.a;
    }
    public void c(int p0,b p1){
       if (this.b == null) {
          b[] uobArray = new b[9];
          this.b = uobArray;
       }
       int i = 1;
       while (i <= 256) {
          int i1 = p0 & i;
          if (i1) {
             this.b[u0$m.a(i)] = p1;
          }
          i = i << 1;
       }
       return;
    }
    public void d(b p0){
    }
    public void e(b p0){
    }
    public void f(b p0){
    }
    public void g(b p0){
    }
    public void h(b p0){
    }
}
