package com.kuaishou.live.core.show.redpacket.richcard.LiveRichCardCoreManager$c$b;
import erd.g;
import com.kuaishou.live.core.show.redpacket.richcard.LiveRichCardCoreManager$c;
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

public final class LiveRichCardCoreManager$c$b implements g	// class@000f41
{
    public final LiveRichCardCoreManager$c b;

    public void LiveRichCardCoreManager$c$b(LiveRichCardCoreManager$c p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveRichCardCoreManager$c$b.class, "1")) {
       }else {
          b.y(LiveRichCardStateManager.h.f().appendTag(this.b.b.m()), "[followUser] 自动失败, 尝试退出暴富模式", p0);
          this.b.b.d();
       }
       return;
    }
}
