package com.kuaishou.live.core.basic.widget.LiveOverVerticalScrollViewGroup$a;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.core.basic.widget.LiveOverVerticalScrollViewGroup;
import android.view.View;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class LiveOverVerticalScrollViewGroup$a extends AnimatorListenerAdapter	// class@000908
{
    public final View a;
    public final LiveOverVerticalScrollViewGroup b;

    public void LiveOverVerticalScrollViewGroup$a(LiveOverVerticalScrollViewGroup p0,View p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveOverVerticalScrollViewGroup$a.class, "1")) {
          return;
       }
       this.b.d(this.a, 0);
       return;
    }
}
