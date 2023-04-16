package com.kuaishou.merchant.home.basic.log.MerchantHomePerfRepository$p;
import z1.a;
import com.kuaishou.merchant.home.basic.log.MerchantHomePerfRepository;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.os.SystemClock;

public final class MerchantHomePerfRepository$p implements a	// class@0016ce
{
    public final MerchantHomePerfRepository a;

    public void MerchantHomePerfRepository$p(MerchantHomePerfRepository p0){
       this.a = p0;
       super();
    }
    public final void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantHomePerfRepository$p.class, "1")) {
          return;
       }
       MerchantHomePerfRepository$p ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(p0, ta, MerchantHomePerfRepository.class, "11") && (ta.h <= 0 && ta.i <= 0)) {
          ta.i = SystemClock.elapsedRealtime();
          ta.b();
       }
    label_0032 :
       return;
    }
}
