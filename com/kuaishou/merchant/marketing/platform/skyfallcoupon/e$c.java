package com.kuaishou.merchant.marketing.platform.skyfallcoupon.e$c;
import tu.h;
import com.kuaishou.merchant.marketing.platform.skyfallcoupon.e;
import com.kuaishou.merchant.marketing.platform.skyfallcoupon.SkyFallDataExplorationTrigger;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import l84.u;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import com.kuaishou.bowl.data.center.data.model.MaterialMap;
import com.kuaishou.merchant.marketing.platform.skyfallcoupon.model.LiveMerchantSkyFallModel;
import com.kuaishou.merchant.marketing.platform.skyfallcoupon.SkyFallDataExplorationError;
import java.lang.Exception;
import java.lang.Throwable;

public class e$c implements h	// class@001b40
{
    public final SkyFallDataExplorationTrigger a;
    public final e b;

    public void e$c(e p0,SkyFallDataExplorationTrigger p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void b(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$c.class, "1")) {
          return;
       }
       u.j(this.a);
       if (p0 == null || p0.size() <= 0) {
          u.g(this.a, SkyFallDataExplorationError.DATA_EMPTY);
          return;
       }else {
          MaterialMap materialMap = null;
          Iterator iterator = p0.entrySet().iterator();
          while (true) {
             if (iterator.hasNext()) {
                MaterialMap value = iterator.next().getValue();
                if (("sky_fall_coupon_pop").equals(value.pendantCode)) {
                   materialMap = value;
                }
             }
             LiveMerchantSkyFallModel liveMerchant = this.b.e9(materialMap);
             if (liveMerchant != null) {
                this.b.d9(this.a, liveMerchant);
                break ;
             }else {
                u.g(this.a, SkyFallDataExplorationError.NO_SKYFALL);
                break ;
             }
          }
          return;
       }
    }
    public void onFailed(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$c.class, "2")) {
          return;
       }
       this.b.l9("requestComponentData failed", new Exception(p0));
       return;
    }
}
