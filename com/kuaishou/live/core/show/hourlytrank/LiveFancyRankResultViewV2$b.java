package com.kuaishou.live.core.show.hourlytrank.LiveFancyRankResultViewV2$b;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.core.show.hourlytrank.LiveFancyRankResultViewV2;
import android.view.View;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class LiveFancyRankResultViewV2$b extends AnimatorListenerAdapter	// class@000bed
{
    public final boolean a;
    public final View b;
    public final LiveFancyRankResultViewV2 c;

    public void LiveFancyRankResultViewV2$b(LiveFancyRankResultViewV2 p0,boolean p1,View p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveFancyRankResultViewV2$b.class, "2")) {
          return;
       }
       if (this.a == null) {
          this.b.setVisibility(8);
       }
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveFancyRankResultViewV2$b.class, "1")) {
          return;
       }
       if (this.a != null) {
          this.b.setVisibility(0);
       }
       return;
    }
}
