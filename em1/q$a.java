package em1.q$a;
import erd.g;
import em1.q;
import java.lang.Object;
import com.kuaishou.live.common.core.component.gift.giftstore.api.GiftListResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.Boolean;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.Objects;
import java.lang.Integer;
import brd.t;
import t45.d;
import brd.z;
import em1.i;
import crd.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import em1.b;
import ekd.q;

public class q$a implements g	// class@0021c1
{
    public final q b;

    public void q$a(q p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q$a.class, "1")) {
       }else {
          b.d0(LiveLogTag.GIFT, "[LiveBaseGiftStoreProxy][updateAllGifts]", "response", p0, "enableGiftGuideShowOptimize", Boolean.TRUE);
          this.b.B(p0);
          q$a tb = this.b;
          Objects.requireNonNull(tb);
          ArrayList uArrayList = 1;
          if (!PatchProxy.applyVoid(null, tb, q.class, "20")) {
             t.just(Integer.valueOf(uArrayList)).observeOn(d.c).subscribe(new i(tb));
          }
          this.b.y("updateAllGifts");
          if (p0 != null && p0.mGifts != null) {
             if (this.b.w()) {
                this.b.g(new ArrayList(p0.mGifts), "giftAllApiDownload");
             }else if(!q.f(p0.mGifts)){
                tb = this.b;
                if (tb.f == null) {
                   tb.f = uArrayList;
                   tb.g(new ArrayList(p0.mGifts), "giftAllApiDownload");
                }
             }
          }
       }
    label_0088 :
       return;
    }
}
