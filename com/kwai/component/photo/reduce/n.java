package com.kwai.component.photo.reduce.n;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewTreeObserver;
import com.kwai.component.photo.reduce.n$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import yf5.f2;
import android.view.View$OnLayoutChangeListener;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.n;
import lnc.a1;
import android.app.Activity;
import ekd.i;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.view.ViewGroup;
import android.view.ViewGroup$MarginLayoutParams;
import android.graphics.Rect;
import uh5.e;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.w;
import lnc.d2;
import android.widget.LinearLayout$LayoutParams;
import com.kwai.component.photo.reduce.model.ReduceMode;
import yf5.e2;
import java.lang.Boolean;
import ekd.m1;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Integer;

public class n extends PresenterV2	// class@000afb
{
    public boolean A;
    public int B;
    public final int C;
    public final int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public View$OnLayoutChangeListener J;
    public boolean K;
    public RecyclerView p;
    public View q;
    public View r;
    public View s;
    public View t;
    public View u;
    public QPhoto v;
    public Rect w;
    public Rect x;
    public boolean y;
    public ReduceMode z;

    public void n(boolean p0){
       super();
       this.C = 15;
       this.D = 10;
       this.K = p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, n.class, "4")) {
          return;
       }
       if (this.A != null) {
          ViewGroup$LayoutParams layoutParams = this.m8().getLayoutParams();
          layoutParams.width = -2;
          this.m8().setLayoutParams(layoutParams);
          this.m8().setMinimumWidth(this.B);
       }
       this.m8().getViewTreeObserver().addOnGlobalLayoutListener(new n$a(this));
       this.J = new f2(this);
       this.m8().addOnLayoutChangeListener(this.J);
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, n.class, "3")) {
          return;
       }
       this.I = n.A(a.b());
       this.E = a1.d(0x7f070fdf);
       this.H = a1.e(15.00f);
       this.F = n.j(this.getActivity());
       if (i.e(this.getActivity())) {
          this.F = this.F - this.I;
       }
       this.G = n.k(this.getActivity());
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, n.class, "5")) {
          return;
       }
       this.m8().removeOnLayoutChangeListener(this.J);
       return;
    }
    public final int P8(){
       Object obj = PatchProxy.apply(null, this, n.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0;
       if (this.p.getChildCount() <= 0) {
          return i;
       }
       return (this.p.getChildAt(i).getHeight() + this.p.getLayoutParams().topMargin);
    }
    public void R8(View p0){
       int top;
       int i1;
       n x;
       n i4;
       n f2;
       int i5;
       boolean b;
       n on2;
       Object obj = this;
       Object obj1 = p0;
       n on = n.class;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, on, "6")) {
          return;
       }
       float f = 0;
       float f1 = 2.00f;
       int i = 4;
       n on1 = 1;
       if (obj.y != null) {
          if (!PatchProxy.applyVoidOneRefs(obj1, obj, on, "9")) {
             top = (obj1 != null && p0.getTop() > 0)? p0.getTop(): 0;
             i1 = obj.s.getHeight() + obj.q.getHeight();
             x = obj.x;
             Rect top1 = x.top;
             n i2 = obj.I;
             int i3 = obj.E + i2;
             if (top1 < i3) {
                i3 = (i3 + x.bottom) / 2;
             }else if(top1 >= i3){
                Rect bottom = x.bottom;
                if (bottom <= obj.F) {
                   i3 = (top1 + bottom) / 2;
                }
             }
             i3 = ((top1 + obj.F) + i2) / 2;
             if (obj.q.getVisibility() == i || obj.r.getVisibility() == i) {
                if (obj.r.getVisibility() != i) {
                label_008c :
                   on1 = 0;
                }
             }else if(((((obj.I + i1) + obj.H) + obj.E) + this.P8()) > i3){
             }
             if (on1) {
                i4 = obj.I;
             }else {
                i3 = i3 - i1;
                i4 = obj.I;
             }
             i3 = i3 - i4;
             i2 = obj.H;
             f2 = obj.F;
             if (((i3 + i1) + i2) > f2) {
                i3 = (f2 - i1) - i2;
             }
             if (e.e()) {
                i3 = i3 - a1.d(0x7f070bf1);
             }
             i3 = i3 - top;
             if (obj.K != null && w.x0(obj.v.mEntity)) {
                top = w.Z(obj.v.getEntity());
                i5 = 0x7f07030d;
                if (i3 < (a1.d(i5) + top)) {
                   i3 = top + a1.d(i5);
                }
             }
             obj1.setTranslationY((float)i3);
             n q = (on1)? obj.q: obj.r;
             i4 = (on1)? obj.r: obj.q;
             q.setX((float)(((x.left + x.right) / 2) - (q.getWidth() / 2)));
             i4.setVisibility(i);
             if (obj.A != null && !PatchProxy.applyVoidTwoRefs(obj1, q, obj, on, "13")) {
                i = p0.getWidth();
                int i7 = obj.x.centerX();
                i5 = i7 - (i / 2);
                i2 = obj.G;
                if ((i5 + i) > i2) {
                   i5 = i2 - i;
                }
                if (i5 < 0) {
                   i5 = 0;
                }
                obj1.setTranslationX((float)i5);
                q.setX((float)((i7 - (q.getWidth() / 2)) - i5));
             }
             float f3 = q.getX() + ((float)q.getWidth() / f1);
             if (!on1) {
                f = (float)i1;
             }
             obj1.setPivotX(f3);
             obj1.setPivotY(f);
             if (!d2.j() || (d2.k() && !PatchProxy.applyVoidTwoRefs(q, obj1, obj, on, "10"))) {
                int i6 = n.k(this.getActivity());
                ViewGroup$LayoutParams layoutParams = obj.s.getLayoutParams();
                layoutParams.width = a1.e(376.00f);
                f3 = (float)(i6 / 3);
                if (q.getX() - f3 < 0) {
                   obj1.setPadding(a1.e(59.00f), 0, 0, 0);
                }else if(q.getX() - f3 > 0 && q.getX() - (float)((i6 * 2) / 3) < 0){
                   layoutParams.gravity = 17;
                }else {
                   layoutParams.gravity = 5;
                   obj1.setPadding(0, 0, a1.e(59.00f), 0);
                }
                obj.s.setLayoutParams(layoutParams);
             }
          }
       }else if(PatchProxy.applyVoidOneRefs(obj1, obj, on, "8")){
          top = obj.s.getHeight() + obj.q.getHeight();
          f2 = obj.w;
          if (obj.q.getVisibility() == i || obj.r.getVisibility() == i) {
             if (obj.r.getVisibility() == i) {
             label_0202 :
                b = true;
             label_0207 :
                i1 = (b)? f2.bottom + a1.e(0x3f800000): f2.top - top;
                x = obj.H;
                if (i1 < x) {
                   on2 = x;
                }
                n f4 = obj.F;
                if (((on2 + top) + x) > f4) {
                   on2 = (f4 - top) - x;
                }
                obj1.setTranslationY((float)(on2 - obj.t.getMeasuredHeight()));
                on2 = (b)? obj.q: obj.r;
                n on3 = on2;
                on2 = (b)? obj.r: obj.q;
                i4 = on2;
                boolean b1 = ((f2.right * 2) < obj.G)? true: false;
                e2.a(obj.s, on3, i4, obj.z.mIsActualMode, b1, f2, n.c(a.b(), 10.00f));
                if (!PatchProxy.isSupport(on) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), obj, on, "11")) {
                   if (obj.z.mCanShowLongTip == null) {
                      obj.u.setVisibility(i);
                      obj.t.setVisibility(i);
                   }else if(b){
                      obj.u.setVisibility(0);
                      obj.t.setVisibility(i);
                   }else {
                      obj.u.setVisibility(i);
                      obj.t.setVisibility(0);
                   }
                }
                float f5 = on3.getX() + ((float)on3.getWidth() / f1);
                if (!b) {
                   f = (float)top;
                }
                obj1.setPivotX(f5);
                obj1.setPivotY(f);
             }
          }else if(((((obj.I + obj.E) + top) + obj.H) + this.P8()) > f2.top){
             goto label_0202 ;
          }
          b = false;
          goto label_0207 ;
       }
    label_02b1 :
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "2")) {
          return;
       }
       this.t = m1.f(p0, 0x7f0a3f22);
       this.r = m1.f(p0, 0x7f0a023c);
       this.s = m1.f(p0, 0x7f0a0b73);
       this.q = m1.f(p0, 0x7f0a0240);
       this.u = m1.f(p0, 0x7f0a3f10);
       this.p = m1.f(p0, 0x7f0a0ec7);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, n.class, "1")) {
          return;
       }
       this.v = this.q8(QPhoto.class);
       this.w = this.r8("PHOTO_REDUCE_ANCHOR_RECT");
       this.x = this.r8("PHOTO_REDUCE_SOURCE_VIEW_RECT");
       this.y = this.r8("PHOTO_REDUCE_LONG_CLICK").booleanValue();
       this.z = this.r8("PHOTO_REDUCE_MODE");
       this.A = this.r8("PHOTO_REDUCE_POPUP_WRAP_CONTENT_HORIZONTALLY").booleanValue();
       this.B = this.r8("PHOTO_REDUCE_POPUP_WIDTH").intValue();
       return;
    }
}
