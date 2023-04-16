package iz0.h;
import erd.g;
import iz0.i;
import java.lang.Object;
import com.kuaishou.live.common.core.component.gift.giftstore.api.GiftPanelListResponse;
import mk1.h;
import bl1.a;
import java.util.List;
import java.lang.String;
import com.kuaishou.android.live.log.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import brd.t;
import mk1.f;
import iz0.f;
import iz0.a;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class h implements g	// class@0029db
{
    public final i b;
    public final boolean c;
    public final int d;

    public void h(i p0,boolean p1,int p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       h tb = this.b;
       h tc = this.c;
       h td = this.d;
       tb.y = false;
       if (!tb.t.o.F2()) {
          b.P(tb.p, "[requestToAnchorGift][prefetchToAnchorGifts] success , isAnchorGiftHasLoaded == false");
       }else if(tc == null){
          b.P(tb.p, "[requestToAnchorGift][prefetchToAnchorGifts] success , enableRefreshUI == false");
       }else {
          p0 = i.class;
          if (!PatchProxy.isSupport(p0) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(td), tb, p0, "9")) {
             tb.X7(tb.t.c.m().subscribe(new f(tb, td), new a(tb)));
          }
       }
       return;
    }
}
