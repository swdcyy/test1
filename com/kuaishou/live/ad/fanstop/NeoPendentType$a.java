package com.kuaishou.live.ad.fanstop.NeoPendentType$a;
import java.lang.Object;
import nsd.u;
import com.kuaishou.live.ad.fanstop.NeoPendentType;
import com.kwai.feature.api.live.base.model.LiveAdNeoMerchantParam;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;

public final class NeoPendentType$a	// class@00099a
{

    public void NeoPendentType$a(){
       super();
    }
    public void NeoPendentType$a(u p0){
       super();
    }
    public final boolean a(NeoPendentType p0,LiveAdNeoMerchantParam p1,LiveBizParam p2,PhotoAdvertisement p3){
       object this;
       NeoPendentType[] obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, NeoPendentType$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "targetType");
       obj = NeoPendentType.values();
       int len = obj.length;
       boolean b = false;
       int i = 0;
       while (true) {
          if (i < len) {
             this = obj[i];
             if (this.valid(p1, p2, p3)) {
             label_0033 :
                if (p0 == this) {
                   b = true;
                   break ;
                }
                break ;
             }else {
                i = i + 1;
             }
          }else {
             this = null;
             goto label_0033 ;
          }
       }
       return b;
    }
}
