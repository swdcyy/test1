package com.kuaishou.merchant.home.basic.log.MerchantHomePerfRepository$e;
import z1.a;
import com.kuaishou.merchant.home.basic.log.MerchantHomePerfRepository;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.os.SystemClock;

public final class MerchantHomePerfRepository$e implements a	// class@0016c3
{
    public final MerchantHomePerfRepository a;

    public void MerchantHomePerfRepository$e(MerchantHomePerfRepository p0){
       this.a = p0;
       super();
    }
    public final void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantHomePerfRepository$e.class, "1")) {
          return;
       }
       MerchantHomePerfRepository$e ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(p0, ta, MerchantHomePerfRepository.class, "22")) {
          if (ta.q <= 0) {
             ta.q = SystemClock.elapsedRealtime();
             ta.b();
          }
          ta.d(null);
       }
       return;
    }
}
