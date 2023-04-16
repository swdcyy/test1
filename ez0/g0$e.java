package ez0.g0$e;
import erd.g;
import ez0.g0;
import com.kuaishou.livestream.message.nano.SCLiveGiftPanelRefresh;
import java.lang.Object;
import com.kuaishou.live.common.core.component.gift.giftstore.api.GiftPanelListResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mk1.d0;

public final class g0$e implements g	// class@002247
{
    public final g0 b;
    public final SCLiveGiftPanelRefresh c;

    public void g0$e(g0 p0,SCLiveGiftPanelRefresh p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g0$e.class, "1")) {
       }else {
          this.b.e(this.c);
          d0 uod0 = this.b.a();
          if (uod0 != null) {
             uod0.a(p0.mGiftToken, 1);
          }
       }
       return;
    }
}
