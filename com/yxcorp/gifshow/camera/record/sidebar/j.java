package com.yxcorp.gifshow.camera.record.sidebar.j;
import c35.i;
import com.yxcorp.gifshow.camera.record.base.d;
import android.content.res.Resources;
import lnc.a1;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.camera.record.sidebar.HalfScrollView;
import android.view.View$OnTouchListener;
import android.widget.ScrollView;
import com.yxcorp.gifshow.camera.record.sidebar.j$c;
import android.widget.ImageView;
import android.view.View;
import com.yxcorp.gifshow.camera.record.sidebar.SidebarShaderLinearLayout;
import k2b.e0;
import zg9.v;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;
import com.kuaishou.viewbinder.IViewBinder;
import com.yxcorp.gifshow.camera.record.sidebar.SideBarViewBinder;
import pi9.n;
import java.lang.Number;
import zb9.p0;
import zb9.p0$a;
import hf9.b;
import hf9.b$a;
import android.content.Context;
import com.yxcorp.utility.n;
import android.view.ViewStub;
import com.kuaishou.viewbinder.ViewStubViewBinder;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import ed9.g;
import zg9.p;
import erd.g;
import crd.b;
import eoc.f;
import ed9.i;
import zg9.r;
import com.yxcorp.gifshow.camera.record.sidebar.i;
import java.lang.Runnable;
import android.view.ViewGroup$MarginLayoutParams;
import com.yxcorp.gifshow.camera.record.sidebar.n;
import com.yxcorp.gifshow.camera.record.sidebar.SidebarShaderRightLayout;
import android.widget.LinearLayout;
import lnc.s6;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.camera.record.sidebar.j$a;
import android.view.View$OnLayoutChangeListener;
import zg9.o;
import com.yxcorp.gifshow.camera.record.sidebar.HalfScrollView$a;
import zg9.n;
import android.view.View$OnClickListener;
import android.app.Activity;
import com.yxcorp.gifshow.camera.record.sidebar.DefaultPictureSideBarViewBinder;
import c35.c;
import android.util.Property;
import android.animation.ObjectAnimator;
import th0.e;
import android.animation.TimeInterpolator;
import com.yxcorp.gifshow.camera.record.sidebar.j$b;
import android.animation.Animator$AnimatorListener;
import java.lang.Math;
import com.yxcorp.gifshow.util.PostUtils;
import zg9.x;

public class j extends d implements i	// class@000f1d
{
    public int A;
    public SidebarShaderLinearLayout B;
    public SidebarShaderRightLayout C;
    public View$OnLayoutChangeListener D;
    public boolean E;
    public int F;
    public SideBarViewBinder n;
    public boolean o;
    public float p;
    public int q;
    public int r;
    public boolean s;
    public View t;
    public ViewGroup u;
    public HalfScrollView v;
    public View w;
    public ImageView x;
    public View y;
    public View z;
    public static final int G;
    public static final int H;
    public static final int I;
    public static final int J;
    public static final int K;
    public static final int L;

