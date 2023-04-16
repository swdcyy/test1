package com.kuaishou.commercial.photoreduce.e;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.view.ViewTreeObserver;
import com.kuaishou.commercial.photoreduce.e$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import ky.b0;
import android.view.View$OnLayoutChangeListener;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.n;
import lnc.a1;
import android.app.Activity;
import ekd.i;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import java.lang.Integer;
import java.lang.Boolean;
import ky.a;
import android.graphics.Rect;
import com.kwai.component.photo.reduce.model.ReduceMode;
import yf5.e2;
import ekd.m1;
import androidx.recyclerview.widget.RecyclerView;

public class e extends PresenterV2	// class@001526
{
    public int A;
    public int B;
    public int C;
    public View$OnLayoutChangeListener D;
    public a E;
    public RecyclerView p;
    public View q;
    public View r;
    public View s;
    public Rect t;
    public boolean u;
    public ReduceMode v;
    public int w;
    public int x;
    public int y;
    public int z;

    public void e(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, e.class, "4")) {
          return;
       }
       this.m8().getViewTreeObserver().addOnGlobalLayoutListener(new e$a(this));
       this.D = new b0(this);
       this.m8().addOnLayoutChangeListener(this.D);
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, e.class, "3")) {
          return;
       }
       this.C = n.A(a.B);
       this.x = a1.d(0x7f070fdf);
       this.w = a1.d(0x7f070070);
       this.B = a1.e(15.00f);
       int i = n.j(this.getActivity());
       this.z = i;
       this.y = i;
       if (i.e(this.getActivity())) {
          this.y = this.y - this.C;
       }
       this.A = n.k(this.getActivity());
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, e.class, "5")) {
          return;
       }
       this.m8().removeOnLayoutChangeListener(this.D);
       return;
    }
    public final int P8(){
       Object obj = PatchProxy.apply(null, this, e.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0;
       if (this.p.getChildCount() <= 0) {
          return i;
       }
       return (this.p.getChildAt(i).getHeight() + this.p.getLayoutParams().topMargin);
    }
    public final boolean R8(int p0,int p1,int p2){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, e.class, "8");
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       boolean b = true;
       if (this.q.getVisibility() == 4 || this.r.getVisibility() == 4) {
          if (this.r.getVisibility() != 4) {
          label_0086 :
             b = false;
          }
       }else if(this.E != null){
          if (PatchProxy.isSupport(uoe)) {
             Object obj1 = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, e.class, "9");
             if (obj1 != patchProxyRe) {
                b = obj1.booleanValue();
             }
          }
          if (this.E != null && ((((this.C + p0) + this.P8()) + this.E.a()) < p1 || ((p2 + p0) + this.P8()) > this.z)) {
          }
       }else if(((((this.C + p0) + this.B) + this.x) + this.P8()) > p1){
       }
       return b;
    }
    public void S8(View p0){
       int i;
       Object obj;
       int i2;
       e tq;
       float f1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e uoe = e.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoe, "6")) {
          return;
       }
       float f = 0;
       if (this.u != null) {
          if (!PatchProxy.applyVoidOneRefs(p0, this, uoe, "11")) {
             i = this.s.getHeight() + this.q.getHeight();
             e tt = this.t;
             Rect top = tt.top;
             e tC = this.C;
             int i1 = this.x + tC;
             if (top < i1) {
                i1 = (i1 + tt.bottom) / 2;
             }else if(top >= i1){
                Rect bottom = tt.bottom;
                if (bottom <= this.y) {
                   i1 = (top + bottom) / 2;
                }
             }
             i1 = ((top + this.y) + tC) / 2;
             boolean b = this.R8(i, i1, i1);
             if (PatchProxy.isSupport(uoe)) {
                obj = PatchProxy.applyThreeRefs(Integer.valueOf(i), Integer.valueOf(i1), Boolean.valueOf(b), this, e.class, "12");
                if (obj != patchProxyRe) {
                   i2 = obj.intValue();
                label_0098 :
                   p0.setTranslationY((float)i2);
                   tq = (b)? this.q: this.r;
                   uoe = (b)? this.r: this.q;
                   tq.setX((((float)(tt.left + tt.right) / 2.00f) - ((float)tq.getWidth() / 2.00f)));
                   uoe.setVisibility(4);
                   f1 = tq.getX() + ((float)tq.getWidth() / 2.00f);
                   if (!b) {
                      f = (float)i;
                   }
                   p0.setPivotX(f1);
                   p0.setPivotY(f);
                }
             }
             if (b) {
                tq = this.C;
             }else {
                i1 = i1 - i;
                tq = this.C;
             }
             i1 = i1 - tq;
             uoe = this.B;
             tC = this.y;
             if (((i1 + i) + uoe) > tC) {
                i1 = (tC - i) - uoe;
             }
             if (this.E == null) {
                i1 = i1 - a1.d(0x7f070bf1);
             }
             i2 = i1;
             goto label_0098 ;
          }
       }else if(PatchProxy.applyVoidOneRefs(p0, this, uoe, "7")){
          i = (this.s.getHeight() + this.q.getHeight()) + this.r.getHeight();
          e tt1 = this.t;
          boolean b1 = this.R8(i, tt1.top, tt1.bottom);
          if (PatchProxy.isSupport(uoe)) {
             obj = PatchProxy.applyThreeRefs(Integer.valueOf(i), tt1, Boolean.valueOf(b1), this, e.class, "10");
             if (obj != patchProxyRe) {
                i2 = obj.intValue();
             }else {
             label_011f :
                float f2 = 0x3f800000;
                int i3 = (b1)? tt1.bottom + a1.e(f2): tt1.top - i;
                if (this.E != null) {
                   i3 = (b1)? i3 + a1.e(f2): i3 - a1.e(2.00f);
                   if (this.getActivity() != null && i.e(this.getActivity())) {
                      i3 = i3 - this.C;
                   }
                }
             label_0152 :
                tq = this.B;
                if (i3 < tq) {
                   i3 = tq;
                }
                e ty = this.y;
                if (((i3 + i) + tq) > ty) {
                   i2 = (ty - i) - tq;
                }else {
                   i2 = i3;
                }
             }
          }else {
             goto label_011f ;
          }
          p0.setTranslationY((float)i2);
          tq = (b1)? this.q: this.r;
          uoe = (b1)? this.r: this.q;
          e uoe1 = uoe;
          boolean b2 = ((tt1.right * 2) < this.A)? true: false;
          e2.a(this.s, tq, uoe1, this.v.mIsActualMode, b2, tt1, this.w);
          f1 = tq.getX() + ((float)tq.getWidth() / 2.00f);
          if (!b1) {
             f = (float)i;
          }
          p0.setPivotX(f1);
          p0.setPivotY(f);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "2")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a023c);
       this.s = m1.f(p0, 0x7f0a0b73);
       this.q = m1.f(p0, 0x7f0a0240);
       this.p = m1.f(p0, 0x7f0a0ec7);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       this.t = this.r8("PHOTO_REDUCE_SOURCE_VIEW_RECT");
       this.u = this.r8("PHOTO_REDUCE_CENTER_ARROW").booleanValue();
       this.v = this.r8("PHOTO_REDUCE_MODE");
       this.E = this.t8("PHOTO_CORONA_VIDEO_BOTTOM");
       return;
    }
}
