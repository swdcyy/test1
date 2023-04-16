package com.yxcorp.gifshow.hotspot.widget.OverScrollViewGroup$a;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.hotspot.widget.OverScrollViewGroup;
import android.view.View;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class OverScrollViewGroup$a extends AnimatorListenerAdapter	// class@0018f3
{
    public final View a;
    public final OverScrollViewGroup b;

    public void OverScrollViewGroup$a(OverScrollViewGroup p0,View p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, OverScrollViewGroup$a.class, "1")) {
          return;
       }
       this.b.d(this.a, 0);
       return;
    }
}
