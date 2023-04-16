package com.kuaishou.live.core.voiceparty.customview.LiveVoicePartyApplaudAnimationView;
import ml8.d;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Math;
import java.lang.Integer;
import android.animation.AnimatorSet;
import android.graphics.Path;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.animation.Animator;
import th0.j;
import android.animation.TimeInterpolator;
import com.kuaishou.live.core.voiceparty.customview.LiveVoicePartyApplaudAnimationView$a;
import android.animation.Animator$AnimatorListener;
import th0.q;
import com.kuaishou.live.core.voiceparty.customview.LiveVoicePartyApplaudAnimationView$b;
import ekd.m1;
import android.widget.ImageView;

public class LiveVoicePartyApplaudAnimationView extends FrameLayout implements d	// class@0014ab
{
    public ImageView b;
    public ImageView c;
    public ImageView d;
    public ArrayList e;

    public void LiveVoicePartyApplaudAnimationView(Context p0){
       super(p0, null);
    }
    public void LiveVoicePartyApplaudAnimationView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveVoicePartyApplaudAnimationView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.e = new ArrayList();
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveVoicePartyApplaudAnimationView.class, "3")) {
       }else {
          this.doBindView(a.c(p0, R.layout.arg_RES_7f0d0e51, this));
       }
       return;
    }
    public final double a(boolean p0){
       if (PatchProxy.isSupport(LiveVoicePartyApplaudAnimationView.class)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, LiveVoicePartyApplaudAnimationView.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj.doubleValue();
          }
       }
       double d = Math.random();
       if (p0) {
          d = (d * 2.00f) - 0x3ff0000000000000;
       }
       return d;
    }
    public final void b(View p0,int p1,int p2,int p3,int p4,int p5){
       LiveVoicePartyApplaudAnimationView liveVoicePar = this;
       object oobject = p0;
       int i = p5;
       int i1 = 3;
       int i2 = 1;
       int i3 = 0;
       int i4 = 2;
       if (PatchProxy.isSupport(LiveVoicePartyApplaudAnimationView.class)) {
          Object[] objArray = new Object[]{oobject,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, this, LiveVoicePartyApplaudAnimationView.class, "5")) {
             return;
          }
       }
       if (liveVoicePar.e.get((i / 200)).booleanValue()) {
          return;
       }else {
          AnimatorSet uAnimatorSet = new AnimatorSet();
          Path path = new Path();
          path.quadTo((float)p1, (float)p3, (float)p2, (float)p4);
          Animator[] uAnimatorArr = new Animator[i2];
          uAnimatorArr[i3] = ObjectAnimator.ofFloat(oobject, FrameLayout.TRANSLATION_X, FrameLayout.TRANSLATION_Y, path);
          uAnimatorSet.playTogether(uAnimatorArr);
          uAnimatorSet.setDuration(1000);
          uAnimatorSet.setInterpolator(new j());
          uAnimatorSet.setStartDelay((long)i);
          uAnimatorSet.addListener(new LiveVoicePartyApplaudAnimationView$a(this, i, oobject));
          AnimatorSet uAnimatorSet1 = new AnimatorSet();
          Animator[] uAnimatorArr1 = new Animator[i1];
          uAnimatorArr1[i3] = ObjectAnimator.ofFloat(oobject, FrameLayout.SCALE_X, new float[i4]{0x3f800000,0x3f19999a});
          uAnimatorArr1[i2] = ObjectAnimator.ofFloat(oobject, FrameLayout.SCALE_Y, new float[i4]{0x3f800000,0x3f19999a});
          uAnimatorArr1[i4] = ObjectAnimator.ofFloat(oobject, FrameLayout.ALPHA, new float[i4]{0x3f800000,0});
          uAnimatorSet1.playTogether(uAnimatorArr1);
          uAnimatorSet1.setDuration(400);
          uAnimatorSet1.setInterpolator(new q());
          uAnimatorSet1.setStartDelay((long)((i + 1000) - 400));
          LiveVoicePartyApplaudAnimationView$b uob = new LiveVoicePartyApplaudAnimationView$b(this, p0, p0.getX(), p0.getY(), p5);
          uAnimatorSet1.addListener(i4);
          uAnimatorSet.start();
          uAnimatorSet1.start();
          return;
       }
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveVoicePartyApplaudAnimationView.class, "1")) {
          return;
       }
       this.b = m1.f(p0, 0x7f0a0ebb);
       this.d = m1.f(p0, 0x7f0a3ec0);
       this.c = m1.f(p0, 0x7f0a37e5);
       return;
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, LiveVoicePartyApplaudAnimationView.class, "2")) {
          return;
       }
       super.onFinishInflate();
       this.e.clear();
       for (int i = 0; i < 3; i = i + 1) {
          this.e.add(Boolean.FALSE);
       }
       return;
    }
}
