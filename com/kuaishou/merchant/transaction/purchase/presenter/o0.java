package com.kuaishou.merchant.transaction.purchase.presenter.o0;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.merchant.transaction.purchase.presenter.o0$a;
import android.os.Handler;
import android.os.Looper;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.transaction.base.logger.MerchantTransactionLogBiz;
import java.lang.StringBuilder;
import p74.a;
import o74.a;
import com.kwai.library.widget.popup.common.c;
import ue4.o;
import crd.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.app.Activity;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.merchant.basic.util.f;
import java.lang.Runnable;
import com.kuaishou.merchant.transaction.purchase.model.PrepayParam;
import java.util.LinkedList;
import java.lang.Long;
import lnc.b9;
import java.lang.Math;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import um4.v1;
import erd.a;
import um4.w1;
import com.kuaishou.merchant.transaction.purchase.presenter.o0$b;
import erd.g;
import java.lang.Integer;
import com.kuaishou.merchant.transaction.base.model.PaymentMethodInfo;
import com.kuaishou.merchant.transaction.purchase.presenter.PaymentMethodPanelPresenter$d;
import ae4.b;
import ae4.a;
import cjd.e;
import erd.o;
import com.kuaishou.merchant.transaction.purchase.presenter.n0;
import com.kuaishou.merchant.transaction.purchase.presenter.o0$c;
import em4.a;
import um4.b2;
import java.util.Map;
import java.util.HashMap;
import com.kuaishou.merchant.transaction.purchase.presenter.g0$d;
import com.kuaishou.merchant.transaction.purchase.MerchantPurchaseFragment;
import com.kuaishou.merchant.transaction.base.live.model.PurchasePageParams;

public class o0 extends PresenterV2 implements g	// class@000995
{
    public int A;
    public long B;
    public PaymentMethodInfo C;
    public long D;
    public long E;
    public o0$d p;
    public PaymentMethodPanelPresenter$d q;
    public g0$d r;
    public a s;
    public MerchantPurchaseFragment t;
    public PurchasePageParams u;
    public Handler v;
    public c w;
    public b x;
    public boolean y;
    public String z;

