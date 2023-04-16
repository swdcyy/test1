package c24.i;
import mb4.b;
import android.app.Activity;
import ks3.t;
import com.kuaishou.merchant.router.base.RouterRequest;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.merchant.log.biz.MerchantCommonLogBiz;
import p74.a;
import o74.a;
import tkd.b;
import tkd.d;
import ma4.e;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.merchant.basic.util.FoldUtils;
import fs5.a;
import fs3.e;
import wp5.c;
import java.util.Collection;
import com.kuaishou.merchant.basic.util.f;

public class i extends b	// class@000480
{
    public final t a;
    public final Activity b;

    public void i(Activity p0,t p1){
       super();
       this.a = p1;
       this.b = p0;
    }
    public boolean b(RouterRequest p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, i.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.s(MerchantCommonLogBiz.ROUTER, "LiveDefaultRouterHandler", "onHandle");
       if (d.a(-1103669376).M3(p0)) {
          return true;
       }
       return super.b(p0);
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, i.class, "3")) {
          return;
       }
       BaseFeed liveFeed = this.a.a().getLiveFeed();
       if (liveFeed instanceof LiveStreamFeed && !FoldUtils.b(this.b)) {
          d.a(-1397441499).k1(this.b, liveFeed, "merchant_float_window", d.a(0x55e6228c).i0(), d.a(0x55e6228c).p());
       }
       return;
    }
    public String e(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, i.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return f.o(p0, this.a.a());
    }
    public String getName(){
       return "LiveDefaultRouterHandler";
    }
}
