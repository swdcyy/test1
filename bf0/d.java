package bf0.d;
import bf0.e;
import java.lang.String;
import android.os.Message;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.Triple;
import com.kuaishou.growth.pendant.realtime.price.speed.PrtpSpeedManager;
import ye0.a$a;
import ye0.b;
import java.lang.Throwable;

public final class d extends e	// class@000367
{

    public void d(){
       super("Prtp-thread-report");
    }
    public void b(Message p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       a.p(p0, "msg");
       if (p0.what == 3) {
          p0 = p0.obj;
          if (p0 instanceof Triple) {
             PrtpSpeedManager.s.b(p0);
          }
       }
       return;
    }
}
