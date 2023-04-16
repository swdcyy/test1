package e19.g$b;
import d6a.a;
import e19.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import p5a.e;
import de5.a;
import p5a.c;

public class g$b extends a	// class@002126
{
    public final g b;

    public void g$b(g p0){
       this.b = p0;
       super();
    }
    public void F1(){
       if (PatchProxy.applyVoid(null, this, g$b.class, "2")) {
          return;
       }
       g$b tb = this.b;
       tb.y = false;
       tb.S8();
       return;
    }
    public void i2(){
       if (PatchProxy.applyVoid(null, this, g$b.class, "1")) {
          return;
       }
       g$b tb = this.b;
       tb.y = true;
       g r = tb.r;
       if (r != null && r.getPlayer().i() == 2) {
          this.b.V8();
       }
       return;
    }
}
