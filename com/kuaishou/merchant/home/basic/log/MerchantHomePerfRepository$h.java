package com.kuaishou.merchant.home.basic.log.MerchantHomePerfRepository$h;
import z1.a;
import com.kuaishou.merchant.home.basic.log.MerchantHomePerfRepository;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.os.SystemClock;

public final class MerchantHomePerfRepository$h implements a	// class@0016c6
{
    public final MerchantHomePerfRepository a;

    public void MerchantHomePerfRepository$h(MerchantHomePerfRepository p0){
       this.a = p0;
       super();
    }
    public final void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantHomePerfRepository$h.class, "1")) {
          return;
       }
       MerchantHomePerfRepository$h ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(p0, ta, MerchantHomePerfRepository.class, "12")) {
          if (ta.s <= 0) {
             ta.s = SystemClock.elapsedRealtime();
             ta.b();
          }
          if (ta.p <= 0) {
             ta.d(null);
          }
       }
       return;
    }
}
