package k8a.a$b;
import d6a.a;
import k8a.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.k1;
import k8a.a$b$a;
import java.lang.Runnable;

public final class a$b extends a	// class@002c14
{
    public final a b;

    public void a$b(a p0){
       this.b = p0;
       super();
    }
    public void F1(){
       if (PatchProxy.applyVoid(null, this, a$b.class, "2")) {
          return;
       }
       k1.n(this.b);
       return;
    }
    public void i2(){
       if (PatchProxy.applyVoid(null, this, a$b.class, "1")) {
          return;
       }
       k1.s(new a$b$a(this), this.b, 1000);
       return;
    }
}
