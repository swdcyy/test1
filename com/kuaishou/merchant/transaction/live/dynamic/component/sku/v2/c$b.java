package com.kuaishou.merchant.transaction.live.dynamic.component.sku.v2.c$b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.merchant.transaction.live.dynamic.component.sku.v2.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import java.util.List;
import com.kuaishou.merchant.transaction.base.sku.b;
import com.kuaishou.merchant.transaction.base.sku.SkuSpecification;
import com.kuaishou.merchant.transaction.base.sku.SkuSpecification$PropValue;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.lang.CharSequence;
import android.widget.TextView;
import lnc.a1;
import android.view.View;
import com.kuaishou.merchant.transaction.live.dynamic.component.sku.v2.c$b$a;
import android.view.View$OnClickListener;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.image.KwaiImageView;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import com.facebook.drawee.generic.RoundingParams;
import fj4.d;

public class c$b extends PresenterV2	// class@0007a6
{
    public View A;
    public View B;
    public View C;
    public final c D;
    public int p;
    public SkuSpecification$PropValue q;
    public ViewGroup r;
    public ViewGroup s;
    public ViewGroup t;
    public KwaiImageView u;
    public TextView v;
    public ViewGroup w;
    public ViewGroup x;
    public KwaiImageView y;
    public TextView z;

    public void c$b(c p0,int p1){
       this.D = p0;
       super();
       this.p = 0;
       this.p = p1;
    }
    public void E8(){
       c$b tC;
       int i1;
       int i2;
       if (PatchProxy.applyVoid(null, this, c$b.class, "3")) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = this.w.getLayoutParams();
       if (layoutParams != null) {
          layoutParams.width = (int)this.D.D;
          this.w.setLayoutParams(layoutParams);
       }
       ViewGroup$LayoutParams layoutParams1 = this.x.getLayoutParams();
       if (layoutParams1 != null) {
          layoutParams1.height = (int)this.D.D;
          this.x.setLayoutParams(layoutParams1);
       }
       int i = 8;
       if (!this.D.z.e().get(this.p).isSmallThumbMode() && this.p == null) {
          this.w.setVisibility(0);
          this.s.setVisibility(i);
          if (!q.f(this.q.mImageUrls)) {
             this.x.setVisibility(0);
             this.y.P(this.q.mImageUrls);
             if (layoutParams) {
                layoutParams.width = (int)this.D.D;
                this.w.setLayoutParams(layoutParams);
             }
          }else {
             this.x.setVisibility(i);
             if (layoutParams) {
                layoutParams.width = -2;
                this.w.setLayoutParams(layoutParams);
             }
          }
          this.z.setText(this.q.mPropValueName);
       }else {
          this.s.setVisibility(0);
          this.w.setVisibility(i);
          int i3 = a1.d(R.dimen.arg_RES_7f07031b);
          i2 = a1.d(R.dimen.arg_RES_7f07034b);
          i1 = a1.d(R.dimen.arg_RES_7f070283);
          if (!q.f(this.q.mImageUrls)) {
             this.t.setVisibility(0);
             this.u.P(this.q.mImageUrls);
             this.v.setPadding(i3, i2, i3, i2);
          }else {
             this.t.setVisibility(i);
             this.v.setPadding(i1, i2, i1, i2);
          }
          this.v.setText(this.q.mPropValueName);
       }
       float f = 0x3f000000;
       if (this.D.z.g()) {
          this.r.setEnabled(0);
          this.v.setEnabled(0);
          this.z.setEnabled(0);
          this.C.setAlpha(f);
          if (this.P8()) {
             this.A.setVisibility(0);
             this.B.setVisibility(i);
          }else {
             this.A.setVisibility(i);
             this.B.setVisibility(0);
          }
       }else {
          this.r.setEnabled(this.q.mEnabled);
          this.v.setEnabled(this.q.mEnabled);
          this.z.setEnabled(this.q.mEnabled);
          if (this.P8()) {
             tC = this.A;
             i1 = (this.q.mEnabled != null)? 8: 0;
             tC.setVisibility(i1);
             tC = this.C;
             if (this.q.mEnabled != null) {
                f = 0x3f800000;
             }
             tC.setAlpha(f);
             this.B.setVisibility(i);
          }else {
             this.A.setVisibility(i);
             tC = this.B;
             i2 = (this.q.mEnabled != null)? 8: 0;
             tC.setVisibility(i2);
          }
          this.r.setSelected(this.q.mSelected);
       }
       tC = this.C;
       if (!q.f(this.q.mImageUrls)) {
          i = 0;
       }
       tC.setVisibility(i);
       this.C.setOnClickListener(new c$b$a(this));
       return;
    }
    public boolean P8(){
       Object obj = PatchProxy.apply(null, this, c$b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.D.z.e().get(this.p).isBigThumbMode() && this.p == null) {
          return true;
       }
       return false;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$b.class, "2")) {
          return;
       }
       this.r = p0.findViewById(0x7f0a39a1);
       this.s = p0.findViewById(0x7f0a3a66);
       this.t = p0.findViewById(0x7f0a3a67);
       this.u = p0.findViewById(0x7f0a3a65);
       this.v = p0.findViewById(0x7f0a3a64);
       this.w = p0.findViewById(0x7f0a042d);
       this.x = p0.findViewById(0x7f0a042e);
       this.y = p0.findViewById(0x7f0a042c);
       this.z = p0.findViewById(0x7f0a042b);
       this.C = p0.findViewById(0x7f0a042f);
       this.y.getHierarchy().L(RoundingParams.c((float)a1.e(2.00f)));
       this.u.getHierarchy().L(RoundingParams.c((float)a1.e(2.00f)));
       this.B = p0.findViewById(0x7f0a3a62);
       this.A = p0.findViewById(0x7f0a0428);
       p0.setOnClickListener(new d(this));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c$b.class, "1")) {
          return;
       }
       this.q = this.q8(SkuSpecification$PropValue.class);
       return;
    }
}
