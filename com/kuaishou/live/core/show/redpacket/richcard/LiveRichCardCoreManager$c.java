package com.kuaishou.live.core.show.redpacket.richcard.LiveRichCardCoreManager$c;
import java.lang.Runnable;
import com.kuaishou.live.core.show.redpacket.richcard.LiveRichCardCoreManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.redpacket.richcard.LiveRichCardCoreManager$c$a;
import com.kuaishou.live.core.show.redpacket.richcard.LiveRichCardCoreManager$c$b;
import erd.g;

public final class LiveRichCardCoreManager$c implements Runnable	// class@000f42
{
    public final LiveRichCardCoreManager b;

    public void LiveRichCardCoreManager$c(LiveRichCardCoreManager p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, LiveRichCardCoreManager$c.class, "1")) {
          return;
       }
       this.b.x(true);
       this.b.t();
       this.b.D(true);
       this.b.A(LiveRichCardCoreManager$c$a.b, new LiveRichCardCoreManager$c$b(this), 139);
       return;
    }
}
