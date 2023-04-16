package com.kuaishou.merchant.transaction.purchase.presenter.g0$b;
import com.yxcorp.gateway.pay.api.PayCallback;
import com.kuaishou.merchant.transaction.purchase.presenter.g0;
import java.lang.String;
import java.lang.Object;
import com.yxcorp.gateway.pay.params.PayResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.transaction.base.logger.MerchantTransactionLogBiz;
import java.lang.StringBuilder;
import p74.a;
import o74.a;
import java.lang.System;
import um4.j1;
import java.lang.Runnable;
import android.os.Handler;
import um4.i1;
import um4.l1;
import um4.k1;

public class g0$b implements PayCallback	// class@000978
{
    public final long a;
    public final String b;
    public final String c;
    public final g0 d;

    public void g0$b(g0 p0,long p1,String p2,String p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public final void a(String p0,PayResult p1){
       PayResult mIncentiveAm;
       String str1;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, g0$b.class, "6")) {
          return;
       }
       MerchantTransactionLogBiz pURCHASE = MerchantTransactionLogBiz.PURCHASE;
       StringBuilder str = p0+": code ";
       p0 = "null";
       PayResult mCode = (p1 != null)? p1.mCode: p0;
       str = str+mCode+", tradeNo ";
       mCode = (p1 != null)? p1.mTradeNo: p0;
       str = str+mCode+", merchantId ";
       mCode = (p1 != null)? p1.mMerchantId: p0;
       str = str+mCode+", provider ";
       mCode = (p1 != null)? p1.mProvider: p0;
       str = str+mCode+", depositAmount ";
       mCode = (p1 != null)? p1.mDepositAmount: p0;
       str = str+mCode+", incentiveAmount ";
       if (p1 != null) {
          mIncentiveAm = p1.mIncentiveAmount;
       }
       a.g(pURCHASE, "PayPresenter", str+mIncentiveAm);
       return;
    }
    public void onPayCancel(PayResult p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g0$b.class, "3")) {
          return;
       }
       this.a("onPayCancel", p0);
       this.d.E = System.currentTimeMillis();
       this.d.Y8("cancel");
       this.d.u.postDelayed(new j1(this, this.a, p0), 100);
       return;
    }
    public void onPayFailure(PayResult p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g0$b.class, "2")) {
          return;
       }
       this.a("onPayFailure", p0);
       this.d.E = System.currentTimeMillis();
       this.d.Y8("failed");
       this.d.u.postDelayed(new i1(this, this.a, p0), 100);
       return;
    }
    public void onPaySuccess(PayResult p0){
       PayResult mIncentiveAm;
       String str2;
       g0$b uob = g0$b.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uob, "1")) {
          return;
       }
       String str = "onPaySuccess";
       if (!PatchProxy.applyVoidTwoRefs(str, p0, this, uob, "5")) {
          MerchantTransactionLogBiz pURCHASE = MerchantTransactionLogBiz.PURCHASE;
          StringBuilder str1 = str+": code ";
          str = "null";
          PayResult mCode = (p0 != null)? p0.mCode: str;
          str1 = str1+mCode+", tradeNo ";
          mCode = (p0 != null)? p0.mTradeNo: str;
          str1 = str1+mCode+", merchantId ";
          mCode = (p0 != null)? p0.mMerchantId: str;
          str1 = str1+mCode+", provider ";
          mCode = (p0 != null)? p0.mProvider: str;
          str1 = str1+mCode+", depositAmount ";
          mCode = (p0 != null)? p0.mDepositAmount: str;
          str1 = str1+mCode+", incentiveAmount ";
          if (p0 != null) {
             mIncentiveAm = p0.mIncentiveAmount;
          }
          a.s(pURCHASE, "PayPresenter", str1+mIncentiveAm);
       }
       this.d.E = System.currentTimeMillis();
       if (p0 != null) {
          this.d.H = p0.mPaySdKElapsedTime;
       }
       l1 ol1 = new l1(this, this.a, p0, this.b, this.c);
       this.d.u.postDelayed(v8, 100);
       return;
    }
    public void onPayUnknown(PayResult p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g0$b.class, "4")) {
          return;
       }
       this.a("onPayUnknown", p0);
       a.s(MerchantTransactionLogBiz.PURCHASE, "PayPresenter", "onPayUnknown£¬orderId£º"+this.a);
       this.d.E = System.currentTimeMillis();
       if (p0 != null) {
          this.d.H = p0.mPaySdKElapsedTime;
       }
       k1 ok1 = new k1(this, this.a, p0, this.b, this.c);
       this.d.u.postDelayed(v8, 100);
       return;
    }
}
