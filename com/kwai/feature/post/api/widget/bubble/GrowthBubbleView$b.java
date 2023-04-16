package com.kwai.feature.post.api.widget.bubble.GrowthBubbleView$b;
import java.lang.Runnable;
import com.kwai.feature.post.api.widget.bubble.GrowthBubbleView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class GrowthBubbleView$b implements Runnable	// class@00148a
{
    public final GrowthBubbleView b;

    public void GrowthBubbleView$b(GrowthBubbleView p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, GrowthBubbleView$b.class, "1")) {
          return;
       }
       GrowthBubbleView$b tb = this.b;
       if (tb.b == null) {
          tb.a(false);
       }
       return;
    }
}
