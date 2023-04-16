package com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.AvatarWithLiving;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.AvatarWithLiving$mRingScaleAnimRunnable$2;
import msd.a;
import qrd.p;
import qrd.s;
import android.view.ViewGroup;
import android.view.View;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.view.ViewStub;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.library.widget.specific.misc.CircleWithStrokeView;
import android.view.ViewGroup$LayoutParams;
import lnc.a1;
import qrd.l1;
import java.lang.NullPointerException;
import android.view.animation.ScaleAnimation;
import m6a.b;
import android.view.animation.Animation$AnimationListener;
import android.view.animation.Animation;
import android.animation.AnimatorSet;
import java.lang.Runnable;
import ekd.k1;
import com.kwai.robust.PatchProxyResult;

public final class AvatarWithLiving extends FrameLayout	// class@001782
{
    public CircleWithStrokeView b;
    public AnimatorSet c;
    public AnimatorSet d;
    public View e;
    public View f;
    public KwaiImageView g;
    public ViewStub h;
    public View i;
    public final p j;

    public void AvatarWithLiving(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void AvatarWithLiving(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void AvatarWithLiving(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.j = s.c(new AvatarWithLiving$mRingScaleAnimRunnable$2(this));
       this.setClipChildren(false);
       FrameLayout.inflate(p0, R.layout.arg_RES_7f0d0f3d, this);
       View view = this.findViewById(R.id.slide_play_live_tip);
       a.o(view, "findViewById\(R.id.slide_play_live_tip\)");
       this.e = view;
       view = this.findViewById(R.id.live_tip_ring);
       a.o(view, "findViewById\(R.id.live_tip_ring\)");
       this.f = view;
       view = this.findViewById(R.id.user_avatar);
       a.o(view, "findViewById\(R.id.user_avatar\)");
       this.g = view;
       view = this.findViewById(R.id.nasa_live_anim_viewstub);
       a.o(view, "findViewById\(R.id.nasa_live_anim_viewstub\)");
       this.h = view;
       view = this.findViewById(R.id.living_text);
       a.o(view, "findViewById\(R.id.living_text\)");
       this.i = view;
    }
    public void AvatarWithLiving(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public final void a(boolean p0){
       if (PatchProxy.isSupport2(AvatarWithLiving.class, "5") && PatchProxy.applyVoidOneRefsWithListener(Boolean.valueOf(p0), this, AvatarWithLiving.class, "5")) {
          return;
       }
       int i = (p0)? 0: 8;
       this.e.setVisibility(i);
       AvatarWithLiving tb = this.b;
       if (tb != null) {
          tb.setVisibility(i);
       }
       this.f.setVisibility(i);
       this.i.setVisibility(i);
       PatchProxy.onMethodExit(AvatarWithLiving.class, "5");
       return;
    }
    public final void b(){
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, AvatarWithLiving.class, "3")) {
          return;
       }
       boolean b = true;
       this.a(b);
       if (this.b == null) {
          View view = this.h.inflate();
          if (view != null) {
             this.b = view;
             ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
             if (layoutParams != null) {
                layoutParams.width = a1.e(70.00f);
                layoutParams.height = a1.e(70.00f);
                l1 a = l1.a;
             }else {
                layoutParams = objArray;
             }
             view.setLayoutParams(layoutParams);
             AvatarWithLiving tb = this.b;
             if (tb != null) {
                tb.setRadius((float)a1.e(26.00f));
             }
          }else {
             PatchProxy.onMethodExit(AvatarWithLiving.class, "3");
             throw new NullPointerException("null cannot be cast to non-null type com.kwai.library.widget.specific.misc.CircleWithStrokeView");
          }
       }
       this.e.setVisibility(0);
       if (!PatchProxy.applyVoidWithListener(objArray, this, AvatarWithLiving.class, "7")) {
          ScaleAnimation scaleAnimati = new ScaleAnimation(0x3f5eb852, 0x3f800000, 0x3f5eb852, 0x3f800000, ((float)this.f.getWidth() / 2.00f), ((float)this.f.getHeight() / 2.00f));
          objArray.setDuration(300);
          objArray.setFillAfter(b);
          objArray.setAnimationListener(new b(this));
          this.f.startAnimation(objArray);
          PatchProxy.onMethodExit(AvatarWithLiving.class, "7");
       }
       PatchProxy.onMethodExit(AvatarWithLiving.class, "3");
       return;
    }
    public final void c(){
       if (PatchProxy.applyVoidWithListener(null, this, AvatarWithLiving.class, "4")) {
          return;
       }
       if (!PatchProxy.applyVoidWithListener(null, this, AvatarWithLiving.class, "6")) {
          AvatarWithLiving tc = this.c;
          if (tc != null) {
             tc.cancel();
          }
          tc = this.c;
          if (tc != null) {
             tc.removeAllListeners();
          }
          tc = this.d;
          if (tc != null) {
             tc.cancel();
          }
          tc = this.d;
          if (tc != null) {
             tc.removeAllListeners();
          }
          this.c = null;
          this.d = null;
          k1.m(this.getMRingScaleAnimRunnable());
          tc = this.b;
          if (tc != null) {
             tc.clearAnimation();
          }
          PatchProxy.onMethodExit(AvatarWithLiving.class, "6");
       }
       this.a(false);
       PatchProxy.onMethodExit(AvatarWithLiving.class, "4");
       return;
    }
    public final KwaiImageView getMAvatarView(){
       return this.g;
    }
    public final Runnable getMRingScaleAnimRunnable(){
       Object obj = PatchProxy.applyWithListener(null, this, AvatarWithLiving.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(AvatarWithLiving.class, "2");
       return this.j.getValue();
    }
    public final void setMAvatarView(KwaiImageView p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, AvatarWithLiving.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.g = p0;
       PatchProxy.onMethodExit(AvatarWithLiving.class, "1");
       return;
    }
}
