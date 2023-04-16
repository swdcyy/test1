package com.kuaishou.merchant.marketing.platform.skyfallcoupon.e$b;
import c84.a;
import com.kuaishou.merchant.marketing.platform.skyfallcoupon.e;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.marketing.platform.skyfallcoupon.SkyFallDataExplorationTrigger;
import l84.u;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.marketing.platform.skyfallcoupon.model.LiveMerchantSkyFallModel;
import fg6.a;
import com.google.gson.Gson;

public class e$b implements a	// class@001b3f
{
    public final e a;

    public void e$b(e p0){
       this.a = p0;
       super();
    }
    public void a(String p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, e$b.class, str)) {
          return;
       }
       u.j(SkyFallDataExplorationTrigger.COUPON_CENTER);
       e$b ta = this.a;
       Objects.requireNonNull(ta);
       Object obj = PatchProxy.applyOneRefs(p0, ta, e.class, str);
       if (obj != PatchProxyResult.class) {
       }else {
          try{
             obj = a.a.h(p0, LiveMerchantSkyFallModel.class);
          }catch(java.lang.Exception e0){
             obj = null;
          }
       }
    }
    public boolean d(){
       return this.a.P;
    }
}
