package com.kwai.feature.post.api.widget.bubble.GrowthBubbleView$g;
import java.lang.Runnable;
import com.kwai.feature.post.api.widget.bubble.GrowthBubbleView;
import s36.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class GrowthBubbleView$g implements Runnable	// class@001490
{
    public final GrowthBubbleView b;
    public final e c;

    public void GrowthBubbleView$g(GrowthBubbleView p0,e p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, GrowthBubbleView$g.class, "1")) {
          return;
       }
       GrowthBubbleView$g tc = this.c;
       if (tc != null) {
          tc.onDismiss();
       }
       this.b.g();
       return;
    }
}
