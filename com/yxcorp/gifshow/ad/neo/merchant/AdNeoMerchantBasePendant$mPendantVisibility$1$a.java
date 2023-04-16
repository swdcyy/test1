package com.yxcorp.gifshow.ad.neo.merchant.AdNeoMerchantBasePendant$mPendantVisibility$1$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.ad.neo.merchant.AdNeoMerchantBasePendant$mPendantVisibility$1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.ad.neo.merchant.AdNeoMerchantBasePendant;
import android.widget.FrameLayout;

public final class AdNeoMerchantBasePendant$mPendantVisibility$1$a implements Runnable	// class@001795
{
    public final AdNeoMerchantBasePendant$mPendantVisibility$1 b;
    public final int c;

    public void AdNeoMerchantBasePendant$mPendantVisibility$1$a(AdNeoMerchantBasePendant$mPendantVisibility$1 p0,int p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, AdNeoMerchantBasePendant$mPendantVisibility$1$a.class, "1")) {
          return;
       }
       AdNeoMerchantBasePendant a = this.b.this$0.a;
       if (a != null) {
          a.setVisibility(this.c);
       }
       return;
    }
}
