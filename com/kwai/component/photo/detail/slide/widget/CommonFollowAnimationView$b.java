package com.kwai.component.photo.detail.slide.widget.CommonFollowAnimationView$b;
import android.animation.AnimatorListenerAdapter;
import com.kwai.component.photo.detail.slide.widget.CommonFollowAnimationView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;

public final class CommonFollowAnimationView$b extends AnimatorListenerAdapter	// class@000aad
{
    public final CommonFollowAnimationView a;

    public void CommonFollowAnimationView$b(CommonFollowAnimationView p0){
       this.a = p0;
       super();
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CommonFollowAnimationView$b.class, "1")) {
          return;
       }
       CommonFollowAnimationView d = this.a.d;
       if (d != null) {
          d.setVisibility(0);
       }
       return;
    }
}
