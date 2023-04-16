package com.kuaishou.merchant.transaction.purchase.presenter.g0$c;
import sfc.a;
import com.kuaishou.merchant.transaction.purchase.presenter.g0;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.System;
import com.kuaishou.merchant.transaction.base.logger.MerchantTransactionLogBiz;
import java.lang.StringBuilder;
import com.yxcorp.retrofit.model.KwaiException;
import p74.a;
import o74.a;
import k2b.e0;
import em4.m;

public class g0$c extends a	// class@000979
{
    public final g0 c;

    public void g0$c(g0 p0){
       this.c = p0;
       super();
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g0$c.class, "1")) {
          return;
       }
       super.b(p0);
       this.c.F = System.currentTimeMillis();
       this.c.Y8("failed");
       MerchantTransactionLogBiz pURCHASE = MerchantTransactionLogBiz.PURCHASE;
       StringBuilder str = "PayRelateTimerError: ";
       String str1 = (p0 instanceof KwaiException)? "code "+p0.mErrorCode: "cause "+p0.getCause();
       a.g(pURCHASE, "PayPresenter", str+str1);
       g0$c tc = this.c;
       tc.x = true;
       tc.P8();
       tc = this.c;
       m.p(tc.r, 2, tc.A, tc.z, "-1", tc.B);
       return;
    }
}
