package com.kuaishou.merchant.live.g$a;
import us3.f;
import com.kuaishou.merchant.live.g;
import com.kuaishou.merchant.api.core.model.MerchantInfo;
import java.lang.Object;
import us3.h;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Map;
import ot3.l0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class g$a implements f	// class@001a20
{
    public final MerchantInfo a;
    public final g b;

    public void g$a(g p0,MerchantInfo p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(h p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$a.class, "1")) {
          return;
       }
       p0 = p0.b;
       if (p0 == null) {
          return;
       }
       if (!l0.g("bizType", p0) - 2) {
          String str = l0.i("token", p0);
          if (!TextUtils.x(str)) {
             this.a.mToken = str;
          }
          this.a.mLivePlanId = l0.g("planId", p0);
          this.a.mLivePlanBindStatus = (int)l0.g("planStatus", p0);
       }
       return;
    }
}
