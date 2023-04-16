package com.yxcorp.gifshow.camera.record.widget.SampleVideoView$a;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.camera.record.widget.SampleVideoView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewPropertyAnimator;
import android.widget.RelativeLayout;
import android.animation.Animator$AnimatorListener;
import j8c.a;
import q87.c;

public class SampleVideoView$a extends AnimatorListenerAdapter	// class@000fda
{
    public final SampleVideoView a;

    public void SampleVideoView$a(SampleVideoView p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SampleVideoView$a.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       SampleVideoView$a ta = this.a;
       ta.o = true;
       ta.animate().setListener(null);
       Object[] objArray = new Object[0];
       a.D().s("SampleVideoView", "onAnimation end", objArray);
       return;
    }
}
