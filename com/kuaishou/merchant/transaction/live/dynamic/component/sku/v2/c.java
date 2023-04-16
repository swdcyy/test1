package com.kuaishou.merchant.transaction.live.dynamic.component.sku.v2.c;
import vd4.b;
import androidx.fragment.app.Fragment;
import com.kuaishou.merchant.transaction.base.sku.b;
import java.util.ArrayList;
import fj4.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import gd4.d;
import gd4.d$a;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ij4.d;
import android.content.Context;
import com.yxcorp.utility.n;
import lnc.a1;
import com.kuaishou.merchant.transaction.base.sku.b$a;
import com.kuaishou.merchant.transaction.live.dynamic.component.sku.v2.a;
import mu4.d;
import java.util.List;
import android.widget.LinearLayout;
import java.util.Collection;
import ekd.q;
import com.kuaishou.merchant.transaction.base.sku.SkuSpecification;
import java.lang.Integer;
import android.view.ViewGroup;
import xm4.a;
import ekd.m1;
import android.widget.TextView;
import android.widget.ImageView;
import com.kuaishou.merchant.transaction.live.dynamic.component.sku.v2.b;
import android.view.View$OnClickListener;
import com.nex3z.flowlayout.FlowContainerView;
import java.lang.CharSequence;
import com.kuaishou.merchant.transaction.live.dynamic.component.sku.v2.c$a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import g9c.a;
import android.view.ViewGroup$LayoutParams;
import android.graphics.drawable.Drawable;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public class c extends b	// class@0007a7
{
    public List A;
    public b$a B;
    public Fragment C;
    public float D;
    public SkuInfo E;
    public LinearLayout y;
    public b z;

    public void c(Fragment p0){
       super(p0);
       this.z = new b();
       this.A = new ArrayList();
       this.B = new b(this);
       this.D = 0;
       this.C = p0;
    }
    public void E8(){
       c uoc = c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc, "2")) {
          return;
       }
       super.E8();
       if (!PatchProxy.applyVoid(objArray, this, uoc, "4")) {
          this.z = d.n.a(this.C).v0();
       }
       if (this.z.o != null) {
          this.m8().setVisibility(8);
          return;
       }else {
          this.m8().setVisibility(0);
          if (this.z.t == null) {
             d.e(this.C);
             this.z.t = true;
          }
          this.D = (float)(n.z(this.getContext()) - a1.d(0x7f07032e)) / 3.00f;
          this.o9();
          this.z.l(this.B);
          if (!PatchProxy.applyVoid(objArray, this, uoc, "3")) {
             this.X8("mt_purchase_panel_activity_state_changed", new a(this));
          }
          return;
       }
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, c.class, "8")) {
          return;
       }
       super.J8();
       this.z.p(this.B);
       this.A.clear();
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       super.doBindView(p0);
       this.y = this.m8().findViewById(0x7f0a3997);
       return;
    }
    public final void o9(){
       if (PatchProxy.applyVoid(null, this, c.class, "5")) {
          return;
       }
       this.A.clear();
       if (q.f(this.z.e())) {
          return;
       }
       this.y.removeAllViews();
       int i = 0;
       while (i < this.z.e().size()) {
          SkuSpecification skuSpecifica = this.z.e().get(i);
          if (!PatchProxy.isSupport(c.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(i), skuSpecifica, this, c.class, "6")) {
             View view = a.f(this.m8(), 0x7f0d032a, false);
             this.y.addView(view);
             View view1 = m1.f(view, 0x7f0a3f2c);
             View view2 = m1.f(view, 0x7f0a3f8f);
             View view3 = m1.f(view, 0x7f0a3f90);
             View view4 = m1.f(view, 0x7f0a3f91);
             int i1 = (!i)? 0: 8;
             view2.setVisibility(i1);
             this.q9(view2, skuSpecifica, view3, view4);
             b uob = new b(this, skuSpecifica, view2, view3, view4);
             view2.setOnClickListener(v14);
             FlowContainerView uFlowContain = m1.f(view, R.id.sku_group);
             uFlowContain.setVisibility(false);
             m1.f(view, R.id.sku_group_top2bottom).setVisibility(8);
             view1.setText(skuSpecifica.mPropName);
             c$a tag = uFlowContain.getTag();
             if (tag == null) {
                tag = new c$a(this, i);
                uFlowContain.setAdapter(tag);
                uFlowContain.setTag(tag);
             }
             tag.W0(skuSpecifica.mPropValues);
             tag.k0();
             this.A.add(tag);
             if (this.z.o != null) {
                view.setVisibility(8);
                view.getLayoutParams().height = 0;
             }else {
                view.setVisibility(false);
                view.getLayoutParams().height = -2;
             }
          }
          i = i + 1;
       }
       return;
    }
    public void q9(ViewGroup p0,SkuSpecification p1,ImageView p2,TextView p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, c.class, "7")) {
          return;
       }
       int i = 0;
       if (p1.isSmallThumbMode()) {
          p0.setVisibility(i);
          p2.setImageDrawable(a1.f(R.drawable.arg_RES_7f081773));
          p3.setText("´óÍ¼");
       }else if(p1.isBigThumbMode()){
          p0.setVisibility(i);
          p2.setImageDrawable(a1.f(R.drawable.arg_RES_7f081774));
          p3.setText("ÁÐ±í");
       }else {
          p0.setVisibility(8);
       }
       if (this.z.u == null && !p0.getVisibility()) {
          c tC = this.C;
          p1 = p1.mStyle;
          d uod = d.class;
          if (!PatchProxy.isSupport(uod) || !PatchProxy.applyVoidTwoRefs(tC, Integer.valueOf(p1), null, uod, "1")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "SKU_SELECT_LABEL";
             i3 oi3 = i3.f();
             oi3.d("type", String.valueOf(p1));
             uElementPack.params = oi3.e();
             u1.C0("", d.b(tC), 3, uElementPack, new ClientContent$ContentPackage());
          }
          tC.u = true;
       }
       return;
    }
}
