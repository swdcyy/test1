package com.kuaishou.live.core.show.redpacket.richcard.LiveRichCardCoreManager$m;
import erd.g;
import com.kuaishou.live.core.show.redpacket.richcard.LiveRichCardCoreManager;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.redpacket.richcard.core.LiveRichCardStateManager;
import pp.c;
import java.util.List;
import com.kuaishou.android.live.log.b;

public final class LiveRichCardCoreManager$m implements g	// class@000f50
{
    public final LiveRichCardCoreManager b;

    public void LiveRichCardCoreManager$m(LiveRichCardCoreManager p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, LiveRichCardCoreManager$m.class, "1")) {
       }else {
          b.y(LiveRichCardStateManager.h.f().appendTag(this.b.m()), "[followUser] ×Ô¶¯Ê§°Ü", p0);
          PatchProxy.onMethodExit(LiveRichCardCoreManager$m.class, "1");
       }
       return;
    }
}
