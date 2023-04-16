package com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.o;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import kk4.i;
import nk4.t0;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.o$b;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.o$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.t;
import com.smile.gifmaker.mvps.utils.DefaultObservable;
import nk4.w0;
import erd.g;
import crd.b;
import com.kuaishou.merchant.transaction.base.sku.c$a;
import com.kuaishou.merchant.transaction.base.sku.c;
import lnc.b9;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Objects;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.BottomTipInfo;
import android.view.ViewGroup;
import android.view.View$OnClickListener;
import android.app.Activity;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.o$a;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.MerchantLivePurchasePanelResponse;
import qk4.d;
import qk4.e;
import com.kuaishou.merchant.basic.model.AddressInfo;
import kc4.c$b;
import kc4.c$a;
import java.lang.Integer;
import android.widget.TextView;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.AppCompatTextView;
import android.view.View;
import ue4.m;
import com.kuaishou.merchant.transaction.base.widget.BottomTipTextView;
import com.yxcorp.widget.selector.view.SelectShapeTextView;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.MerchantLivePurchasePanelResponse$ItemSaleStatus;
import ot3.u0;
import com.yxcorp.utility.f;
import com.kuaishou.merchant.basic.util.o;
import nk4.x0;
import oi4.a;
import oi4.b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Number;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import ekd.m1;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.MerchantLivePurchasePanelFragment;

public class o extends PresenterV2	// class@00083a
{
    public c$a A;
    public String B;
    public b C;
    public b D;
    public boolean E;
    public final c$a F;
    public final m G;
    public final m H;
    public ViewGroup p;
    public SelectShapeTextView q;
    public BottomTipTextView r;
    public d s;
    public MerchantLivePurchasePanelFragment t;
    public e u;
    public i v;
    public DefaultObservable w;
    public LiveMerchantBaseContext x;
    public MerchantLivePurchasePanelResponse y;
    public c z;

