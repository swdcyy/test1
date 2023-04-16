package com.yxcorp.gifshow.v3.SocialSimpleEditorActivityViewBinder$b;
import ooc.r0;
import com.yxcorp.gifshow.v3.SocialSimpleEditorActivityViewBinder;
import java.lang.Object;
import ooc.q0;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import android.view.View;
import android.os.Bundle;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import uwc.a;
import java.util.List;
import com.yxcorp.gifshow.v3.previewer.EditorBasePreviewFragment;
import r1c.h;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.SocialSimpleEditorActivityViewBinder$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.yxcorp.gifshow.v3.customizer.viewbinder.SocialSimplePhotoFragmentViewBinderAbs;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.util.Objects;
import com.yxcorp.gifshow.v3.customizer.viewbinder.SocialSimplePhotoFragmentViewBinderAbs$a;
import kotlin.jvm.internal.a;
import lq.i;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.android.post.PostArguments;
import com.kuaishou.android.post.SerialArg;
import com.kuaishou.android.post.SimpleEditParam;
import com.kuaishou.android.post.PostPageArg;
import com.kuaishou.android.post.SimpleEditParam$SocialParam;
import java.lang.Integer;
import java.lang.Number;
import q2b.h$b;
import k2b.e0;
import k2b.u1;
import android.widget.FrameLayout;
import android.app.Activity;
import kotlin.Triple;
import com.yxcorp.gifshow.model.RectInfo;
import kotlin.Pair;
import android.animation.Animator;
import java.lang.Long;
import android.animation.AnimatorSet;
import android.graphics.RectF;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import com.yxcorp.gifshow.v3.z;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.gifshow.v3.a0;
import th0.e;
import android.animation.TimeInterpolator;
import android.view.animation.LinearInterpolator;
import com.yxcorp.gifshow.v3.SocialSimpleEditorActivityViewBinder$b$a;
import android.animation.Animator$AnimatorListener;
import faa.a;
import q87.c;

public final class SocialSimpleEditorActivityViewBinder$b implements r0	// class@000d26
{
    public final SocialSimpleEditorActivityViewBinder b;

