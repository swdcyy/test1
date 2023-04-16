package com.kuaishou.live.audience.component.gift.gift.audience.v2.k$a;
import com.kuaishou.live.common.core.component.gift.gift.righttopbanner.panel.ILiveDefaultSelectGiftIdInterceptor;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.k;
import java.lang.Object;
import com.kuaishou.live.common.core.component.gift.trace.gift.util.GiftTab;
import qk1.a;
import mk1.f;
import mk1.b;
import android.util.Pair;
import ql1.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import mk1.c;
import mk1.e;
import java.lang.Number;
import com.kuaishou.live.common.core.component.gift.gift.righttopbanner.panel.ILiveDefaultSelectGiftIdInterceptor$Priority;

public class k$a implements ILiveDefaultSelectGiftIdInterceptor	// class@000b1e
{
    public final k a;

    public void k$a(k p0){
       this.a = p0;
       super();
    }
    public boolean a(GiftTab p0){
       return this.a.U;
    }
    public Pair b(a p0,GiftTab p1,f p2,b p3){
       return a.a(this, p0, p1, p2, p3);
    }
    public GiftTab c(){
       Object obj = PatchProxy.apply(null, this, k$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.t.d.a;
    }
    public int d(){
       Object obj = PatchProxy.apply(null, this, k$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.a.t.d.b;
    }
    public int getPriority(){
       Object obj = PatchProxy.apply(null, this, k$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return ILiveDefaultSelectGiftIdInterceptor$Priority.GIFT_TAB_OPT.getPriority();
    }
}
