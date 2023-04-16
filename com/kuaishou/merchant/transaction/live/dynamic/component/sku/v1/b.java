package com.kuaishou.merchant.transaction.live.dynamic.component.sku.v1.b;
import vd4.b;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import ej4.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import gd4.d;
import gd4.d$a;
import com.kuaishou.merchant.transaction.base.sku.b;
import ij4.d;
import com.kuaishou.merchant.transaction.base.sku.b$a;
import com.kuaishou.merchant.transaction.live.dynamic.component.sku.v1.a;
import mu4.d;
import java.util.List;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.widget.LinearLayout;
import java.util.Iterator;
import com.kuaishou.merchant.transaction.base.sku.SkuSpecification;
import android.view.ViewGroup;
import xm4.a;
import ekd.m1;
import android.widget.TextView;
import com.nex3z.flowlayout.FlowContainerView;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Collection;
import ekd.q;
import java.lang.CharSequence;
import com.kuaishou.merchant.transaction.live.dynamic.component.sku.v1.b$a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import g9c.a;
import android.view.ViewGroup$LayoutParams;

public class b extends b	// class@0007a0
{
    public List A;
    public b$a B;
    public Fragment C;
    public SkuInfo D;
    public LinearLayout y;
    public b z;

    public void b(Fragment p0){
       super(p0);
       this.A = new ArrayList();
       this.B = new b(this);
       this.C = p0;
    }
    public void E8(){
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "2")) {
          return;
       }
       super.E8();
       if (!PatchProxy.applyVoid(objArray, this, uob, "4")) {
          this.z = d.n.a(this.C).v0();
       }
       if (this.z.t == null) {
          d.e(this.C);
          this.z.t = true;
       }
       this.o9();
       this.z.l(this.B);
       if (!PatchProxy.applyVoid(objArray, this, uob, "3")) {
          this.X8("mt_purchase_panel_activity_state_changed", new a(this));
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b.class, "7")) {
          return;
       }
       super.J8();
       this.z.p(this.B);
       this.A.clear();
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       super.doBindView(p0);
       this.y = this.m8().findViewById(0x7f0a3997);
       return;
    }
    public final void o9(){
       boolean b;
       if (PatchProxy.applyVoid(null, this, b.class, "5")) {
          return;
       }
       this.A.clear();
       this.y.removeAllViews();
       Iterator iterator = this.z.e().iterator();
       while (iterator.hasNext()) {
          SkuSpecification skuSpecifica = iterator.next();
          String str = "6";
          if (PatchProxy.applyVoidOneRefs(skuSpecifica, this, b.class, str)) {
             continue ;
          }else {
             ViewGroup viewGroup = a.f(this.m8(), R.layout.arg_RES_7f0d0329, false);
             this.y.addView(viewGroup);
             TextView textView = m1.f(viewGroup, R.id.title);
             viewGroup.findViewById(R.id.to_mode_container).setVisibility(8);
             FlowContainerView uFlowContain = m1.f(viewGroup, R.id.sku_group);
             FlowContainerView uFlowContain1 = m1.f(viewGroup, R.id.sku_group_top2bottom);
             b tz = this.z;
             Objects.requireNonNull(tz);
             b$a obj = PatchProxy.apply(null, tz, b.class, str);
             if (obj != PatchProxyResult.class) {
                b = obj.booleanValue();
             }else if(q.f(tz.b)){
                Iterator iterator1 = tz.b.iterator();
                while (true) {
                   if (iterator1.hasNext()) {
                      if ((iterator1.next().mPropName).length() <= 2) {
                         continue ;
                      }
                   }else {
                      b = true;
                   }
                }
             }
             b = false;
             if (!b) {
                uFlowContain.setVisibility(8);
                uFlowContain1.setVisibility(false);
                uFlowContain = uFlowContain1;
             }else {
                uFlowContain.setVisibility(false);
                uFlowContain1.setVisibility(8);
             }
             textView.setText(skuSpecifica.mPropName);
             obj = uFlowContain.getTag();
             if (obj == null) {
                obj = new b$a(this);
                uFlowContain.setAdapter(obj);
                uFlowContain.setTag(obj);
             }
             obj.W0(skuSpecifica.mPropValues);
             obj.k0();
             this.A.add(obj);
             if (this.z.o != null) {
                viewGroup.setVisibility(8);
                viewGroup.getLayoutParams().height = 0;
             }else {
                viewGroup.setVisibility(false);
                viewGroup.getLayoutParams().height = -2;
             }
          }
       }
       return;
    }
}
