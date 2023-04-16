package ai2.i;
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

public final class i implements g	// class@0000df
{
    public static final i b;

    static {
       i.b = new i();
    }
    public void i(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "1")) {
       }else {
          LiveRichCardStateManager h = LiveRichCardStateManager.h;
          b.I(h.f(), "useNormalRichCard， 使用普通暴富卡错误", p0);
          a.o(p0, "it");
          h.i(p0);
       }
       return;
    }
}
