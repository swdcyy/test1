package com.kwai.feature.post.api.music.widget.DragScrollContainerLayout$a;
import android.animation.AnimatorListenerAdapter;
import com.kwai.feature.post.api.music.widget.DragScrollContainerLayout;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.RelativeLayout;

public class DragScrollContainerLayout$a extends AnimatorListenerAdapter	// class@00141b
{
    public final DragScrollContainerLayout a;

    public void DragScrollContainerLayout$a(DragScrollContainerLayout p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DragScrollContainerLayout$a.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       this.a.setEnabled(true);
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DragScrollContainerLayout$a.class, "2")) {
          return;
       }
       super.onAnimationStart(p0);
       this.a.setEnabled(false);
       return;
    }
}
