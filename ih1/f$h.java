package ih1.f$h;
import erd.o;
import java.lang.Object;
import com.kuaishou.live.core.basic.model.LiveGiftPanelRefreshConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import brd.t;
import java.util.concurrent.TimeUnit;

public final class f$h implements o	// class@0028e0
{
    public static final f$h b;

    static {
       f$h.b = new f$h();
    }
    public void f$h(){
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, f$h.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          ot = t.just(p0).delay(p0.mDelayRequestMillis, TimeUnit.MILLISECONDS);
       }
       return ot;
    }
}
