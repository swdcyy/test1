package com.kuaishou.merchant.home.basic.log.MerchantHomePerfRepository$k;
import z1.a;
import com.kuaishou.merchant.home.basic.log.MerchantHomePerfRepository;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.lang.Long;
import java.lang.Number;

public final class MerchantHomePerfRepository$k implements a	// class@0016c9
{
    public final MerchantHomePerfRepository a;

    public void MerchantHomePerfRepository$k(MerchantHomePerfRepository p0){
       this.a = p0;
       super();
    }
    public final void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantHomePerfRepository$k.class, "1")) {
          return;
       }
       MerchantHomePerfRepository$k ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(p0, ta, MerchantHomePerfRepository.class, "6") && (ta.d <= 0 && p0 instanceof Long)) {
          ta.d = p0.longValue();
       }
    label_002f :
       return;
    }
}
