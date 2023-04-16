package com.yxcorp.gifshow.camera.record.widget.RecordSwitchCameraView;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import android.widget.ImageView;
import com.yxcorp.gifshow.widget.cdn.KwaiLottieAnimationView;
import lnc.s6;
import com.airbnb.lottie.LottieAnimationView;
import android.view.ViewPropertyAnimator;
import th0.e;
import android.animation.TimeInterpolator;
import com.yxcorp.gifshow.camera.record.widget.RecordSwitchCameraView$a;
import android.animation.Animator$AnimatorListener;

public class RecordSwitchCameraView extends LinearLayout	// class@000fd8
{
    public View b;
    public ImageView c;
    public KwaiLottieAnimationView d;
    public boolean e;
    public ViewPropertyAnimator f;

    public void RecordSwitchCameraView(Context p0){
       super(p0, null);
    }
    public void RecordSwitchCameraView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void RecordSwitchCameraView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (PatchProxy.applyVoidOneRefs(p0, this, RecordSwitchCameraView.class, "1")) {
       }else {
          View view = a.d(p0, R.layout.arg_RES_7f0d12e0, this, true);
          this.b = view.findViewById(0x7f0a0602);
          this.c = view.findViewById(0x7f0a0603);
          this.d = view.findViewById(0x7f0a0601);
          if (s6.m()) {
             this.c.setImageResource(R.drawable.arg_RES_7f081c12);
             this.c.setVisibility(8);
             this.d.setVisibility(0);
             this.d.D(R.string.arg_RES_7f103d9b);
          }
       }
       return;
    }
    public boolean a(){
       return this.e;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, RecordSwitchCameraView.class, "2")) {
          return;
       }
       if (this.e != null) {
          return;
       }
       this.e = true;
       this.d.s();
       this.f = this.c.animate().setDuration(500).rotation(180.00f).setInterpolator(new e()).setListener(new RecordSwitchCameraView$a(this));
       return;
    }
    public View getArrowLayout(){
       return this.b;
    }
    public View getArrowView(){
       return this.c;
    }
}
