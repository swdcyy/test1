package com.kwai.feature.component.photofeatures.widget.NestedParentConstraintLayout$a;
import android.animation.AnimatorListenerAdapter;
import com.kwai.feature.component.photofeatures.widget.NestedParentConstraintLayout;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;

public class NestedParentConstraintLayout$a extends AnimatorListenerAdapter	// class@00127a
{
    public final NestedParentConstraintLayout a;

    public void NestedParentConstraintLayout$a(NestedParentConstraintLayout p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NestedParentConstraintLayout$a.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       this.a.setEnabled(true);
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NestedParentConstraintLayout$a.class, "2")) {
          return;
       }
       super.onAnimationStart(p0);
       this.a.setEnabled(false);
       return;
    }
}
