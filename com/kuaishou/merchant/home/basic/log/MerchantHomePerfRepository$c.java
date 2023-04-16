package com.kuaishou.merchant.home.basic.log.MerchantHomePerfRepository$c;
import z1.a;
import com.kuaishou.merchant.home.basic.log.MerchantHomePerfRepository;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.lang.Long;
import java.lang.Number;

public final class MerchantHomePerfRepository$c implements a	// class@0016c1
{
    public final MerchantHomePerfRepository a;

    public void MerchantHomePerfRepository$c(MerchantHomePerfRepository p0){
       this.a = p0;
       super();
    }
    public final void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantHomePerfRepository$c.class, "1")) {
          return;
       }
       MerchantHomePerfRepository$c ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(p0, ta, MerchantHomePerfRepository.class, "20") && (ta.o <= 0 && p0 instanceof Long)) {
          ta.o = p0.longValue();
       }
    label_002f :
       return;
    }
}
