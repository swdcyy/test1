package b44.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import b44.a$a;
import nsd.u;
import java.util.HashSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.live.cart.onsale.audience.a;
import android.view.Window;
import k34.g0;
import com.kuaishou.merchant.live.cart.MerchantCartLogBiz;
import p74.a;
import o74.a;
import com.kuaishou.merchant.live.cart.onsale.audience.model.CommodityListGuestResponse;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.merchant.live.cart.onsale.audience.model.ComponentInfo;
import java.util.HashMap;
import com.kuaishou.merchant.live.cart.onsale.audience.model.ComponentData;
import java.util.Objects;
import yz7.e;
import ks3.f0;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import java.util.Map;
import v34.a;
import b44.b;
import a30.b;
import com.kuaishou.cover.a;
import java.lang.Number;
import com.kuaishou.cover.Link;
import android.view.View;

public final class a extends PresenterV2	// class@000312
{
    public LiveMerchantBaseContext p;
    public a q;
    public f0 r;
    public HashSet s;
    public static final a$a t;

    static {
       a.t = new a$a(null);
    }
    public void a(){
       super();
       this.s = new HashSet();
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "3")) {
          return;
       }
       a tq = this.q;
       if (tq != null) {
          tq = tq.f;
          if (tq != null) {
             objArray = tq.getWindow();
          }
       }
       if (objArray == null) {
          a.g(MerchantCartLogBiz.LIVE_AUDIENCE_ON_SALE, "LiveShopPendantAreaPresenter", "window is null");
       }
       tq = this.q;
       if (tq != null) {
          a g = tq.g;
          if (g != null && g.isCacheResponse == true) {
             return;
          }
       }
       if (tq != null) {
          tq = tq.g;
          if (tq != null) {
             CommodityListGuestResponse mPendantArea = tq.mPendantArea;
             if (mPendantArea != null) {
                Iterator iterator = mPendantArea.iterator();
                while (iterator.hasNext()) {
                   ComponentInfo uComponentIn = iterator.next();
                   if (uComponentIn != null && uComponentIn.isValid()) {
                      if (uComponentIn.getViewType() && (objArray == null || PatchProxy.applyVoidTwoRefs(uComponentIn, objArray, this, a.class, "4"))) {
                         continue ;
                      }else {
                         HashMap hashMap = new HashMap();
                         if (uComponentIn.getData() instanceof ComponentData) {
                            ComponentData data = uComponentIn.getData();
                            Objects.requireNonNull(data, "null cannot be cast to non-null type com.kuaishou.merchant.live.cart.onsale.audience.model.ComponentData");
                            data = data.data;
                            if (data != null) {
                               hashMap.put("payload", e.f(data));
                            }
                         }
                         hashMap.put("__Id", uComponentIn.getId());
                         a tr = this.r;
                         if (tr != null) {
                            hashMap.put("liveId", tr.J4());
                            hashMap.put("pageId", tr.I4());
                         }
                         tr = this.p;
                         if (tr != null) {
                            hashMap.putAll(a.a(tr));
                         }
                         a.d(uComponentIn.getRenderUrl(), hashMap, new b(this, uComponentIn), objArray, 2);
                      }
                   }
                }
             }
          }
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "5")) {
          return;
       }
       Iterator iterator = this.s.iterator();
       while (iterator.hasNext()) {
          Link.h().g(iterator.next().longValue());
       }
       this.s.clear();
       return;
    }
    public void doBindView(View p0){
       PatchProxy.applyVoidOneRefs(p0, this, a.class, "2");
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.p = this.r8("LIVE_BASE_CONTEXT");
       this.q = this.q8(a.class);
       this.r = this.t8("LIVE_MERCHANT_LIVE_INTERNAL_ROUTER_SERVICE");
       return;
    }
}
