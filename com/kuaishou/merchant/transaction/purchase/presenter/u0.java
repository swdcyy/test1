package com.kuaishou.merchant.transaction.purchase.presenter.u0;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.merchant.transaction.purchase.MerchantPurchaseFragment;
import com.kwai.robust.PatchProxyResult;
import android.os.Bundle;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import oj0.a;
import com.kuaishou.merchant.transaction.purchase.presenter.t0;
import com.kuaishou.merchant.transaction.purchase.presenter.r0;
import com.kuaishou.merchant.transaction.purchase.presenter.s0;
import com.kuaishou.merchant.transaction.purchase.presenter.u0$a;
import com.kuaishou.merchant.transaction.base.live.model.PurchasePageParams;
import com.kuaishou.merchant.transaction.base.logger.MerchantTransactionLogBiz;
import java.lang.StringBuilder;
import p74.a;
import o74.a;
import com.kuaishou.krn.model.LaunchModel$b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Set;
import java.util.Iterator;
import java.lang.Long;
import android.app.Activity;
import com.kuaishou.krn.model.LaunchModel;
import com.kuaishou.merchant.bowl.krn.MerchantKrnContainerView;
import com.kwai.kds.krn.api.page.KwaiRnContainerView;
import com.kuaishou.krn.event.a;
import android.view.View;
import ekd.m1;
import um4.k2;
import java.util.Map;
import java.util.HashMap;

public class u0 extends PresenterV2 implements g	// class@0009ad
{
    public MerchantPurchaseFragment p;
    public String q;
    public PurchasePageParams r;
    public String s;
    public MerchantKrnContainerView t;
    public final Bundle u;
    public boolean v;
    public final a w;
    public final a x;
    public final a y;
    public u0$b z;

    public void u0(MerchantPurchaseFragment p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       u0 ou0 = u0.class;
       super();
       this.s = "";
       this.u = new Bundle();
       this.v = false;
       t0 ot0 = PatchProxy.apply(null, this, ou0, "10");
       if (ot0 != patchProxyRe) {
       }else {
          ot0 = new t0(this);
       }
       this.w = ot0;
       r0 or0 = PatchProxy.apply(null, this, ou0, "11");
       if (or0 != patchProxyRe) {
       }else {
          or0 = new r0(this);
       }
       this.x = or0;
       s0 os0 = PatchProxy.apply(null, this, ou0, "12");
       if (os0 != patchProxyRe) {
       }else {
          os0 = new s0(this);
       }
       this.y = os0;
       this.z = new u0$a(this);
       this.p = p0;
       return;
    }
    public void E8(){
       u0 ou0 = u0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ou0, "4")) {
          return;
       }
       this.u.clear();
       u0 tr = this.r;
       if (tr != null) {
          this.u.putLong("merchantCreateTime", tr.mPerfCreateTime);
          this.u.putLong("merchantRequestSuccessTime", this.r.mPerfRequestSuccessTime);
       }
       this.u.putString("identifyKey", this.s);
       tr = this.q;
       if (tr != null) {
          this.u.putString("merchantPageInfo", tr);
          a.s(MerchantTransactionLogBiz.PURCHASE, "RNPanelPresenter", "update rn full data, hashcode "+(this.q).hashCode());
       }
       if (this.v == null) {
          tr = this.u;
          if (!PatchProxy.applyVoidOneRefs(tr, this, ou0, "7")) {
             LaunchModel$b uob = new LaunchModel$b();
             uob.i("merchant-purchase");
             uob.j("merchant_client_purchase");
             uob.g(false);
             u0 tr1 = this.r;
             if (tr1 != null && !TextUtils.x(tr1.mMinBundleVersion)) {
                uob.l(this.r.mMinBundleVersion);
             }
             Iterator iterator = tr.keySet().iterator();
             while (iterator.hasNext()) {
                String str = iterator.next();
                Object obj = tr.get(str);
                if (obj instanceof Long) {
                   uob.c(str, obj.longValue());
                }else if(obj instanceof String){
                   uob.e(str, obj);
                }
             }
             this.t.c(this.getActivity(), uob.h());
             a.s(MerchantTransactionLogBiz.PURCHASE, "RNPanelPresenter", "krn initialization succeeded");
          }
          this.v = true;
       }else {
          this.t.Vc(this.u);
       }
       if (!PatchProxy.applyVoid(objArray, this, ou0, "8")) {
          a uoa = a.b();
          if (uoa == null) {
             a.g(MerchantTransactionLogBiz.PURCHASE, "RNPanelPresenter", "registerReselectEvent: manager null");
          }else {
             uoa.a("MerchantPurchaseReselectNotice", this.w);
             uoa.a("MerchantPurchaseLoadingNotice", this.x);
             uoa.a("MerchantPurchasePageRefresh", this.y);
          }
       }
       return;
    }
    public void F8(){
       PatchProxy.applyVoid(null, this, u0.class, "3");
    }
    public void H8(){
       PatchProxy.applyVoid(null, this, u0.class, "6");
    }
    public void J8(){
       u0 ou0 = u0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ou0, "5")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, ou0, "9")) {
          a uoa = a.b();
          if (uoa != null) {
             uoa.c("MerchantPurchaseReselectNotice", this.w);
             uoa.c("MerchantPurchaseLoadingNotice", this.x);
             uoa.c("MerchantPurchasePageRefresh", this.y);
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, u0.class, "2")) {
          return;
       }
       this.t = m1.f(p0, 0x7f0a16a4);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, u0.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new k2();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, u0.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(u0.class, new k2());
       }else {
          obj.put(u0.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, u0.class, "1")) {
          return;
       }
       this.q = this.t8("page_info_json");
       this.r = this.t8("page_params");
       this.s = this.r8("ID_PAGE_IDENTIFY_KEY");
       return;
    }
}
