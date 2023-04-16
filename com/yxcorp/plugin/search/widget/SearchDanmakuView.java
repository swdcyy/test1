package com.yxcorp.plugin.search.widget.SearchDanmakuView;
import android.widget.FrameLayout;
import android.content.Context;
import com.yxcorp.plugin.search.widget.SearchDanmakuView$c;
import com.yxcorp.plugin.search.widget.SearchDanmakuView$a;
import android.util.AttributeSet;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.yxcorp.plugin.search.widget.SearchDanmakuView$b;
import android.view.ViewTreeObserver$OnPreDrawListener;
import java.lang.Integer;
import com.yxcorp.plugin.search.widget.SearchDanmakuView$d;
import android.view.Choreographer$FrameCallback;
import android.view.Choreographer;
import ufd.i;
import com.yxcorp.plugin.search.result.danmu.SearchLiveCommentBulletsResponse$Comment;
import ufd.j;
import java.lang.Runnable;
import java.util.List;
import java.util.Objects;
import java.lang.Math;
import com.yxcorp.plugin.search.utils.SearchLiveDanmakuHelper$DanmakuStyle;
import java.util.Timer;
import com.yxcorp.plugin.search.widget.a;
import java.util.TimerTask;
import android.os.Handler;
import java.lang.Boolean;
import android.animation.ObjectAnimator;
import android.animation.AnimatorSet;
import lnc.q1;
import android.animation.TimeInterpolator;
import android.animation.Animator;
import android.view.View$MeasureSpec;

public class SearchDanmakuView extends FrameLayout	// class@0007d9
{
    public long b;
    public int c;
    public int d;
    public i e;
    public int f;
    public boolean g;
    public Choreographer h;
    public long i;
    public SearchDanmakuView$d j;
    public boolean k;
    public boolean l;
    public boolean m;
    public int n;
    public SearchLiveDanmakuHelper$DanmakuStyle o;
    public b p;
    public Timer q;
    public TimerTask r;
    public SearchLiveCommentBulletsResponse$Comment s;
    public final SearchDanmakuView$c t;
    public final Choreographer$FrameCallback u;

