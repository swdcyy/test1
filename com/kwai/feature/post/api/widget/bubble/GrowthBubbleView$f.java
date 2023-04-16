package com.kwai.feature.post.api.widget.bubble.GrowthBubbleView$f;
import java.lang.Runnable;
import com.kwai.feature.post.api.widget.bubble.GrowthBubbleView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class GrowthBubbleView$f implements Runnable	// class@00148f
{
    public final GrowthBubbleView b;

    public void GrowthBubbleView$f(GrowthBubbleView p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, GrowthBubbleView$f.class, "1")) {
          return;
       }
       this.b.b("widget discard");
       return;
    }
}
