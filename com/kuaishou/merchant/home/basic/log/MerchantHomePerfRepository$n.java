package com.kuaishou.merchant.home.basic.log.MerchantHomePerfRepository$n;
import z1.a;
import com.kuaishou.merchant.home.basic.log.MerchantHomePerfRepository;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.os.SystemClock;

public final class MerchantHomePerfRepository$n implements a	// class@0016cc
{
    public final MerchantHomePerfRepository a;

    public void MerchantHomePerfRepository$n(MerchantHomePerfRepository p0){
       this.a = p0;
       super();
    }
    public final void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantHomePerfRepository$n.class, "1")) {
          return;
       }
       MerchantHomePerfRepository$n ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(p0, ta, MerchantHomePerfRepository.class, "9") && ta.g <= 0) {
          ta.g = SystemClock.elapsedRealtime();
       }
       return;
    }
}
