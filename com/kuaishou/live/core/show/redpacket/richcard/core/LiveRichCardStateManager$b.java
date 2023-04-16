package com.kuaishou.live.core.show.redpacket.richcard.core.LiveRichCardStateManager$b;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.redpacket.richcard.core.LiveRichCardStateManager;
import bi2.e;

public final class LiveRichCardStateManager$b implements g	// class@000f6a
{
    public static final LiveRichCardStateManager$b b;

    static {
       LiveRichCardStateManager$b.b = new LiveRichCardStateManager$b();
    }
    public void LiveRichCardStateManager$b(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveRichCardStateManager$b.class, "1")) {
       }else {
          p0 = LiveRichCardStateManager.h;
          p0.e().h("[LogoutEvent]");
          p0.h();
       }
       return;
    }
}
