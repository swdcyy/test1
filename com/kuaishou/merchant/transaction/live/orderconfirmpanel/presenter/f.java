package com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.f;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.f$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.kuaishou.merchant.transaction.base.purchasepanel.insurance.FreightInsuranceModel;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.view.View$OnClickListener;
import android.widget.TextView;
import lnc.a1;
import android.graphics.drawable.Drawable;
import android.app.Activity;
import oi4.a;
import oi4.b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.MerchantLivePurchasePanelResponse;
import java.util.HashMap;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import ekd.m1;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.f$b;
import com.yxcorp.gifshow.widget.m;
import z1.k;

public class f extends PresenterV2	// class@000820
{
    public TextView p;
    public TextView q;
    public View r;
    public MerchantLivePurchasePanelResponse s;
    public LiveMerchantBaseContext t;
    public FreightInsuranceModel u;
    public k v;
    public m w;

    public void f(){
       super();
       this.w = new f$a(this);
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, f.class, "3")) {
          return;
       }
       int i = 8;
       if (this.u == null) {
          this.m8().setVisibility(i);
          return;
       }else {
          this.m8().setVisibility(0);
          f tr = this.r;
          if (!TextUtils.x(this.u.mDetailLink)) {
             i = 0;
          }
          tr.setVisibility(i);
          this.r.setOnClickListener(this.w);
          this.q.setText(this.u.mFreightInsuranceDes);
          this.p.setText(this.u.mServiceName);
          this.q.setTextColor(TextUtils.J(this.u.mProviderTypeDescColor, a1.a(R.color.arg_RES_7f061da9)));
          f tq = this.q;
          Drawable uDrawable = (TextUtils.x(this.u.mServicePageLink) ^ 0x01)? a1.f(R.drawable.arg_RES_7f080e1a): objArray;
          tq.setCompoundDrawablesRelativeWithIntrinsicBounds(objArray, objArray, uDrawable, objArray);
          b.a(this.getActivity()).N(this.P8(), this.s, this.u.mLoggerInfo);
          return;
       }
    }
    public final ClientContent$LiveStreamPackage P8(){
       Object[] objArray = null;
       f obj = PatchProxy.apply(objArray, this, f.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.t;
       if (obj != null) {
          objArray = obj.getLiveStreamPackage();
       }
       return objArray;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a02ec);
       this.q = m1.f(p0, 0x7f0a02eb);
       this.r = m1.f(p0, 0x7f0a02ed);
       m1.b(p0, new f$b(this), R.id.audience_order_confirm_freightinsurance_msg);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       this.u = this.q8(FreightInsuranceModel.class);
       this.v = this.r8("LIVE_AUDIENCE_ORDER_BOTTOM_BAR_SERVICE_MEDIA");
       this.s = this.q8(MerchantLivePurchasePanelResponse.class);
       this.t = this.t8("LIVE_BASE_CONTEXT");
       return;
    }
}
