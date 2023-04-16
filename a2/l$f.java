package a2.l$f;
import a2.l;
import java.lang.Object;
import a2.l$m;
import p1.b;

public class l$f	// class@00007f
{
    public final l a;
    public b[] b;

    public void l$f(){
       super(new l(null));
    }
    public void l$f(l p0){
       super();
       this.a = p0;
    }
    public final void a(){
       l$f tb = this.b;
       if (tb != null) {
          int i = 1;
          object oobject = tb[l$m.a(i)];
          object oobject1 = this.b[l$m.a(2)];
          if (oobject1 == null) {
             oobject1 = this.a.f(2);
          }
          if (oobject == null) {
             oobject = this.a.f(i);
          }
          this.f(l.h(oobject, oobject1));
          oobject = this.b[l$m.a(16)];
          if (oobject != null) {
             this.e(oobject);
          }
          oobject = this.b[l$m.a(32)];
          if (oobject != null) {
             this.c(oobject);
          }
          oobject = this.b[l$m.a(64)];
          if (oobject != null) {
             this.g(oobject);
          }
       }
       return;
    }
    public l b(){
       this.a();
       return this.a;
    }
    public void c(b p0){
    }
    public void d(b p0){
    }
    public void e(b p0){
    }
    public void f(b p0){
    }
    public void g(b p0){
    }
}
