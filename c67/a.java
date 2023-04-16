package c67.a;
import b67.a;
import java.lang.Object;
import b67.a$a;
import lp3.e;
import lp3.c;
import lp3.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class a implements a	// class@0004f1
{
    public a$a b;

    public void a(){
       super();
    }
    public void Pc(a$a p0){
       this.b = p0;
    }
    public void create(e p0){
       b.a(this, p0);
    }
    public void destroy(){
       b.b(this);
    }
    public void f1(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       a tb = this.b;
       if (tb != null) {
          tb.f1();
       }
       return;
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       a tb = this.b;
       if (tb != null) {
          tb.k();
       }
       return;
    }
}
