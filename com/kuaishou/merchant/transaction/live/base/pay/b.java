package com.kuaishou.merchant.transaction.live.base.pay.b;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Object;
import java.util.List;
import java.util.Arrays;
import java.util.Collection;
import androidx.fragment.app.Fragment;
import qi4.e;
import java.util.UUID;
import java.lang.ref.WeakReference;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import com.yxcorp.gateway.pay.activity.FrontCashierOneStepActivity;
import java.lang.Class;
import java.lang.Throwable;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.retrofit.model.KwaiException;
import com.kuaishou.merchant.transaction.live.base.pay.PurchasePanelCreateOrderUnionResponse$Data;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import njd.a;
import com.kuaishou.merchant.transaction.live.base.pay.PurchasePanelCreateOrderUnionResponse;
import com.kuaishou.merchant.transaction.live.base.pay.PurchasePanelCreateOrderUnionResponse$ErrorInfo;
import java.util.HashMap;
import java.util.Map;
import ekd.q;
import android.app.Activity;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import java.lang.Integer;
import qi4.f;
import io.reactivex.g;
import brd.t;
import t45.d;
import brd.z;
import qi4.g;
import erd.a;
import qi4.k;
import com.kuaishou.merchant.transaction.live.base.pay.b$b;
import erd.g;
import crd.b;
import java.lang.Boolean;
import android.net.Uri;
import ekd.x0;
import java.util.Locale;
import com.yxcorp.utility.n;
import et3.a;
import ni4.a;
import android.content.Context;
import dm4.b;
import com.kuaishou.merchant.router.b;
import com.kuaishou.merchant.basic.util.f;
import com.kuaishou.merchant.transaction.base.logger.MerchantTransactionLogBiz;
import p74.a;
import o74.a;
import java.lang.StringBuilder;
import com.yxcorp.gateway.pay.params.PayResult$PaySdKElapsedTime;
import brd.v;
import ae4.b;
import ae4.a;
import cjd.e;
import erd.o;
import qi4.l;
import qi4.m;
import com.kuaishou.merchant.transaction.base.model.payment.CashierData;
import java.lang.System;
import qi4.b;
import qi4.c;
import yz7.e;
import lk4.b;
import lk4.a;
import qi4.a;
import qi4.i;
import com.kuaishou.merchant.transaction.live.base.pay.b$c;
import crd.c;
import com.yxcorp.gateway.pay.params.PaymentInfo;
import com.kuaishou.merchant.transaction.live.base.pay.b$a;
import com.yxcorp.gateway.pay.api.PayManager;
import com.yxcorp.gateway.pay.api.PayCallback;
import androidx.lifecycle.LifecycleOwner;

public class b	// class@00078f
{
    public b a;
    public b b;
    public b c;
    public WeakReference d;
    public e e;
    public int f;
    public long g;
    public long h;
    public long i;
    public long j;
    public PayResult$PaySdKElapsedTime k;
    public long l;
    public long m;
    public b n;
    public String o;
    public static final List p;

