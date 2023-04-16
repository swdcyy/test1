package ai2.g;
import erd.g;
import java.lang.Object;
import java.lang.Long;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.redpacket.richcard.core.LiveRichCardStateManager;
import pp.c;
import com.kuaishou.android.live.log.b;
import bi2.e;

public final class g implements g	// class@0000dd
{
    public static final g b;

    static {
       g.b = new g();
    }
    public void g(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
       }else {
          p0 = LiveRichCardStateManager.h;
          b.Z(p0.f(), "startRichCardTimer， 天降暴富卡过期");
          p0.e().e("richCardDeadlineDisposable");
       }
       return;
    }
}
