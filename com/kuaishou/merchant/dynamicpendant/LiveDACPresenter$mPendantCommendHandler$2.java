package com.kuaishou.merchant.dynamicpendant.LiveDACPresenter$mPendantCommendHandler$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.merchant.dynamicpendant.LiveDACPresenter;
import cw3.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import ks3.t;
import com.kuaishou.merchant.api.core.model.MerchantAudienceParams;
import java.util.Objects;
import kw3.a;
import qrd.p;
import com.kwaishou.merchant.daccore.b;
import ks3.r;
import cs3.a;

public final class LiveDACPresenter$mPendantCommendHandler$2 extends Lambda implements a	// class@001691
{
    public final LiveDACPresenter this$0;

    public void LiveDACPresenter$mPendantCommendHandler$2(LiveDACPresenter p0){
       this.this$0 = p0;
       super(0);
    }
    public final c invoke(){
       MerchantAudienceParams merchantAudi;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, LiveDACPresenter$mPendantCommendHandler$2.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       LiveDACPresenter$mPendantCommendHandler$2 tthis$0 = this.this$0;
       LiveDACPresenter s = tthis$0.s;
       LiveDACPresenter z = tthis$0.z;
       if (z != null) {
          LiveMerchantBaseContext liveMerchant = z.a();
          if (liveMerchant != null) {
             merchantAudi = liveMerchant.getMerchantAudienceParams();
          label_0027 :
             tthis$0 = this.this$0;
             LiveDACPresenter d = tthis$0.D;
             LiveDACPresenter b = tthis$0.B;
             Objects.requireNonNull(tthis$0);
             c obj1 = PatchProxy.apply(objArray, tthis$0, LiveDACPresenter.class, "3");
             a uoa = (obj1 != patchProxyRe)? obj1: tthis$0.H.getValue();
             obj1 = new c(s, merchantAudi, d, b, uoa);
             return obj;
          }
       }
       merchantAudi = objArray;
       goto label_0027 ;
    }
    public Object invoke(){
       return this.invoke();
    }
}
