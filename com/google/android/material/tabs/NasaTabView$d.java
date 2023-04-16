package com.google.android.material.tabs.NasaTabView$d;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.tabs.NasaTabView;
import android.animation.Animator;
import android.widget.ImageView;

public class NasaTabView$d extends AnimatorListenerAdapter	// class@0016bf
{
    public final NasaTabView a;

    public void NasaTabView$d(NasaTabView p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
       NasaTabView x = this.a.x;
       if (x != null) {
          x.setScaleX(0x3f800000);
          this.a.x.setScaleY(0x3f800000);
       }
       return;
    }
    public void onAnimationEnd(Animator p0){
       NasaTabView x = this.a.x;
       if (x != null) {
          x.setScaleX(0x3f800000);
          this.a.x.setScaleY(0x3f800000);
       }
       return;
    }
    public void onAnimationStart(Animator p0){
       NasaTabView x = this.a.x;
       if (x != null) {
          x.setAlpha(0x3f800000);
       }
       return;
    }
}
