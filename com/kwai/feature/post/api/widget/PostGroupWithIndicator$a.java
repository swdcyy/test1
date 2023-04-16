package com.kwai.feature.post.api.widget.PostGroupWithIndicator$a;
import android.animation.AnimatorListenerAdapter;
import com.kwai.feature.post.api.widget.PostGroupWithIndicator;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class PostGroupWithIndicator$a extends AnimatorListenerAdapter	// class@001471
{
    public final PostGroupWithIndicator a;

    public void PostGroupWithIndicator$a(PostGroupWithIndicator p0){
       this.a = p0;
       super();
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostGroupWithIndicator$a.class, "1")) {
          return;
       }
       super.onAnimationStart(p0);
       this.a.g();
       return;
    }
}