    public void o(){
       super();
       this.v = new i();
       this.F = new t0(this);
       this.G = new o$b(this);
       this.H = new o$c(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, o.class, "3")) {
          return;
       }
       this.W8(1);
       this.X7(this.w.observable().subscribe(new w0(this)));
       this.z.i(this.F);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, o.class, "24")) {
          return;
       }
       b9.a(this.C);
       b9.a(this.D);
       this.z.p(this.F);
       return;
    }
    public final boolean P8(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       o obj = PatchProxy.apply(objArray, this, o.class, "25");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.v;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, i.class, "1");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          i a = obj.a;
          b = (a != null && a.isValid())? true: false;
       }
       return b;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, o.class, "5")) {
          return;
       }
       this.p.setVisibility(8);
       this.p.setOnClickListener(null);
       b9.a(this.D);
       return;
    }
    public final void S8(){
       if (PatchProxy.applyVoid(null, this, o.class, "16")) {
          return;
       }
       if (this.getActivity() != null && !TextUtils.x(this.v.b())) {
          this.V8(this.v.b());
       }
       return;
    }
    public final void V8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "19")) {
          return;
       }
       if (this.getActivity() == null) {
          return;
       }
       o ty = this.y;
       o$a uoa = new o$a(this, this.s, this.u, this.z, ty, ty.mAddressInfo);
       this.A.a(this.getActivity(), p0, v9);
       return;
    }
    public final void W8(int p0){
       o obj;
       boolean b;
       i b1;
       i oi = i.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       o oo = o.class;
       if (PatchProxy.isSupport(oo) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oo, "4")) {
          return;
       }
       Object[] objArray = null;
       if (p0 == 1) {
          obj = PatchProxy.apply(objArray, this, oo, "8");
          b = (obj != patchProxyRe)? obj.booleanValue(): TextUtils.x(this.B) ^ 1;
          if (b) {
             return;
          }
       }
       MerchantLivePurchasePanelResponse merchantLive = null;
       if (!PatchProxy.applyVoid(objArray, this, oo, "6")) {
          b9.a(this.D);
          this.p.setVisibility(merchantLive);
          this.q.setVisibility(8);
          this.p.setOnClickListener(objArray);
          this.r.setCompoundDrawables(objArray, objArray, objArray, objArray);
       }
       obj = PatchProxy.apply(objArray, this, oo, "7");
       b = (obj != patchProxyRe)? obj.booleanValue(): TextUtils.x(this.B) ^ 1;
       if (b) {
          this.r.setText(this.B);
          return;
       }else if(this.P8()){
          obj = this.p;
          i a = this.v.a;
          String str = (a == null)? "": a.mBottomTipBackgroundColor;
          m.d(obj, str);
          m.b(this.r, this.v.a);
          if (!PatchProxy.applyVoid(objArray, this, oo, "11")) {
             obj = this.v;
             Objects.requireNonNull(obj);
             BottomTipInfo obj2 = PatchProxy.apply(objArray, obj, oi, "2");
             if (obj2 != patchProxyRe) {
                b = obj2.booleanValue();
             }else {
                b1 = obj.a;
                b = (b1 != null && b1.couldContainerClick())? true: false;
             }
             if (b) {
                this.p.setOnClickListener(this.G);
                m.f(this.r, this.v.a);
             }else {
                this.p.setOnClickListener(objArray);
                if (!PatchProxy.applyVoid(objArray, this, oo, "12")) {
                   this.r.setCompoundDrawables(objArray, objArray, objArray, objArray);
                }
             }
          }
          m.a(this.r, this.q, this.v.a, this.H);
          if (!PatchProxy.applyVoid(objArray, this, oo, "9")) {
             b9.a(this.D);
             obj = this.v;
             Objects.requireNonNull(obj);
             MerchantLivePurchasePanelResponse$ItemSaleStatus obj1 = PatchProxy.apply(objArray, obj, oi, "3");
             if (obj1 != patchProxyRe) {
                merchantLive = obj1.booleanValue();
             }else {
                b1 = obj.b;
                if (b1 != null) {
                   obj1 = b1.mTime;
                   str = null;
                   if (obj1 - str > 0 && (obj1 - u0.b()) - str > 0) {
                      merchantLive = true;
                   }
                }
             }
             if (merchantLive) {
                this.D = f.d().b((this.v.b.mTime - o.d()), 1000).subscribe(new x0(this));
             }
          }
          if (!PatchProxy.applyVoid(objArray, this, oo, "10") && this.E == null) {
             a uoa = b.a(this.getActivity());
             o ty = this.y;
             ClientContent$LiveStreamPackage liveStreamPa = this.x.getLiveStreamPackage();
             Objects.requireNonNull(uoa);
             if (PatchProxy.applyVoidTwoRefs(ty, liveStreamPa, uoa, a.class, "13") || (ty == null || (liveStreamPa != null && ty.mBottomTip != null))) {
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "MERCHANT_SKU_PURCHASE_BOTTOM_TIP";
                i3 oi3 = i3.f();
                oi3.c("action_type", Integer.valueOf(ty.mBottomTip.mClickActionType));
                oi3.d("action_type_url", TextUtils.k(ty.mBottomTip.mClickRedirectLink));
                oi3.d("bottom_tip", TextUtils.k(ty.mBottomTip.mBottomTip));
                uElementPack.params = oi3.e();
                u1.y0(uoa.e(ty), 3, uElementPack, uoa.d(ty, liveStreamPa));
             }
          label_01cb :
             this.E = true;
          }
          return;
       }else {
          this.R8();
          return;
       }
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "1")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a02f4);
       this.p = m1.f(p0, 0x7f0a02f6);
       SelectShapeTextView selectShapeT = m1.f(p0, R.id.audience_order_confirm_tips_button);
       this.q = selectShapeT;
       selectShapeT.setText("¡¢º¥ π”√");
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, o.class, "2")) {
          return;
       }
       this.u = this.r8("LIVE_AUDIENCE_ORDER_CONFIRM_SERVICE");
       this.v = this.q8(i.class);
       this.w = this.r8("LIVE_AUDIENCE_ORDER_CONFIRM_BOTTOM_ACTIVITY_TIP");
       this.x = this.r8("LIVE_BASE_CONTEXT");
       this.y = this.q8(MerchantLivePurchasePanelResponse.class);
       this.z = this.r8("LIVE_AUDIENCE_SKU_MANAGER");
       this.t = this.r8("LIVE_AUDIENCE_ORDER_CONFIRM_PANEL_FRAGMENT");
       this.A = this.r8("ID_PANEL_ADDRESS_SERVICE");
       this.s = this.r8("LIVE_AUDIENCE_CONFIRM_PANEL_BOTTOM_BAR_SERVICE");
       return;
    }
}
