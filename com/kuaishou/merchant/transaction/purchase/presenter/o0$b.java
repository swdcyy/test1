package com.kuaishou.merchant.transaction.purchase.presenter.o0$b;
import sfc.a;
import com.kuaishou.merchant.transaction.purchase.presenter.o0;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.transaction.base.logger.MerchantTransactionLogBiz;
import java.lang.StringBuilder;
import com.yxcorp.retrofit.model.KwaiException;
import p74.a;
import o74.a;
import com.kuaishou.merchant.transaction.base.model.PaymentMethodInfo;
import vm4.e;
import k2b.e0;
import em4.m;

public class o0$b extends a	// class@000992
{
    public final o0 c;

    public void o0$b(o0 p0){
       this.c = p0;
       super();
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o0$b.class, "1")) {
          return;
       }
       super.b(p0);
       MerchantTransactionLogBiz pURCHASE = MerchantTransactionLogBiz.PURCHASE;
       StringBuilder str = "PayRelateTimerError: ";
       String str1 = (p0 instanceof KwaiException)? "code "+p0.mErrorCode: "cause "+p0.getCause();
       a.g(pURCHASE, "PrepayPresenter", str+str1);
       o0$b tc = this.c;
       tc.y = true;
       tc.R8();
       tc = this.c;
       tc = this.c;
       m.p(tc.t, 2, e.e(tc.C), tc.B, "-1", tc.D);
       return;
    }
}
