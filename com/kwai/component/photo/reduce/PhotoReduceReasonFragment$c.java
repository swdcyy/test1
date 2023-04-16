package com.kwai.component.photo.reduce.PhotoReduceReasonFragment$c;
import android.animation.AnimatorListenerAdapter;
import com.kwai.component.photo.reduce.PhotoReduceReasonFragment;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class PhotoReduceReasonFragment$c extends AnimatorListenerAdapter	// class@000ad6
{
    public final PhotoReduceReasonFragment a;

    public void PhotoReduceReasonFragment$c(PhotoReduceReasonFragment p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoReduceReasonFragment$c.class, "1")) {
          return;
       }
       this.a.vh();
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoReduceReasonFragment$c.class, "2")) {
          return;
       }
       this.a.vh();
       return;
    }
}
