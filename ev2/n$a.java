package ev2.n$a;
import h02.d;
import ev2.n;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ev2.l;
import zx2.c;
import qu2.a;
import co2.f2;
import zx2.c$a;
import ev2.k;

public final class n$a implements d	// class@002804
{
    public final n a;
    public final boolean b;

    public void n$a(n p0,boolean p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void a(){
       n c;
       if (PatchProxy.applyVoid(null, this, n$a.class, "1")) {
          return;
       }
       n g = this.a.g;
       if (g != null) {
          g.a();
       }
       c$a a = c.a;
       n$a ta = this.a;
       n b = ta.b;
       c = ta.c;
       String str = (this.b != null)? "CONFIRM_SETTING": "OPEN_VIDEO";
       a.a(b, c, str);
       this.a.a();
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, n$a.class, "3")) {
          return;
       }
       this.a.d.switchCamera();
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, n$a.class, "2")) {
          return;
       }
       n g = this.a.g;
       if (g != null) {
          g.e();
       }
       n$a ta = this.a;
       c.a.a(ta.b, ta.c, "CLOSE");
       this.a.a();
       return;
    }
}
