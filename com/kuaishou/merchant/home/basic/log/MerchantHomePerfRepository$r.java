package com.kuaishou.merchant.home.basic.log.MerchantHomePerfRepository$r;
import z1.a;
import com.kuaishou.merchant.home.basic.log.MerchantHomePerfRepository;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.os.SystemClock;

public final class MerchantHomePerfRepository$r implements a	// class@0016d0
{
    public final MerchantHomePerfRepository a;

    public void MerchantHomePerfRepository$r(MerchantHomePerfRepository p0){
       this.a = p0;
       super();
    }
    public final void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantHomePerfRepository$r.class, "1")) {
          return;
       }
       MerchantHomePerfRepository$r ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(p0, ta, MerchantHomePerfRepository.class, "15") && ta.k <= 0) {
          ta.k = SystemClock.elapsedRealtime();
       }
       return;
    }
}
