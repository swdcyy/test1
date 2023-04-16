package com.kuaishou.merchant.home.basic.log.MerchantHomePerfRepository$d;
import z1.a;
import com.kuaishou.merchant.home.basic.log.MerchantHomePerfRepository;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.os.SystemClock;

public final class MerchantHomePerfRepository$d implements a	// class@0016c2
{
    public final MerchantHomePerfRepository a;

    public void MerchantHomePerfRepository$d(MerchantHomePerfRepository p0){
       this.a = p0;
       super();
    }
    public final void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantHomePerfRepository$d.class, "1")) {
          return;
       }
       MerchantHomePerfRepository$d ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(p0, ta, MerchantHomePerfRepository.class, "21") && ta.p <= 0) {
          ta.p = SystemClock.elapsedRealtime();
       }
       return;
    }
}
