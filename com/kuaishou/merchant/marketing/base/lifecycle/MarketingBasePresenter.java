package com.kuaishou.merchant.marketing.base.lifecycle.MarketingBasePresenter;
import ks3.p0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.ArrayList;
import com.kuaishou.merchant.marketing.base.lifecycle.MarketingBasePresenter$mPageContext$2;
import msd.a;
import qrd.p;
import qrd.s;
import android.os.Handler;
import java.lang.String;
import vu.c;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import androidx.fragment.app.KwaiDialogFragment;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.a;
import ks3.t;
import tkd.b;
import tkd.d;
import os5.d;
import android.app.Activity;
import com.kuaishou.merchant.marketing.base.MerchantMarketingBaseLogBiz;
import kotlin.Pair;
import qrd.r0;
import java.util.Map;
import trd.s0;
import p74.a;
import o74.a;
import crd.a;
import android.os.CountDownTimer;
import ks5.b;
import ks5.c;
import bs3.b;
import ks3.l0;
import rq5.a;
import pq5.c;
import g14.e;
import g14.c;
import java.lang.Boolean;
import su.o;
import ks3.f0;
import com.kuaishou.merchant.marketing.base.lifecycle.MarketingBasePresenter$a;
import crd.b;
import fq5.b;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.c;
import ks3.k0;
import java.lang.StringBuilder;
import java.lang.Thread;
import java.lang.StackTraceElement;
import java.util.HashMap;

public abstract class MarketingBasePresenter extends PresenterV2 implements p0	// class@001af4
{
    public ArrayList A;
    public ArrayList B;
    public ArrayList C;
    public ArrayList D;
    public final p E;
    public Handler F;
    public boolean G;
    public String H;
    public t p;
    public k0 q;
    public l0 r;
    public c s;
    public f0 t;
    public b u;
    public c v;
    public a w;
    public ArrayList x;
    public ArrayList y;
    public ArrayList z;

