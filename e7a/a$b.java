package e7a.a$b;
import d6a.a;
import e7a.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import crd.a;

public final class a$b extends a	// class@002079
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
       this.b.s.dispose();
       a$b tb = this.b;
       tb.s = new a();
       tb.W8();
       return;
    }
    public void i2(){
       if (PatchProxy.applyVoid(null, this, a$b.class, "1")) {
          return;
       }
       this.b.V8();
       return;
    }
}
