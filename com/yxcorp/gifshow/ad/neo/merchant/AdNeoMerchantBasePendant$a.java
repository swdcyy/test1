package com.yxcorp.gifshow.ad.neo.merchant.AdNeoMerchantBasePendant$a;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.ad.neo.merchant.AdNeoMerchantBasePendant;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import wkd.b;
import ql9.f;
import com.yxcorp.gifshow.commercial.response.magnetic.RewardPendantResponse;
import com.yxcorp.gifshow.commercial.response.magnetic.RewardPendantResponse$Data;
import com.yxcorp.gifshow.widget.popup.a;
import android.app.Activity;
import com.yxcorp.gifshow.widget.popup.KwaiBubbleOption;
import com.kwai.library.widget.popup.bubble.a$c;
import lnc.a1;
import java.lang.CharSequence;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.library.widget.popup.bubble.a;
import k07.p;

public final class AdNeoMerchantBasePendant$a extends m	// class@001792
{
    public final AdNeoMerchantBasePendant c;

    public void AdNeoMerchantBasePendant$a(AdNeoMerchantBasePendant p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       AdNeoMerchantBasePendant a;
       if (PatchProxy.applyVoidOneRefs(p0, this, AdNeoMerchantBasePendant$a.class, "1")) {
          return;
       }
       a.p(p0, "v");
       int i = -618875779;
       RewardPendantResponse rewardPendan = b.a(i).j();
       if (rewardPendan != null && rewardPendan.canShowView()) {
          AdNeoMerchantBasePendant$a uoa = 1;
          if (rewardPendan.mData.mStatus == uoa) {
             a uoa1 = new a(this.c.b());
             uoa1.K0(KwaiBubbleOption.e);
             a = this.c.a;
             a.m(a);
             uoa1.o0(a);
             uoa1.v0(0);
             uoa1.F0(a1.p(R.string.arg_RES_7f1000d6));
             uoa1.T(3000);
             a.o(uoa1, "builder");
             p.m(uoa1);
             b.a(i).l(0);
          }else {
             b.a(i).l(uoa);
          }
       }
       return;
    }
}