    public void MarketingBasePresenter(){
       super();
       this.x = new ArrayList();
       this.y = new ArrayList();
       this.z = new ArrayList();
       this.A = new ArrayList();
       this.B = new ArrayList();
       this.C = new ArrayList();
       this.D = new ArrayList();
       this.E = s.c(new MarketingBasePresenter$mPageContext$2(this));
       this.F = new Handler();
    }
    public static void R8(MarketingBasePresenter p0,String p1,c p2,boolean p3,int p4,Object p5){
       if (p4 & 0x04) {
          p3 = true;
       }
       p0.P8(p1, p2, p3);
       return;
    }
    private final void V8(){
       KwaiDialogFragment kwaiDialogFr;
       if (PatchProxy.applyVoid(null, this, MarketingBasePresenter.class, "26")) {
          return;
       }
       Iterator iterator = this.y.iterator();
       while (iterator.hasNext()) {
          kwaiDialogFr = iterator.next();
          if (kwaiDialogFr != null) {
             kwaiDialogFr.dismissAllowingStateLoss();
          }
       }
       this.y.clear();
       iterator = this.z.iterator();
       while (iterator.hasNext()) {
          WeakReference weakReferenc = iterator.next();
          if (weakReferenc != null) {
             kwaiDialogFr = weakReferenc.get();
             if (kwaiDialogFr != null) {
                kwaiDialogFr.dismissAllowingStateLoss();
             }
          }
       }
       this.z.clear();
       return;
    }
    public final void E8(){
       if (PatchProxy.applyVoid(null, this, MarketingBasePresenter.class, "20")) {
          return;
       }
       MarketingBasePresenter tp = this.p;
       if (tp == null) {
          a.S("mLiveMerchantAudienceCommonService");
       }
       if (tp != null) {
          tp.c(this);
       }
       if (d.a(-2004767397).Xq(this.getActivity())) {
          this.r();
       }
       return;
    }
    public final void J8(){
       if (PatchProxy.applyVoid(null, this, MarketingBasePresenter.class, "21")) {
          return;
       }
       if (d.a(-2004767397).Xq(this.getActivity())) {
          this.P();
       }
       if (this.G != null) {
          this.P();
          MerchantMarketingBaseLogBiz dEBUG = MerchantMarketingBaseLogBiz.DEBUG;
          Activity activity = this.getActivity();
          String simpleName = (activity != null)? activity.getClass().getSimpleName(): "";
          a.x(dEBUG, "MarketingBasePresenter", "onPageHide 未调用", s0.k(r0.a("currentActivity", simpleName)));
       }
       MarketingBasePresenter tp = this.p;
       if (tp == null) {
          a.S("mLiveMerchantAudienceCommonService");
       }
       if (tp != null) {
          tp.d(this);
       }
       return;
    }
    public final void P(){
       Iterator iterator;
       b uob;
       MarketingBasePresenter tv;
       MarketingBasePresenter marketingBas = MarketingBasePresenter.class;
       if (PatchProxy.applyVoid(null, this, marketingBas, "24")) {
          return;
       }
       this.G = false;
       MarketingBasePresenter tw = this.w;
       if (tw != null) {
          tw.dispose();
       }
       tw = this.w;
       if (tw != null) {
          tw.d();
       }
       this.w = null;
       if (!PatchProxy.applyVoid(null, this, marketingBas, "25")) {
          Iterator iterator1 = this.A.iterator();
          while (iterator1.hasNext()) {
             iterator1.next().cancel();
          }
          this.A.clear();
       }
       this.V8();
       if (!PatchProxy.applyVoid(null, this, marketingBas, "27")) {
          iterator = this.B.iterator();
          while (iterator.hasNext()) {
             uob = iterator.next();
             if (uob != null) {
                tv = this.v;
                if (tv == null) {
                   a.S("mTopPendantAssociateService");
                }
                tv.c(uob);
             }
          }
          iterator = this.C.iterator();
          while (iterator.hasNext()) {
             uob = iterator.next();
             if (uob != null) {
                tv = this.r;
                if (tv == null) {
                   a.S("mSlideShowPendantService");
                }
                tv.j(uob);
             }
          }
          iterator = this.D.iterator();
          while (iterator.hasNext()) {
             a uoa = iterator.next();
             if (uoa != null) {
                tv = this.s;
                if (tv == null) {
                   a.S("mPendantContainerService");
                }
                tv.g9(uoa);
             }
          }
          this.B.clear();
          this.C.clear();
          this.D.clear();
       }
       iterator = this.x.iterator();
       while (iterator.hasNext()) {
          c.b(iterator.next());
       }
       this.x.clear();
       this.F.removeCallbacksAndMessages(null);
       this.Z8();
       return;
    }
    public final void P8(String p0,c p1,boolean p2){
       if (PatchProxy.isSupport(MarketingBasePresenter.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, MarketingBasePresenter.class, "28")) {
          return;
       }
       o oo = o.c();
       MarketingBasePresenter tt = this.t;
       if (tt == null) {
          a.S("mLiveMerchantLiveRouterProxyService");
       }
       oo.b("LIVE_WATCH", tt.J4(), p0, p2, new MarketingBasePresenter$a(this, p1));
       return;
    }
    public final void S8(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MarketingBasePresenter.class, "19")) {
          return;
       }
       if (this.w == null) {
          this.w = new a();
       }
       MarketingBasePresenter tw = this.w;
       a.m(tw);
       tw.c(p0);
       return;
    }
    public final b W8(){
       MarketingBasePresenter obj = PatchProxy.apply(null, this, MarketingBasePresenter.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.u;
       if (obj == null) {
          a.S("mLiveBasicContext");
       }
       return obj;
    }
    public void X7(b p0){
       super.X7(p0);
    }
    public final t X8(){
       MarketingBasePresenter obj = PatchProxy.apply(null, this, MarketingBasePresenter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.p;
       if (obj == null) {
          a.S("mLiveMerchantAudienceCommonService");
       }
       return obj;
    }
    public final f0 Y8(){
       MarketingBasePresenter obj = PatchProxy.apply(null, this, MarketingBasePresenter.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.t;
       if (obj == null) {
          a.S("mLiveMerchantLiveRouterProxyService");
       }
       return obj;
    }
    public abstract void Z8();
    public abstract void a9();
    public final void b9(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MarketingBasePresenter.class, "30")) {
          return;
       }
       o oo = o.c();
       MarketingBasePresenter tt = this.t;
       if (tt == null) {
          a.S("mLiveMerchantLiveRouterProxyService");
       }
       oo.m("LIVE_WATCH", tt.J4(), p0);
       return;
    }
    public final void c9(KwaiDialogFragment p0,c p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, MarketingBasePresenter.class, "12")) {
          return;
       }
       p0.show(p1, p2);
       this.y.add(p0);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, MarketingBasePresenter.class, "1")) {
          return;
       }
       this.p = this.r8("LIVE_MERCHANT_AUDIENCE_COMMON_SERVICE");
       this.q = this.r8("LIVE_MERCHANT_SIGNAL_SERVICE");
       this.r = this.r8("LIVE_MERCHANT_AUDIENCE_SLIDE_SHOW_SERVICE");
       this.s = this.q8(c.class);
       this.t = this.r8("LIVE_MERCHANT_LIVE_INTERNAL_ROUTER_SERVICE");
       this.u = this.r8("LIVE_BASIC_CONTEXT");
       this.v = this.q8(c.class);
       MarketingBasePresenter tt = this.t;
       if (tt == null) {
          a.S("mLiveMerchantLiveRouterProxyService");
       }
       this.H = tt.J4();
       return;
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, MarketingBasePresenter.class, "22")) {
          return;
       }
       this.V8();
       return;
    }
    public final void r(){
       if (PatchProxy.applyVoid(null, this, MarketingBasePresenter.class, "23")) {
          return;
       }
       if (this.G != null) {
          String str = "";
          StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
          int len = stackTrace.length;
          for (int i = 0; i < len; i = i + 1) {
             str = str+stackTrace[i].toString()+"\n";
          }
          HashMap hashMap = new HashMap();
          hashMap.put("stackTrace", str);
          Activity activity = this.getActivity();
          str = (activity != null)? activity.getClass().getSimpleName(): "";
          hashMap.put("currentActivity", str);
          a.x(MerchantMarketingBaseLogBiz.DEBUG, "MarketingBasePresenter", "onPageShow 多次调用", hashMap);
          return;
       }else {
          this.G = true;
          this.a9();
          return;
       }
    }
}
