package com.kuaishou.merchant.home.basic.log.MerchantHomePerfRepository$b;
import z1.a;
import com.kuaishou.merchant.home.basic.log.MerchantHomePerfRepository;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.os.SystemClock;
import java.lang.Throwable;

public final class MerchantHomePerfRepository$b implements a	// class@0016c0
{
    public final MerchantHomePerfRepository a;

    public void MerchantHomePerfRepository$b(MerchantHomePerfRepository p0){
       this.a = p0;
       super();
    }
    public final void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantHomePerfRepository$b.class, "1")) {
          return;
       }
       MerchantHomePerfRepository$b ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(p0, ta, MerchantHomePerfRepository.class, "18")) {
          if (ta.n <= 0) {
             ta.n = SystemClock.elapsedRealtime();
             ta.b();
          }
          ta.d(p0);
          if (p0 instanceof Throwable) {
             ta.c(p0);
          }
       }
       return;
    }
}
