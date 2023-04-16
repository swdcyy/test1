package com.kuaishou.merchant.live.bubble.pinocchio.widget.PinocchioBubble;
import f14.g;
import com.kuaishou.merchant.live.bubble.pinocchio.widget.PinocchioBubble$b;
import nsd.u;
import android.content.Context;
import java.util.ArrayList;
import com.kuaishou.merchant.live.bubble.pinocchio.widget.PinocchioBubble$LEVEL;
import ot3.o0;
import java.lang.String;
import ot3.o0$a;
import com.kuaishou.merchant.live.bubble.pinocchio.widget.PinocchioBubble$a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.live.bubble.pinocchio.widget.PinocchioLevelView;
import com.kuaishou.merchant.live.bubble.pinocchio.widget.PinocchioLevelView$ViewData;
import java.lang.Boolean;
import t24.a;
import java.lang.Enum;
import t24.h;
import kotlin.NoWhenBranchMatchedException;
import t24.l;
import t24.c;
import java.util.Collection;
import kotlin.jvm.internal.a;
import android.view.ViewGroup;
import android.view.View;
import com.kuaishou.merchant.live.bubble.pinocchio.widget.PinocchioBubble$d;
import java.lang.Runnable;
import android.animation.Animator;
import com.kwai.robust.PatchProxyResult;
import android.widget.FrameLayout;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.animation.TimeInterpolator;
import android.view.animation.Animation;

public final class PinocchioBubble extends g	// class@0018ec
{
    public Context p;
    public ViewGroup q;
    public final ArrayList r;
    public final ArrayList s;
    public PinocchioLevelView t;
    public PinocchioBubble$LEVEL u;
    public PinocchioLevelView v;
    public static final PinocchioBubble$b w;

    static {
       PinocchioBubble.w = new PinocchioBubble$b(null);
    }
    public void PinocchioBubble(Context p0){
       super(p0);
       this.r = new ArrayList();
       this.s = new ArrayList();
       this.u = PinocchioBubble$LEVEL.LEVEL_ONE;
       this.p = p0;
       this.z(o0.a.a("pinocchioBubblePendant", 0x2b11));
    }
    public final void D(PinocchioBubble$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PinocchioBubble.class, "3")) {
          return;
       }
       this.r.add(p0);
       PinocchioBubble tt = this.t;
       if (tt != null && !PatchProxy.applyVoidOneRefs(p0, tt, PinocchioLevelView.class, "5")) {
          tt.a.add(p0);
       }
       return;
    }
    public final PinocchioBubble$LEVEL E(){
       return this.u;
    }
    public final void F(PinocchioBubble$LEVEL p0,PinocchioLevelView$ViewData p1,boolean p2){
       h oh;
       PinocchioLevelView pinocchioLev = PinocchioLevelView.class;
       if (PatchProxy.isSupport(PinocchioBubble.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, PinocchioBubble.class, "2")) {
          return;
       }
       this.u = p0;
       int i = a.a[p0.ordinal()];
       if (i != 1) {
          if (i != 2) {
             if (i == 3) {
                oh = new h(this.p, p2, this);
             }else {
                throw new NoWhenBranchMatchedException();
             }
          }else {
             oh = new l(this.p, p2, this);
          }
       }else {
          oh = new c(this.p, this);
       }
       this.t = oh;
       oh.a(p1);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, oh, pinocchioLev, "7")) {
          oh.a.clear();
       }
       if (!PatchProxy.applyVoid(objArray, oh, pinocchioLev, "4")) {
          oh.b.clear();
       }
       PinocchioBubble tr = this.r;
       if (!PatchProxy.applyVoidOneRefs(tr, oh, pinocchioLev, "6")) {
          oh.a.addAll(tr);
       }
       tr = this.s;
       if (!PatchProxy.applyVoidOneRefs(tr, oh, pinocchioLev, "3")) {
          oh.b.addAll(tr);
       }
       PinocchioBubble tq = this.q;
       if (tq == null) {
          a.S("mRootView");
       }
       tq.removeAllViews();
       this.A(p1.getShowMills());
       tq = this.q;
       if (tq == null) {
          a.S("mRootView");
       }
       PinocchioBubble tt = this.t;
       PinocchioLevelView c = (tt != null)? tt.c: objArray;
       tq.addView(c);
       tq = this.q;
       if (tq == null) {
          a.S("mRootView");
       }
       tq.post(new PinocchioBubble$d(this, p2));
       tq = this.v;
       if (tq != null) {
          tt = this.t;
          if (tt == null || tt.d() - tq.d()) {
             tt = this.t;
             int i1 = (tt != null)? (int)tt.d(): 0;
             int i2 = (int)tq.d();
             tq = this.t;
             if (tq != null) {
                objArray = tq.h();
             }
             this.t(0, i1, 0, i2, objArray);
          }
       }
       this.v = this.t;
       return;
    }
    public View c(Context p0){
       FrameLayout obj = PatchProxy.applyOneRefs(p0, this, PinocchioBubble.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new FrameLayout(p0);
       this.q = obj;
       return obj;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, PinocchioBubble.class, "7")) {
          return;
       }
       super.d();
       PinocchioBubble tt = this.t;
       if (tt != null) {
          tt.c();
       }
       this.r.clear();
       this.s.clear();
       return;
    }
    public int e(){
       return 14;
    }
    public Animator g(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       PinocchioBubble obj = PatchProxy.apply(objArray, this, PinocchioBubble.class, "6");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.v;
       if (obj != null) {
          objArray = PatchProxy.apply(objArray, obj, PinocchioLevelView.class, "9");
          if (objArray != patchProxyRe) {
          }else {
             obj.c.setPivotX(0);
             obj.c.setPivotY(obj.d());
             PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[2]{0x3f800000,0}),PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[2]{0x3f800000,0})};
             ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(obj.c, propertyValu);
             objectAnimat.setInterpolator(new AccelerateDecelerateInterpolator());
             objectAnimat.setDuration(500);
             objArray = objectAnimat;
          }
       }
       return objArray;
    }
    public int h(){
       return 2;
    }
    public Animator j(){
       Object[] objArray = null;
       PinocchioBubble obj = PatchProxy.apply(objArray, this, PinocchioBubble.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.v;
       if (obj != null) {
          objArray = obj.h();
       }
       return objArray;
    }
    public void v(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, PinocchioBubble.class, "8")) {
          return;
       }
       super.v();
       PinocchioBubble tt = this.t;
       if (tt != null && !PatchProxy.applyVoid(objArray, tt, PinocchioLevelView.class, "11")) {
          Animation animation = tt.c.getAnimation();
          if (animation != null) {
             animation.cancel();
          }
       }
       return;
    }
}
