package com.kuaishou.live.core.show.redpacket.richcard.LiveRichCardCoreManager$startAutoJumpTimer$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.show.redpacket.richcard.LiveRichCardCoreManager;
import java.lang.Object;
import java.lang.Number;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import ei2.a;

public final class LiveRichCardCoreManager$startAutoJumpTimer$1 extends Lambda implements l	// class@000f54
{
    public final LiveRichCardCoreManager this$0;

    public void LiveRichCardCoreManager$startAutoJumpTimer$1(LiveRichCardCoreManager p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0.longValue());
       return l1.a;
    }
    public final void invoke(long p0){
       if (PatchProxy.isSupport(LiveRichCardCoreManager$startAutoJumpTimer$1.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, LiveRichCardCoreManager$startAutoJumpTimer$1.class, "1")) {
          return;
       }
       LiveRichCardCoreManager.a(this.this$0).d((p0 / this.this$0.b));
       this.this$0.t();
       return;
    }
}
