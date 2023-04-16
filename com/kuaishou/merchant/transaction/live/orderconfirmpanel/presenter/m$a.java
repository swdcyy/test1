package com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.m$a;
import com.kuaishou.merchant.transaction.base.widget.paylist.PayListPanelView$f;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.m;
import java.lang.Object;
import com.kuaishou.merchant.transaction.base.model.PaymentMethodInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.util.SparseBooleanArray;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.app.Activity;
import oi4.a;
import oi4.b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import java.util.Objects;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import java.util.List;
import com.kuaishou.merchant.transaction.base.model.SubCashierConfig;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.MerchantLivePurchasePanelResponse;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import com.kuaishou.merchant.transaction.base.model.BankCard;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import z1.k;
import qk4.d;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.model.PageInfoReqParam;

public class m$a implements PayListPanelView$f	// class@000834
{
    public final m a;

    public void m$a(m p0){
       this.a = p0;
       super();
    }
    public void a(PaymentMethodInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m$a.class, "6")) {
          return;
       }
       if (p0 != null && !this.a.p.get(16)) {
          Activity context = (this.a.getContext() instanceof Activity)? this.a.getContext(): null;
          a uoa = b.a(context);
          ClientContent$LiveStreamPackage liveStreamPa = this.a.r.getLiveStreamPackage();
          m s = this.a.s;
          Objects.requireNonNull(uoa);
          if (!PatchProxy.applyVoidThreeRefs(liveStreamPa, s, p0, uoa, a.class, "10") && !q.f(p0.mSubCashierConfigs)) {
             Iterator iterator = p0.mSubCashierConfigs.iterator();
             while (iterator.hasNext()) {
                SubCashierConfig subCashierCo = iterator.next();
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "SUBPAY_METHOD";
                i3 oi3 = i3.f();
                oi3.d("module_name", "PAY");
                oi3.d("pay_method", p0.mName);
                oi3.d("sub_pay_method", subCashierCo.mName);
                oi3.c("is_default", Integer.valueOf(subCashierCo.mSelected));
                uElementPack.params = oi3.e();
                u1.y0(uoa.c(s), 3, uElementPack, uoa.d(s, liveStreamPa));
             }
          }
          this.a.p.put(16, true);
       }
       return;
    }
    public void b(PaymentMethodInfo p0,PaymentMethodInfo p1,BankCard p2){
       String str;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, m$a.class, "2")) {
          return;
       }
       b.a(this.a.getActivity()).C(this.a.r.getLiveStreamPackage(), this.a.s, p1);
       if (p0 != null && !TextUtils.n(p0.mProviderRefreshType, p1.mProviderRefreshType)) {
          m$a ta = this.a;
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoidTwoRefs(p1, p2, ta, m.class, "4")) {
             PageInfoReqParam pageInfoReqP = ta.t.get().c();
             pageInfoReqP.mReselectedEventType = 9;
             PaymentMethodInfo mProvider = p1.mProvider;
             p1 = p1.mProviderChannelType;
             p2 = (p2 != null)? p2.mToken: "";
             pageInfoReqP.buildCashierAttachParam(mProvider, p1, p2);
             ta.t.get().d(pageInfoReqP, true);
          }
          return;
       }else {
          this.a.t.get().k(p1);
          return;
       }
    }
    public void c(){
    }
    public void d(PaymentMethodInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m$a.class, "5")) {
          return;
       }
       Activity context = (this.a.getContext() instanceof Activity)? this.a.getContext(): null;
       b.a(context).E(this.a.r.getLiveStreamPackage(), this.a.s, p0);
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, m$a.class, "1")) {
          return;
       }
       m$a ta = this.a;
       ta.s.mForcePayListExpand = true;
       Activity context = (ta.getContext() instanceof Activity)? this.a.getContext(): null;
       b.a(context).D(this.a.r.getLiveStreamPackage(), this.a.s, null);
       return;
    }
    public void f(PaymentMethodInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m$a.class, "4")) {
          return;
       }
       Activity context = (this.a.getContext() instanceof Activity)? this.a.getContext(): null;
       b.a(context).F(this.a.r.getLiveStreamPackage(), this.a.s, p0);
       return;
    }
    public void g(PaymentMethodInfo p0,SubCashierConfig p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, m$a.class, "3")) {
          return;
       }
       if (p0 != null && p1 != null) {
          m$a ta = this.a;
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoidTwoRefs(p0, p1, ta, m.class, "5")) {
             PageInfoReqParam pageInfoReqP = ta.t.get().c();
             pageInfoReqP.mReselectedEventType = 9;
             pageInfoReqP.buildCashierAttachParam(p0, p1);
             ta.t.get().d(pageInfoReqP, true);
          }
       }
       return;
    }
}
