package com.kwai.library.widget.refresh.strategy.KwaiDynamicRefreshDelegate;
import r17.b;
import com.kwai.library.widget.refresh.strategy.KwaiDynamicRefreshDelegate$a;
import nsd.u;
import android.view.ViewStub;
import p17.c;
import r17.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import kotlin.LazyThreadSafetyMode;
import com.kwai.library.widget.refresh.strategy.KwaiDynamicRefreshDelegate$mPullAnimView$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.library.widget.refresh.strategy.KwaiDynamicRefreshDelegate$mRefreshAnimView$2;
import com.airbnb.lottie.LottieAnimationView;
import android.widget.ImageView;
import android.view.ViewParent;
import android.view.ViewGroup;
import android.view.View;
import com.kwai.library.widget.refresh.lottie.KwaiRefreshLottieManager;
import w4.e;
import android.view.ViewGroup$LayoutParams;
import android.content.Context;
import com.yxcorp.utility.n;
import qrd.l1;
import usd.q;

public final class KwaiDynamicRefreshDelegate implements b	// class@0009e2
{
    public e b;
    public e c;
    public boolean d;
    public boolean e;
    public final boolean f;
    public final p g;
    public final p h;
    public final ViewStub i;
    public final ViewStub j;
    public final c k;
    public final c l;
    public static final KwaiDynamicRefreshDelegate$a m;

    static {
       KwaiDynamicRefreshDelegate.m = new KwaiDynamicRefreshDelegate$a(null);
    }
    public void KwaiDynamicRefreshDelegate(ViewStub p0,ViewStub p1,c p2,c p3){
       a.p(p0, "pullAnimStub");
       a.p(p1, "refreshAnimStub");
       a.p(p3, "callback");
       super();
       this.i = p0;
       this.j = p1;
       this.k = p2;
       this.l = p3;
       boolean b = true;
       if (p2 == null || p2.b != b) {
          b = false;
       }
       this.f = b;
       LazyThreadSafetyMode nONE = LazyThreadSafetyMode.NONE;
       this.g = s.b(nONE, new KwaiDynamicRefreshDelegate$mPullAnimView$2(this));
       this.h = s.b(nONE, new KwaiDynamicRefreshDelegate$mRefreshAnimView$2(this));
       return;
    }
    public final void a(LottieAnimationView p0){
       p0.setFrame(0);
       p0.setVisibility(4);
       if (p0.p()) {
          p0.f();
       }
       return;
    }
    public void b(){
       this.g();
       ViewParent parent = this.i.getParent();
       ViewGroup viewGroup = null;
       if (!parent instanceof ViewGroup) {
          parent = viewGroup;
       }
       if (parent != null) {
          parent.removeView(this.i);
       }
       parent = this.f().getParent();
       if (parent instanceof ViewGroup) {
          viewGroup = parent;
       }
       if (viewGroup != null) {
          viewGroup.removeView(this.i);
       }
       return;
    }
    public final boolean c(){
       KwaiRefreshLottieManager c;
       KwaiDynamicRefreshDelegate tk;
       boolean b = true;
       if (this.d != null) {
          return b;
       }
       String str = null;
       if (this.b == null) {
          c = KwaiRefreshLottieManager.c;
          tk = this.k;
          String str1 = (tk != null)? tk.e(): str;
          this.b = c.d(str1);
       }
       if (this.c == null) {
          c = KwaiRefreshLottieManager.c;
          tk = this.k;
          if (tk != null) {
             str = tk.f();
          }
          this.c = c.d(str);
       }
       boolean b1 = (this.b == null || this.c == null)? true: false;
       if (b1) {
          this.d = b;
          this.l.a();
       }
       return b1;
    }
    public final void d(View p0){
       KwaiDynamicRefreshDelegate tk = this.k;
       if (tk != null) {
          int i = tk.g();
          int i1 = this.k.d();
          if (i && i1) {
             ViewGroup$LayoutParams layoutParams = p0.getLayoutParams();
             if (layoutParams != null) {
                layoutParams.width = n.c(p0.getContext(), (float)i);
                layoutParams.height = n.c(p0.getContext(), (float)i1);
                p0.setLayoutParams(layoutParams);
             }
          }
       }
       return;
    }
    public final LottieAnimationView e(){
       return this.g.getValue();
    }
    public final LottieAnimationView f(){
       return this.h.getValue();
    }
    public final void g(){
       this.e = false;
       this.a(this.e());
       this.a(this.f());
    }
    public final void h(LottieAnimationView p0,e p1,boolean p2){
       if (p1 != null) {
          if (a.g(p0.getComposition(), p1) ^ 0x01) {
             p0.setComposition(p1);
          }
          p0.setVisibility(0);
          if (p2) {
             p0.s();
          }
       }
       return;
    }
    public void pullProgress(float p0,float p1){
       if (this.e != null) {
          return;
       }
       LottieAnimationView lottieAnimat = this.e();
       if (lottieAnimat.getVisibility() || lottieAnimat.getComposition() == null) {
          this.h(lottieAnimat, this.b, this.f);
       }
       if (!this.c() && this.f == null) {
          lottieAnimat = this.e();
          p1 = q.A(p1, 0, 0x3f800000);
          if (lottieAnimat.getProgress() - p1) {
             lottieAnimat.setProgress(p1);
          }
       }
       return;
    }
    public void pullToRefresh(){
       this.c();
    }
    public void refreshComplete(){
       this.c();
    }
    public int refreshedAnimatorDuration(){
       return 500;
    }
    public void refreshing(){
       if (this.c()) {
          return;
       }
       this.e = true;
       this.a(this.e());
       this.h(this.f(), this.c, true);
       return;
    }
    public void releaseToRefresh(){
       this.c();
    }
    public void reset(){
       if (this.c()) {
          return;
       }
       this.g();
       return;
    }
}
