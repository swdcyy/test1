package com.kuaishou.live.core.show.redpacket.richcard.core.LiveRichCardStateManager$e;
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

public final class LiveRichCardStateManager$e implements g	// class@000f6d
{
    public static final LiveRichCardStateManager$e b;

    static {
       LiveRichCardStateManager$e.b = new LiveRichCardStateManager$e();
    }
    public void LiveRichCardStateManager$e(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveRichCardStateManager$e.class, "1")) {
       }else {
          LiveRichCardStateManager h = LiveRichCardStateManager.h;
          b.I(h.f(), "exitRichCardMode£¬ ÍË³ö±©¸»¿¨´íÎó", p0);
          a.o(p0, "it");
          h.i(p0);
       }
       return;
    }
}
