package ap2.b;
import erd.o;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import brd.t;

public final class b implements o	// class@0002a6
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, b.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "error");
          b.g0(LiveLogTag.LIVE_VOICE_PARTY, "audienceHeartbeat error", p0);
          ot = t.empty();
       }
       return ot;
    }
}
