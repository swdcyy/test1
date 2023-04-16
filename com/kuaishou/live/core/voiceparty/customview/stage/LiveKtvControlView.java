package com.kuaishou.live.core.voiceparty.customview.stage.LiveKtvControlView;
import ml8.d;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import z12.e;
import com.kuaishou.live.core.voiceparty.customview.stage.LiveKtvControlView$a;
import java.util.Objects;
import com.kuaishou.live.core.voiceparty.customview.stage.GraduallyDisplayLinearLayout;
import java.lang.Integer;
import android.util.Property;
import android.animation.ObjectAnimator;
import tr2.a;
import android.animation.Animator$AnimatorListener;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.animation.TimeInterpolator;
import com.kuaishou.live.core.voiceparty.customview.stage.LiveKtvControlView$b;
import tr2.b;
import android.view.View;
import ekd.m1;

public class LiveKtvControlView extends LinearLayout implements d	// class@0014cb
{
    public GraduallyDisplayLinearLayout b;
    public GraduallyDisplayLinearLayout c;
    public int d;

    public void LiveKtvControlView(Context p0){
       super(p0, null);
    }
    public void LiveKtvControlView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveKtvControlView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.d = -1;
    }
    public void a(boolean p0){
       if (PatchProxy.isSupport(LiveKtvControlView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveKtvControlView.class, "3")) {
          return;
       }
       int i = 1;
       if (this.d == i) {
          return;
       }
       this.d = i;
       int i1 = 0;
       String[] stringArray = new String[i1];
       e.c("LiveKtvControlView", "switchToPlayMode", stringArray);
       if (p0) {
          LiveKtvControlView tb = this.b;
          i1 = 400;
          LiveKtvControlView$a uoa = new LiveKtvControlView$a(this);
          Objects.requireNonNull(tb);
          if (!PatchProxy.isSupport(GraduallyDisplayLinearLayout.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(i1), uoa, tb, GraduallyDisplayLinearLayout.class, "1")) {
             tb.a();
             ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(tb, GraduallyDisplayLinearLayout.d, new float[2]{0,0x3f800000}).setDuration((long)i1);
             tb.b = objectAnimat;
             objectAnimat.addListener(new a(tb, uoa));
             tb.b.setInterpolator(new AccelerateDecelerateInterpolator());
             tb.b.start();
          }
       }else {
          this.c.setVisibility(4);
          this.b.setVisibility(i1);
       }
       return;
    }
    public void b(boolean p0){
       if (PatchProxy.isSupport(LiveKtvControlView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveKtvControlView.class, "4")) {
          return;
       }
       int i = 2;
       if (this.d == i) {
          return;
       }
       this.d = i;
       int i1 = 0;
       String[] stringArray = new String[i1];
       e.c("LiveKtvControlView", "switchToWatchMode", stringArray);
       if (p0) {
          LiveKtvControlView tb = this.b;
          i1 = 400;
          LiveKtvControlView$b uob = new LiveKtvControlView$b(this);
          Objects.requireNonNull(tb);
          if (!PatchProxy.isSupport(GraduallyDisplayLinearLayout.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(i1), uob, tb, GraduallyDisplayLinearLayout.class, "2")) {
             tb.a();
             ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(tb, GraduallyDisplayLinearLayout.d, new float[i]{0x3f800000,0}).setDuration((long)i1);
             tb.b = objectAnimat;
             objectAnimat.addListener(new b(tb, uob));
             tb.b.setInterpolator(new AccelerateDecelerateInterpolator());
             tb.b.start();
          }
       }else {
          this.c.setVisibility(i1);
          this.b.setVisibility(4);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveKtvControlView.class, "1")) {
          return;
       }
       this.b = m1.f(p0, 0x7f0a206a);
       this.c = m1.f(p0, 0x7f0a206b);
       return;
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, LiveKtvControlView.class, "2")) {
          return;
       }
       super.onFinishInflate();
       this.doBindView(this);
       return;
    }
}
