package com.yxcorp.gifshow.ad.neo.merchant.AdNeoMerchantBasePendant$mUpdateCountDown$1$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.ad.neo.merchant.AdNeoMerchantBasePendant$mUpdateCountDown$1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.ad.neo.merchant.AdNeoMerchantBasePendant;
import com.yxcorp.gifshow.ad.neo.widget.AdRewardPendant;
import java.lang.Long;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import lnc.y0;
import java.lang.CharSequence;
import android.widget.TextView;
import java.lang.StringBuilder;
import lnc.a1;

public final class AdNeoMerchantBasePendant$mUpdateCountDown$1$a implements Runnable	// class@00179b
{
    public final AdNeoMerchantBasePendant$mUpdateCountDown$1 b;
    public final long c;
    public final boolean d;

    public void AdNeoMerchantBasePendant$mUpdateCountDown$1$a(AdNeoMerchantBasePendant$mUpdateCountDown$1 p0,long p1,boolean p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       AdRewardPendant b;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AdNeoMerchantBasePendant$mUpdateCountDown$1$a.class, "1")) {
          return;
       }
       AdNeoMerchantBasePendant a = this.b.this$0.a;
       if (a != null) {
          AdNeoMerchantBasePendant$mUpdateCountDown$1$a tc = this.c;
          AdNeoMerchantBasePendant$mUpdateCountDown$1$a td = this.d;
          if (!PatchProxy.isSupport(AdRewardPendant.class) || !PatchProxy.applyVoidTwoRefs(Long.valueOf(tc), Boolean.valueOf(td), a, AdRewardPendant.class, "4")) {
             String str = "mInfoText";
             if (td != null) {
                b = a.b;
                if (b == null) {
                   a.S(str);
                }
                b.setText(y0.h(tc, false, 2, objArray));
             }else {
                b = a.b;
                if (b == null) {
                   a.S(str);
                }
                b.setText(tc+a1.p(R.string.arg_RES_7f1045e8));
             }
          }
       }
       return;
    }
}
