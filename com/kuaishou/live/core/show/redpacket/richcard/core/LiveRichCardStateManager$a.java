package com.kuaishou.live.core.show.redpacket.richcard.core.LiveRichCardStateManager$a;
import erd.g;
import java.lang.Object;
import eda.n;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.redpacket.richcard.core.LiveRichCardStateManager;
import bi2.e;

public final class LiveRichCardStateManager$a implements g	// class@000f69
{
    public static final LiveRichCardStateManager$a b;

    static {
       LiveRichCardStateManager$a.b = new LiveRichCardStateManager$a();
    }
    public void LiveRichCardStateManager$a(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveRichCardStateManager$a.class, "1")) {
       }else {
          p0 = LiveRichCardStateManager.h;
          p0.e().h("[LogoutEvent]");
          p0.h();
       }
       return;
    }
}