    public void SearchDanmakuView(Context p0){
       super(p0);
       this.b = 3000;
       this.c = 36;
       this.s = null;
       this.t = new SearchDanmakuView$c(this);
       this.u = new SearchDanmakuView$a(this);
    }
    public void SearchDanmakuView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = 3000;
       this.c = 36;
       this.s = null;
       this.t = new SearchDanmakuView$c(this);
       this.u = new SearchDanmakuView$a(this);
    }
    public void SearchDanmakuView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = 3000;
       this.c = 36;
       this.s = null;
       this.t = new SearchDanmakuView$c(this);
       this.u = new SearchDanmakuView$a(this);
    }
    public final void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchDanmakuView.class, "16")) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = p0.getLayoutParams();
       if (layoutParams instanceof FrameLayout$LayoutParams) {
          layoutParams.width = -2;
          layoutParams.height = -1;
       }else {
          layoutParams = new FrameLayout$LayoutParams(-2, -1);
       }
       p0.setLayoutParams(layoutParams);
       p0.measure(0, 0);
       p0.getLayoutParams().width = p0.getMeasuredWidth();
       p0.setTranslationX((float)this.d);
       super.addView(p0);
       this.c(this.f);
       return;
    }
    public final void b(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchDanmakuView.class, "17")) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = p0.getLayoutParams();
       if (layoutParams instanceof FrameLayout$LayoutParams) {
          layoutParams.width = -2;
          layoutParams.height = -2;
       }else {
          layoutParams = new FrameLayout$LayoutParams(-2, -2);
       }
       p0.setLayoutParams(layoutParams);
       p0.measure(0, 0);
       p0.getLayoutParams().height = p0.getMeasuredHeight();
       p0.getViewTreeObserver().addOnPreDrawListener(new SearchDanmakuView$b(this, p0));
       super.addView(p0);
       this.c(this.f);
       return;
    }
    public final void c(int p0){
       if (PatchProxy.isSupport(SearchDanmakuView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, SearchDanmakuView.class, "6")) {
          return;
       }
       SearchDanmakuView tj = this.j;
       if (tj != null) {
          tj.a(p0);
       }
       return;
    }
    public void d(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, SearchDanmakuView.class, "10")) {
          return;
       }
       this.g = false;
       this.i = 0;
       this.j = objArray;
       this.h.removeFrameCallback(this.u);
       this.h();
       this.removeAllViews();
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, SearchDanmakuView.class, "11")) {
          return;
       }
       if ((this.f + 1) >= this.e.e() && this.l != null) {
          this.f(0);
       }else {
          this.f((this.f + 1));
       }
       return;
    }
    public final void f(int p0){
       if (PatchProxy.isSupport(SearchDanmakuView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, SearchDanmakuView.class, "9")) {
          return;
       }
       if (this.e.e() > p0 && this.g == null) {
          if (this.m != null && (this.s != null && !this.e.g())) {
             this.e.b(this.s, p0);
          }
       label_003c :
          boolean b = true;
          this.g = b;
          int i = 4;
          if (!PatchProxy.isSupport(SearchDanmakuView.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, SearchDanmakuView.class, "15")) {
             View view = this.e.f(this.getContext(), p0, this.e.h());
             this.f = p0;
             view.setTag(R.id.viewtag, Integer.valueOf(this.c));
             if (this.m != null) {
                this.a(view);
             }else {
                this.b(view);
             }
             view.setVisibility(i);
             this.post(new j(this, view));
          }
          int i1 = this.e.a.size();
          Objects.requireNonNull(this.e);
          i = Math.min(i, ((this.e.e() - p0) - b)) - i1;
          if (i > 0) {
             for (int i2 = 0; i2 < i; i2 = i2 + 1) {
                SearchDanmakuView te = this.e;
                int i3 = p0 + 1;
                i3 = i3 + i1;
                i3 = i3 + i2;
                te.c(te.f(this.getContext(), i3, null));
             }
          }
          if (this.h == null) {
             this.h = Choreographer.getInstance();
          }
          if (this.o == SearchLiveDanmakuHelper$DanmakuStyle.VERTICAL_ANIMATOR_TIMER_MOVE) {
             if (!PatchProxy.applyVoid(null, this, SearchDanmakuView.class, "12")) {
                this.q = new Timer();
                a uoa = new a(this);
                this.r = uoa;
                this.q.schedule(uoa, 950, 950);
             }
          }else {
             this.h.postFrameCallbackDelayed(this.u, 100);
          }
       }
    label_00fb :
       return;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, SearchDanmakuView.class, "14")) {
          return;
       }
       this.d();
       this.h();
       SearchDanmakuView te = this.e;
       if (te != null) {
          te.d();
       }
       return;
    }
    public final void h(){
       if (PatchProxy.applyVoid(null, this, SearchDanmakuView.class, "13")) {
          return;
       }
       SearchDanmakuView tq = this.q;
       if (tq != null) {
          tq.cancel();
          this.q = null;
       }
       tq = this.r;
       if (tq != null) {
          tq.cancel();
          this.r = null;
       }
       this.j = null;
       this.t.removeCallbacksAndMessages(null);
       return;
    }
    public void i(View p0,boolean p1){
       if (PatchProxy.isSupport(SearchDanmakuView.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, SearchDanmakuView.class, "4")) {
          return;
       }
       if (this.o != SearchLiveDanmakuHelper$DanmakuStyle.VERTICAL_ANIMATOR_TIMER_MOVE) {
          return;
       }
       float[] uofloatArray = new float[]{p0.getTranslationY(),(p0.getTranslationY() - (float)p0.getHeight()) - (float)this.c};
       ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(p0, "translationY", uofloatArray);
       if (p1) {
          AnimatorSet uAnimatorSet = new AnimatorSet();
          ObjectAnimator objectAnimat1 = ObjectAnimator.ofFloat(p0, "scaleX", new float[2]{0x3ecccccd,0x3f800000});
          ObjectAnimator.ofFloat(p0, "scaleY", new float[2]{0x3ecccccd,0x3f800000});
          objectAnimat1.setInterpolator(new q1(0, 0, 0x3f147ae1, 0x3f800000));
          p0.setPivotX(0);
          uAnimatorSet.setDuration(250);
          uAnimatorSet.setTarget(p0);
          Animator[] uAnimatorArr = new Animator[]{objectAnimat1,objectAnimat};
          uAnimatorSet.playTogether(uAnimatorArr);
          uAnimatorSet.start();
       }else {
          objectAnimat.setDuration(250);
          objectAnimat.start();
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(SearchDanmakuView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, SearchDanmakuView.class, "7")) {
          return;
       }
       super.onMeasure(p0, p1);
       this.d = View$MeasureSpec.getSize(p0);
       this.n = View$MeasureSpec.getSize(p1);
       return;
    }
    public void setAdapter(i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchDanmakuView.class, "8")) {
          return;
       }
       if (this.e != null) {
          this.g();
       }
       this.e = p0;
       this.f(0);
       return;
    }
    public void setAnimationDuration(long p0){
       this.b = p0;
    }
    public void setAutoStop(boolean p0){
       this.k = p0;
    }
    public void setDanmakuStyle(SearchLiveDanmakuHelper$DanmakuStyle p0){
       boolean b = (p0 == SearchLiveDanmakuHelper$DanmakuStyle.HORIZONTAL_FRAME_MOVE)? true: false;
       this.m = b;
       if (p0 == SearchLiveDanmakuHelper$DanmakuStyle.VERTICAL_FRAME_MOVE) {
          p0 = SearchLiveDanmakuHelper$DanmakuStyle.VERTICAL_ANIMATOR_TIMER_MOVE;
       }
       this.o = p0;
       return;
    }
    public void setLoopPlay(boolean p0){
       this.l = p0;
    }
    public void setOnItemShowListener(SearchDanmakuView$d p0){
       this.j = p0;
    }
    public void setSpan(int p0){
       this.c = p0;
    }
    public void setSpecialDanmuku(SearchLiveCommentBulletsResponse$Comment p0){
       this.s = p0;
    }
}
