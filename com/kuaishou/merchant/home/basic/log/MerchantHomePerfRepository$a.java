package com.kuaishou.merchant.home.basic.log.MerchantHomePerfRepository$a;
import z1.a;
import com.kuaishou.merchant.home.basic.log.MerchantHomePerfRepository;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.lang.Throwable;
import android.os.SystemClock;

public final class MerchantHomePerfRepository$a implements a	// class@0016bf
{
    public final MerchantHomePerfRepository a;

    public void MerchantHomePerfRepository$a(MerchantHomePerfRepository p0){
       this.a = p0;
       super();
    }
    public final void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantHomePerfRepository$a.class, "1")) {
          return;
       }
       MerchantHomePerfRepository$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(p0, ta, MerchantHomePerfRepository.class, "17")) {
          ta.c(null);
          if (ta.m <= 0) {
             ta.m = SystemClock.elapsedRealtime();
          }
       }
       return;
    }
}