    static {
       j.G = a1.m().getInteger(0x7f0b003f);
       j.H = a1.m().getInteger(0x7f0b003e);
       j.I = a1.e(355.00f);
       j.J = a1.e(55.00f);
       j.K = a1.e(52.00f);
       j.L = a1.d(0x7f070139);
    }
    public void j(CameraPageType p0,b p1){
       super(p0, p1);
       this.q = 3;
       this.r = 0;
       this.F = j.J;
    }
    public final void A2(int p0){
       boolean b1;
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oj, "18")) {
          return;
       }
       boolean b = true;
       if (PatchProxy.isSupport(oj)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oj, "17");
          if (obj != PatchProxyResult.class) {
             b1 = obj.booleanValue();
          }else if((float)p0 - this.n2() > 0){
             b1 = true;
          }else {
             b1 = false;
          }
       }else {
          goto label_0032 ;
       }
       if (!b1) {
          this.v.a(false);
          this.v.setOnTouchListener(null);
          this.v.smoothScrollTo(false, false);
       }else {
          this.v.a(b);
          this.v.setOnTouchListener(new j$c(this));
       }
       if (!PatchProxy.isSupport(oj) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oj, "19")) {
          if (p0 <= this.q) {
             this.x.setVisibility(8);
          }else {
             this.x.setVisibility(false);
          }
       }
       return;
    }
    public void B2(int p0){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oj, "10")) {
          return;
       }
       if (this.E != null && this.u != null) {
          p0 = this.o2();
          this.q = 3 + this.r;
          oj = this.o;
          j ts = this.s;
          if (oj != ts) {
             this.o = ts;
             this.s = oj;
             oj = this.w;
             float f = (ts != null)? 0: 180.00f;
             oj.setRotation(f);
          }
          oj = this.B;
          boolean b = false;
          if (oj != null) {
             boolean b1 = (this.o == null && this.n2() - (float)this.o2() < 0)? true: false;
             oj.b(b, b1);
          }
          int i = (this.o == null)? this.g2(p0): this.g2(this.q);
          float f1 = (float)i;
          this.v.scrollTo(b, b);
          this.A2(p0);
          this.C2((int)f1);
          this.w.setY((f1 + (float)this.F));
          this.v.requestLayout();
          v.b(this.o, this.f);
       }
       return;
    }
    public final void C2(int p0){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oj, "11")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("SidebarController", "updateScrollSideContainerHeight: height = "+p0+", mMaxDisplayHeight = "+this.A, objArray);
       if (p0 < this.A) {
          this.v.setHeight((p0 + j.L));
          j tB = this.B;
          if (tB != null) {
             tB.a(0);
          }
       }else {
          this.v.setHeight(p0);
       }
       return;
    }
    public boolean D2(){
       return false;
    }
    public IViewBinder O1(){
       return this.r2();
    }
    public IViewBinder V5(int p0){
       return this.k2(p0);
    }
    public boolean f2(){
       Object obj = PatchProxy.apply(null, this, j.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (n.b() ^ 0x01);
    }
    public final int g2(int p0){
       j oj = j.class;
       if (PatchProxy.isSupport(oj)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oj, "12");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       Object[] objArray = new Object[0];
       a.D().w("SidebarController", "computeScrollSideContainerHeight: iconNum = "+p0, objArray);
       float f = this.n2();
       float f1 = (float)p0;
       if (f1 - f <= 0) {
          f1 = (int)(f1 * (this.p + (float)j.L));
       }else {
          f1 = (int)f;
          float f2 = (float)f1;
          int i = 0x7f070301;
          if ((double)(f - f2) - 0x3fe0000000000000 < 0) {
             f1--;
             f1 = (int)((float)f1 * (this.p + (float)j.L));
             i = a1.d(i);
          }else {
             f1 = (int)(f2 * (this.p + (float)j.L));
             i = a1.d(i);
          }
          f1 = f1 + i;
       }
       this.A = f1;
       return f1;
    }
    public final float h2(){
       j obj = PatchProxy.apply(null, this, j.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       obj = this.y;
       if (obj == null || this.z == null) {
          return 0;
       }
       int bottom = obj.getBottom();
       int top = this.z.getTop();
       if (this.d.d(p0.j.a()).c() || this.d.d(b.c.a()).a()) {
          top = top - a1.d(0x7f070339);
       }
       Object[] objArray = new Object[0];
       a.D().w("SidebarController", "computeTotalHeight: top = "+bottom+", bottom = "+top, objArray);
       return (float)n.P(this.e, (float)(top - bottom));
    }
    public void i2(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "2")) {
          return;
       }
       ViewStub viewStub = this.p2(p0);
       SideBarViewBinder sideBarViewB = this.k2(-1);
       this.n = sideBarViewB;
       if (sideBarViewB != null) {
          sideBarViewB.A(viewStub);
          this.t = this.n.y();
          this.u = this.n.C();
       }
       return;
    }
    public void k(View p0){
       ViewStub viewStub1;
       RelativeLayout$LayoutParams layoutParams1;
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("SidebarController", "onViewCreated", objArray);
       int i = -1;
       if (this.D2()) {
          this.i2(p0);
          super.k(p0);
       }else {
          viewStub1 = this.p2(p0);
          if (viewStub1 != null) {
             if (viewStub1.getParent() instanceof RelativeLayout) {
                layoutParams1 = viewStub1.getLayoutParams();
                layoutParams1.addRule(11, i);
                viewStub1.setLayoutParams(layoutParams1);
             }
             this.t = viewStub1.inflate();
          }
          super.k(p0);
          this.u = p0.findViewById(0x7f0a0635);
       }
       this.Y1(f.a(g.class, new p(this)));
       this.d.l(i.class, new r(this));
       this.b2(new i(this));
       HalfScrollView halfScrollVi = null;
       this.v = halfScrollVi;
       if (this.l2()) {
          j tt = this.t;
          if (tt != null) {
             tt.getLayoutParams().topMargin = a1.d(0x7f070323);
          }
          if (this instanceof n ^ 1) {
             ViewStub viewStub = p0.findViewById(R.id.camera_sidebar_right_shader_stub);
             if (viewStub != null) {
                if (viewStub.getParent() instanceof RelativeLayout) {
                   RelativeLayout$LayoutParams layoutParams = viewStub.getLayoutParams();
                   layoutParams.addRule(11, i);
                   viewStub.setLayoutParams(layoutParams);
                }
                this.C = viewStub.inflate();
             }else {
                this.C = p0.findViewById(0x7f0a3965);
             }
             tt = this.C;
             if (tt != null) {
                View view = tt.findViewById(R.id.side_bar_right_shader_bg);
                if (view != null) {
                   if (s6.m()) {
                      view.setBackground(halfScrollVi);
                   }else {
                      view.setBackground(a1.f(R.drawable.arg_RES_7f08204e));
                   }
                }
             }
          }
       label_00ef :
          this.o = true;
          this.s = true;
          this.B = p0.findViewById(0x7f0a38b7);
          j$a uoa = new j$a(this);
          this.D = uoa;
          tt = this.B;
          if (tt != null) {
             tt.addOnLayoutChangeListener(uoa);
          }
          viewStub1 = p0.findViewById(R.id.fold_button_stub);
          if (viewStub1 != null) {
             if (viewStub1.getParent() instanceof RelativeLayout) {
                layoutParams1 = viewStub1.getLayoutParams();
                layoutParams1.addRule(11, i);
                viewStub1.setLayoutParams(layoutParams1);
             }
             this.w = viewStub1.inflate();
          }else {
             this.w = p0.findViewById(0x7f0a0f3d);
          }
          this.x = this.w.findViewById(0x7f0a0f3c);
          if (s6.m()) {
             this.x.setImageResource(R.drawable.arg_RES_7f081c24);
          }
          halfScrollVi = p0.findViewById(R.id.scroll_container);
          this.v = halfScrollVi;
          if (halfScrollVi != null) {
             halfScrollVi.setOnScrollCallback(new o(this));
          }
          this.w.setOnClickListener(new n(this));
       }
       this.y = p0.findViewById(0x7f0a0612);
       this.z = this.e.findViewById(0x7f0a0086);
       this.E = true;
       return;
    }
    public SideBarViewBinder k2(int p0){
       j oj = j.class;
       if (PatchProxy.isSupport(oj)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oj, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new DefaultPictureSideBarViewBinder(this.d.i());
    }
    public boolean l2(){
       boolean b = (this.c == CameraPageType.VIDEO)? true: false;
       return b;
    }
    public final void m2(int p0,boolean p1){
       float f;
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, oj, "16")) {
          return;
       }
       int i = 0;
       if (p1) {
          f = (float)this.g2(p0);
          this.C2((int)f);
          f = f + (float)this.F;
          this.v.requestLayout();
       }else {
          f = (float)((int)((this.p + (float)j.L) * (float)this.q) + this.F);
          this.v.smoothScrollTo(i, i);
       }
       this.z2((int)f);
       this.A2(p0);
       j tw = this.w;
       float[] uofloatArray = new float[]{tw.getY(),f};
       ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(tw, View.Y, uofloatArray);
       objectAnimat.setInterpolator(new e());
       objectAnimat.setDuration(300);
       objectAnimat.addListener(new j$b(this, p0, f));
       objectAnimat.start();
       return;
    }
    public final float n2(){
       Object obj = PatchProxy.apply(null, this, j.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       float f = Math.max((this.h2() / 72.00f), (float)this.q);
       Object[] objArray = new Object[0];
       a.D().w("SidebarController", "getMaxCanDisplayIconNum: res = "+f, objArray);
       return f;
    }
    public final int o2(){
       Object obj = PatchProxy.apply(null, this, j.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0;
       if (this.u == null) {
          return i;
       }
       int i1 = 0;
       int i2 = 0;
       while (i1 < this.u.getChildCount()) {
          View childAt = this.u.getChildAt(i1);
          if (!childAt instanceof ViewStub && !childAt.getVisibility()) {
             i2 = i2 + 1;
          }
          i1 = i1 + 1;
       }
       Object[] objArray = new Object[i];
       a.D().w("SidebarController", "getSideBarVisibleIconNum: = "+i2, objArray);
       return i2;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, j.class, "3")) {
          return;
       }
       super.onDestroyView();
       j tB = this.B;
       if (tB != null) {
          tB.removeOnLayoutChangeListener(this.D);
       }
       return;
    }
    public ViewStub p2(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, j.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.findViewById(0x7f0a3d50);
    }
    public SideBarViewBinder r2(){
       return this.n;
    }
    public void s2(){
       if (PatchProxy.applyVoid(null, this, j.class, "8")) {
          return;
       }
       boolean b = false;
       if (this.E == null) {
          StringBuilder str = "foldButton npe ";
          if (this.w == null) {
             b = true;
          }
          PostUtils.x("ScrollableSideBar", str+b);
          return;
       }else {
          int l = j.L;
          this.w.setY((((float)this.q * (this.p + (float)l)) + (float)this.F));
          this.v.setHeight(((int)((this.p + (float)l) * (float)this.q) + l));
          this.v.requestLayout();
          this.v.smoothScrollTo(b, b);
          this.v.a(b);
          j tB = this.B;
          if (tB != null) {
             tB.a(b);
          }
          v.b(this.o, this.f);
          tB = this.C;
          if (tB != null) {
             tB.setVisibility(b);
             this.z2((this.g2(this.q) + this.F));
          }
          return;
       }
    }
    public boolean t2(){
       return false;
    }
    public void u2(boolean p0){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oj, "6")) {
          return;
       }
       oj = this.u;
       if (oj != null) {
          j tv = this.v;
          if (tv != null) {
             oj = tv;
          }
          int i = 0;
          int i1 = (p0)? 0: 4;
          long l = 300;
          long l1 = (p0)? l: 150;
          n.W(oj, i1, l1);
          if (this.l2()) {
             oj = this.w;
             if (!p0) {
                i = 4;
             }
             long l2 = (p0)? l: 150;
             n.W(oj, i, l2);
          }
          d td = this.d;
          if (!p0) {
             l = 150;
          }
          td.m(new x(p0, l));
       }
       return;
    }
    public void v2(boolean p0){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oj, "9")) {
          return;
       }
       if (this.E != null) {
          this.w.setEnabled(p0);
       }
       return;
    }
    public void w2(){
       if (PatchProxy.applyVoid(null, this, j.class, "13")) {
          return;
       }
       if (this.E == null) {
          return;
       }
       if (!this.l2()) {
          return;
       }
       if (this.u != null && this.v != null) {
          boolean i = this.o2();
          int i1 = (this.o == null)? this.g2(i): this.g2(this.q);
          float f = (float)i1;
          this.A2(i);
          this.C2((int)f);
          this.w.setY((f + (float)this.F));
          j tB = this.B;
          if (tB != null && this.o == null) {
             i = ((float)i - this.n2() > 0)? true: false;
             tB.b(false, i);
          }
       }
    label_005d :
       return;
    }
    public void y2(float p0){
       this.p = p0;
    }
    public final void z2(int p0){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oj, "25")) {
          return;
       }
       oj = this.C;
       if (oj != null) {
          oj.setEndAlphaShaderStartY((p0 + j.K));
       }
       return;
    }
}
