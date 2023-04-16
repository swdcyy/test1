package bf0.a;
import bf0.e;
import java.lang.String;
import bf0.a$a;
import bf0.a$b;
import android.os.Handler;
import java.lang.Runnable;
import android.os.Message;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import bf0.f;
import qrd.l1;
import com.kuaishou.growth.pendant.realtime.price.core.PrtpManager;
import com.kuaishou.growth.pendant.realtime.price.core.PrtpSwitchConfig;
import java.lang.Long;
import java.lang.Math;

public final class a extends e	// class@000364
{
    public final Runnable c;
    public final Runnable d;

    public void a(){
       super("Prtp-thread-control");
       a$a uoa = new a$a(this);
       this.c = uoa;
       this.d = new a$b(this);
       this.a().post(uoa);
    }
    public void b(Message p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "3")) {
          return;
       }
       a.p(p0, "msg");
       return;
    }
    public final void e(String p0){
       PrtpSwitchConfig prtpSwitchCo1;
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       a.p(p0, "from");
       this.a().removeCallbacks(this.d);
       Handler handler = f.d.b();
       if (handler != null) {
          Message message = Message.obtain();
          message.what = 2;
          message.obj = p0;
          handler.sendMessage(message);
       }
       PrtpManager z = PrtpManager.z;
       PrtpSwitchConfig prtpSwitchCo = z.k();
       Long longx = null;
       if (prtpSwitchCo != null && prtpSwitchCo.enable == 1) {
          prtpSwitchCo1 = z.k();
          if (prtpSwitchCo1 != null) {
             longx = Long.valueOf(prtpSwitchCo1.inferInterval);
          }
       }else {
          prtpSwitchCo1 = z.k();
          if (prtpSwitchCo1 != null) {
             longx = Long.valueOf(prtpSwitchCo1.reportInterval);
          }
       }
       long l = (longx != null)? longx.longValue(): 10;
       this.a().postDelayed(this.d, (Math.max(l, 5) * 1000));
       return;
    }
}
