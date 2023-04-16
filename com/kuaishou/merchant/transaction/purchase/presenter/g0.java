package com.kuaishou.merchant.transaction.purchase.presenter.g0;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.merchant.transaction.purchase.presenter.g0$a;
import android.os.Handler;
import android.os.Looper;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.widget.popup.common.c;
import ue4.o;
import crd.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.app.Activity;
import com.kuaishou.merchant.transaction.base.logger.MerchantTransactionLogBiz;
import p74.a;
import o74.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import ue4.k;
import com.kuaishou.merchant.basic.util.f;
import java.lang.Runnable;
import em4.a;
import com.kuaishou.merchant.transaction.base.model.PaymentMethodInfo;
import java.lang.Long;
import java.lang.StringBuilder;
import com.kuaishou.merchant.transaction.purchase.presenter.g0$b;
import java.lang.System;
import com.yxcorp.gateway.pay.api.PayManager;
import android.content.Context;
import com.yxcorp.gateway.pay.api.PayCallback;
import com.yxcorp.gateway.pay.params.PaymentInfo;
import ue4.l;
import androidx.lifecycle.LifecycleOwner;
import com.kuaishou.merchant.transaction.purchase.model.PayResultQueryParam;
import java.lang.Integer;
import lnc.b9;
import sm4.b;
import sm4.a;
import brd.t;
import cjd.e;
import erd.o;
import um4.f1;
import erd.a;
import com.kuaishou.merchant.transaction.purchase.presenter.f0;
import com.kuaishou.merchant.transaction.purchase.presenter.g0$c;
import erd.g;
import com.kuaishou.merchant.transaction.purchase.presenter.r$g;
import java.util.HashMap;
import com.yxcorp.gateway.pay.params.PayResult$PaySdKElapsedTime;
import java.util.Map;
import je4.a;
import um4.o1;
import com.kuaishou.merchant.transaction.purchase.MerchantPurchaseFragment;
import com.kuaishou.merchant.transaction.base.live.model.PurchasePageParams;

public class g0 extends PresenterV2 implements g	// class@00097b
{
    public String A;
    public long B;
    public String C;
    public long D;
    public long E;
    public long F;
    public long G;
    public PayResult$PaySdKElapsedTime H;
    public g0$d p;
    public a q;
    public MerchantPurchaseFragment r;
    public r$g s;
    public PurchasePageParams t;
    public Handler u;
    public c v;
    public b w;
    public boolean x;
    public String y;
    public long z;

