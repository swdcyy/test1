package com.kuaishou.live.common.core.component.line.widget.LiveAvatarListLoopView;
import android.widget.FrameLayout;
import lnc.a1;
import android.content.Context;
import android.util.AttributeSet;
import java.util.ArrayList;
import ro1.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import com.facebook.drawee.generic.RoundingParams;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import android.view.View;
import java.util.List;
import android.animation.AnimatorSet;
import android.animation.Animator;
import ekd.f;
import java.lang.Runnable;
import ekd.k1;
import com.kwai.robust.PatchProxyResult;
import java.util.Collection;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import ekd.j;
import android.animation.ObjectAnimator;
import com.kuaishou.live.common.core.basic.degrade.j;
import android.util.Property;
import com.kuaishou.live.common.core.component.line.widget.LiveAvatarListLoopView$a;
import android.animation.Animator$AnimatorListener;

public class LiveAvatarListLoopView extends FrameLayout	// class@001492
{
    public int[] b;
    public List c;
    public int d;
    public int e;
    public long f;
    public List g;
    public AnimatorSet h;
    public AnimatorSet i;
    public AnimatorSet j;
    public int k;
    public boolean l;
    public Runnable m;
    public static final int n;
    public static final int o;
    public static final int p;
    public static final int q;
    public static final int r;

