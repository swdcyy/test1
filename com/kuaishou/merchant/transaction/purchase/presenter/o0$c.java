package com.kuaishou.merchant.transaction.purchase.presenter.o0$c;
import sfc.a;
import com.kuaishou.merchant.transaction.purchase.presenter.o0;
import com.kuaishou.merchant.transaction.purchase.model.PrepayParam;
import java.util.LinkedList;
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
import njd.a;
import com.kuaishou.merchant.transaction.base.payment.PrepayResponse;
import java.util.Collection;
import ekd.q;
import java.lang.Long;
import um4.z1;
import java.lang.Runnable;
import um4.y1;

public class o0$c extends a	// class@000993
{
    public boolean c;
    public PrepayParam d;
    public LinkedList e;
    public final o0 f;

    public void o0$c(o0 p0,boolean p1,PrepayParam p2,LinkedList p3){
       this.f = p0;
       super();
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o0$c.class, "1")) {
          return;
       }
       MerchantTransactionLogBiz pURCHASE = MerchantTransactionLogBiz.PURCHASE;
       String str = "PrepayError: ";
       String str1 = (v2 = p0 instanceof KwaiException)? "code "+p0.mErrorCode: "cause "+p0.getCause();
       a.g(pURCHASE, "PrepayPresenter", str+str1);
       o0$c uoc = null;
       o0$c tf = this.f;
       o0 t = tf.t;
       int i = 2;
       String str2 = e.e(tf.C);
       o0 b = this.f.B;
       str = (v2)? p0.mErrorCode+"": null;
       m.p(t, i, str2, b, str, this.f.D);
       if (v2) {
          KwaiException kwaiExceptio = p0;
          if (kwaiExceptio.mErrorCode == 3390) {
             if (this.c != null) {
                KwaiException mResponse = kwaiExceptio.mResponse;
                if (mResponse != null && (mResponse.a() instanceof PrepayResponse && !q.f(kwaiExceptio.mResponse.a().mRetryIntervals))) {
                   PrepayResponse mRetryInterv = kwaiExceptio.mResponse.a().mRetryIntervals;
                   Long longx = mRetryInterv.removeFirst();
                   if (longx != null) {
                      this.f.S8(new z1(this, longx, mRetryInterv));
                   label_00ee :
                      uoc = 1;
                   }
                }
             }
             if (this.c == null && !q.f(this.e)) {
                Long longx1 = this.e.removeFirst();
                if (longx1 != null) {
                   this.f.S8(new y1(this, longx1));
                   goto label_00ee ;
                }
             }
          }
       }
    label_00ef :
       if (uoc != null) {
          return;
       }else {
          super.b(p0);
          o0$c tf1 = this.f;
          tf1.y = true;
          tf1.R8();
          return;
       }
    }
}
