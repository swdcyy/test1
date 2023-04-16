package com.yxcorp.gifshow.ad.neo.merchant.AdNeoMerchantBasePendant$mStartSuccessAnimation$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.ad.neo.merchant.AdNeoMerchantBasePendant;
import java.lang.Object;
import msd.a;
import java.lang.Number;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import com.yxcorp.gifshow.ad.neo.merchant.AdNeoMerchantBasePendant$mStartSuccessAnimation$1$a;
import java.lang.Runnable;
import ekd.k1;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import qrd.p;
import kzc.d;
import com.kwai.library.widget.popup.common.c$b;
import android.graphics.drawable.Drawable;
import com.kwai.library.widget.popup.common.PopupInterface$Excluded;
import x29.b;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kwai.library.widget.popup.common.c;

public final class AdNeoMerchantBasePendant$mStartSuccessAnimation$1 extends Lambda implements p	// class@00179a
{
    public final AdNeoMerchantBasePendant this$0;

    public void AdNeoMerchantBasePendant$mStartSuccessAnimation$1(AdNeoMerchantBasePendant p0){
       this.this$0 = p0;
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       this.invoke(p0, p1.longValue());
       return l1.a;
    }
    public final void invoke(a p0,long p1){
       String str = "1";
       if (PatchProxy.isSupport(AdNeoMerchantBasePendant$mStartSuccessAnimation$1.class) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), this, AdNeoMerchantBasePendant$mStartSuccessAnimation$1.class, str)) {
          return;
       }
       a.p(p0, "callback");
       ActivityContext uActivityCon = ActivityContext.g();
       a.o(uActivityCon, "ActivityContext.getInstance\(\)");
       if (a.g(uActivityCon.e(), this.this$0.b())) {
          k1.p(new AdNeoMerchantBasePendant$mStartSuccessAnimation$1$a(this, p0), this.this$0);
          AdNeoMerchantBasePendant$mStartSuccessAnimation$1 tthis$0 = this.this$0;
          Objects.requireNonNull(tthis$0);
          AdNeoMerchantBasePendant uAdNeoMercha = AdNeoMerchantBasePendant.class;
          if (!PatchProxy.isSupport(uAdNeoMercha) || !PatchProxy.applyVoidOneRefs(Long.valueOf(p1), tthis$0, uAdNeoMercha, "8")) {
             Number number = PatchProxy.apply(null, tthis$0, uAdNeoMercha, str);
             if (number == PatchProxyResult.class) {
                number = tthis$0.b.getValue();
             }
             if (p1 - (long)number.intValue() >= 0) {
                d uod = new d(tthis$0.i);
                uod.z(true);
                uod.A(false);
                uod.w(null);
                uod.P(true);
                uod.D(PopupInterface$Excluded.SAME_TYPE);
                uod.T(2000);
                uod.L(new b(p1));
                uod.X();
             }
          }
       }
       return;
    }
}
