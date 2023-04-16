package com.kuaishou.live.core.show.redpacket.richcard.LiveRichCardCoreManager$tryStartAutoGrab$$inlined$let$lambda$1$b;
import erd.g;
import com.kuaishou.live.core.show.redpacket.richcard.LiveRichCardCoreManager$tryStartAutoGrab$$inlined$let$lambda$1;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.redpacket.richcard.core.LiveRichCardStateManager;
import pp.c;
import com.kuaishou.live.core.show.redpacket.richcard.LiveRichCardCoreManager;
import java.util.List;
import com.kuaishou.android.live.log.b;

public final class LiveRichCardCoreManager$tryStartAutoGrab$$inlined$let$lambda$1$b implements g	// class@000f57
{
    public final LiveRichCardCoreManager$tryStartAutoGrab$$inlined$let$lambda$1 b;

    public void LiveRichCardCoreManager$tryStartAutoGrab$$inlined$let$lambda$1$b(LiveRichCardCoreManager$tryStartAutoGrab$$inlined$let$lambda$1 p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, LiveRichCardCoreManager$tryStartAutoGrab$$inlined$let$lambda$1$b.class, "1")) {
       }else {
          b.y(LiveRichCardStateManager.h.f().appendTag(this.b.this$0.m()), "[followUser] 自动失败, 尝试退出暴富模式", p0);
          this.b.this$0.d();
          PatchProxy.onMethodExit(LiveRichCardCoreManager$tryStartAutoGrab$$inlined$let$lambda$1$b.class, "1");
       }
       return;
    }
}
