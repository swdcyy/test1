package com.yxcorp.gifshow.camera.record.widget.RecordSwitchCameraView$a;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.camera.record.widget.RecordSwitchCameraView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;

public class RecordSwitchCameraView$a extends AnimatorListenerAdapter	// class@000fd7
{
    public final RecordSwitchCameraView a;

    public void RecordSwitchCameraView$a(RecordSwitchCameraView p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecordSwitchCameraView$a.class, "2")) {
          return;
       }
       super.onAnimationCancel(p0);
       this.a.c.setRotation(0);
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecordSwitchCameraView$a.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       this.a.c.setRotation(0);
       p0.e = false;
       return;
    }
}
