package com.kuaishou.live.core.show.redpacket.richcard.LiveRichCardCoreManager$i$a;
import erd.g;
import com.kuaishou.live.core.show.redpacket.richcard.LiveRichCardCoreManager$i;
import java.lang.Object;
import njd.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.redpacket.richcard.core.LiveRichCardStateManager;
import pp.c;
import com.kuaishou.live.core.show.redpacket.richcard.LiveRichCardCoreManager;
import java.util.List;
import com.kuaishou.android.live.log.b;

public final class LiveRichCardCoreManager$i$a implements g	// class@000f4a
{
    public final LiveRichCardCoreManager$i b;

    public void LiveRichCardCoreManager$i$a(LiveRichCardCoreManager$i p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveRichCardCoreManager$i$a.class, "1")) {
       }else {
          b.P(LiveRichCardStateManager.h.f().appendTag(this.b.a.m()), "[onGrabBtnClick] reportHandleGrap success");
       }
       return;
    }
}
