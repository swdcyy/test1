package com.kuaishou.live.common.core.component.like.i$a;
import lo1.l;
import com.kuaishou.live.common.core.component.like.i;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import mo1.a;
import android.view.View;
import android.animation.AnimatorSet;
import java.util.Objects;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.animation.TimeInterpolator;
import go1.n;
import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import android.animation.AnimatorSet$Builder;
import android.widget.ImageView;
import com.kuaishou.live.common.core.basic.degrade.j;
import go1.i;
import android.widget.ProgressBar;
import go1.j;
import go1.k;
import android.widget.TextView;
import go1.l;
import go1.m;
import com.kwai.robust.PatchProxyResult;
import lnc.a1;
import p91.m;
import com.kwai.framework.model.user.QCurrentUser;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import wb5.g;
import com.kwai.framework.model.user.User;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.facebook.imagepipeline.request.ImageRequest;
import wb5.d;
import ub.b;
import pb.d;
import com.facebook.drawee.controller.AbstractDraweeController;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import ac.a;
import java.lang.Integer;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import d61.y;
import com.kuaishou.live.common.core.component.like.j;
import go1.q;
import com.airbnb.lottie.RenderMode;
import com.airbnb.lottie.LottieAnimationView;
import ko1.b0;
import lo1.c;
import com.kuaishou.live.common.core.component.like.f;
import go1.g;
import d61.k0$a;
import com.google.common.base.Optional;
import d61.k0;
import com.kuaishou.live.common.core.component.like.g;
import com.kuaishou.live.common.core.component.like.e;

public class i$a implements l	// class@001467
{
    public final i a;

