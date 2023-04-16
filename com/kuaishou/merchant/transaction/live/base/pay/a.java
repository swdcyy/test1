package com.kuaishou.merchant.transaction.live.base.pay.a;
import com.kuaishou.merchant.transaction.base.net.error.c;
import com.kuaishou.merchant.transaction.live.base.pay.b;
import android.app.Activity;
import java.lang.String;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import java.util.HashMap;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.transaction.base.logger.MerchantTransactionLogBiz;
import java.lang.StringBuilder;
import com.yxcorp.retrofit.model.KwaiException;
import p74.a;
import o74.a;
import qi4.e;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class a extends c	// class@00078b
{
    public final String f;
    public final Activity g;
    public final LiveMerchantBaseContext h;
    public final HashMap i;
    public final b j;

    public void a(b p0,Activity p1,String p2,Activity p3,LiveMerchantBaseContext p4,HashMap p5){
       this.j = p0;
       this.f = p2;
       this.g = p3;
       this.h = p4;
       this.i = p5;
       super(p1);
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       super.b(p0);
       MerchantTransactionLogBiz lIVE_PURCHAS = MerchantTransactionLogBiz.LIVE_PURCHASE_PANEL;
       StringBuilder str = "prePayError: ";
       String str1 = (p0 instanceof KwaiException)? "code "+p0.mErrorCode: "cause "+p0.getCause();
       a.g(lIVE_PURCHAS, "LiveMerchantPaymentManager", str+str1);
       return;
    }
    public void e(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       b e = this.j.e;
       if (e != null) {
          e.b();
          a tj = this.j;
          tj.e.l(tj.a(p0), this.j.c(p0), this.j.d(p0));
       }
       return;
    }
    public void f(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "3")) {
          return;
       }
       if (!TextUtils.x(this.f)) {
          a.g(MerchantTransactionLogBiz.LIVE_PURCHASE_PANEL, "LiveMerchantPaymentManager", "response.mPayment.mPreCreate is null");
          this.j.g(this.g, this.f, this.h, this.i);
       }
       return;
    }
}
