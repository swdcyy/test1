package com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.m;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.util.SparseBooleanArray;
import nk4.r0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.content.Context;
import com.yxcorp.utility.n;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.MerchantLivePurchasePanelResponse;
import java.util.Collection;
import ekd.q;
import android.app.Activity;
import oi4.a;
import oi4.b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import java.util.List;
import com.kuaishou.merchant.transaction.base.widget.paylist.PayListPanelView;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.m$a;
import com.kuaishou.merchant.transaction.base.widget.paylist.PayListPanelView$f;
import com.kuaishou.merchant.transaction.base.sku.c$a;
import com.kuaishou.merchant.transaction.base.sku.c;
import ekd.m1;
import z1.k;

public class m extends PresenterV2	// class@000835
{
    public final SparseBooleanArray p;
    public c q;
    public LiveMerchantBaseContext r;
    public MerchantLivePurchasePanelResponse s;
    public k t;
    public c$a u;
    public PayListPanelView v;

    public void m(){
       super();
       this.p = new SparseBooleanArray();
       this.u = new r0(this);
    }
    public void E8(){
       m om = m.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, om, "3")) {
          return;
       }
       this.m8().setVisibility(0);
       RecyclerView$LayoutParams layoutParams = this.m8().getLayoutParams();
       layoutParams.height = -2;
       layoutParams.width = -1;
       layoutParams.bottomMargin = n.c(this.getContext(), 8.00f);
       if (!PatchProxy.applyVoid(objArray, this, om, "6") && !q.f(this.s.mPaymentMethodInfos)) {
          m ts1 = this.s;
          b.a(this.getActivity()).G(this.r.getLiveStreamPackage(), ts1, ts1.mPaymentMethodInfos);
       }
       this.v.setHideSubMethodWhenUnSelected(true);
       om = this.v;
       om.g = true;
       om.setPayListPanelCallBack(new m$a(this));
       m ts = this.s;
       this.v.b(ts.mPaymentMethodInfos, ts.mShowProviderSize, ts.mForcePayListExpand, 0x3f4ccccd);
       this.q.i(this.u);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, m.class, "8")) {
          return;
       }
       this.q.p(this.u);
       m tv = this.v;
       if (tv != null) {
          tv.g();
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "2")) {
          return;
       }
       this.v = m1.f(p0, 0x7f0a2fa3);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, m.class, "1")) {
          return;
       }
       this.q = this.r8("LIVE_AUDIENCE_SKU_MANAGER");
       this.r = this.r8("LIVE_BASE_CONTEXT");
       this.s = this.q8(MerchantLivePurchasePanelResponse.class);
       this.t = this.r8("LIVE_AUDIENCE_ORDER_BOTTOM_BAR_SERVICE_MEDIA");
       return;
    }
}
