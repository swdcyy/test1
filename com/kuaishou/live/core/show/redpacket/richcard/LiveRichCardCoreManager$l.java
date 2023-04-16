package com.kuaishou.live.core.show.redpacket.richcard.LiveRichCardCoreManager$l;
import erd.g;
import com.kuaishou.live.core.show.redpacket.richcard.LiveRichCardCoreManager;
import java.lang.Object;
import com.kwai.framework.model.user.User;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.redpacket.richcard.core.LiveRichCardStateManager;
import pp.c;
import java.util.List;
import com.kuaishou.android.live.log.b;

public final class LiveRichCardCoreManager$l implements g	// class@000f4f
{
    public final LiveRichCardCoreManager b;

    public void LiveRichCardCoreManager$l(LiveRichCardCoreManager p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, LiveRichCardCoreManager$l.class, "1")) {
       }else {
          b.P(LiveRichCardStateManager.h.f().appendTag(this.b.m()), "[followUser] 自动关注成功");
          PatchProxy.onMethodExit(LiveRichCardCoreManager$l.class, "1");
       }
       return;
    }
}
