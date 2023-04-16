package com.kuaishou.merchant.home.basic.log.MerchantHomePerfRepository$q;
import z1.a;
import com.kuaishou.merchant.home.basic.log.MerchantHomePerfRepository;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.os.SystemClock;

public final class MerchantHomePerfRepository$q implements a	// class@0016cf
{
    public final MerchantHomePerfRepository a;

    public void MerchantHomePerfRepository$q(MerchantHomePerfRepository p0){
       this.a = p0;
       super();
    }
    public final void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantHomePerfRepository$q.class, "1")) {
          return;
       }
       MerchantHomePerfRepository$q ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(p0, ta, MerchantHomePerfRepository.class, "14") && ta.j <= 0) {
          ta.j = SystemClock.elapsedRealtime();
       }
       return;
    }
}
