package com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.banner.f$b;
import ol1.p;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.banner.f;
import java.lang.Object;
import ol1.o;
import com.kuaishou.live.common.core.component.gift.trace.gift.util.GiftTab;
import com.kuaishou.live.common.core.component.gift.giftstore.bean.GiftPanelItem;
import ol1.n;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.models.Gift;
import java.util.Collection;
import ekd.q;

public class f$b implements p	// class@000b30
{
    public final f a;

    public void f$b(f p0){
       this.a = p0;
       super();
    }
    public void a(){
       o.a(this);
    }
    public n b(GiftTab p0,GiftPanelItem p1){
       return o.b(this, p0, p1);
    }
    public boolean c(GiftPanelItem p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 == null || p0.getGift() == null) {
          return false;
       }
       if (q.f(this.a.v)) {
          return false;
       }
       return true;
    }
}
