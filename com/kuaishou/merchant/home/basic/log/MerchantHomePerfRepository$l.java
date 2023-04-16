package com.kuaishou.merchant.home.basic.log.MerchantHomePerfRepository$l;
import z1.a;
import com.kuaishou.merchant.home.basic.log.MerchantHomePerfRepository;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.lang.Long;
import java.lang.Number;

public final class MerchantHomePerfRepository$l implements a	// class@0016ca
{
    public final MerchantHomePerfRepository a;

    public void MerchantHomePerfRepository$l(MerchantHomePerfRepository p0){
       this.a = p0;
       super();
    }
    public final void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantHomePerfRepository$l.class, "1")) {
          return;
       }
       MerchantHomePerfRepository$l ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(p0, ta, MerchantHomePerfRepository.class, "7") && (ta.e <= 0 && p0 instanceof Long)) {
          ta.e = p0.longValue();
       }
    label_002f :
       return;
    }
}
