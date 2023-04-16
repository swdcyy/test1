package com.yxcorp.gifshow.camera.record.widget.PieChartProgress$a;
import android.animation.Animator$AnimatorListener;
import com.yxcorp.gifshow.camera.record.widget.PieChartProgress;
import java.lang.Object;
import android.animation.Animator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;

public class PieChartProgress$a implements Animator$AnimatorListener	// class@000fcd
{
    public final PieChartProgress a;

    public void PieChartProgress$a(PieChartProgress p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PieChartProgress$a.class, "3")) {
          return;
       }
       this.a.setVisibility(8);
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PieChartProgress$a.class, "2")) {
          return;
       }
       this.a.setVisibility(8);
       return;
    }
    public void onAnimationRepeat(Animator p0){
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PieChartProgress$a.class, "1")) {
          return;
       }
       this.a.setVisibility(0);
       return;
    }
}
