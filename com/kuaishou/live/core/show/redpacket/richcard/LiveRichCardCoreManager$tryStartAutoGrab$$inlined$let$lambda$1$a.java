package com.kuaishou.live.core.show.redpacket.richcard.LiveRichCardCoreManager$tryStartAutoGrab$$inlined$let$lambda$1$a;
import erd.g;
import com.kuaishou.live.core.show.redpacket.richcard.LiveRichCardCoreManager$tryStartAutoGrab$$inlined$let$lambda$1;
import java.lang.Object;
import com.kwai.framework.model.user.User;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.redpacket.richcard.core.LiveRichCardStateManager;
import pp.c;
import com.kuaishou.live.core.show.redpacket.richcard.LiveRichCardCoreManager;
import java.util.List;
import com.kuaishou.android.live.log.b;

public final class LiveRichCardCoreManager$tryStartAutoGrab$$inlined$let$lambda$1$a implements g	// class@000f56
{
    public final LiveRichCardCoreManager$tryStartAutoGrab$$inlined$let$lambda$1 b;

    public void LiveRichCardCoreManager$tryStartAutoGrab$$inlined$let$lambda$1$a(LiveRichCardCoreManager$tryStartAutoGrab$$inlined$let$lambda$1 p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, LiveRichCardCoreManager$tryStartAutoGrab$$inlined$let$lambda$1$a.class, "1")) {
       }else {
          b.P(LiveRichCardStateManager.h.f().appendTag(this.b.this$0.m()), "[followUser] 自动关注成功");
          PatchProxy.onMethodExit(LiveRichCardCoreManager$tryStartAutoGrab$$inlined$let$lambda$1$a.class, "1");
       }
       return;
    }
}
