package e2.a$b;
import java.lang.Runnable;
import e2.a;
import java.lang.Object;
import e2.a$a;
import android.view.View;
import a2.i0;

public class a$b implements Runnable	// class@001ecf
{
    public final a b;

    public void a$b(a p0){
       this.b = p0;
       super();
    }
    public void run(){
       a$b tb = this.b;
       if (tb.p == null) {
          return;
       }
       boolean b = false;
       if (tb.n != null) {
          tb.n = b;
          tb.b.m();
       }
       a b1 = this.b.b;
       if (b1.h() || !this.b.u()) {
          this.b.p = b;
          return;
       }else {
          a$b tb1 = this.b;
          if (tb1.o != null) {
             tb1.o = b;
             tb1.c();
          }
          b1.a();
          this.b.j(b1.b(), b1.c());
          i0.k0(this.b.d, this);
          return;
       }
    }
}
