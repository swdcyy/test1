package iz0.g;
import erd.g;
import iz0.i;
import java.lang.Object;
import com.kuaishou.live.common.core.component.gift.giftstore.api.GiftPanelListResponse;
import mk1.h;
import mk1.f;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.Integer;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;

public final class g implements g	// class@0029da
{
    public final i b;
    public final int c;

    public void g(i p0,int p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       g tb = this.b;
       g tc = this.c;
       GiftPanelListResponse giftPanelLis = tb.t.c.q();
       if (tc == 2 || giftPanelLis == null) {
          b.d0(LiveLogTag.GIFT, "[GiftOpt][requestAnchorGiftImmediately]", "refreshMode", Integer.valueOf(tc), "giftPanelListResponse", giftPanelLis);
          tb.S8();
       }
       return;
    }
}
