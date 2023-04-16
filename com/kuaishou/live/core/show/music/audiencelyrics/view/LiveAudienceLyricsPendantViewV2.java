package com.kuaishou.live.core.show.music.audiencelyrics.view.LiveAudienceLyricsPendantViewV2;
import com.kuaishou.live.core.show.music.audiencelyrics.view.LiveAudienceLyricsPendantView;
import com.kuaishou.live.core.show.music.audiencelyrics.view.LiveAudienceLyricsPendantViewV2$a;
import nsd.u;
import lnc.a1;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.show.music.audiencelyrics.view.LiveAudienceLyricsPendantViewV2$e;
import android.graphics.Rect;
import com.kuaishou.live.core.show.music.audiencelyrics.view.LiveAudienceLyricsPendantViewV2$b;
import com.kuaishou.live.core.show.music.audiencelyrics.LivePendantLyricsView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.model.Lyrics;
import com.yxcorp.gifshow.widget.FlattenLyricView;
import android.widget.RelativeLayout;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.kuaishou.live.core.show.music.audiencelyrics.view.LiveAudienceLyricsPendantViewV2$d;
import android.view.animation.Animation$AnimationListener;
import android.widget.ScrollView;
import android.view.View;
import ekd.m1;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.live.core.show.music.audiencelyrics.LivePendantLyricsView$b;
import java.lang.Float;
import java.lang.Integer;
import java.lang.Runnable;
import android.graphics.RectF;
import android.animation.AnimatorSet;
import usd.q;
import android.view.ViewGroup;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.view.ViewGroup$LayoutParams;
import java.util.Objects;
import android.view.ViewGroup$MarginLayoutParams;
import msd.a;
import android.animation.ValueAnimator;
import rc2.b;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import rc2.c;
import android.animation.Animator$AnimatorListener;
import th0.c;
import android.animation.TimeInterpolator;
import java.lang.Long;
import ekd.k1;
import com.kuaishou.live.core.show.music.audiencelyrics.view.LiveAudienceLyricsPendantViewV2$c;
import android.view.MotionEvent;
import com.kuaishou.live.core.show.music.audiencelyrics.view.LiveAudienceLyricsPendantViewV2$f;
import com.kuaishou.live.core.show.music.audiencelyrics.view.LiveAudienceLyricsPendantViewV2$g;
import com.kuaishou.live.core.show.music.audiencelyrics.view.LiveAudienceLyricsPendantViewV2$h;
import com.kuaishou.live.core.show.music.audiencelyrics.view.LiveAudienceLyricsPendantViewV2$i;
import android.animation.Animator;
import android.animation.AnimatorSet$Builder;

public final class LiveAudienceLyricsPendantViewV2 extends LiveAudienceLyricsPendantView	// class@000d44
{
    public final Rect A;
    public final Runnable B;
    public HashMap C;
    public boolean n;
    public LivePendantLyricsView o;
    public LivePendantLyricsView p;
    public AnimatorSet q;
    public long r;
    public final Runnable s;
    public boolean t;
    public a u;
    public LyricsMode v;
    public ConstraintType w;
    public PointF x;
    public Animator y;
    public Animator z;
    public static final int D;
    public static final int E;
    public static final int F;
    public static final int G;
    public static final LiveAudienceLyricsPendantViewV2$a H;

