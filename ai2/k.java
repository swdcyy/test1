package ai2.k;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.redpacket.richcard.core.LiveRichCardStateManager;
import pp.c;
import com.kuaishou.android.live.log.b;
import kotlin.jvm.internal.a;

public final class k implements g	// class@0000e1
{
    public static final k b;

    static {
       k.b = new k();
    }
    public void k(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "1")) {
       }else {
          LiveRichCardStateManager h = LiveRichCardStateManager.h;
          b.I(h.f(), "useRichCard， 使用天降暴富卡错误", p0);
          a.o(p0, "it");
          h.i(p0);
       }
       return;
    }
}
