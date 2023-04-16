package ckc.a$c;
import so7.d;
import sx4.e;
import tx4.w;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.widget.FrameLayout;
import android.os.SystemClock;
import ckc.a;
import java.lang.Long;
import lnc.i3;
import wkd.b;
import com.kwai.framework.perf.phonelevel.d;
import java.lang.Integer;
import java.lang.Number;
import tkd.b;
import tkd.d;
import rx4.i;
import k2b.u1;

public class a$c implements d	// class@0005c1
{
    public final e a;
    public final w b;

    public void a$c(e p0,w p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public View a(){
       Object obj = PatchProxy.apply(null, this, a$c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getView();
    }
    public void setData(Object[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$c.class, "1")) {
          return;
       }
       if (this.a != null) {
          this.a.setData(p0);
          long l = SystemClock.uptimeMillis() - SystemClock.uptimeMillis();
          a$c tb = this.b;
          a uoa = a.class;
          if (PatchProxy.isSupport(uoa) && (!PatchProxy.applyVoidTwoRefs(Long.valueOf(l), tb, null, uoa, "2") && tb != null)) {
             i3 oi3 = i3.f();
             oi3.c("phoneCommonLevel", Integer.valueOf(b.a(-404437045).c()));
             oi3.c("phoneRenderLevel", Integer.valueOf(b.a(-404437045).d()));
             oi3.c("TK_bindDataTime", Long.valueOf(l));
             oi3.d("engineVersion", d.a(0x256720e1).nr());
             oi3.c("bundleVersionCode", Integer.valueOf(tb.d));
             oi3.d("bundleId", tb.b);
             oi3.d("bundleVersion", tb.c);
             String str = oi3.e();
             u1.Q("KwaiShareTkRenderTime", str);
          }
       }
       return;
    }
}
