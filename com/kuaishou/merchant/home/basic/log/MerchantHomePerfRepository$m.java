package com.kuaishou.merchant.home.basic.log.MerchantHomePerfRepository$m;
import z1.a;
import com.kuaishou.merchant.home.basic.log.MerchantHomePerfRepository;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.lang.Long;
import java.lang.Number;

public final class MerchantHomePerfRepository$m implements a	// class@0016cb
{
    public final MerchantHomePerfRepository a;

    public void MerchantHomePerfRepository$m(MerchantHomePerfRepository p0){
       this.a = p0;
       super();
    }
    public final void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantHomePerfRepository$m.class, "1")) {
          return;
       }
       MerchantHomePerfRepository$m ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(p0, ta, MerchantHomePerfRepository.class, "8") && p0 instanceof Long) {
          ta.f = p0.longValue();
       }
       return;
    }
}
