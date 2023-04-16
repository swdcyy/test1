package com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.u;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kk4.g;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.OrderConfirmCommodity;
import kk4.e;
import ekd.j;
import java.lang.CharSequence;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import brd.t;
import com.kuaishou.merchant.basic.util.d;
import nk4.n1;
import erd.g;
import crd.b;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.MerchantLivePurchasePanelResponse;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.MerchantLivePurchasePanelResponse$ItemInfo;
import java.util.Collection;
import ekd.q;
import com.kuaishou.merchant.api.core.model.Commodity$IconLabel;
import nk4.o1;
import com.kuaishou.merchant.api.core.model.Commodity;
import com.yxcorp.utility.TextUtils;
import android.app.Activity;
import oi4.a;
import oi4.b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import nk4.m1;
import android.view.View$OnClickListener;
import android.view.View;
import ekd.m1;
import android.text.TextPaint;

public class u extends PresenterV2	// class@000842
{
    public TextView p;
    public TextView q;
    public TextView r;
    public MerchantLivePurchasePanelResponse s;
    public LiveMerchantBaseContext t;
    public g u;
    public e v;
    public OrderConfirmCommodity w;

    public void u(){
       super();
    }
    public void E8(){
       u ou = u.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ou, "3")) {
          return;
       }
       this.w = this.u.b;
       if (!PatchProxy.applyVoid(objArray, this, ou, "4")) {
          if (j.h(this.v.d)) {
             this.p.setText(this.v.b);
          }else {
             this.X7(d.e(j.a(this.v.d)).subscribe(new n1(this)));
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, ou, "5")) {
          MerchantLivePurchasePanelResponse mItemInfo = this.s.mItemInfo;
          if (mItemInfo == null || q.f(mItemInfo.mImageIconList)) {
             this.q.setVisibility(8);
          }else {
             this.q.setVisibility(0);
             Commodity$IconLabel[] iconLabelArr = new Commodity$IconLabel[]{this.s.mItemInfo.mImageIconList.get(0)};
             this.X7(d.e(j.a(iconLabelArr)).subscribe(new o1(this)));
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, ou, "6")) {
          if (TextUtils.x(this.w.mJumpUrl)) {
             this.r.setVisibility(8);
          }else {
             this.r.setVisibility(0);
             b.a(this.getActivity()).w(this.t.getLiveStreamPackage(), this.s);
          }
          this.r.setOnClickListener(new m1(this));
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, u.class, "1")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a02e4);
       this.r = m1.f(p0, 0x7f0a02e6);
       TextView textView = m1.f(p0, R.id.audience_order_confirm_commodity_title);
       this.p = textView;
       textView.getPaint().setFakeBoldText(true);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, u.class, "2")) {
          return;
       }
       this.s = this.q8(MerchantLivePurchasePanelResponse.class);
       this.t = this.r8("LIVE_BASE_CONTEXT");
       this.u = this.q8(g.class);
       this.v = this.q8(e.class);
       return;
    }
}
