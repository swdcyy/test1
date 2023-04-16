package hh1.i$c;
import erd.g;
import hh1.i;
import yg1.a;
import java.lang.String;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import yg1.f;
import android.util.Log;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class i$c implements g	// class@0026c2
{
    public final i b;
    public final a c;
    public final String d;

    public void i$c(i p0,a p1,String p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i$c.class, "1")) {
       }else {
          boolean b = false;
          this.b.b.set(b);
          i$c tc = this.c;
          i$c td = this.d;
          i$c tb = this.b;
          a.o(p0, "it");
          Objects.requireNonNull(tb);
          f uof = PatchProxy.applyOneRefs(p0, tb, i.class, "4");
          if (uof != PatchProxyResult.class) {
          }else {
             String stackTraceSt = Log.getStackTraceString(p0);
             a.o(stackTraceSt, "Log.getStackTraceString\(error\)");
             uof = new f(b, stackTraceSt, null);
          }
          tc.a(td, uof);
          b.I(LiveLogTag.LIVE_VIP_GRADE, "[LiveGiftVipGradeNetworkDataSource][fetch] error ", p0);
       }
       return;
    }
}
