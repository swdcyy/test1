package com.kuaishou.live.common.core.component.comments.fluency.display.a;
import ve1.a;
import we1.a;
import g81.c;
import java.lang.Object;
import lnc.a1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import we1.c;
import android.view.View;
import te1.b;
import te1.d;
import java.lang.Boolean;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.Objects;
import ekd.k1;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kuaishou.live.common.core.component.comments.fluency.display.LiveCommentsBottomIgnoreSizeView;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import java.lang.Math;
import android.view.View$MeasureSpec;
import android.widget.TextView;
import java.lang.Integer;
import android.view.ViewPropertyAnimator;
import ve1.c;
import android.animation.Animator$AnimatorListener;
import com.kuaishou.live.common.core.basic.degrade.LiveDegradeBiz;
import android.view.ViewParent;
import com.kuaishou.live.common.core.component.comments.fluency.display.a$a;
import ve1.b;
import java.lang.Runnable;
import android.view.MotionEvent;

public class a implements a, a	// class@00107f
{
    public final int a;
    public final c b;
    public final boolean c;
    public c d;
    public View e;
    public d f;
    public d g;
    public View h;

    public void a(c p0,boolean p1){
       super();
       this.a = a1.d(0x7f070614) * 2;
       this.c = p1;
       this.b = p0;
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
       }else {
          ViewGroup viewGroup = p0.Zd();
          if (viewGroup != null) {
             c uoc = new c(viewGroup);
             this.d = uoc;
             uoc.d = this;
          }
       }
       return;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, a.class, "15")) {
          return;
       }
       a tf = this.f;
       if (tf == null) {
          return;
       }
       b uob = tf.a();
       if (uob != null) {
          uob.c(this.f.d);
       }
       return;
    }
    public void b(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "11")) {
          return;
       }
       b.c0(LiveLogTag.LIVE_HIGH_FLUENCY_FEEDS, "forceClear", "withAnimation", Boolean.valueOf(p0));
       if (p0) {
          this.g(this.h, this.g);
          this.g(this.e, this.f);
       }else {
          this.e(this.h);
          this.e(this.e);
       }
       View view = null;
       this.e = view;
       this.h = view;
       this.b.Ag(0, p0);
       a td = this.d;
       if (td != null) {
          Objects.requireNonNull(td);
          if (!PatchProxy.applyVoid(view, td, c.class, "2")) {
             td.c = true;
             k1.n(td);
          }
       }
       return;
    }
    public boolean c(d p0){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       b obj = PatchProxy.applyOneRefs(p0, this, uoa, "2");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = p0.a();
       ViewGroup viewGroup = this.b.Zd();
       boolean b = false;
       if (obj == null || viewGroup == null) {
          return b;
       }
       this.g = this.f;
       this.h = this.e;
       View view = obj.b(p0.d);
       this.e = view;
       if (view == null) {
          this.g(this.h, this.g);
          return b;
       }else {
          viewGroup.addView(view);
          a te = this.e;
          Object obj1 = PatchProxy.applyOneRefs(te, this, uoa, "3");
          if (obj1 != patchProxyRe) {
             i = obj1.intValue();
          }else if(te instanceof LiveCommentsBottomIgnoreSizeView){
             i = 0;
          }else {
             ViewGroup$MarginLayoutParams layoutParams = te.getLayoutParams();
             int i2 = (this.c != null)? a1.d(R.dimen.arg_RES_7f07060e): Math.max(layoutParams.topMargin, a1.d(R.dimen.arg_RES_7f07060d));
             layoutParams.topMargin = i2;
             i = i2;
          }
          this.e.measure(View$MeasureSpec.makeMeasureSpec(viewGroup.getWidth(), 0x40000000), View$MeasureSpec.makeMeasureSpec(b, b));
          a te1 = this.e;
          if (!PatchProxy.applyVoidOneRefs(te1, this, uoa, "4")) {
             TextView textView = te1.findViewById(R.id.live_high_fluency_text);
             if (textView != null && (textView.getLineCount() == 1 && te1.getMeasuredHeight() < this.a)) {
                te1.setBackgroundResource(R.drawable.arg_RES_7f0812a4);
             }
          }
          int i1 = this.e.getMeasuredHeight() + i;
          LiveLogTag lIVE_HIGH_FL = LiveLogTag.LIVE_HIGH_FLUENCY_FEEDS;
          b.d0(lIVE_HIGH_FL, "doSwitchAnimation", "message", p0, "containerTargetHeight", Integer.valueOf(i1));
          if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i1), this, uoa, "5")) {
             this.g(this.h, this.g);
             a te2 = this.e;
             if (!PatchProxy.applyVoidOneRefs(te2, this, uoa, "7") && te2 != null) {
                int measuredHeig = te2.getMeasuredHeight();
                b.c0(lIVE_HIGH_FL, "startShowAnimation", "targetY", Integer.valueOf(measuredHeig));
                ViewPropertyAnimator viewProperty = te2.animate();
                viewProperty.cancel();
                te2.setAlpha(0);
                te2.setTranslationY((float)measuredHeig);
                viewProperty.alpha(0x3f800000).translationY(0).setListener(new c(this, te2)).setDuration(300).start();
             }
             this.b.Ag(i1, (LiveDegradeBiz.BottomComment.shouldDegrade() ^ true));
          }
          obj.f(p0, this.e);
          this.f = p0;
          return true;
       }
    }
    public void d(View p0,d p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "9")) {
          return;
       }
       boolean b = this.e(p0);
       if (p1 != null && b) {
          b uob = p1.a();
          if (uob == null) {
             return;
          }else {
             p0.animate().cancel();
             uob.a(p0);
          }
       }
       return;
    }
    public final boolean e(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       if (!p0.getParent() instanceof ViewGroup) {
          return b;
       }
       p0.getParent().removeView(p0);
       return true;
    }
    public void f(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "8")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       p0.setAlpha(0x3f800000);
       p0.setTranslationY(0);
       return;
    }
    public final void g(View p0,d p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "6")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       ViewPropertyAnimator viewProperty = p0.animate();
       viewProperty.cancel();
       viewProperty.alpha(0).setDuration(300).setListener(new a$a(this, p0, p1)).start();
       k1.s(new b(this, p0, p1), this, 300);
       return;
    }
    public void onClick(){
       if (PatchProxy.applyVoid(null, this, a.class, "14")) {
          return;
       }
       a tf = this.f;
       if (tf == null) {
          return;
       }
       b uob = tf.a();
       if (uob != null) {
          uob.d(this.f.d);
       }
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, a.class, "12")) {
          return;
       }
       this.b(false);
       k1.n(this);
       this.f = null;
       this.g = null;
       return;
    }
    public void onDoubleTap(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "13")) {
          return;
       }
       a tf = this.f;
       if (tf != null && p0 != null) {
          b uob = tf.a();
          if (uob != null) {
             uob.e(this.f.d, p0);
          }
       }
       return;
    }
}
