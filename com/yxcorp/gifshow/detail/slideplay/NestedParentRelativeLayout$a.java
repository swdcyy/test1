package com.yxcorp.gifshow.detail.slideplay.NestedParentRelativeLayout$a;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.detail.slideplay.NestedParentRelativeLayout;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.RelativeLayout;

public class NestedParentRelativeLayout$a extends AnimatorListenerAdapter	// class@001708
{
    public final NestedParentRelativeLayout a;

    public void NestedParentRelativeLayout$a(NestedParentRelativeLayout p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NestedParentRelativeLayout$a.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       this.a.setEnabled(true);
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NestedParentRelativeLayout$a.class, "2")) {
          return;
       }
       super.onAnimationStart(p0);
       this.a.setEnabled(false);
       return;
    }
}
