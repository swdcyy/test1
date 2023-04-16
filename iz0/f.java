package iz0.f;
import erd.g;
import iz0.i;
import java.lang.Object;
import com.kuaishou.live.common.core.component.gift.giftstore.api.GiftPanelListResponse;
import mk1.h;
import mk1.b;
import com.yxcorp.gifshow.models.Gift;
import qk1.a;

public final class f implements g	// class@0029d9
{
    public final i b;
    public final int c;

    public void f(i p0,int p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       f tb = this.b;
       if (this.c == 1) {
          p0 = tb.t.K;
          if (p0 != null) {
             tb.s.a.m(p0.mId);
          }
       }
       tb.S8();
       return;
    }
}
