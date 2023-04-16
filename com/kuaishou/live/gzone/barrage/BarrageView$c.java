package com.kuaishou.live.gzone.barrage.BarrageView$c;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.gzone.barrage.BarrageView;
import com.kuaishou.live.gzone.barrage.BarrageView$e;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Queue;
import android.view.View;
import android.graphics.drawable.Drawable;

public class BarrageView$c extends AnimatorListenerAdapter	// class@001c25
{
    public final BarrageView$e a;
    public final BarrageView b;

    public void BarrageView$c(BarrageView p0,BarrageView$e p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BarrageView$c.class, "1")) {
          return;
       }
       this.b.d.offer(this.a);
       BarrageView g = this.b.g;
       BarrageView$c ta = this.a;
       BarrageView$e a = ta.a;
       if (g[a] == ta) {
          g[a] = null;
       }
       int i = 0x7f0a15dc;
       if (ta.c.getTag(i) != null) {
          this.a.c.setBackgroundDrawable(null);
          this.a.c.setTag(i, null);
       }
       i = 0x7f0a15dd;
       if (this.a.c.getTag(i) != null) {
          this.a.c.setTag(i, null);
       }
       this.a.c.setVisibility(4);
       return;
    }
}
