package com.yxcorp.gifshow.camera.record.widget.AdjustableCameraView$a;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.camera.record.widget.AdjustableCameraView;
import android.animation.Animator;

public class AdjustableCameraView$a extends AnimatorListenerAdapter	// class@000fab
{
    public final AdjustableCameraView a;

    public void AdjustableCameraView$a(AdjustableCameraView p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       p0.s = true;
    }
}