    public void o0(){
       super();
       this.p = new o0$a(this);
       this.v = new Handler(Looper.getMainLooper());
    }
    public static void P8(o0 p0){
       p0.X8();
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, o0.class, "2")) {
          return;
       }
       a.s(MerchantTransactionLogBiz.PURCHASE, "PrepayPresenter", "onUnbind£ºorderId£º"+this.B);
       this.B = 0;
       this.E = 0;
       this.C = null;
       o.b(this.w);
       this.w = null;
       o0 tx = this.x;
       if (tx != null) {
          tx.dispose();
       }
       tx = this.v;
       if (tx != null) {
          tx.removeCallbacksAndMessages(null);
       }
       return;
    }
    public boolean R8(){
       Activity obj = PatchProxy.apply(null, this, o0.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.getActivity();
       boolean b = false;
       if (obj == null) {
          a.s(MerchantTransactionLogBiz.PURCHASE, "PrepayPresenter", "jumpToOrderDetailAndCloseCurrentPage: activity null");
          return b;
       }else if(TextUtils.x(this.z)){
          a.s(MerchantTransactionLogBiz.PURCHASE, "PrepayPresenter", "jumpToOrderDetail: url null, finish page");
          obj.finish();
          return b;
       }else {
          a.s(MerchantTransactionLogBiz.PURCHASE, "PrepayPresenter", "jumpToOrderDetailAndCloseCurrentPage");
          f.e(obj, this.z);
          obj.finish();
          return true;
       }
    }
    public void S8(Runnable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o0.class, "12")) {
          return;
       }
       o0 tv = this.v;
       if (tv == null) {
          a.s(MerchantTransactionLogBiz.PURCHASE, "PrepayPresenter", "post: mMainHandler null");
          return;
       }else {
          tv.postAtFrontOfQueue(p0);
          return;
       }
    }
    public void V8(PrepayParam p0,long p1,LinkedList p2){
       if (PatchProxy.isSupport(o0.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), p2, this, o0.class, "5")) {
          return;
       }
       a.s(MerchantTransactionLogBiz.PURCHASE, "PrepayPresenter", "startPrepayDelay: param "+p0+", delay "+p1);
       b9.a(this.x);
       this.x = t.timer(Math.max(0, p1), TimeUnit.MILLISECONDS).observeOn(d.a).doFinally(new v1(this)).subscribe(new w1(this, p0, p2), new o0$b(this));
       return;
    }
    public void W8(boolean p0,PrepayParam p1,long p2,LinkedList p3,String p4,int p5,String p6){
       Object[] objArray;
       Object obj1;
       PaymentMethodInfo paymentMetho = this;
       boolean b = p0;
       long l = p2;
       object oobject = p3;
       object oobject1 = p4;
       o0 oo0 = o0.class;
       int i = 4;
       int i1 = 3;
       int i2 = 2;
       int i3 = 1;
       int i4 = 0;
       int i5 = 5;
       if (PatchProxy.isSupport(oo0)) {
          objArray = new Object[]{Boolean.valueOf(p0),p1,Long.valueOf(p2),oobject,oobject1,Integer.valueOf(p5),p6};
          if (PatchProxy.applyVoid(objArray, paymentMetho, oo0, "3")) {
             return;
          }
       }
       if (PatchProxy.isSupport(oo0)) {
          objArray = new Object[i5];
          objArray[i4] = Boolean.valueOf(p0);
          objArray[i3] = p1;
          objArray[i2] = Long.valueOf(p2);
          objArray[i1] = oobject1;
          objArray[i] = Integer.valueOf(p5);
          PaymentMethodInfo obj = PatchProxy.apply(objArray, paymentMetho, oo0, "6");
          if (obj != PatchProxyResult.class) {
             obj1 = obj;
          }else if(b || p1 == null){
             obj = paymentMetho.q.a();
             paymentMetho.C = obj;
             obj1 = PrepayParam.forPrepayApi(obj, l, oobject1, p5);
          }else {
             obj1 = p1;
          }
       }else {
          goto label_006b ;
       }
       a.s(MerchantTransactionLogBiz.PURCHASE, "PrepayPresenter", "startPrepay: first "+b+", tid "+l+", param "+obj1);
       b9.a(paymentMetho.x);
       paymentMetho.x = a.a().v(obj1.mTid+"", obj1.mHide, obj1.mProvider, obj1.mProviderChannelType, obj1.mPaymentMethod, obj1.mInstallmentProductNo, false, obj1.mTransactionPassThrough, obj1.mPrePayType, p6, obj1.mBankCardToken, obj1.mBankCardPayType, obj1.mActivityDiscountCode, 2000, TextUtils.k(obj1.mSubCashierConfigScene)).map(new e()).doFinally(new v1(paymentMetho)).subscribe(new n0(paymentMetho), new o0$c(paymentMetho, b, obj1, oobject));
       return;
    }
    public final void X8(){
       if (PatchProxy.applyVoid(null, this, o0.class, "13")) {
          return;
       }
       a.s(MerchantTransactionLogBiz.PURCHASE, "PrepayPresenter", "stopLoadingIfNeeded: mShouldStopLoading "+this.y);
       if (this.y != null) {
          o0 ts = this.s;
          if (ts != null) {
             ts.l7();
          }
          this.y = false;
       }
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, o0.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new b2();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, o0.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(o0.class, new b2());
       }else {
          obj.put(o0.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, o0.class, "1")) {
          return;
       }
       this.q = this.r8("payment_method_service");
       this.r = this.r8("pay_service");
       this.s = this.q8(a.class);
       this.t = this.r8("FRAGMENT");
       this.u = this.r8("page_params");
       return;
    }
}
