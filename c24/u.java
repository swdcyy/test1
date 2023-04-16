package c24.u;
import erd.g;
import com.kuaishou.merchant.router.base.RouterRequest;
import java.lang.Object;
import java.lang.Throwable;
import com.kuaishou.merchant.live.MerchantLiveLogBiz;
import p74.a;
import java.lang.String;
import o74.a;
import us3.f;
import us3.h;

public final class u implements g	// class@00049c
{
    public final RouterRequest b;

    public void u(RouterRequest p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       a.l(MerchantLiveLogBiz.LIVE_SANDEAGO, "LiveCapturePreviewHandler", "load img error", p0);
       p0 = this.b.b();
       if (p0 != null) {
          h oh = new h();
          oh.a = 2;
          p0.a(oh);
       }
       return;
    }
}