    static {
       LiveAvatarListLoopView.n = a1.e(14.00f);
       LiveAvatarListLoopView.o = a1.e(20.00f);
       LiveAvatarListLoopView.p = a1.e(24.00f);
       LiveAvatarListLoopView.q = a1.e(24.00f);
       LiveAvatarListLoopView.r = a1.e(32.00f);
    }
    public void LiveAvatarListLoopView(Context p0){
       super(p0, null);
    }
    public void LiveAvatarListLoopView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveAvatarListLoopView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.c = new ArrayList();
       this.d = 3;
       this.e = a1.e(42.00f);
       this.f = 3000;
       this.g = new ArrayList();
       this.k = 0;
       this.l = false;
       this.m = new a(this);
    }
    public final void a(int p0,int p1,KwaiImageView p2){
       if (PatchProxy.isSupport(LiveAvatarListLoopView.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, LiveAvatarListLoopView.class, "13")) {
          return;
       }
       RoundingParams roundingPara = p2.getHierarchy().n();
       boolean b = true;
       if (roundingPara != null) {
          roundingPara.q(b);
       }else {
          RoundingParams roundingPara1 = new RoundingParams();
          roundingPara1.q(b);
          p2.getHierarchy().L(roundingPara1);
       }
       FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(LiveAvatarListLoopView.r, LiveAvatarListLoopView.r);
       layoutParams.leftMargin = p1;
       p2.setLayoutParams(layoutParams);
       p2.setPadding(a1.e(0x3fc00000), a1.e(0x3fc00000), a1.e(0x3fc00000), a1.e(0x3fc00000));
       p2.setBackgroundResource(R.drawable.arg_RES_7f082540);
       this.addView(p2);
       this.g.add(p2);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, LiveAvatarListLoopView.class, "5")) {
          return;
       }
       LiveAvatarListLoopView th = this.h;
       if (th != null) {
          th.removeAllListeners();
          f.a(this.h);
       }
       th = this.i;
       if (th != null) {
          th.removeAllListeners();
          f.a(this.i);
       }
       th = this.j;
       if (th != null) {
          th.removeAllListeners();
          f.a(this.j);
       }
       k1.m(this.m);
       return;
    }
    public final KwaiImageView c(){
       KwaiImageView obj = PatchProxy.apply(null, this, LiveAvatarListLoopView.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new KwaiImageView(this.getContext());
       obj.getHierarchy().D(R.drawable.detail_avatar_secret);
       return obj;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, LiveAvatarListLoopView.class, "6")) {
          return;
       }
       k1.m(this.m);
       this.b();
       this.l = false;
       this.c.clear();
       this.g.clear();
       this.clearAnimation();
       this.removeAllViews();
       return;
    }
    public void e(List p0,int[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, null, this, LiveAvatarListLoopView.class, "1")) {
          return;
       }
       this.b();
       this.c.clear();
       this.c.addAll(p0);
       this.b = null;
       return;
    }
    public void f(){
       int i1;
       KwaiImageView kwaiImageVie1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveAvatarListLoopView.class, "4")) {
          return;
       }
       this.b();
       this.removeAllViews();
       int i = 0;
       if (!PatchProxy.applyVoid(objArray, this, LiveAvatarListLoopView.class, "12")) {
          this.g.clear();
          int i3 = 0;
          float f1 = 0;
          while (i3 < this.c.size() && i3 < this.d) {
             kwaiImageVie1 = this.c();
             kwaiImageVie1.L(this.c.get(i3));
             kwaiImageVie1.setAlpha(f1);
             LiveAvatarListLoopView te = this.e;
             if (i3) {
                int i4 = LiveAvatarListLoopView.q * i3;
                te = te + i4;
             }
             this.a(i3, te, kwaiImageVie1);
             i3 = i3 + 1;
          }
          if (this.c.size() < this.d && !j.g(this.b)) {
             this.l = true;
             i3 = 0;
             i1 = this.d - this.c.size();
             while (i3 < i1 && i3 < this.b.length) {
                kwaiImageVie1 = this.c();
                kwaiImageVie1.setImageResource(this.b[i3]);
                kwaiImageVie1.setAlpha(f1);
                LiveAvatarListLoopView te1 = this.e;
                if (i3) {
                   int i5 = LiveAvatarListLoopView.q * i3;
                   te1 = te1 + i5;
                }
                this.a(i3, te1, kwaiImageVie1);
                i3 = i3 + 1;
             }
          }
          this.k = this.d - 1;
       }
       this.h = new AnimatorSet();
       ArrayList uArrayList = new ArrayList();
       for (i1 = 0; i1 < this.g.size(); i1 = i1 + 1) {
          KwaiImageView kwaiImageVie = this.g.get(i1);
          AnimatorSet uAnimatorSet = new AnimatorSet();
          ObjectAnimator objectAnimat = j.a(kwaiImageVie, new float[2]{0,0x3f800000});
          objectAnimat.setDuration(180);
          float[] uofloatArray = new float[2];
          uofloatArray[i] = kwaiImageVie.getTranslationX();
          float f = kwaiImageVie.getTranslationX() - (float)LiveAvatarListLoopView.o;
          uofloatArray[1] = f;
          ObjectAnimator objectAnimat1 = ObjectAnimator.ofFloat(kwaiImageVie, View.TRANSLATION_X, uofloatArray);
          objectAnimat1.setDuration(360);
          Animator[] uAnimatorArr = new Animator[2];
          uAnimatorArr[i] = objectAnimat;
          uAnimatorArr[1] = objectAnimat1;
          uAnimatorSet.playTogether(uAnimatorArr);
          int i2 = i1 * 180;
          uAnimatorSet.setStartDelay((long)i2);
          uArrayList.add(uAnimatorSet);
       }
       this.h.playTogether(uArrayList);
       this.h.addListener(new LiveAvatarListLoopView$a(this));
       this.h.start();
       return;
    }
    public void setLoopDelayMs(int p0){
       if (PatchProxy.isSupport(LiveAvatarListLoopView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveAvatarListLoopView.class, "3")) {
          return;
       }
       this.b();
       this.f = (long)p0;
       return;
    }
    public void setMaxShowNum(int p0){
       if (PatchProxy.isSupport(LiveAvatarListLoopView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveAvatarListLoopView.class, "2")) {
          return;
       }
       this.b();
       if (!PatchProxy.isSupport(LiveAvatarListLoopView.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveAvatarListLoopView.class, "8")) {
          int i = 2;
          if (p0 == i) {
             this.d = i;
             this.e = a1.e(32.00f);
          }else if(p0 == 3){
             this.d = 3;
             this.e = a1.e(42.00f);
          }
       }
       return;
    }
}
