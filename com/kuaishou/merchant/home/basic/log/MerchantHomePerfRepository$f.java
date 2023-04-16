package com.kuaishou.merchant.home.basic.log.MerchantHomePerfRepository$f;
import z1.a;
import com.kuaishou.merchant.home.basic.log.MerchantHomePerfRepository;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.os.SystemClock;

public final class MerchantHomePerfRepository$f implements a	// class@0016c4
{
    public final MerchantHomePerfRepository a;

    public void MerchantHomePerfRepository$f(MerchantHomePerfRepository p0){
       this.a = p0;
       super();
    }
    public final void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantHomePerfRepository$f.class, "1")) {
          return;
       }
       MerchantHomePerfRepository$f ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(p0, ta, MerchantHomePerfRepository.class, "23") && ta.r <= 0) {
          ta.r = SystemClock.elapsedRealtime();
       }
       return;
    }
}
