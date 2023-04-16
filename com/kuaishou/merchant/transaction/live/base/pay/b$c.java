package com.kuaishou.merchant.transaction.live.base.pay.b$c;
import com.kuaishou.merchant.transaction.base.net.error.c;
import android.app.Activity;
import com.kuaishou.merchant.transaction.live.base.pay.b;
import java.lang.String;
import com.kuaishou.merchant.transaction.base.model.payment.CashierData;
import qi4.e;
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
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.OrderPaymentRequestInfo$CreateOrderParam;
import yz7.e;
import crd.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import ie4.b;
import java.lang.Boolean;
import android.text.TextUtils;
import kotlin.jvm.internal.a;
import zsd.u;
import com.kuaishou.merchant.transaction.base.pay.OrderEventProcessor;
import java.util.Objects;
import njd.a;
import com.kuaishou.merchant.transaction.live.base.pay.PurchasePanelCreateOrderUnionResponse;
import com.kuaishou.merchant.transaction.live.base.pay.PurchasePanelCreateOrderUnionResponse$Data;
import wkd.b;
import com.kwai.framework.network.sntp.a;
import java.lang.Long;
import java.lang.System;
import com.kuaishou.merchant.transaction.live.base.pay.PurchasePanelCreateOrderUnionResponse$CreateOrderUnionData;
import java.lang.Math;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import qi4.j;
import sfc.a;
import erd.g;
import com.kuaishou.merchant.transaction.base.payment.PrepayData;
import ae4.b;
import ae4.a;
import cjd.e;
import erd.o;
import qi4.h;
import com.kuaishou.merchant.transaction.live.base.pay.a;

public class b$c extends c	// class@00078e
{
    public b f;
    public String g;
    public CashierData h;
    public String i;
    public int j;
    public e k;
    public boolean l;
    public LiveMerchantBaseContext m;
    public HashMap n;
    public HashMap o;
    public String p;

