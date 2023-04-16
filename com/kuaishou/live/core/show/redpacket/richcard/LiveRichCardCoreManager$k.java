package com.kuaishou.live.core.show.redpacket.richcard.LiveRichCardCoreManager$k;
import java.lang.Runnable;
import com.kuaishou.live.core.show.redpacket.richcard.LiveRichCardCoreManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import uw1.m;
import java.util.Map;
import uw1.f;
import java.lang.Integer;
import com.kuaishou.live.core.show.redpacket.richcard.handler.KrnDialogHandler;
import bi2.e;

public final class LiveRichCardCoreManager$k implements Runnable	// class@000f4e
{
    public final LiveRichCardCoreManager b;

    public void LiveRichCardCoreManager$k(LiveRichCardCoreManager p0){
       this.b = p0;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveRichCardCoreManager$k.class, "1")) {
          return;
       }
       this.b.l().D0();
       LiveRichCardCoreManager$k tb = this.b;
       LiveRichCardCoreManager q = tb.q;
       String str = LiveRichCardCoreManager.g(tb, objArray, 1, objArray);
       f uof = this.b.h();
       Integer integer = (uof != null)? Integer.valueOf(uof.g()): objArray;
       uof = this.b.h();
       if (uof != null) {
          objArray = uof.a();
       }
       KrnDialogHandler.b(q, str, integer, objArray, false, 8, null);
       this.b.o.e("onGrabResult");
       return;
    }
}