    public void i$a(i p0){
       this.a = p0;
       super();
    }
    public void a(String p0,String p1){
       i$a ta = this.a;
       ta.u = p0;
       ta.v = p1;
    }
    public void b(boolean p0){
       int i;
       i$a ta;
       ObjectAnimator objectAnimat;
       i oi = i.class;
       i$a uoa = i$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "2")) {
          return;
       }
       this.a.P = new a(this.a.A);
       this.a.R = new AnimatorSet();
       long l = 670;
       boolean b = false;
       i = 2;
       Object[] objArray = null;
       if (p0) {
          ta = this.a;
          if (ta.q != null) {
             Objects.requireNonNull(ta);
             if (!PatchProxy.applyVoid(objArray, ta, oi, "20")) {
                ta.q = b;
                int[] ointArray = new int[i];
                ointArray[b] = b;
                ointArray[1] = ta.V8();
                objectAnimat = ObjectAnimator.ofInt(ta.P, a.b, ointArray).setDuration(l);
                objectAnimat.setInterpolator(new AccelerateDecelerateInterpolator());
                objectAnimat.addListener(new n(ta));
                ta.R.play(objectAnimat);
             }
          }
       }else {
          ta = this.a;
          if (ta.r == null) {
             return;
          }else {
             Objects.requireNonNull(ta);
             if (!PatchProxy.applyVoid(objArray, ta, oi, "19")) {
                oi = ta.B;
                float[] uofloatArray = new float[i];
                uofloatArray[b] = oi.getAlpha();
                uofloatArray[1] = 0;
                objectAnimat = j.a(oi, uofloatArray).setDuration(200);
                objectAnimat.addListener(new i(ta));
                i c = ta.C;
                float[] uofloatArray1 = new float[i];
                uofloatArray1[b] = c.getAlpha();
                uofloatArray1[1] = 0;
                ObjectAnimator objectAnimat1 = ObjectAnimator.ofFloat(c, View.ALPHA, uofloatArray1).setDuration(200);
                objectAnimat1.addListener(new j(ta));
                i f = ta.F;
                uofloatArray1 = new float[i];
                uofloatArray1[b] = f.getAlpha();
                uofloatArray1[1] = 0;
                ObjectAnimator objectAnimat2 = j.a(f, uofloatArray1).setDuration(200);
                objectAnimat2.addListener(new k(ta));
                i e = ta.E;
                float[] uofloatArray2 = new float[i];
                uofloatArray2[b] = e.getAlpha();
                uofloatArray2[1] = 0;
                ObjectAnimator objectAnimat3 = j.a(e, uofloatArray2).setDuration(200);
                objectAnimat3.addListener(new l(ta));
                int[] ointArray1 = new int[i];
                ointArray1[b] = ta.V8();
                ointArray1[1] = b;
                ObjectAnimator objectAnimat4 = ObjectAnimator.ofInt(ta.P, a.b, ointArray1).setDuration(l);
                objectAnimat4.setInterpolator(new AccelerateDecelerateInterpolator());
                objectAnimat4.addListener(new m(ta));
                ta.R8();
                Animator[] uAnimatorArr = new Animator[]{objectAnimat4,objectAnimat,objectAnimat2,objectAnimat3,objectAnimat1};
                ta.R.playTogether(uAnimatorArr);
             }
          }
       }
       this.a.R.start();
       return;
    }
    public boolean c(){
       return this.a.r;
    }
    public int[] d(){
       int[] obj = PatchProxy.apply(null, this, i$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new int[]{obj[0] - a1.e(10.00f),obj[1]};
       this.a.J.getLocationInWindow(obj);
       return obj;
    }
    public void e(boolean p0){
       i$a ta;
       i i;
       i oi = i.class;
       i$a uoa = i$a.class;
       String str = "7";
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, str)) {
          return;
       }
       if (p0) {
          this.a.I.setVisibility(0);
          i u = this.a.U;
          Object[] objArray = null;
          float f = 0.30f;
          if (u != null && u.e()) {
             ta = this.a;
             Objects.requireNonNull(ta);
             if (!PatchProxy.applyVoid(objArray, ta, oi, "6")) {
                ta.I.setAlpha(f);
                g.a(ta.I, QCurrentUser.me(), HeadImageSize.MIDDLE);
             }
          }else {
             ta = this.a;
             i v = ta.V;
             if (v != null) {
                User user = v.getUser();
                HeadImageSize mIDDLE = HeadImageSize.MIDDLE;
                Objects.requireNonNull(ta);
                if (!PatchProxy.applyVoidTwoRefs(user, mIDDLE, ta, oi, str)) {
                   if (user != null) {
                      ta.I.setAlpha(f);
                      d uod = ta.I.g0(objArray, objArray, d.i(user, mIDDLE));
                      i = ta.I;
                      if (uod != null) {
                         objArray = uod.e();
                      }
                      i.setController(objArray);
                   }
                   ta.I.setPlaceHolderImage(R.drawable.detail_avatar_secret);
                }
             }
          }
       }else {
          this.a.I.setVisibility(8);
       }
       return;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, i$a.class, "6")) {
          return;
       }
       i$a ta = this.a;
       i b = ta.B;
       float[] uofloatArray = new float[]{b.getRotation(),0,0x41800000};
       ta.O = ObjectAnimator.ofFloat(b, View.ROTATION, uofloatArray).setDuration(100);
       this.a.O.start();
       return;
    }
    public boolean g(){
       return this.a.x;
    }
    public void h(boolean p0){
       i$a uoa = i$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "4")) {
          return;
       }
       this.a.I.setVisibility(0);
       this.a.N = new AnimatorSet();
       ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(this.a.I, View.SCALE_X, new float[2]{0x3f800000,0x3fb33333});
       objectAnimat.setDuration(300);
       int i = -1;
       objectAnimat.setRepeatCount(i);
       ObjectAnimator objectAnimat1 = ObjectAnimator.ofFloat(this.a.I, View.SCALE_Y, new float[2]{0x3f800000,0x3fb33333});
       objectAnimat1.setDuration(300);
       objectAnimat1.setRepeatCount(i);
       ObjectAnimator objectAnimat2 = j.a(this.a.I, new float[2]{0x3e99999a,0});
       objectAnimat2.setDuration(300);
       objectAnimat2.setRepeatCount(i);
       if (p0) {
          i$a ta = this.a;
          if (ta.t != null) {
             return;
          }else {
             Animator[] uAnimatorArr = new Animator[]{objectAnimat,objectAnimat1,objectAnimat2};
             ta.N.playTogether(uAnimatorArr);
             this.a.N.start();
             ta.t = true;
          }
       }else {
          this.a.I.setVisibility(8);
       }
       return;
    }
    public void i(int p0){
       i$a uoa = i$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "3")) {
          return;
       }
       this.a.C.setProgress((p0 - 10));
       if (p0 >= 60) {
          i$a ta = this.a;
          if (ta.s == null) {
             ta.s = true;
             if (!y.d(ta.getActivity())) {
                ta = this.a;
                ta.x = false;
                Objects.requireNonNull(ta);
                if (!PatchProxy.applyVoid(null, ta, i.class, "12")) {
                   AnimatorSet uAnimatorSet = new AnimatorSet();
                   ObjectAnimator objectAnimat = j.a(ta.B, new float[2]{0x3f800000,0});
                   objectAnimat.addListener(new j(ta));
                   ObjectAnimator objectAnimat1 = j.a(ta.C, new float[2]{0x3f800000,0});
                   objectAnimat1.addListener(new q(ta));
                   uAnimatorSet.setDuration(200);
                   Animator[] uAnimatorArr = new Animator[]{objectAnimat,objectAnimat1};
                   uAnimatorSet.playTogether(uAnimatorArr);
                   uAnimatorSet.start();
                }
             }
          }
       }
       return;
    }
    public void j(){
       if (PatchProxy.applyVoid(null, this, i$a.class, "5")) {
          return;
       }
       this.a.G.setVisibility(0);
       this.a.H.setVisibility(0);
       RenderMode hARDWARE = RenderMode.HARDWARE;
       this.a.G.setRenderMode(hARDWARE);
       this.a.G.k(true);
       k0.b(this.a.W.d(), f.a, new g(this));
       this.a.H.setRenderMode(hARDWARE);
       this.a.H.k(true);
       k0.b(this.a.W.d(), g.a, new e(this));
       return;
    }
    public boolean k(){
       return this.a.w;
    }
}
