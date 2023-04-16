package com.yxcorp.gifshow.magic.ui.widget.AutoHideTextView;
import androidx.appcompat.widget.AppCompatTextView;
import android.content.Context;
import p5b.a;
import android.util.AttributeSet;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.animation.Keyframe;
import android.view.View;
import android.util.Property;
import android.animation.PropertyValuesHolder;
import android.animation.ObjectAnimator;
import th0.i;
import android.animation.TimeInterpolator;
import android.animation.AnimatorSet;
import p5b.b;
import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import java.lang.Runnable;
import android.widget.TextView;
import java.lang.CharSequence;

public class AutoHideTextView extends AppCompatTextView	// class@001c4a
{
    public AnimatorSet f;
    public Animator$AnimatorListener g;
    public Runnable h;

    public void AutoHideTextView(Context p0){
       super(p0);
       this.g = null;
       this.h = new a(this);
    }
    public void AutoHideTextView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.g = null;
       this.h = new a(this);
    }
    public static void p(AutoHideTextView p0){
       Objects.requireNonNull(p0);
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, p0, AutoHideTextView.class, "5")) {
       }else {
          p0.f = objArray;
          Keyframe[] keyframeArra = new Keyframe[]{Keyframe.ofFloat(0, 0),Keyframe.ofFloat(0x3f800000, 0x3f800000)};
          PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofKeyframe(View.ALPHA, keyframeArra)};
          ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(p0, propertyValu);
          objectAnimat.setDuration(600);
          objectAnimat.setRepeatCount(0);
          Keyframe keyframe = Keyframe.ofFloat(0, 0x3f800000);
          Keyframe keyframe1 = Keyframe.ofFloat(0.36f, 0.30f);
          Keyframe keyframe2 = Keyframe.ofFloat(0x3f800000, 0x3f800000);
          keyframe1.setInterpolator(new i());
          keyframe2.setInterpolator(new i());
          Keyframe[] keyframeArra1 = new Keyframe[]{keyframe,keyframe1,keyframe2};
          PropertyValuesHolder[] propertyValu1 = new PropertyValuesHolder[]{PropertyValuesHolder.ofKeyframe(View.ALPHA, keyframeArra1)};
          ObjectAnimator objectAnimat1 = ObjectAnimator.ofPropertyValuesHolder(p0, propertyValu1);
          objectAnimat1.setDuration(1400);
          objectAnimat1.setStartDelay(300);
          objectAnimat1.setRepeatCount(1);
          Keyframe keyframe3 = Keyframe.ofFloat(0x3f800000, 0);
          keyframe3.setInterpolator(new i());
          keyframeArra1 = new Keyframe[]{keyframe,keyframe3};
          PropertyValuesHolder[] propertyValu2 = new PropertyValuesHolder[]{PropertyValuesHolder.ofKeyframe(View.ALPHA, keyframeArra1)};
          ObjectAnimator objectAnimat2 = ObjectAnimator.ofPropertyValuesHolder(p0, propertyValu2);
          objectAnimat2.setDuration(500);
          objectAnimat2.setRepeatCount(0);
          AnimatorSet uAnimatorSet = new AnimatorSet();
          p0.f = uAnimatorSet;
          uAnimatorSet.setStartDelay(300);
          p0.f.addListener(new b(p0));
          Animator[] uAnimatorArr = new Animator[]{objectAnimat,objectAnimat1,objectAnimat2};
          p0.f.playSequentially(uAnimatorArr);
          p0.f.start();
       }
       return;
    }
    public void q(){
       if (PatchProxy.applyVoid(null, this, AutoHideTextView.class, "3")) {
          return;
       }
       this.removeCallbacks(this.h);
       this.r();
       this.setText("");
       this.setVisibility(8);
       return;
    }
    public final void r(){
       if (PatchProxy.applyVoid(null, this, AutoHideTextView.class, "4")) {
          return;
       }
       AutoHideTextView tf = this.f;
       if (tf != null) {
          tf.end();
       }
       this.f = null;
       this.setText("");
       this.setVisibility(8);
       return;
    }
}
