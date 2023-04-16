package c24.h;
import cb4.e;
import cs3.a;
import java.lang.Object;
import cb4.d;
import com.kuaishou.merchant.router.base.RouterRequest;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.merchant.log.biz.MerchantCommonLogBiz;
import p74.a;
import o74.a;

public class h implements e	// class@00047d
{
    public final a a;

    public void h(a p0){
       super();
       this.a = p0;
    }
    public boolean a(){
       return d.a(this);
    }
    public boolean b(RouterRequest p0){
       p0 = PatchProxy.applyOneRefs(p0, this, h.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       a.g(MerchantCommonLogBiz.ROUTER, "LiveAnchorRouterHandler", "anchor showOnSaleFragment");
       this.a.b();
       return true;
    }
    public String getName(){
       return d.b(this);
    }
}
