package com.kuaishou.merchant.transaction.purchase.presenter.r$c;
import sfc.a;
import com.kuaishou.merchant.transaction.purchase.presenter.r;
import com.kuaishou.merchant.transaction.purchase.presenter.r$a;
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
import com.kuaishou.merchant.transaction.purchase.presenter.PaymentMethodPanelPresenter$d;
import com.kuaishou.merchant.transaction.base.live.model.PurchasePageParams;
import k2b.e0;
import em4.m;

public class r$c extends a	// class@00099f
{
    public final r c;

    public void r$c(r p0){
       this.c = p0;
       super();
    }
    public void r$c(r p0,r$a p1){
       super(p0);
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r$c.class, "1")) {
          return;
       }
       super.b(p0);
       MerchantTransactionLogBiz pURCHASE = MerchantTransactionLogBiz.PURCHASE;
       StringBuilder str = "CreateOrderError: ";
       String str1 = (p0 instanceof KwaiException)? "code "+p0.mErrorCode: "cause "+p0.getCause();
       a.g(pURCHASE, "CreateOrderPresenter", str+str1);
       r$c tc = this.c;
       tc.O = true;
       r i = tc.I;
       r q = tc.Q;
       r r = tc.R;
       boolean b = (r != null && r.isServerSelectedAtMainLevel(tc.t.b()))? true: false;
       PurchasePageParams mPrevPageSel = this.c.K.mPrevPageSelectedPayMethod;
       String str2 = (p0 == null)? "": p0.getMessage();
       m.k(i, 2, q, "-1", r, b, mPrevPageSel, 0, str2);
       return;
    }
}
