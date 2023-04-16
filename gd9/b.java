package gd9.b;
import com.yxcorp.gifshow.camera.record.CameraActivity;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;
import k36.c;
import gd9.b$b;
import gd9.b$a;
import k36.f;

public class b	// class@002465
{
    public int a;
    public final CameraActivity b;
    public Integer c;

    public void b(CameraActivity p0){
       super();
       this.a = -1;
       this.b = p0;
    }
    public final void a(int p0){
       boolean b;
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "3")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("FlyWheel", "onModeChange: "+p0, objArray);
       if (this.c == null) {
          this.c = Integer.valueOf(p0);
          b = true;
       }else {
          b = false;
       }
       b ta = this.a;
       if (ta != p0) {
          this.a = p0;
          b$b uob1 = new b$b(ta, p0, this.c.intValue(), b, null);
          c.d().g(v1);
       }
       return;
    }
}
