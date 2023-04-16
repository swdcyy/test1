package com.yxcorp.gifshow.profile.presenter.profile.header.recommend.e;
import android.view.ViewTreeObserver$OnPreDrawListener;
import com.yxcorp.gifshow.profile.presenter.profile.header.recommend.f;
import java.lang.Object;
import com.yxcorp.gifshow.profile.presenter.profile.header.recommend.UserProfilePymkPresenter;
import android.view.ViewTreeObserver;
import android.view.ViewGroup;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.daimajia.easing.Skill;
import lnc.a1;
import android.util.Property;
import android.animation.ObjectAnimator;
import com.daimajia.easing.BaseEasingMethod$EasingListener;
import android.animation.ValueAnimator;
import com.daimajia.easing.Glider;
import java.util.ArrayList;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import u4c.x;
import u4c.y;
import com.yxcorp.gifshow.profile.presenter.profile.header.recommend.d;
import android.animation.Animator;
import android.animation.Animator$AnimatorListener;
import android.animation.AnimatorSet;

public final class e implements ViewTreeObserver$OnPreDrawListener	// class@001536
{
    public final f b;

    public void e(f p0){
       this.b = p0;
    }
    public final boolean onPreDraw(){
       e b = this.b;
       UserProfilePymkPresenter c = b.h.C;
       if (c != null && c.getViewTreeObserver() != null) {
          b.h.C.getViewTreeObserver().removeOnPreDrawListener(b.h.X);
          f h = b.h;
          Objects.requireNonNull(h);
          if (!PatchProxy.applyVoid(null, h, UserProfilePymkPresenter.class, "9")) {
             int measuredHeig = h.B.getMeasuredHeight();
             Skill quadEaseOut = Skill.QuadEaseOut;
             float[] uofloatArray = new float[]{0,(float)(- a1.e(20.00f))};
             BaseEasingMethod$EasingListener[] uEasingListe = new BaseEasingMethod$EasingListener[false];
             h.t.add(Glider.glide(quadEaseOut, 300.00f, ObjectAnimator.ofFloat(h.v, View.TRANSLATION_Y, uofloatArray), uEasingListe));
             Skill quadEaseIn = Skill.QuadEaseIn;
             uofloatArray = new float[]{(float)(- a1.e(20.00f)),0};
             BaseEasingMethod$EasingListener[] uEasingListe1 = new BaseEasingMethod$EasingListener[false];
             h.u.add(Glider.glide(quadEaseIn, 300.00f, ObjectAnimator.ofFloat(h.v, View.TRANSLATION_Y, uofloatArray), uEasingListe1));
             FrameLayout$LayoutParams layoutParams = h.w.getLayoutParams();
             int[] ointArray = new int[]{false,measuredHeig};
             BaseEasingMethod$EasingListener[] uEasingListe2 = new BaseEasingMethod$EasingListener[]{new x(h, layoutParams)};
             h.t.add(Glider.glide(quadEaseOut, 300.00f, ValueAnimator.ofInt(ointArray), uEasingListe2));
             ointArray = new int[]{measuredHeig,false};
             uEasingListe1 = new BaseEasingMethod$EasingListener[]{new y(h, layoutParams)};
             h.u.add(Glider.glide(quadEaseIn, 300.00f, ValueAnimator.ofInt(ointArray), uEasingListe1));
             uofloatArray = new float[]{(float)(- a1.e(20.00f)),0};
             uEasingListe = new BaseEasingMethod$EasingListener[false];
             h.t.add(Glider.glide(quadEaseOut, 300.00f, ObjectAnimator.ofFloat(h.B, View.TRANSLATION_Y, uofloatArray), uEasingListe));
             float[] uofloatArray1 = new float[]{0,(float)(- a1.e(20.00f))};
             uEasingListe = new BaseEasingMethod$EasingListener[false];
             h.u.add(Glider.glide(quadEaseIn, 300.00f, ObjectAnimator.ofFloat(h.B, View.TRANSLATION_Y, uofloatArray1), uEasingListe));
             uEasingListe = new BaseEasingMethod$EasingListener[false];
             h.t.add(Glider.glide(quadEaseOut, 300.00f, ObjectAnimator.ofFloat(h.B, View.ALPHA, new float[2]{0,0x3f800000}), uEasingListe));
             uEasingListe = new BaseEasingMethod$EasingListener[false];
             h.u.add(Glider.glide(quadEaseIn, 300.00f, ObjectAnimator.ofFloat(h.B, View.ALPHA, new float[2]{0x3f800000,0}), uEasingListe));
             uEasingListe = new BaseEasingMethod$EasingListener[false];
             h.t.add(Glider.glide(quadEaseOut, 300.00f, ObjectAnimator.ofFloat(h.v, View.ALPHA, new float[2]{0x3f800000,0}), uEasingListe));
             BaseEasingMethod$EasingListener[] uEasingListe3 = new BaseEasingMethod$EasingListener[false];
             h.u.add(Glider.glide(quadEaseIn, 300.00f, ObjectAnimator.ofFloat(h.v, View.ALPHA, new float[2]{0,0x3f800000}), uEasingListe3));
             h.t.add(ObjectAnimator.ofFloat(h.A, View.ROTATION, new float[2]{0,0xc3340000}));
             h.u.add(ObjectAnimator.ofFloat(h.A, View.ROTATION, new float[2]{0xc3340000,0}));
             d uod = new d(h);
             h.t.get(false).addListener(uod);
             h.u.get(false).addListener(uod);
             h.X8(h.v.getMeasuredHeight());
          }
          b.h.p.start();
       }
       return false;
    }
}
