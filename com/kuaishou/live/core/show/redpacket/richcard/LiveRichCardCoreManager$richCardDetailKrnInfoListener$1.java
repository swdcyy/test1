package com.kuaishou.live.core.show.redpacket.richcard.LiveRichCardCoreManager$richCardDetailKrnInfoListener$1;
import oj0.a;
import com.kuaishou.live.core.show.redpacket.richcard.LiveRichCardCoreManager;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.redpacket.richcard.LiveRichCardCoreManager$richCardDetailKrnInfoListener$1$1;
import msd.a;
import com.kwai.android.common.ext.ContextExtKt;

public final class LiveRichCardCoreManager$richCardDetailKrnInfoListener$1 implements a	// class@000f53
{
    public final LiveRichCardCoreManager b;

    public void LiveRichCardCoreManager$richCardDetailKrnInfoListener$1(LiveRichCardCoreManager p0){
       this.b = p0;
       super();
    }
    public final void W(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveRichCardCoreManager$richCardDetailKrnInfoListener$1.class, "1")) {
          return;
       }
       ContextExtKt.runOnUiThread(new LiveRichCardCoreManager$richCardDetailKrnInfoListener$1$1(this, p0));
       return;
    }
}