    public void b$c(Activity p0,b p1,String p2,CashierData p3,String p4,int p5,e p6,boolean p7,LiveMerchantBaseContext p8,HashMap p9,HashMap p10,String p11){
       super(p0);
       this.f = p1;
       this.g = p2;
       this.h = p3;
       this.i = p4;
       this.j = p5;
       this.k = p6;
       this.l = p7;
       this.m = p8;
       this.n = p9;
       this.o = p10;
       this.p = p11;
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$c.class, "1")) {
          return;
       }
       super.b(p0);
       MerchantTransactionLogBiz lIVE_PURCHAS = MerchantTransactionLogBiz.LIVE_PURCHASE_PANEL;
       StringBuilder str = "CreateOrderError: ";
       String str1 = (p0 instanceof KwaiException)? "code "+p0.mErrorCode: "cause "+p0.getCause();
       a.g(lIVE_PURCHAS, "LiveMerchantPaymentManager", str+str1);
       return;
    }
    public void c(int p0,String p1,Throwable p2){
       String str1;
       b$c k;
       boolean b;
       b$c uoc = this;
       int i = p0;
       String str = p1;
       if (PatchProxy.isSupport(b$c.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, b$c.class, "6")) {
          return;
       }
       MerchantTransactionLogBiz merchantTran = null;
       if (i != -3) {
          if (i != -2) {
             if (i != -1) {
                str1 = "LiveMerchantPaymentManager";
                switch (i){
                    case 1000:
                      a.s(MerchantTransactionLogBiz.LIVE_PURCHASE_PANEL, str1, "request price interface error, should refresh business data");
                      k = uoc.k;
                      if (k != null) {
                         k.e();
                      }
                      break;
                    case 1001:
                      a.s(MerchantTransactionLogBiz.LIVE_PURCHASE_PANEL, str1, "request price interface error, shouldReconnect Freight");
                      b$c f = uoc.f;
                      Activity uActivity = this.d();
                      k = PatchProxy.apply(merchantTran, uoc, b$c.class, "7");
                      if (k != PatchProxyResult.class) {
                      }else {
                         OrderPaymentRequestInfo$CreateOrderParam uCreateOrder = e.a(uoc.g, OrderPaymentRequestInfo$CreateOrderParam.class);
                         if (uCreateOrder == null) {
                            k = uoc.g;
                         }else {
                            uCreateOrder.mInsuranceNotUsed = 1;
                            str1 = e.f(uCreateOrder);
                         }
                      }
                      Object obj = k;
                      f.k(uActivity, obj, uoc.h, uoc.i, uoc.j, false, uoc.o, uoc.m, uoc.n);
                      break;
                    case 1002:
                      k = uoc.k;
                      if (k != null) {
                         k.i();
                      }
                      break;
                    case 1003:
                      k = uoc.k;
                      if (k != null) {
                         k.p(str);
                      }
                      break;
                    default:
                }
             }else {
                k = uoc.k;
                if (k != null) {
                   k.q();
                }
             }
          }else if(!TextUtils.x(p1) && this.d() != null){
             uoc.f.e(this.d(), uoc.k, p1, uoc.m, uoc.n);
          }
       }else if(!TextUtils.x(p1) && this.d() != null){
          str1 = TextUtils.c(str, "identifyKey", uoc.p);
          Object obj1 = PatchProxy.applyOneRefs(str1, merchantTran, b.class, "2");
          if (obj1 != PatchProxyResult.class) {
             b = obj1.booleanValue();
          }else {
             b$c uoc1 = null;
             if (TextUtils.isEmpty(str1)) {
                b = false;
             }else {
                a.m(str1);
                b = u.q2(str1, "kwai://kds/react/bottom_sheet", uoc1, 2, merchantTran);
             }
          }
          if (b) {
             b.a(this.d(), str1);
          }else {
             uoc.f.g(this.d(), str1, uoc.m, uoc.n);
          }
       }
    label_0119 :
       return;
    }
    public void e(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$c.class, "2")) {
          return;
       }
       b$c tk = this.k;
       if (tk != null) {
          tk.l(this.f.a(p0), this.f.c(p0), this.f.d(p0));
       }
       b n = this.f.n;
       if (n != null) {
          n.c(p0);
       }
       return;
    }
    public void f(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$c.class, "5")) {
          return;
       }
       b$c tk = this.k;
       if (tk != null) {
          tk.b();
       }
       return;
    }
    public void g(boolean p0){
       b$c uoc = b$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "4")) {
          return;
       }
       if (p0) {
          b$c tk = this.k;
          if (tk != null) {
             tk.b();
          }
       }
       return;
    }
    public boolean h(Throwable p0){
       boolean b;
       object obj3;
       boolean b1;
       b uob1;
       PatchProxyResult patchProxyRe1;
       int i4;
       int i5;
       b uob2;
       boolean b2;
       String str;
       Object obj = this;
       b$c obj1 = p0;
       b uob = b.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b$c obj2 = PatchProxy.applyOneRefs(obj1, obj, b$c.class, "3");
       if (obj2 != patchProxyRe) {
          return obj2.booleanValue();
       }
       obj2 = obj.k;
       b = true;
       if (obj2 != null && obj2.d(obj1)) {
          return b;
       }
       obj2 = obj.f;
       Activity uActivity = this.d();
       b$c g = obj.g;
       b$c h = obj.h;
       b$c j = obj.j;
       b$c l = obj.l;
       b$c m = obj.m;
       b$c n = obj.n;
       b$c o = obj.o;
       Objects.requireNonNull(obj2);
       int i = 8;
       int i1 = 6;
       int i2 = 5;
       int i3 = 9;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[i3];
          objArray[0] = obj1;
          objArray[b] = uActivity;
          objArray[2] = g;
          objArray[3] = h;
          objArray[4] = Integer.valueOf(j);
          objArray[i2] = Boolean.valueOf(l);
          objArray[i1] = m;
          objArray[7] = n;
          objArray[i] = o;
          obj3 = PatchProxy.apply(objArray, obj2, uob, "12");
          if (obj3 != patchProxyRe) {
             b1 = obj3.booleanValue();
             uob1 = uob;
             patchProxyRe1 = patchProxyRe;
             i4 = 7;
          label_0094 :
             i5 = 9;
          }else if(obj2.a(obj1) != 4105){
             uob1 = uob;
             patchProxyRe1 = patchProxyRe;
             i4 = 7;
             b1 = false;
             goto label_0094 ;
          }else {
             Object obj5 = obj1.mResponse.a();
             if (obj5 != null) {
                PurchasePanelCreateOrderUnionResponse mData1 = obj5.mData;
                if (mData1 != null && mData1.mOrderData != null) {
                   Long longx = b.a(0x3b1f7b44).a();
                   long l1 = (longx != null)? longx.longValue(): System.currentTimeMillis() + 2000;
                   uob1 = uob;
                   long l2 = Math.max(0, (obj5.mData.mOrderData.mNt - l1));
                   a.v(MerchantTransactionLogBiz.LIVE_PURCHASE_PANEL, "LiveMerchantPaymentManager", "shouldReconnectByFlowLimit", "currentTime", Long.valueOf(l1), "mNt", Long.valueOf(obj5.mData.mOrderData.mNt), "delayTime", Long.valueOf(l2));
                   patchProxyRe1 = patchProxyRe;
                   i4 = 7;
                   i5 = 9;
                   j oj = new j(obj2, uActivity, g, h, obj5, j, l, o, m, n);
                   obj2.b = t.timer(l2, TimeUnit.MILLISECONDS).observeOn(d.a).subscribe(uob, new a());
                   b1 = true;
                }
             }
             uob1 = uob;
             patchProxyRe1 = patchProxyRe;
             i4 = 7;
             i5 = 9;
             b1 = false;
          }
       }else {
          str = 7;
          goto label_0086 ;
       }
       if (b1) {
          return true;
       }else {
          obj1 = obj.f;
          Activity uActivity1 = this.d();
          n = obj.h;
          h = obj.j;
          obj2 = obj.k;
          m = obj.m;
          l = obj.n;
          Objects.requireNonNull(obj1);
          if (PatchProxy.isSupport(uob1)) {
             Object[] objArray1 = new Object[i4];
             obj3 = p0;
             objArray1[0] = obj3;
             objArray1[1] = uActivity1;
             objArray1[2] = n;
             objArray1[3] = Integer.valueOf(h);
             objArray1[4] = obj2;
             objArray1[i2] = m;
             objArray1[i1] = l;
             uob2 = uob1;
             KwaiException obj4 = PatchProxy.apply(objArray1, obj1, uob2, "8");
             if (obj4 != patchProxyRe1) {
                b2 = obj4.booleanValue();
             }else if(!obj3 instanceof KwaiException || obj1.a(obj3) != 0x9c91){
                obj4 = obj3.mResponse;
                if (obj4 != null) {
                   PurchasePanelCreateOrderUnionResponse purchasePane = obj4.a();
                   if (purchasePane != null) {
                      PurchasePanelCreateOrderUnionResponse mData = purchasePane.mData;
                      if (mData != null && mData.mOrderData != null) {
                         obj1.f = mData.mPayFlowControl;
                         obj1.h = System.currentTimeMillis();
                         mData = purchasePane.mData;
                         PurchasePanelCreateOrderUnionResponse$CreateOrderUnionData mTid = mData.mOrderData.mTid;
                         str = obj1.b(mData);
                         purchasePane = purchasePane.mData;
                         PurchasePanelCreateOrderUnionResponse$Data mPayFlowCont = purchasePane.mPayFlowControl;
                         PurchasePanelCreateOrderUnionResponse$Data mPrepayData = purchasePane.mPrepayData;
                         PrepayData prepayData = (mPrepayData != null)? mPrepayData.mPrePayType: 0;
                         PurchasePanelCreateOrderUnionResponse$Data mOrderData = purchasePane.mOrderData;
                         PurchasePanelCreateOrderUnionResponse$CreateOrderUnionData mPrePayScene = mOrderData.mPrePayScene;
                         PurchasePanelCreateOrderUnionResponse$CreateOrderUnionData mPrePayTrans = mOrderData.mPrePayTransparentParam;
                         if (PatchProxy.isSupport(uob2)) {
                            Object[] objArray2 = new Object[12];
                            objArray2[0] = uActivity1;
                            objArray2[1] = mTid;
                            objArray2[2] = Boolean.FALSE;
                            objArray2[3] = str;
                            objArray2[4] = n;
                            objArray2[i2] = Integer.valueOf(h);
                            objArray2[i1] = m;
                            objArray2[i4] = l;
                            objArray2[i] = Integer.valueOf(mPayFlowCont);
                            objArray2[i5] = Integer.valueOf(prepayData);
                            objArray2[10] = mPrePayScene;
                            objArray2[11] = mPrePayTrans;
                            if (PatchProxy.applyVoid(objArray2, obj1, uob2, "9")) {
                            label_028e :
                               b2 = true;
                            }
                         }
                         b e = obj1.e;
                         if (e != null) {
                            e.a();
                         }
                         a.s(MerchantTransactionLogBiz.LIVE_PURCHASE_PANEL, "LiveMerchantPaymentManager", "startPrepay");
                         b$c uoc = l;
                         b$c uoc1 = obj1;
                         Activity uActivity2 = uActivity1;
                         h oh = new h(uoc1, uActivity2, m, mTid, str, h, uoc, mPayFlowCont, mPrePayTrans, n);
                         a uoa = new a(uoc1, uActivity2, str, uActivity1, m, uoc);
                         obj1.c = a.a().v(mTid, n.mHide, n.mProvider, n.mProviderChannelType, n.mPaymentMethod, n.mInstallmentProductNo, false, mPrePayTrans, prepayData, mPrePayScene, n.mBankCardToken, n.mBankCardPayType, n.mActivityDiscountCode, 1000, TextUtils.k(n.mSubCashierConfigScene)).map(new e()).subscribe(e, mPrePayTrans);
                         goto label_028e ;
                      }
                   }
                }
             }
             b2 = false;
          }else {
             Throwable throwable = p0;
             uob2 = uob1;
             goto label_017f ;
          }
          if (b2) {
             return true;
          }else {
             return 0;
          }
       }
    }
}