    public void g0(){
       super();
       this.p = new g0$a(this);
       this.u = new Handler(Looper.getMainLooper());
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, g0.class, "2")) {
          return;
       }
       this.z = 0;
       this.A = null;
       this.E = 0;
       this.D = 0;
       this.F = 0;
       this.H = null;
       o.b(this.v);
       this.v = null;
       g0 tw = this.w;
       if (tw != null) {
          tw.dispose();
       }
       tw = this.u;
       if (tw != null) {
          tw.removeCallbacksAndMessages(null);
       }
       return;
    }
    public boolean P8(){
       Activity obj = PatchProxy.apply(null, this, g0.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.getActivity();
       boolean b = false;
       String str = "PayPresenter";
       if (obj == null) {
          a.s(MerchantTransactionLogBiz.PURCHASE, str, "jumpToOrderDetailAndCloseCurrentPage: activity null");
          return b;
       }else if(TextUtils.x(this.y)){
          a.s(MerchantTransactionLogBiz.PURCHASE, str, "jumpToOrderDetail: url null, finish page");
          k.a.a(obj);
          return b;
       }else {
          a.s(MerchantTransactionLogBiz.PURCHASE, str, "jumpToOrderDetailAndCloseCurrentPage");
          f.e(obj, this.y);
          k.a.a(obj);
          return true;
       }
    }
    public final void R8(Runnable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g0.class, "11")) {
          return;
       }
       g0 tu = this.u;
       if (tu == null) {
          a.s(MerchantTransactionLogBiz.PURCHASE, "PayPresenter", "post: mMainHandler null");
          return;
       }else {
          tu.postAtFrontOfQueue(p0);
          return;
       }
    }
    public void S8(){
       if (PatchProxy.applyVoid(null, this, g0.class, "12")) {
          return;
       }
       MerchantTransactionLogBiz pURCHASE = MerchantTransactionLogBiz.PURCHASE;
       a.s(pURCHASE, "PayPresenter", "startLoading");
       g0 tq = this.q;
       if (tq != null) {
          tq.Pc();
       }else {
          a.s(pURCHASE, "PayPresenter", "startLoading: mContract null");
       }
       return;
    }
    public void V8(long p0,String p1,String p2,String p3,boolean p4,String p5,PaymentMethodInfo p6){
       int i = this;
       object oobject = p1;
       object oobject1 = p2;
       boolean b = p4;
       object oobject2 = p6;
       g0 og0 = g0.class;
       int i1 = 1;
       if (PatchProxy.isSupport(og0)) {
          Object[] objArray = new Object[]{Long.valueOf(p0),oobject,oobject1,p3,Boolean.valueOf(p4),p5,oobject2};
          if (PatchProxy.applyVoid(objArray, this, og0, "3")) {
             return;
          }
       }
       MerchantTransactionLogBiz pURCHASE = MerchantTransactionLogBiz.PURCHASE;
       StringBuilder str = "startPayInternal: merchantId "+oobject+", prepayNo "+oobject1+", isOneStep "+b+", paySdkPassThrough ";
       String str1 = (TextUtils.x(p5))? "null": "nonNull";
       a.s(pURCHASE, "PayPresenter", str+str1);
       Activity activity = this.getActivity();
       if (activity == null) {
          a.s(pURCHASE, "PayPresenter", "startPay: activity null");
          i.x = i1;
          this.X8();
       }
       g0$b uob = new g0$b(this, p0, p2, p3);
       i.D = System.currentTimeMillis();
       if (b) {
          a.s(pURCHASE, "PayPresenter", "startOneStepPaySdkApi");
          PayManager.getInstance().startPay(activity, p1, p2, p5, v14);
       }else {
          a.s(pURCHASE, "PayPresenter", "startOldPaySDKApi");
          PayManager.getInstance().startKsPay(activity, l.b(oobject, oobject1, oobject2), v14, null);
       }
       return;
    }
    public void W8(boolean p0,long p1,String p2,PayResultQueryParam p3,int p4,String p5){
       PayResultQueryParam payResultQue;
       PayResultQueryParam payResultQue1;
       g0 og0 = this;
       boolean b = p0;
       object oobject = p2;
       object oobject1 = p5;
       g0 og01 = g0.class;
       int i = 4;
       if (PatchProxy.isSupport(og01)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Long.valueOf(p1),oobject,p3,Integer.valueOf(p4),oobject1};
          if (PatchProxy.applyVoid(objArray, this, og01, "4")) {
             return;
          }
       }
       a.s(MerchantTransactionLogBiz.PURCHASE, "PayPresenter", "startQueryPayResult: first "+b+", prepayNo "+oobject+", remainedRetryCount "+p4+"£¬orderId£º"+p1);
       b9.a(og0.w);
       if (PatchProxy.isSupport(og01)) {
          payResultQue = PatchProxy.applyThreeRefs(Boolean.valueOf(p0), p2, p3, this, g0.class, "5");
          if (payResultQue != PatchProxyResult.class) {
          label_009f :
             payResultQue1 = payResultQue;
          label_00a0 :
             f0 uof0 = new f0(this, p0, p1, payResultQue1, p4, p5);
             og0.w = a.a().b(i, String.valueOf(p1), oobject1, og0.C).map(new e()).doFinally(new f1(this)).subscribe(v14, new g0$c(this));
             return;
          }
       }
       if (b || p3 == null) {
          payResultQue = new PayResultQueryParam();
          payResultQue.mPrepayNo = oobject;
          goto label_009f ;
       }else {
          payResultQue1 = p3;
          goto label_00a0 ;
       }
    }
    public final void X8(){
       if (PatchProxy.applyVoid(null, this, g0.class, "13")) {
          return;
       }
       a.s(MerchantTransactionLogBiz.PURCHASE, "PayPresenter", "stopLoadingIfNeeded: mShouldStopLoading "+this.x);
       if (this.x != null) {
          g0 tq = this.q;
          if (tq != null) {
             tq.l7();
          }
          this.x = false;
       }
       return;
    }
    public void Y8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g0.class, "14")) {
          return;
       }
       long l = this.s.f();
       if (!TextUtils.x(p0) && l > 0) {
          HashMap hashMap = new HashMap();
          if (!TextUtils.x(this.s.a())) {
             hashMap.put("cashierType", this.s.a());
          }
          if (!TextUtils.x(this.s.c())) {
             hashMap.put("payPage", this.s.c());
          }
          if (!TextUtils.x(this.s.g())) {
             hashMap.put("paymentMethod", this.s.g());
          }
          if (!TextUtils.x(this.s.getProvider())) {
             hashMap.put("provider", this.s.getProvider());
          }
          if (!TextUtils.x(this.s.d())) {
             hashMap.put("providerChannelType", this.s.d());
          }
          if (this.s.b()) {
             hashMap.put("payFlowControl", Integer.valueOf(this.s.b()));
          }
          hashMap.put("startPayTimeStamp", Long.valueOf(l));
          if ((this.s.e() - l) > 0) {
             hashMap.put("shopOrderResponse", Long.valueOf((this.s.e() - l)));
          }
          long l1 = this.G - l;
          if (l1 > 0) {
             hashMap.put("shopPreCreateResponse", Long.valueOf(l1));
          }
          l1 = this.D - l;
          if (l1 > 0) {
             hashMap.put("shopPaySDKStart", Long.valueOf(l1));
          }
          g0 tH = this.H;
          if (tH != null) {
             l1 = tH.paySDKStartApp - l;
             if (l1 > 0) {
                hashMap.put("paySDKStartApp", Long.valueOf(l1));
             }
             l1 = this.H.paySDKEndApp - l;
             if (l1 > 0) {
                hashMap.put("paySDKEndApp", Long.valueOf(l1));
             }
             l1 = this.H.paySDKQueryResultCompleted - l;
             if (l1 > 0) {
                hashMap.put("paySDKQueryResultCompleted", Long.valueOf(l1));
             }
          }
          l1 = this.E - l;
          if (l1 > 0) {
             hashMap.put("shopPaySDKCompleted", Long.valueOf(l1));
          }
          l1 = this.F - l;
          if (l1 > 0) {
             hashMap.put("shopQueryResultCompleted", Long.valueOf(l1));
          }
          hashMap.put("shopPayResult", p0);
          a.a(hashMap);
       }
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g0.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new o1();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, g0.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(g0.class, new o1());
       }else {
          obj.put(g0.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, g0.class, "1")) {
          return;
       }
       this.q = this.q8(a.class);
       this.r = this.r8("FRAGMENT");
       this.t = this.r8("page_params");
       this.s = this.r8("create_order_statics_service");
       return;
    }
}