    static {
       String[] stringArray = new String[]{"openmerchanthalfrn","openhalfrn"};
       b.p = new ArrayList(Arrays.asList(stringArray));
    }
    public void b(Fragment p0,e p1){
       super();
       this.f = 1;
       this.o = UUID.randomUUID().toString();
       this.d = new WeakReference(p0);
       this.e = p1;
       b.a(0x4b316083).I(FrontCashierOneStepActivity.class.getName());
    }
    public int a(Throwable p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = -1;
       if (p0 instanceof KwaiException) {
          i = p0.getErrorCode();
       }
       return i;
    }
    public final String b(PurchasePanelCreateOrderUnionResponse$Data p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return "";
       }
       p0 = (!TextUtils.x(p0.mUnpaidSimplifyHalfUrl))? p0.mUnpaidSimplifyHalfUrl: p0.mOrderDetailLink;
       return p0;
    }
    public String c(Throwable p0){
       PurchasePanelCreateOrderUnionResponse obj = PatchProxy.applyOneRefs(p0, this, b.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.mResponse.a();
       if (obj != null) {
          PurchasePanelCreateOrderUnionResponse mData = obj.mData;
          if (mData != null) {
             PurchasePanelCreateOrderUnionResponse$Data mErrorInfo = mData.mErrorInfo;
             if (mErrorInfo != null && !TextUtils.x(mErrorInfo.mErrorReason)) {
                return obj.mData.mErrorInfo.mErrorReason;
             }
          }
       }
       return p0.getMessage();
    }
    public HashMap d(Throwable p0){
       PurchasePanelCreateOrderUnionResponse obj = PatchProxy.applyOneRefs(p0, this, b.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PurchasePanelCreateOrderUnionResponse purchasePane = p0.mResponse.a();
       if (purchasePane != null) {
          obj = purchasePane.mData;
          if (obj != null) {
             PurchasePanelCreateOrderUnionResponse$Data mErrorInfo = obj.mErrorInfo;
             if (mErrorInfo != null && !q.h(mErrorInfo.mLoggerInfo)) {
                return purchasePane.mData.mErrorInfo.mLoggerInfo;
             }
          }
       }
       return null;
    }
    public void e(Activity p0,e p1,String p2,LiveMerchantBaseContext p3,HashMap p4){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, uob, "19")) {
             return;
          }
       }
       this.g(p0, p2, p3, p4);
       if (p1 != null) {
          p1.m(p2);
       }
       return;
    }
    public void f(Activity p0,e p1,String p2,String p3,String p4,int p5,LiveMerchantBaseContext p6,HashMap p7,String p8,String p9){
       int i = this;
       object oobject = p1;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[10];
          objArray[0] = p0;
          objArray[1] = oobject;
          objArray[2] = p2;
          objArray[3] = p3;
          objArray[4] = p4;
          objArray[5] = Integer.valueOf(p5);
          objArray[6] = p6;
          objArray[7] = p7;
          objArray[8] = p8;
          objArray[9] = p9;
          if (PatchProxy.applyVoid(objArray, this, uob, "16")) {
             return;
          }
       }
       if (oobject != null) {
          p1.a();
       }
       f uof = new f(this, p0, p1, p4, p2, p3, p5, p6, p7, p8, p9);
       b uob1 = this;
       e uoe = p1;
       String str = p4;
       LiveMerchantBaseContext liveMerchant = p6;
       HashMap hashMap = p7;
       k ok = new k(uob1, uoe, p2, p3, p0, str, liveMerchant, hashMap);
       b$b uob2 = new b$b(uob1, uoe, p0, p2, p3, str, liveMerchant, hashMap);
       i.a = t.create(v14).observeOn(d.a).doFinally(new g(oobject)).subscribe(v10, v11);
       return;
    }
    public void g(Activity p0,String p1,LiveMerchantBaseContext p2,HashMap p3){
       boolean b;
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, b.class, "5")) {
          return;
       }
       b te = this.e;
       if (te != null && te.h()) {
          return;
       }
       if (p0 != null && (p0.isFinishing() || TextUtils.x(p1))) {
          a.s(MerchantTransactionLogBiz.LIVE_PURCHASE_PANEL, "LiveMerchantPaymentManager", "jump failed, because activity or url is null");
          return;
       }else {
          Uri obj = PatchProxy.applyOneRefs(p1, this, b.class, "6");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else if(TextUtils.x(p1)){
             obj = x0.f(p1);
             if (obj != null) {
                b = b.p.contains((obj.getHost()).toLowerCase(Locale.getDefault()));
             }
          }
          b = false;
          if (b) {
             if (n.j(p0) > 0) {
                p1 = TextUtils.c(TextUtils.c(p1, "heightRatio", String.valueOf(a.a)), a.a, b.a(p0));
             }
             b.o(p2.getMerchantSessionId(), p0, p1);
             return;
          }else {
             f.l(p0, TextUtils.e(p1, p3), p2);
             return;
          }
       }
    }
    public final void h(Activity p0,String p1,LiveMerchantBaseContext p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, b.class, "4")) {
          return;
       }
       if (p0.isFinishing()) {
          a.s(MerchantTransactionLogBiz.LIVE_PURCHASE_PANEL, "LiveMerchantPaymentManager", "jump failed, because activity is null or finishing");
          return;
       }else if(!TextUtils.x(p1)){
          if (p2 != null) {
             b.o(p2.getMerchantSessionId(), p0, p1);
          }else {
             b.k(p0, p1);
          }
          a.s(MerchantTransactionLogBiz.LIVE_PURCHASE_PANEL, "LiveMerchantPaymentManager", "jumpAndCloseCurrentPage is: "+p1);
       }else {
          a.g(MerchantTransactionLogBiz.LIVE_PURCHASE_PANEL, "LiveMerchantPaymentManager", "jump failed, because url is null");
       }
       b te = this.e;
       if (te != null) {
          te.m(p1);
       }
       return;
    }
    public void i(e p0,String p1){
       Object obj = this;
       Object obj1 = p0;
       if (PatchProxy.applyVoidTwoRefs(obj1, p1, obj, b.class, "22")) {
          return;
       }
       if (obj1 != null) {
          p0.n(obj.f, obj.g, obj.h, obj.i, obj.j, obj.k, obj.l, obj.m, p1);
       }
       return;
    }
    public final b j(Activity p0,e p1,String p2,v p3,String p4,String p5,int p6,int p7,boolean p8,LiveMerchantBaseContext p9,HashMap p10,String p11,String p12){
       l obj1;
       boolean b;
       Object obj = this;
       object oobject = p1;
       object oobject1 = p3;
       object oobject2 = p4;
       object oobject3 = p11;
       object oobject4 = p12;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[13];
          objArray[0] = p0;
          objArray[1] = oobject;
          objArray[2] = p2;
          objArray[3] = oobject1;
          objArray[4] = oobject2;
          objArray[5] = p5;
          objArray[6] = Integer.valueOf(p6);
          objArray[7] = Integer.valueOf(p7);
          objArray[8] = Boolean.valueOf(p8);
          objArray[9] = p9;
          objArray[10] = p10;
          objArray[11] = oobject3;
          objArray[12] = oobject4;
          obj1 = PatchProxy.apply(objArray, obj, uob, "17");
          if (obj1 != PatchProxyResult.class) {
             return obj1;
          }
       }
       a.s(MerchantTransactionLogBiz.LIVE_PURCHASE_PANEL, "LiveMerchantPaymentManager", "start check by requestPayResult");
       int i = p7;
       obj1 = v7;
       b uob1 = this;
       v ov = p3;
       b = p8;
       l ol = v7;
       obj1 = new l(uob1, ov, b, p1, p6, p0, p2, p4, p5, i, p9, p10, p11, p12);
       m om = new m(uob1, b, oobject, ov);
       return a.a().b(i, oobject2, oobject3, oobject4).map(new e()).observeOn(d.a).subscribe(ol, om);
    }
    public b k(Activity p0,String p1,CashierData p2,String p3,int p4,boolean p5,HashMap p6,LiveMerchantBaseContext p7,HashMap p8){
       b obj;
       t ot;
       HashMap hashMap;
       long l = this;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p3;
       object oobject3 = p6;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       int i = 6;
       int i1 = 5;
       int i2 = 4;
       int i3 = 3;
       int i4 = 2;
       int i5 = 1;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[9];
          objArray[0] = oobject;
          objArray[i5] = oobject1;
          objArray[i4] = p2;
          objArray[i3] = oobject2;
          objArray[i2] = Integer.valueOf(p4);
          objArray[i1] = Boolean.valueOf(p5);
          objArray[i] = oobject3;
          objArray[7] = p7;
          objArray[8] = p8;
          obj = PatchProxy.apply(objArray, l, uob, "2");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       if (oobject == null || p0.isFinishing()) {
          return c.b();
       }else {
          obj = l.e;
          if (obj != null) {
             obj.a();
          }
          l.g = System.currentTimeMillis();
          l.n = new b(new WeakReference(oobject), l, new c(p2, p4, l.e, p7, p8, p1, p5, p3, p6), l.o);
          obj = l.e;
          if (PatchProxy.isSupport(uob)) {
             Object[] objArray1 = new Object[i];
             objArray1[0] = oobject1;
             objArray1[i5] = p2;
             objArray1[i4] = oobject2;
             objArray1[i3] = Boolean.valueOf(p5);
             objArray1[4] = obj;
             i1 = 5;
             objArray1[i1] = oobject3;
             ot = PatchProxy.apply(objArray1, l, uob, "13");
             if (ot != patchProxyRe) {
             label_0113 :
                i oi = new i(this, p0, p7, p8, p4, p2);
                b$c uoc = i5;
                b$c uoc1 = i5;
                uoc = new b$c(p0, this, p1, p2, p3, p4, l.e, p5, p7, p8, p6, l.o);
                return ot.observeOn(d.a).subscribe(v15, uoc1);
             }
          }else {
             i1 = 5;
          }
          String str = e.f(p2);
          if (PatchProxy.isSupport(uob)) {
             Object[] objArray2 = new Object[i1];
             objArray2[0] = oobject1;
             objArray2[i5] = oobject2;
             objArray2[i4] = Integer.valueOf(p5);
             objArray2[i3] = str;
             objArray2[4] = oobject3;
             hashMap = PatchProxy.apply(objArray2, l, uob, "14");
             if (hashMap != patchProxyRe) {
             }else {
             label_00d7 :
                hashMap = new HashMap();
                hashMap.put("createOrderParam", oobject1);
                hashMap.put("act", oobject2);
                hashMap.put("freightInsurance", Integer.valueOf(p5));
                hashMap.put("preCreateParam", str);
                if (oobject3 != null) {
                   hashMap.putAll(oobject3);
                }
             }
          }else {
             goto label_00d7 ;
          }
          ot = a.a().e(hashMap).retryWhen(new a(obj, hashMap)).map(new e());
          goto label_0113 ;
       }
    }
    public final void l(Activity p0,e p1,String p2,String p3,int p4,LiveMerchantBaseContext p5,HashMap p6,int p7,String p8,String p9,String p10,PaymentInfo p11){
       Object obj = this;
       object oobject = p0;
       int i = p7;
       object oobject1 = p11;
       b uob = b.class;
       int i1 = 1;
       int i2 = 2;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[12];
          objArray[0] = oobject;
          objArray[i1] = p1;
          objArray[i2] = p2;
          objArray[3] = p3;
          objArray[4] = Integer.valueOf(p4);
          objArray[5] = p5;
          objArray[6] = p6;
          objArray[7] = Integer.valueOf(p7);
          objArray[8] = p8;
          objArray[9] = p9;
          objArray[10] = p10;
          objArray[11] = oobject1;
          if (PatchProxy.applyVoid(objArray, obj, uob, "15")) {
             return;
          }
       }
       b$a uoa = v9;
       b$a uoa1 = v9;
       b$a uoa2 = uoa1;
       uoa = new b$a(this, p1, p2, p0, p11, p3, p4, p5, p6, p9, p10);
       obj.j = System.currentTimeMillis();
       String str = "LiveMerchantPaymentManager";
       if (i == 1) {
          a.s(MerchantTransactionLogBiz.LIVE_PURCHASE_PANEL, str, "startOldPaySdkApi");
          PayManager.getInstance().startKsPay(p0, oobject1, uoa2, null);
       }else {
          b$a uoa3 = uoa2;
          if (i == 2) {
             a.s(MerchantTransactionLogBiz.LIVE_PURCHASE_PANEL, str, "startOneStepPaySdkApi");
             PayManager.getInstance().startPay(p0, p11.getMerchantId(), p11.getOutOrderNo(), p8, uoa3);
          }else {
             a.A(MerchantTransactionLogBiz.LIVE_PURCHASE_PANEL, str, "startPay:flowControlUnknown "+i);
          }
       }
       return;
    }
}
