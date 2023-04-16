package jz0.d;
import erd.g;
import jz0.e;
import java.lang.String;
import java.lang.Object;
import com.kuaishou.live.common.core.component.gift.giftstore.api.GiftPanelListResponse;
import mk1.h;
import mk1.b;
import com.yxcorp.gifshow.models.Gift;
import qk1.a;
import java.util.List;
import mk1.f;
import com.kuaishou.android.live.log.b;

public final class d implements g	// class@002c43
{
    public final e b;
    public final boolean c;
    public final int d;
    public final String e;

    public void d(e p0,boolean p1,int p2,String p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void accept(Object p0){
       d tb = this.b;
       d td = this.d;
       d te = this.e;
       tb.w = false;
       if (this.c != null) {
          if (td == 1) {
             p0 = tb.t.K;
             if (p0 != null) {
                tb.u.a.m(p0.mId);
             }
          }
          tb.S8(tb.t.c.j(te));
       }else {
          b.P(tb.p, "[requestToAudienceGift][loadToAudienceGifts] success , enableRefreshUI == false");
       }
       return;
    }
}
