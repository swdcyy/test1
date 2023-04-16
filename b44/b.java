package b44.b;
import a30.b;
import b44.a;
import com.kuaishou.merchant.live.cart.onsale.audience.model.ComponentInfo;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import a30.a;
import java.util.HashSet;
import com.kuaishou.merchant.live.cart.MerchantCartLogBiz;
import p74.a;
import o74.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class b implements b	// class@000313
{
    public final a a;
    public final ComponentInfo b;

    public void b(a p0,ComponentInfo p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void a(long p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uob, "4")) {
          return;
       }
       a.b(this, p0);
       this.a.s.add(Long.valueOf(p0));
       return;
    }
    public void b(boolean p0){
       a.a(this, p0);
    }
    public void onDismiss(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       a.t(MerchantCartLogBiz.LIVE_AUDIENCE_ON_SALE, "LiveShopPendantAreaPresenter", "pendant onDismiss", "component", this.b);
       return;
    }
    public boolean onFailed(){
       Object obj = PatchProxy.apply(null, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.t(MerchantCartLogBiz.LIVE_AUDIENCE_ON_SALE, "LiveShopPendantAreaPresenter", "pendant onFailed", "component", this.b);
       return false;
    }
    public void onShow(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       a.t(MerchantCartLogBiz.LIVE_AUDIENCE_ON_SALE, "LiveShopPendantAreaPresenter", "pendant onShow", "component", this.b);
       return;
    }
}
