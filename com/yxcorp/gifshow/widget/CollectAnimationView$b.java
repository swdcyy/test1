package com.yxcorp.gifshow.widget.CollectAnimationView$b;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.widget.CollectAnimationView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class CollectAnimationView$b extends AnimatorListenerAdapter	// class@001802
{
    public final CollectAnimationView a;

    public void CollectAnimationView$b(CollectAnimationView p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CollectAnimationView$b.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       this.a.setCommonState(false);
       return;
    }
}
