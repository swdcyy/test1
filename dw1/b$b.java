package dw1.b$b;
import cw1.b0;
import dw1.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import dw1.a;
import cw1.a0;
import java.lang.Integer;

public class b$b implements b0	// class@002041
{
    public final b a;

    public void b$b(b p0){
       this.a = p0;
       super();
    }
    public void n2(){
       if (PatchProxy.applyVoid(null, this, b$b.class, "2")) {
          return;
       }
       this.a.P8();
       this.a.A.n2();
       return;
    }
    public void o2(int p0){
       a0.b(this, p0);
    }
    public void q(int p0){
       b$b uob = b$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "1")) {
          return;
       }
       this.a.P8();
       this.a.A.q(p0);
       return;
    }
}
