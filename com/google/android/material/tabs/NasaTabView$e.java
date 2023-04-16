package com.google.android.material.tabs.NasaTabView$e;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.tabs.NasaTabView;
import android.animation.Animator;
import android.widget.ImageView;

public class NasaTabView$e extends AnimatorListenerAdapter	// class@0016c0
{
    public final NasaTabView a;

    public void NasaTabView$e(NasaTabView p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       this.a.v.setAlpha(0);
       this.a.v.setScaleX(0x3f800000);
       this.a.v.setScaleY(0x3f800000);
    }
}
