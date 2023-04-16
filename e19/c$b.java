package e19.c$b;
import d6a.a;
import e19.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import e19.d;
import java.lang.Runnable;
import ekd.k1;

public class c$b extends a	// class@00211e
{
    public final c b;

    public void c$b(c p0){
       this.b = p0;
       super();
    }
    public void B0(){
       if (PatchProxy.applyVoid(null, this, c$b.class, "3")) {
          return;
       }
       c$b tb = this.b;
       tb.y = false;
       tb.X8();
       return;
    }
    public void F1(){
       if (PatchProxy.applyVoid(null, this, c$b.class, "2")) {
          return;
       }
       c$b tb = this.b;
       tb.y = false;
       tb.X8();
       return;
    }
    public void i2(){
       if (PatchProxy.applyVoid(null, this, c$b.class, "1")) {
          return;
       }
       c$b tb = this.b;
       tb.y = true;
       if (tb.z != null) {
          tb.R8();
          d uod = new d(this);
          this.b.A = uod;
          k1.r(uod, 450);
       }
       return;
    }
}
