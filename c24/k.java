package c24.k;
import cb4.e;
import c24.k$a;
import nsd.u;
import b14.b;
import java.lang.Object;
import cb4.d;
import com.kuaishou.merchant.router.base.RouterRequest;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.net.Uri;
import ekd.x0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.merchant.log.biz.MerchantCommonLogBiz;
import p74.a;
import o74.a;

public final class k implements e	// class@000486
{
    public final b a;
    public static final k$a b;

    static {
       k.b = new k$a(null);
    }
    public void k(b p0){
       super();
       this.a = p0;
    }
    public boolean a(){
       return d.a(this);
    }
    public boolean b(RouterRequest p0){
       String str = "1";
       Object obj = PatchProxy.applyOneRefs(p0, this, k.class, str);
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 != null) {
          Uri uri = p0.d();
          boolean b = TextUtils.n(x0.a(uri, "isDisabled"), str);
          a.u(MerchantCommonLogBiz.ROUTER, "LiveDisableBubbleRouterHandler", "on handler bubble disable request", "url", uri.toString(), "isDisabled", Boolean.valueOf(b));
          this.a.a(b);
       }
       return true;
    }
    public String getName(){
       return d.b(this);
    }
}
