package com.kuaishou.merchant.transaction.live.base.pay.b$a;
import com.yxcorp.gateway.pay.api.PayCallback;
import com.kuaishou.merchant.transaction.live.base.pay.b;
import qi4.e;
import java.lang.String;
import android.app.Activity;
import com.yxcorp.gateway.pay.params.PaymentInfo;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import java.util.HashMap;
import java.lang.Object;
import com.yxcorp.gateway.pay.params.PayResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.System;
import com.kuaishou.merchant.transaction.base.logger.MerchantTransactionLogBiz;
import p74.a;
import o74.a;

public class b$a implements PayCallback	// class@00078c
{
    public final e a;
    public final String b;
    public final Activity c;
    public final PaymentInfo d;
    public final String e;
    public final int f;
    public final LiveMerchantBaseContext g;
    public final HashMap h;
    public final String i;
    public final String j;
    public final b k;

    public void b$a(b p0,e p1,String p2,Activity p3,PaymentInfo p4,String p5,int p6,LiveMerchantBaseContext p7,HashMap p8,String p9,String p10){
       this.k = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       this.e = p5;
       this.f = p6;
       this.g = p7;
       this.h = p8;
       this.i = p9;
       this.j = p10;
       super();
    }
    public void onPayCancel(PayResult p0){
       Object obj = this;
       Object obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, b$a.class, "3")) {
          return;
       }
       obj.k.l = System.currentTimeMillis();
       if (obj1 != null) {
          obj.k.k = obj1.mPaySdKElapsedTime;
       }
       b$a a = obj.a;
       if (a != null) {
          a.f(obj.b, 3);
       }
       a = obj.a;
       if (a != null) {
          a.b();
       }
       obj.k.i(obj.a, "cancel");
       a.u(MerchantTransactionLogBiz.LIVE_PURCHASE_PANEL, "LiveMerchantPaymentManager", "use pay sdk cancel", "tradeNo", obj1.mTradeNo, "merchantId", obj1.mMerchantId);
       obj.k.e(obj.c, obj.a, obj.e, obj.g, obj.h);
       return;
    }
    public void onPayFailure(PayResult p0){
       Object obj = this;
       Object obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, b$a.class, "2")) {
          return;
       }
       obj.k.l = System.currentTimeMillis();
       if (obj1 != null) {
          obj.k.k = obj1.mPaySdKElapsedTime;
       }
       b$a a = obj.a;
       if (a != null) {
          a.f(obj.b, 2);
       }
       a = obj.a;
       if (a != null) {
          a.b();
       }
       obj.k.i(obj.a, "failed");
       a.u(MerchantTransactionLogBiz.LIVE_PURCHASE_PANEL, "LiveMerchantPaymentManager", "use pay sdk failure", "tradeNo", obj1.mTradeNo, "merchantId", obj1.mMerchantId);
       obj.k.e(obj.c, obj.a, obj.e, obj.g, obj.h);
       return;
    }
    public void onPaySuccess(PayResult p0){
       Object obj = this;
       Object obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, b$a.class, "1")) {
          return;
       }
       obj.k.l = System.currentTimeMillis();
       if (obj1 != null) {
          obj.k.k = obj1.mPaySdKElapsedTime;
       }
       b$a a = obj.a;
       if (a != null) {
          a.f(obj.b, 1);
       }
       a.u(MerchantTransactionLogBiz.LIVE_PURCHASE_PANEL, "LiveMerchantPaymentManager", "use pay sdk success", "tradeNo", obj1.mTradeNo, "merchantId", obj1.mMerchantId);
       obj.k.f(obj.c, obj.a, obj.b, obj.d.mOutOrderNo, obj.e, obj.f, obj.g, obj.h, obj.i, obj.j);
       return;
    }
    public void onPayUnknown(PayResult p0){
       Object obj = this;
       Object obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, b$a.class, "4")) {
          return;
       }
       obj.k.l = System.currentTimeMillis();
       if (obj1 != null) {
          obj.k.k = obj1.mPaySdKElapsedTime;
       }
       b$a a = obj.a;
       if (a != null) {
          a.f(obj.b, 4);
       }
       obj.k.i(obj.a, "unknown");
       a.u(MerchantTransactionLogBiz.LIVE_PURCHASE_PANEL, "LiveMerchantPaymentManager", "use pay sdk unknown", "tradeNo", obj1.mTradeNo, "merchantId", obj1.mMerchantId);
       obj.k.f(obj.c, obj.a, obj.b, obj.d.mOutOrderNo, obj.e, obj.f, obj.g, obj.h, obj.i, obj.j);
       return;
    }
}