    static {
       LiveAudienceLyricsPendantViewV2.H = new LiveAudienceLyricsPendantViewV2$a(null);
       LiveAudienceLyricsPendantViewV2.D = a1.d(0x7f0702da);
       LiveAudienceLyricsPendantViewV2.E = a1.d(0x7f07032a);
       LiveAudienceLyricsPendantViewV2.F = a1.d(0x7f070267);
       LiveAudienceLyricsPendantViewV2.G = a1.e(250.00f);
    }
    public void LiveAudienceLyricsPendantViewV2(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void LiveAudienceLyricsPendantViewV2(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void LiveAudienceLyricsPendantViewV2(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.s = new LiveAudienceLyricsPendantViewV2$e(this);
       this.A = new Rect();
       this.B = new LiveAudienceLyricsPendantViewV2$b(this);
    }
    public void LiveAudienceLyricsPendantViewV2(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public static final LivePendantLyricsView k(LiveAudienceLyricsPendantViewV2 p0){
       p0 = p0.o;
       if (p0 == null) {
          a.S("leftLyricsView");
       }
       return p0;
    }
    public void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceLyricsPendantViewV2.class, "8")) {
          return;
       }
       LiveAudienceLyricsPendantViewV2 to = this.o;
       if (to == null) {
          a.S("leftLyricsView");
       }
       to.z(p0);
       to = this.p;
       if (to == null) {
          a.S("rightLyricsView");
       }
       to.z(p0);
       return;
    }
    public void b(Lyrics p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceLyricsPendantViewV2.class, "7")) {
          return;
       }
       a.p(p0, "lyrics");
       LiveAudienceLyricsPendantViewV2 to = this.o;
       if (to == null) {
          a.S("leftLyricsView");
       }
       to.h(p0, p0.mDuration);
       to = this.p;
       if (to == null) {
          a.S("rightLyricsView");
       }
       to.h(p0, p0.mDuration);
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceLyricsPendantViewV2.class, "25")) {
          return;
       }
       Animation uAnimation = AnimationUtils.loadAnimation(this.getContext(), R.anim.arg_RES_7f01004c);
       a.o(uAnimation, "animation");
       uAnimation.setFillAfter(false);
       uAnimation.setAnimationListener(new LiveAudienceLyricsPendantViewV2$d(this));
       this.k.startAnimation(uAnimation);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceLyricsPendantViewV2.class, "5")) {
          return;
       }
       super.doBindView(p0);
       View view = m1.f(p0, R.id.live_audience_left_lyrics_view);
       a.o(view, "ViewBindUtils.bindWidget¡­udience_left_lyrics_view\)");
       this.o = view;
       p0 = m1.f(p0, R.id.live_audience_right_lyrics_view);
       a.o(p0, "ViewBindUtils.bindWidget¡­dience_right_lyrics_view\)");
       this.p = p0;
       LiveAudienceLyricsPendantViewV2 to = this.o;
       String str = "leftLyricsView";
       if (to == null) {
          a.S(str);
       }
       to.setLineGravity(5);
       if (!PatchProxy.applyVoid(null, this, LiveAudienceLyricsPendantViewV2.class, "6")) {
          float f = 0x3fc71c72;
          LivePendantLyricsView[] livePendantL = new LivePendantLyricsView[2];
          LiveAudienceLyricsPendantViewV2 to1 = this.o;
          if (to1 == null) {
             a.S(str);
          }
          livePendantL[0] = to1;
          int i = 1;
          LiveAudienceLyricsPendantViewV2 tp = this.p;
          if (tp == null) {
             a.S("rightLyricsView");
          }
          livePendantL[i] = tp;
          Iterator iterator = CollectionsKt__CollectionsKt.L(livePendantL).iterator();
          while (iterator.hasNext()) {
             LivePendantLyricsView livePendantL1 = iterator.next();
             livePendantL1.Q = 0;
             livePendantL1.R = 0x3f800000;
             livePendantL1.setCurrentLineScale(f);
             livePendantL1.U = new LivePendantLyricsView$b(0, 0, 0, 0xff000000);
             livePendantL1.V = new LivePendantLyricsView$b(0, 0, 0, 0xff000000);
             livePendantL1.W = a1.e(0x3f800000);
             livePendantL1.U0 = 0;
          }
       }
       to = this.p;
       if (to == null) {
          a.S("rightLyricsView");
       }
       this.k = to;
       return;
    }
    public void e(float p0,int p1,float p2,int p3){
       LiveAudienceLyricsPendantView ti;
       LiveAudienceLyricsPendantViewV2 tp;
       if (PatchProxy.isSupport(LiveAudienceLyricsPendantViewV2.class) && PatchProxy.applyVoidFourRefs(Float.valueOf(p0), Integer.valueOf(p1), Float.valueOf(p2), Integer.valueOf(p3), this, LiveAudienceLyricsPendantViewV2.class, "14")) {
          return;
       }
       this.l();
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, LiveAudienceLyricsPendantViewV2.class, "30")) {
          this.v = objArray;
          this.w = objArray;
          this.x = objArray;
          this.removeCallbacks(this.B);
       }
       String str = "mMusicCoverLayout";
       if (this.n != null) {
          ti = this.i;
          a.o(ti, str);
          ti.setAlpha(0x3f800000);
          this.n = false;
       }
       float coverLeft = this.getCoverLeft();
       if (!this.o()) {
          LiveAudienceLyricsPendantView ti1 = this.i;
          a.o(ti1, str);
          if ((this.getSlideRectF().right - (((float)p1 + coverLeft) + (float)ti1.getWidth())) - (float)LiveAudienceLyricsPendantViewV2.E <= 0) {
             LiveAudienceLyricsPendantViewV2 tq = this.q;
             if (tq == null || tq.isRunning() != true) {
                tp = this.p;
                if (tp == null) {
                   a.S("rightLyricsView");
                }
                tq = this.o;
                if (tq == null) {
                   a.S("leftLyricsView");
                }
                this.q(tp, tq);
             }else if(this.o() && ((coverLeft + (float)p1) - this.getSlideRectF().left) - (float)LiveAudienceLyricsPendantViewV2.E <= 0){
                tp = this.q;
                if (tp == null || tp.isRunning() != true) {
                   tp = this.o;
                   if (tp == null) {
                      a.S("leftLyricsView");
                   }
                   tq = this.p;
                   if (tq == null) {
                      a.S("rightLyricsView");
                   }
                   this.q(tp, tq);
                }
             }
          }else {
             goto label_0097 ;
          }
       }else {
          goto label_0097 ;
       }
       ti = this.h;
       a.o(ti, "mMusicLyricsContainer");
       ti.setX(q.m(q.t(this.getMaxX(), (p0 + (float)p1)), this.getMinX()));
       LiveAudienceLyricsPendantView th = this.h;
       a.o(th, "mMusicLyricsContainer");
       th.setY(q.m(q.t(this.getMaxY(), (p2 + (float)p3)), this.getMinY()));
       return;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceLyricsPendantViewV2.class, "22")) {
          return;
       }
       float coverLeft = this.getCoverLeft();
       if (coverLeft - ((this.getSlideRectF().right + this.getSlideRectF().left) / 2.00f) > 0) {
          LiveAudienceLyricsPendantView ti = this.i;
          a.o(ti, "mMusicCoverLayout");
          this.p((int)(this.getSlideRectF().right - ((coverLeft + (float)ti.getWidth()) + (float)LiveAudienceLyricsPendantViewV2.F)));
       }else {
          this.p((int)(- ((coverLeft - (float)LiveAudienceLyricsPendantViewV2.F) - this.getSlideRectF().left)));
       }
       return;
    }
    public void g(boolean p0,boolean p1){
       if (PatchProxy.isSupport(LiveAudienceLyricsPendantViewV2.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, LiveAudienceLyricsPendantViewV2.class, "12")) {
          return;
       }
       LiveAudienceLyricsPendantView tk = this.k;
       a.o(tk, "mCurrentLyricsView");
       int i = (p0)? 0: 4;
       tk.setVisibility(i);
       if (p1) {
          if (p0) {
             this.h();
          }else {
             this.c();
          }
       }
       return;
    }
    public final float getCoverLeft(){
       float x;
       LiveAudienceLyricsPendantView obj = PatchProxy.apply(null, this, LiveAudienceLyricsPendantViewV2.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       String str = "mMusicLyricsContainer";
       if (this.o()) {
          obj = this.h;
          a.o(obj, str);
          x = obj.getX();
          LiveAudienceLyricsPendantViewV2 to = this.o;
          if (to == null) {
             a.S("leftLyricsView");
          }
          x = (x + (float)to.getWidth()) + (float)this.getLeftLyricsViewMarginRight();
       }else {
          obj = this.h;
          a.o(obj, str);
          x = obj.getX();
       }
       return x;
    }
    public final int getLeftLyricsViewMarginRight(){
       LiveAudienceLyricsPendantViewV2 obj = PatchProxy.apply(null, this, LiveAudienceLyricsPendantViewV2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.o;
       if (obj == null) {
          a.S("leftLyricsView");
       }
       ViewGroup$LayoutParams layoutParams = obj.getLayoutParams();
       Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
       return layoutParams.rightMargin;
    }
    public final int getLyricsViewWidth(){
       LiveAudienceLyricsPendantViewV2 obj = PatchProxy.apply(null, this, LiveAudienceLyricsPendantViewV2.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.o;
       if (obj == null) {
          a.S("leftLyricsView");
       }
       int width = obj.getWidth();
       LiveAudienceLyricsPendantViewV2 tp = this.p;
       if (tp == null) {
          a.S("rightLyricsView");
       }
       return q.n(width, tp.getWidth());
    }
    public final float getMaxX(){
       int width;
       RectF obj = PatchProxy.apply(null, this, LiveAudienceLyricsPendantViewV2.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       if (this.o()) {
          obj = this.getSlideRectF().right;
          width = this.getWidth();
       }else {
          obj = this.getSlideRectF().right;
          LiveAudienceLyricsPendantView ti = this.i;
          a.o(ti, "mMusicCoverLayout");
          width = ti.getWidth();
       }
       return (obj - (float)width);
    }
    public final float getMaxY(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceLyricsPendantViewV2.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return (this.getSlideRectF().bottom - (float)this.getHeight());
    }
    public final float getMinX(){
       float f;
       RectF obj = PatchProxy.apply(null, this, LiveAudienceLyricsPendantViewV2.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       if (this.o()) {
          obj = this.getSlideRectF().left;
          LiveAudienceLyricsPendantViewV2 to = this.o;
          if (to == null) {
             a.S("leftLyricsView");
          }
          f = obj - (float)to.getWidth();
       }else {
          f = this.getSlideRectF().left;
       }
       return f;
    }
    public final float getMinY(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceLyricsPendantViewV2.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.getSlideRectF().top;
    }
    public final RectF getSlideRectF(){
       RectF rectF;
       LiveAudienceLyricsPendantViewV2 obj = PatchProxy.apply(null, this, LiveAudienceLyricsPendantViewV2.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.u;
       if (obj != null) {
          rectF = obj.invoke();
          if (rectF != null) {
          label_001f :
             if (rectF == null) {
                rectF = new RectF();
             }
             return rectF;
          }
       }
       rectF = this.b;
       goto label_001f ;
    }
    public void h(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveAudienceLyricsPendantViewV2.class, "24")) {
          return;
       }
       this.l();
       boolean b = false;
       this.t = b;
       if (this.n != null) {
          if (!PatchProxy.applyVoid(objArray, this, LiveAudienceLyricsPendantViewV2.class, "27")) {
             ValueAnimator valueAnimato = ValueAnimator.ofFloat(new float[2]{0,0x3f800000});
             LiveAudienceLyricsPendantView tk = this.k;
             a.o(tk, "mCurrentLyricsView");
             tk.setVisibility(b);
             LiveAudienceLyricsPendantView th = this.h;
             a.o(th, "mMusicLyricsContainer");
             valueAnimato.addUpdateListener(new b(this, th.getX()));
             valueAnimato.addListener(new c(this));
             a.o(valueAnimato, "animator");
             valueAnimato.setInterpolator(new c());
             valueAnimato.setDuration(200);
             valueAnimato.start();
          }
       }else {
          super.h();
       }
       return;
    }
    public void j(long p0){
       if (PatchProxy.isSupport(LiveAudienceLyricsPendantViewV2.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, LiveAudienceLyricsPendantViewV2.class, "9")) {
          return;
       }
       super.j(p0);
       this.r = p0;
       return;
    }
    public final void l(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceLyricsPendantViewV2.class, "33")) {
          return;
       }
       k1.m(this.s);
       return;
    }
    public final void m(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceLyricsPendantViewV2.class, "32")) {
          return;
       }
       k1.r(this.s, 3000);
       return;
    }
    public final ValueAnimator n(View p0,boolean p1){
       if (PatchProxy.isSupport(LiveAudienceLyricsPendantViewV2.class)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, LiveAudienceLyricsPendantViewV2.class, "21");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       int i = 2;
       ValueAnimator valueAnimato = (p1)? ValueAnimator.ofFloat(new float[i]{0,0x3f800000}): ValueAnimator.ofFloat(new float[i]{0x3f800000,0});
       valueAnimato.addUpdateListener(new LiveAudienceLyricsPendantViewV2$c(p0));
       valueAnimato.setInterpolator(new c());
       valueAnimato.setDuration(100);
       a.o(valueAnimato, "if \(toShow\) {\n      Valu¡­     duration = 100\n    }");
       return valueAnimato;
    }
    public final boolean o(){
       LiveAudienceLyricsPendantView obj = PatchProxy.apply(null, this, LiveAudienceLyricsPendantViewV2.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.k;
       LiveAudienceLyricsPendantViewV2 to = this.o;
       if (to == null) {
          a.S("leftLyricsView");
       }
       return a.g(obj, to);
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(LiveAudienceLyricsPendantViewV2.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, LiveAudienceLyricsPendantViewV2.class, "11")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       this.k.getHitRect(this.A);
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveAudienceLyricsPendantViewV2.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "motionEvent");
       if (!p0.getAction() && (this.t != null && this.A.contains((int)p0.getX(), (int)p0.getY()))) {
          return false;
       }
       return super.onTouchEvent(p0);
    }
    public final void p(int p0){
       if (PatchProxy.isSupport(LiveAudienceLyricsPendantViewV2.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveAudienceLyricsPendantViewV2.class, "23")) {
          return;
       }
       int[] ointArray = new int[]{0,p0};
       ValueAnimator valueAnimato = ValueAnimator.ofInt(ointArray);
       valueAnimato.addUpdateListener(new LiveAudienceLyricsPendantViewV2$f(this));
       valueAnimato.addListener(new LiveAudienceLyricsPendantViewV2$g(this));
       valueAnimato.setInterpolator(new c());
       valueAnimato.setDuration(200);
       valueAnimato.start();
       return;
    }
    public final void q(LivePendantLyricsView p0,LivePendantLyricsView p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveAudienceLyricsPendantViewV2.class, "20")) {
          return;
       }
       ValueAnimator valueAnimato = this.n(p0, false);
       ValueAnimator valueAnimato1 = this.n(p1, true);
       valueAnimato.addListener(new LiveAudienceLyricsPendantViewV2$h(this, p0));
       valueAnimato1.addListener(new LiveAudienceLyricsPendantViewV2$i(this, p1));
       AnimatorSet uAnimatorSet = new AnimatorSet();
       this.q = uAnimatorSet;
       uAnimatorSet.play(valueAnimato);
       uAnimatorSet.play(valueAnimato1).after(60);
       uAnimatorSet.start();
       return;
    }
    public final void setSlideRectFSupplier(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceLyricsPendantViewV2.class, "10")) {
          return;
       }
       a.p(p0, "supplier");
       this.u = p0;
       return;
    }
}
