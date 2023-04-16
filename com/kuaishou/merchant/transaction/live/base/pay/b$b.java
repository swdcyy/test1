package com.kuaishou.merchant.transaction.live.base.pay.b$b;
import sfc.a;
import com.kuaishou.merchant.transaction.live.base.pay.b;
import qi4.e;
import android.app.Activity;
import java.lang.String;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import java.util.HashMap;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.retrofit.model.KwaiException;
import com.kuaishou.merchant.transaction.base.logger.MerchantTransactionLogBiz;
import java.lang.StringBuilder;
import p74.a;
import o74.a;

public class b$b extends a	// class@00078d
{
    public final e c;
    public final Activity d;
    public final String e;
    public final String f;
    public final String g;
    public final LiveMerchantBaseContext h;
    public final HashMap i;
    public final b j;

    public void b$b(b p0,e p1,Activity p2,String p3,String p4,String p5,LiveMerchantBaseContext p6,HashMap p7){
       this.j = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p6;
       this.i = p7;
       super();
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$b.class, "1")) {
          return;
       }
       b$b tc = this.c;
       if (tc != null) {
          tc.b();
       }
       super.b(p0);
       if (this.d.isFinishing()) {
          return;
       }else {
          v0 = p0 instanceof KwaiException;
          if (tc) {
             b$b tc1 = this.c;
             if (tc1 != null) {
                tc1.k(this.e, this.f, p0.getErrorCode(), p0.getMessage());
             }
          }
          this.j.e(this.d, this.c, this.g, this.h, this.i);
          MerchantTransactionLogBiz lIVE_PURCHAS = MerchantTransactionLogBiz.LIVE_PURCHASE_PANEL;
          StringBuilder str = "requestPayResult: ";
          String str1 = (tc)? "code "+p0.mErrorCode: "cause "+p0.getCause();
          a.g(lIVE_PURCHAS, "LiveMerchantPaymentManager", str+str1);
          return;
       }
    }
}
