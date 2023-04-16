package k76.a$a;
import q97.c;
import k76.a;
import k76.a$b;
import java.lang.Object;
import java.lang.String;
import java.lang.Throwable;
import q97.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import q87.c;

public class a$a implements c	// class@001bd1
{
    public final a$b a;
    public final a b;

    public void a$a(a p0,a$b p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(String p0,Throwable p1){
       b.e(this, p0, p1);
    }
    public void b(String p0){
       b.i(this, p0);
    }
    public void c(Throwable p0){
       b.f(this, p0);
    }
    public void d(String p0){
       b.a(this, p0);
    }
    public void d(String p0,String p1){
       b.b(this, p0, p1);
    }
    public void d(String p0,String p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a$a.class, "2")) {
          return;
       }
       this.a.r(p0, p1, p2);
       return;
    }
    public void e(String p0){
       b.g(this, p0);
    }
    public void e(String p0,String p1){
       b.d(this, p0, p1);
    }
    public void e(String p0,String p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a$a.class, "5")) {
          return;
       }
       this.a.e(p0, p1, p2);
       return;
    }
    public void f(String p0){
       b.k(this, p0);
    }
    public void g(String p0){
       b.c(this, p0);
    }
    public void i(String p0,String p1){
       b.h(this, p0, p1);
    }
    public void i(String p0,String p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a$a.class, "3")) {
          return;
       }
       this.a.v(p0, p1, p2);
       return;
    }
    public void v(String p0,String p1){
       b.j(this, p0, p1);
    }
    public void v(String p0,String p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a$a.class, "1")) {
          return;
       }
       this.a.x(p0, p1, p2);
       return;
    }
    public void w(String p0,String p1){
       b.l(this, p0, p1);
    }
    public void w(String p0,String p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a$a.class, "4")) {
          return;
       }
       this.a.z(p0, p1, p2);
       return;
    }
}
