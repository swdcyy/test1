package com.kuaishou.merchant.home.basic.log.MerchantHomePerfRepository$o;
import z1.a;
import com.kuaishou.merchant.home.basic.log.MerchantHomePerfRepository;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.os.SystemClock;

public final class MerchantHomePerfRepository$o implements a	// class@0016cd
{
    public final MerchantHomePerfRepository a;

    public void MerchantHomePerfRepository$o(MerchantHomePerfRepository p0){
       this.a = p0;
       super();
    }
    public final void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantHomePerfRepository$o.class, "1")) {
          return;
       }
       MerchantHomePerfRepository$o ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(p0, ta, MerchantHomePerfRepository.class, "10") && (ta.i <= 0 && ta.h <= 0)) {
          ta.h = SystemClock.elapsedRealtime();
       }
    label_002f :
       return;
    }
}
