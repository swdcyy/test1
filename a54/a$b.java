package a54.a$b;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.live.cart.MerchantCartLogBiz;
import p74.a;
import o74.a;

public final class a$b implements g	// class@000029
{
    public static final a$b b;

    static {
       a$b.b = new a$b();
    }
    public void a$b(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "1")) {
       }else {
          a.l(MerchantCartLogBiz.LIVE_AUDIENCE_ON_SALE, "UltronShopPreloader", "preloadRequest", p0);
       }
       return;
    }
}