    public void SocialSimpleEditorActivityViewBinder$b(SocialSimpleEditorActivityViewBinder p0){
       this.b = p0;
       super();
    }
    public void Z(){
       q0.q(this);
    }
    public void b(c p0){
       q0.j(this, p0);
    }
    public void c(View p0,Bundle p1,BaseEditorFragment p2){
       q0.p(this, p0, p1, p2);
    }
    public void d(a p0){
       q0.o(this, p0);
    }
    public void d0(){
       q0.g(this);
    }
    public void e(boolean p0){
       q0.a(this, p0);
    }
    public List f(){
       return q0.c(this);
    }
    public void g(int p0){
       q0.i(this, p0);
    }
    public void h(EditorBasePreviewFragment p0,c p1){
       q0.m(this, p0, p1);
    }
    public void i(){
       q0.l(this);
    }
    public List j(h p0,boolean p1){
       return q0.b(this, p0, p1);
    }
    public void m(LayoutInflater p0,ViewGroup p1,Bundle p2,View p3,BaseEditorFragment p4){
       q0.n(this, p0, p1, p2, p3, p4);
    }
    public void onActivityDestroy(){
       q0.f(this);
    }
    public void onActivityResume(){
       q0.h(this);
    }
    public void p(boolean p0){
       int i;
       SocialSimpleEditorActivityViewBinder u;
       SocialSimpleEditorActivityViewBinder a;
       AnimatorSet uAnimatorSet;
       PatchProxyResult patchProxyRe1;
       SocialSimpleEditorActivityViewBinder$a uoa1;
       SocialSimpleEditorActivityViewBinder socialSimple;
       SocialSimpleEditorActivityViewBinder$a uoa2;
       AnimatorSet uAnimatorSet1;
       int i3;
       ObjectAnimator objectAnimat;
       float f;
       View obj = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       SocialSimpleEditorActivityViewBinder$a uoa = SocialSimpleEditorActivityViewBinder$a.class;
       SocialSimpleEditorActivityViewBinder$b uob = SocialSimpleEditorActivityViewBinder$b.class;
       String str = "1";
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), obj, uob, str)) {
          return;
       }
       q0.k(this, p0);
       SocialSimplePhotoFragmentViewBinderAbs$a j1 = SocialSimplePhotoFragmentViewBinderAbs.J1;
       GifshowActivity gifshowActiv = SocialSimpleEditorActivityViewBinder.H(obj.b);
       Objects.requireNonNull(j1);
       if (!PatchProxy.applyVoidOneRefs(gifshowActiv, j1, SocialSimplePhotoFragmentViewBinderAbs$a.class, "6")) {
          a.p(gifshowActiv, "page");
          if (i.h()) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             i3 oi3 = i3.f();
             SimpleEditParam dEFAULT = SimpleEditParam.DEFAULT;
             a.o(dEFAULT, "DEFAULT");
             oi3.c("is_true_biphoto", Integer.valueOf(i.g().getSimpleEditParam().get(dEFAULT).mSocialParam.mDualCamera));
             uElementPack.params = oi3.e();
             h$b uob2 = h$b.e(7, "BIPHOTO_STATUS");
             a.o(uob2, "taskEventBuilder");
             uob2.k(uElementPack);
             u1.p0("", gifshowActiv, uob2);
          }
       }
       SocialSimpleEditorActivityViewBinder$b b = obj.b;
       i = 8;
       if (b.D == null) {
          u = b.u;
          if (u != null) {
             u.setVisibility(i);
          }
          u = obj.b.C;
          if (u != null) {
             u.setVisibility(i);
          }
          return;
       }else {
          a = b.A;
          if (a != null) {
             SocialSimpleEditorActivityViewBinder$a k = SocialSimpleEditorActivityViewBinder.K;
             Triple triple = k.b(SocialSimpleEditorActivityViewBinder.H(b));
             if (triple != null) {
                RectInfo rectInfo = j1.a(SocialSimpleEditorActivityViewBinder.H(obj.b));
                if (rectInfo != null) {
                   if (!rectInfo.valid() || !triple.getFirst().getSecond().valid()) {
                      Object[] objArray = new Object[0];
                      a.D().w("SocialSimpleEditorActivityViewBinder", "onEditorFirstFrameShown invalid", objArray);
                      u = obj.b.u;
                      if (u != null) {
                         u.setVisibility(i);
                      }
                      u = obj.b.C;
                      if (u != null) {
                         u.setVisibility(i);
                      }
                   }else {
                      SocialSimpleEditorActivityViewBinder x = obj.b.x;
                      Animator[] uAnimatorArr = new Animator[2];
                      View first = a.getFirst();
                      View second = a.getSecond();
                      View third = a.getThird();
                      RectInfo second1 = triple.getFirst().getSecond();
                      Objects.requireNonNull(k);
                      int i1 = 6;
                      Animator[] uAnimatorArr1 = uAnimatorArr;
                      int i2 = 1;
                      if (PatchProxy.isSupport(uoa)) {
                         Object[] objArray1 = new Object[i1];
                         objArray1[0] = first;
                         objArray1[i2] = second;
                         objArray1[2] = third;
                         objArray1[3] = second1;
                         objArray1[4] = rectInfo;
                         objArray1[5] = Long.valueOf(350);
                         uAnimatorSet = PatchProxy.apply(objArray1, k, uoa, str);
                         if (uAnimatorSet != patchProxyRe) {
                            patchProxyRe1 = patchProxyRe;
                            uoa1 = uoa;
                            socialSimple = x;
                            uoa2 = k;
                            i = 0;
                         label_026b :
                            uAnimatorArr1[i] = uAnimatorSet;
                            obj = a.getThird();
                            Objects.requireNonNull(uoa2);
                            if (PatchProxy.isSupport(uoa1)) {
                               uAnimatorSet1 = PatchProxy.applyTwoRefs(obj, Long.valueOf(350), uoa2, uoa1, "2");
                               if (uAnimatorSet1 != patchProxyRe1) {
                                  i3 = 1;
                               label_02c6 :
                                  uAnimatorArr1[i3] = uAnimatorSet1;
                                  socialSimple.playTogether(uAnimatorArr1);
                                  SocialSimpleEditorActivityViewBinder$b uob1 = this;
                                  uob1.b.x.start();
                                  uob1.b.x.addListener(new SocialSimpleEditorActivityViewBinder$b$a(uob1));
                                  return;
                               }
                            }
                            a.p(obj, "splashRoundView");
                            uAnimatorSet1 = new AnimatorSet();
                            objectAnimat = ObjectAnimator.ofFloat(obj, View.ALPHA, new float[2]{0,0x3f800000}).setDuration(350);
                            a.o(objectAnimat, "ObjectAnimator.ofFloat\(s¡­1F\).setDuration\(duration\)");
                            uAnimatorSet1.setInterpolator(new LinearInterpolator());
                            i3 = 1;
                            Animator[] uAnimatorArr2 = new Animator[i3];
                            uAnimatorArr2[0] = objectAnimat;
                            uAnimatorSet1.playTogether(uAnimatorArr2);
                            goto label_02c6 ;
                         }
                      }
                      a.p(first, "splashContainerView");
                      a.p(second, "imageView");
                      a.p(third, "roundView");
                      a.p(second1, "originRectInfo");
                      a.p(rectInfo, "finalRectInfo");
                      RectF tarRect = second1.getTargetRect();
                      a.o(tarRect, "originRectInfo.targetRect");
                      RectF tarRect1 = rectInfo.getTargetRect();
                      a.o(tarRect1, "finalRectInfo.targetRect");
                      AnimatorSet uAnimatorSet2 = new AnimatorSet();
                      float[] uofloatArray = new float[]{0x3f800000,tarRect1.width() / tarRect.width()};
                      RectF rectF = tarRect1;
                      objectAnimat = ObjectAnimator.ofFloat(first, View.SCALE_X, uofloatArray).setDuration(350);
                      a.o(objectAnimat, "ObjectAnimator.ofFloat\(s¡­\(\)\).setDuration\(duration\)");
                      patchProxyRe1 = patchProxyRe;
                      socialSimple = x;
                      float[] uofloatArray1 = new float[]{0x3f800000,rectF.height() / tarRect.height()};
                      ObjectAnimator objectAnimat1 = ObjectAnimator.ofFloat(first, View.SCALE_Y, uofloatArray1).setDuration(350);
                      a.o(objectAnimat1, "ObjectAnimator.ofFloat\(s¡­\(\)\).setDuration\(duration\)");
                      uoa1 = uoa;
                      float[] uofloatArray2 = new float[]{0,rectF.centerX() - tarRect.centerX()};
                      RectF rectF1 = rectF;
                      ObjectAnimator objectAnimat2 = ObjectAnimator.ofFloat(first, View.TRANSLATION_X, uofloatArray2).setDuration(350);
                      a.o(objectAnimat2, "ObjectAnimator.ofFloat\(s¡­\(\)\).setDuration\(duration\)");
                      uoa2 = k;
                      float[] uofloatArray3 = new float[]{0,rectF1.centerY() - tarRect.centerY()};
                      ObjectAnimator objectAnimat3 = ObjectAnimator.ofFloat(first, View.TRANSLATION_Y, uofloatArray3).setDuration(350);
                      a.o(objectAnimat3, "ObjectAnimator.ofFloat\(s¡­\(\)\).setDuration\(duration\)");
                      float[] uofloatArray4 = new float[]{0x3f800000,(tarRect.width() / rectF1.width()) * (rectInfo.getRadiusOuter() / second1.getRadiusOuter())};
                      int i4 = 1;
                      ValueAnimator valueAnimato = ValueAnimator.ofFloat(uofloatArray4).setDuration(350);
                      valueAnimato.addUpdateListener(new z(second, tarRect, second1, third));
                      float[] uofloatArray5 = new float[]{0x3f800000,f / rectF1.width()};
                      f = tarRect.width();
                      ValueAnimator valueAnimato1 = ValueAnimator.ofFloat(uofloatArray5).setDuration(350);
                      valueAnimato1.addUpdateListener(new a0(third));
                      uAnimatorSet2.setInterpolator(new e());
                      Animator[] uAnimatorArr3 = new Animator[]{objectAnimat,objectAnimat1,objectAnimat2,objectAnimat3,valueAnimato,valueAnimato1};
                      i = 0;
                      uAnimatorSet2.playTogether(uAnimatorArr3);
                      uAnimatorSet = uAnimatorSet2;
                      goto label_026b ;
                   }
                }
             }
          }
          return;
       }
    }
    public void s(Bundle p0){
       q0.e(this, p0);
    }
    public void u(boolean p0,String p1){
       q0.d(this, p0, p1);
    }
}
