package com.kuaishou.live.core.show.redpacket.richcard.LiveRichCardCoreManager$a;
import z1.k;
import com.kuaishou.live.core.show.redpacket.richcard.LiveRichCardCoreManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import uw1.f;

public final class LiveRichCardCoreManager$a implements k	// class@000f3e
{
    public final LiveRichCardCoreManager b;

    public void LiveRichCardCoreManager$a(LiveRichCardCoreManager p0){
       this.b = p0;
       super();
    }
    public Object get(){
       f uof = PatchProxy.apply(null, this, LiveRichCardCoreManager$a.class, "1");
       if (uof != PatchProxyResult.class) {
       }else {
          uof = this.b.h();
       }
       return uof;
    }
}
