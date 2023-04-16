package com.kuaishou.live.core.show.quiz.question.LiveQuizQuestionAnswerStateView;
import ml8.d;
import android.widget.RelativeLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.animation.AnimatorSet;
import android.view.View;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;
import android.view.animation.OvershootInterpolator;
import android.animation.Animator;
import android.view.ViewGroup;
import i2b.a;
import java.lang.Boolean;
import android.widget.ImageView;
import android.view.animation.ScaleAnimation;
import android.view.animation.Animation;
import ekd.m1;
import com.airbnb.lottie.LottieAnimationView;
import com.kuaishou.live.core.show.quiz.question.LiveQuizQuestionAnswerStateProgressBar;
import android.widget.TextView;
import java.lang.Long;
import android.widget.ProgressBar;

public class LiveQuizQuestionAnswerStateView extends RelativeLayout implements d	// class@000e35
{
    public TextView b;
    public LiveQuizQuestionAnswerStateProgressBar c;
    public ImageView d;
    public LottieAnimationView e;
    public CountDownTimer f;
    public int g;
    public int h;
    public boolean i;
    public AnimatorSet j;

    public void LiveQuizQuestionAnswerStateView(Context p0){
       super(p0);
       this.g = 0;
       this.h = 0;
       this.b();
    }
    public void LiveQuizQuestionAnswerStateView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.g = 0;
       this.h = 0;
       this.b();
    }
    public void LiveQuizQuestionAnswerStateView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.g = 0;
       this.h = 0;
       this.b();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, LiveQuizQuestionAnswerStateView.class, "5")) {
          return;
       }
       this.j = new AnimatorSet();
       ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(this.b, View.ALPHA, new float[2]{0x3f000000,0x3f800000});
       objectAnimat.setDuration(41);
       objectAnimat.setInterpolator(new LinearInterpolator());
       ObjectAnimator objectAnimat1 = ObjectAnimator.ofFloat(this.b, View.SCALE_X, new float[2]{0x3fd9999a,0x3f800000});
       objectAnimat1.setDuration(337);
       objectAnimat1.setInterpolator(new OvershootInterpolator());
       ObjectAnimator objectAnimat2 = ObjectAnimator.ofFloat(this.b, View.SCALE_Y, new float[2]{0x3fd9999a,0x3f800000});
       objectAnimat2.setDuration(337);
       objectAnimat2.setInterpolator(new OvershootInterpolator());
       Animator[] uAnimatorArr = new Animator[]{objectAnimat,objectAnimat1,objectAnimat2};
       this.j.playTogether(uAnimatorArr);
       this.j.start();
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, LiveQuizQuestionAnswerStateView.class, "2")) {
          return;
       }
       a.k(this, R.layout.arg_RES_7f0d0d68, true);
       this.doBindView(this);
       return;
    }
    public void c(boolean p0){
       if (PatchProxy.isSupport(LiveQuizQuestionAnswerStateView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveQuizQuestionAnswerStateView.class, "6")) {
          return;
       }
       float f = 0x3f000000;
       this.d.setScaleX(f);
       this.d.setScaleY(f);
       LiveQuizQuestionAnswerStateView td = this.d;
       int i = (p0)? 0x7f081426: 0x7f081427;
       td.setImageResource(i);
       ScaleAnimation scaleAnimati = new ScaleAnimation(0x3f800000, 2.00f, 0x3f800000, 2.00f, 1, 0x3f000000, 1, 0x3f000000);
       i.setFillAfter(true);
       i.setDuration(250);
       i.setStartOffset(200);
       this.d.startAnimation(i);
       this.d.setVisibility(0);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveQuizQuestionAnswerStateView.class, "1")) {
          return;
       }
       this.e = m1.f(p0, 0x7f0a2453);
       this.c = m1.f(p0, 0x7f0a2455);
       this.b = m1.f(p0, 0x7f0a2454);
       this.d = m1.f(p0, 0x7f0a2452);
       return;
    }
    public void setMaxCountDownTime(long p0){
       if (PatchProxy.isSupport(LiveQuizQuestionAnswerStateView.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, LiveQuizQuestionAnswerStateView.class, "3")) {
          return;
       }
       this.c.setMax((int)p0);
       return;
    }
}
