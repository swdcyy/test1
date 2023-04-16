package com.kuaishou.merchant.home.basic.log.MerchantHomePerfRepository$i;
import z1.a;
import com.kuaishou.merchant.home.basic.log.MerchantHomePerfRepository;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.os.SystemClock;

public final class MerchantHomePerfRepository$i implements a	// class@0016c7
{
    public final MerchantHomePerfRepository a;

    public void MerchantHomePerfRepository$i(MerchantHomePerfRepository p0){
       this.a = p0;
       super();
    }
    public final void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantHomePerfRepository$i.class, "1")) {
          return;
       }
       MerchantHomePerfRepository$i ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(p0, ta, MerchantHomePerfRepository.class, "13") && ta.t <= 0) {
          ta.t = SystemClock.elapsedRealtime();
          ta.b();
       }
       return;
    }
}
