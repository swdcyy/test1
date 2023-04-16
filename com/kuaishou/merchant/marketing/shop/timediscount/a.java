package com.kuaishou.merchant.marketing.shop.timediscount.a;
import q94.a;
import im8.g;
import com.kuaishou.merchant.marketing.base.lifecycle.MarketingBasePresenter;
import com.kuaishou.merchant.marketing.shop.timediscount.a$a;
import com.kuaishou.merchant.marketing.shop.timediscount.LiveMerchantTimeDiscountControllerV2;
import java.lang.String;
import com.kuaishou.merchant.marketing.shop.timediscount.a$b;
import q94.c;
import y94.c;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import q94.d;
import java.lang.Runnable;
import ekd.k1;
import com.kuaishou.merchant.marketing.shop.timediscount.view.LiveMerchantTimeDiscountPendent$a;
import bs3.b;
import kotlin.jvm.internal.a;
import ks3.l0;
import java.util.ArrayList;
import crd.b;
import x94.a;
import z94.b;
import fa4.a;
import q94.o;
import java.lang.Boolean;
import java.lang.Integer;
import q94.n;
import fq5.b;
import da4.a;
import java.util.Objects;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import w74.a;
import q2b.h$b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Number;
import k2b.u1;
import com.kwai.robust.PatchProxyResult;
import q94.i;
import java.util.Map;
import java.util.HashMap;
import com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.model.LiveMerchantContainerDataList;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import c84.a;
import zp5.a;
import ks3.f0;
import android.app.Activity;
import android.content.Context;
import ks3.k0;
import q94.j;
import android.view.View$OnClickListener;
import com.kuaishou.merchant.marketing.shop.timediscount.a$c;

public class a extends MarketingBasePresenter implements a, g	// class@001c03
{
    public b I;
    public a J;
    public a K;
    public b L;
    public LiveMerchantTimeDiscountPendent$a M;
    public a N;
    public final b O;
    public Map P;
    public final a Q;

    public void a(){
       super();
       this.M = new a$a(this);
       this.N = new LiveMerchantTimeDiscountControllerV2("LiveMerchantTimeDiscountPresenter", this);
       this.O = new a$b(this);
       this.Q = new c(this);
    }
    public void O6(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "14")) {
          return;
       }
       k1.s(new d(this, p0), "LiveMerchantTimeDiscountPresenter", 0);
       return;
    }
    public LiveMerchantTimeDiscountPendent$a T3(){
       return this.M;
    }
    public void V0(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "15")) {
          return;
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, MarketingBasePresenter.class, "16")) {
          MarketingBasePresenter tr = this.r;
          if (tr == null) {
             a.S("mSlideShowPendantService");
          }
          tr.i(p0);
          this.C.add(p0);
       }
       return;
    }
    public void V5(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "16")) {
          return;
       }
       this.S8(p0);
       return;
    }
    public void Z8(){
       if (PatchProxy.applyVoid(null, this, a.class, "10")) {
          return;
       }
       k1.n("LiveMerchantTimeDiscountPresenter");
       this.I.b(this.Q);
       this.N.D();
       return;
    }
    public void a9(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       this.I.e(this.Q);
       this.N.onShow();
       return;
    }
    public void d9(o p0,boolean p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoa, "7")) {
          return;
       }
       if (p0 != null) {
          p0.a(p1);
       }
       return;
    }
    public void e9(c p0,String p1,int p2){
       n a;
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, a.class, "9")) {
          return;
       }
       a = n.a;
       String liveStreamId = this.u.getLiveStreamId();
       String str = this.u.d();
       String str1 = p0.b();
       int size = this.N.getSize();
       int i = 1;
       int i1 = this.N.d(p0) + i;
       String str2 = (p0.e() == null)? "": p0.e().f();
       Objects.requireNonNull(a);
       int i2 = 0;
       if (PatchProxy.isSupport(n.class)) {
          Object[] objArray = new Object[]{liveStreamId,str,str1,p1,Integer.valueOf(size),Integer.valueOf(i1),Integer.valueOf(p2),str2};
          if (!PatchProxy.applyVoid(objArray, a, n.class, "4")) {
          label_0086 :
             h$b uob = h$b.d(i2, i2);
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             i3 oi3 = i3.f();
             oi3.d("activity_id", str1);
             oi3.d("coupon_id", p1);
             oi3.c("num", Integer.valueOf(size));
             oi3.c("pos", Integer.valueOf(i1));
             oi3.d("receive_condition_type", str2);
             oi3.c("result", Integer.valueOf(p2));
             uElementPack.params = oi3.toString();
             uElementPack.action2 = "MERCHANT_TIMING_REDPACKET";
             uob.k(uElementPack);
             uob.h(a.a(liveStreamId, str));
             if (!PatchProxy.applyVoidOneRefs(uob, a, n.class, "7")) {
                u1.r0(uob);
             }
          }
       }else {
          goto label_0086 ;
       }
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new i();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, a.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(a.class, new i());
       }else {
          obj.put(a.class, null);
       }
       return obj;
    }
    public void h9(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "11")) {
          return;
       }
       this.N.a(p0);
       return;
    }
    public void i3(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       this.j9(false, null, this.N.b());
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       super.j8();
       this.I = this.r8("LIVE_MERCHANT_DIALOG_SERVICE");
       this.J = this.t8("LIVE_MERCHANT_RISING_COUPON_SERVICE");
       this.K = this.r8("LIVE_FRAGMENT_SIMPLE_SERVICE");
       this.N.e(this.t.J4(), this.getActivity(), this.q, this.r, this.u);
       return;
    }
    public void j9(boolean p0,c p1,LiveMerchantContainerDataList p2){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), p1, p2, this, a.class, "4")) {
          return;
       }
       a tK = this.K;
       if (tK != null && !tK.a()) {
          return;
       }
       if (this.I.d()) {
          return;
       }
       tK = this.J;
       if (tK != null && tK.d()) {
          return;
       }
       if (p2 != null && p2.size() > 0) {
          c uoc = (p1 != null)? p1: p2.get(0);
          if (!PatchProxy.applyVoidOneRefs(uoc, this, uoa, "5") && uoc != null) {
             this.P = j.a(uoc, "dialogShow", this.t.J4());
          }
          this.I.c(p2, p1, 2, p0);
       }
       return;
    }
    public void k9(boolean p0,c p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uoa, "12")) {
          return;
       }
       if (p1 == null) {
          return;
       }
       uoa = this.J;
       if (uoa != null && uoa.d()) {
          return;
       }
       if (!this.I.d()) {
          LiveMerchantContainerDataList liveMerchant = new LiveMerchantContainerDataList();
          liveMerchant.add(p1);
          this.j9(p0, p1, liveMerchant);
       }else if(this.I.g(2)){
          this.I.f(p1);
       }
       return;
    }
    public View$OnClickListener m6(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a$c(this, p0);
    }
}
