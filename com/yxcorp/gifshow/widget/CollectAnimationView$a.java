package com.yxcorp.gifshow.widget.CollectAnimationView$a;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.widget.CollectAnimationView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class CollectAnimationView$a extends AnimatorListenerAdapter	// class@001801
{
    public final CollectAnimationView a;

    public void CollectAnimationView$a(CollectAnimationView p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CollectAnimationView$a.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       this.a.setCommonState(true);
       return;
    }
}
