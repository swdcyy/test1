package c8a.b$b;
import d6a.a;
import c8a.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class b$b extends a	// class@000571
{
    public final b b;

    public void b$b(b p0){
       this.b = p0;
       super();
    }
    public void F1(){
       if (PatchProxy.applyVoid(null, this, b$b.class, "2")) {
          return;
       }
       b$b tb = this.b;
       tb.v = false;
       tb.u = 0;
       return;
    }
    public void i2(){
       if (PatchProxy.applyVoid(null, this, b$b.class, "1")) {
          return;
       }
       b$b tb = this.b;
       tb.v = true;
       tb.u = 0;
       return;
    }
}
