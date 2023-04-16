package c44.b;
import android.view.View$OnClickListener;
import c44.a;
import com.kuaishou.merchant.live.cart.onsale.audience.pendant.ginseng.GinsengPendantData;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import c44.e;
import kotlin.jvm.internal.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import m34.a;
import c44.b$a;
import qvb.n0;
import com.kuaishou.merchant.live.cart.MerchantCartLogBiz;
import p74.a;
import o74.a;

public final class b implements View$OnClickListener	// class@0004ad
{
    public final a b;
    public final GinsengPendantData c;
    public final View d;

    public void b(a p0,GinsengPendantData p1,View p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       e a = e.a;
       a w = this.b.w;
       if (w == null) {
          a.S("mLiveBaseContext");
       }
       a.a(w.getLiveStreamPackage(), this.c.getTitle());
       this.d.setVisibility(8);
       b tb = this.b;
       if (!tb.R8(tb.x)) {
          a u = this.b.u;
          if (u == null) {
             a.S("mPageList");
          }
          if (!u instanceof a) {
             u = null;
          }
          if (u != null) {
             String payload = this.c.getPayload();
             b$a uoa = new b$a(this);
             if (!PatchProxy.applyVoidTwoRefs(payload, uoa, u, a.class, "7")) {
                if (u.hasMore()) {
                   u.r = uoa;
                   u.s = payload;
                   u.load();
                }else {
                   a.s(MerchantCartLogBiz.LIVE_AUDIENCE_ON_SALE, "LiveAudienceShopTabPageList", "no more");
                }
             }
          }
       }
    label_0077 :
       return;
    }
}
