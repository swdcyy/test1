package com.kuaishou.merchant.transaction.purchase.presenter.j;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.merchant.transaction.purchase.presenter.j$a;
import um4.p;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.transaction.purchase.e0$a;
import com.kuaishou.merchant.transaction.purchase.e0;
import android.view.View;
import android.widget.TextView;
import android.view.View$OnClickListener;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.AppCompatTextView;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.BottomTipInfo;
import ue4.m;
import com.kuaishou.merchant.transaction.base.widget.BottomTipTextView;
import com.kuaishou.merchant.transaction.purchase.presenter.j$b;
import com.yxcorp.widget.selector.view.SelectShapeTextView;
import com.yxcorp.gifshow.widget.m;
import crd.b;
import lnc.b9;
import em4.m;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import android.app.Activity;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.merchant.transaction.purchase.presenter.q0$b;
import em4.a;
import com.kuaishou.merchant.basic.model.AddressInfo;
import kc4.c$b;
import kc4.c$a;
import ekd.m1;
import com.kuaishou.merchant.transaction.purchase.MerchantPurchaseFragment;
import com.kuaishou.merchant.transaction.base.live.model.PurchasePageParams;

public class j extends PresenterV2	// class@000986
{
    public boolean A;
    public final m B;
    public final e0$a C;
    public SelectShapeTextView p;
    public BottomTipTextView q;
    public View r;
    public e0 s;
    public b t;
    public MerchantPurchaseFragment u;
    public a v;
    public PurchasePageParams w;
    public c$a x;
    public BottomTipInfo y;
    public AddressInfo z;

    public void j(){
       super();
       this.B = new j$a(this);
       this.C = new p(this);
    }
    public void E8(){
       j oj = j.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oj, "3")) {
          return;
       }
       this.s.a(this.C);
       j oj1 = 8;
       if (!PatchProxy.applyVoid(objArray, this, oj, "4")) {
          this.r.setVisibility(0);
          this.p.setVisibility(oj1);
          this.r.setOnClickListener(objArray);
          this.q.setCompoundDrawables(objArray, objArray, objArray, objArray);
       }
       j ty = this.y;
       if (ty != null && ty.isValid()) {
          m.d(this.r, this.y.mBottomTipBackgroundColor);
          m.b(this.q, this.y);
          m.a(this.q, this.p, this.y, new j$b(this));
          if (this.y.couldContainerClick()) {
             this.r.setOnClickListener(this.B);
             m.f(this.q, this.y);
          }else {
             this.r.setOnClickListener(objArray);
             m.c(this.q);
          }
       }else if(PatchProxy.applyVoid(objArray, this, oj, "5")){
          this.r.setVisibility(oj1);
          this.q.setOnClickListener(objArray);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, j.class, "11")) {
          return;
       }
       b9.a(this.t);
       return;
    }
    public final void P8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, j.class, "10")) {
          return;
       }
       j ty = this.y;
       if (ty == null) {
          return;
       }
       if (!PatchProxy.applyVoidOneRefs(ty, objArray, m.class, "21")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "HAPPY_BEAN_GUIDE_BAR";
          uElementPack.params = m.c(ty);
          u1.u(1, uElementPack, new ClientContent$ContentPackage());
       }
       return;
    }
    public final void R8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "7")) {
          return;
       }
       if (this.getActivity() != null && !TextUtils.x(p0)) {
          this.x.a(this.getActivity(), p0, new q0$b(this.v, this.z));
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "2")) {
          return;
       }
       this.q = p0.findViewById(0x7f0a02f4);
       this.r = p0.findViewById(0x7f0a02f6);
       SelectShapeTextView selectShapeT = m1.f(p0, R.id.audience_order_confirm_tips_button);
       this.p = selectShapeT;
       selectShapeT.setText("¡¢º¥ π”√");
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, j.class, "1")) {
          return;
       }
       this.s = this.r8("LOG_PAGE_SERVICE");
       this.y = this.t8("bottom_bar_prompt");
       this.u = this.r8("FRAGMENT");
       this.v = this.q8(a.class);
       this.w = this.r8("page_params");
       this.x = this.r8("address_service");
       this.z = this.t8("address_id");
       return;
    }
}
