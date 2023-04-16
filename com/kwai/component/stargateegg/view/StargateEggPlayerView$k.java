package com.kwai.component.stargateegg.view.StargateEggPlayerView$k;
import java.lang.Runnable;
import com.kwai.component.stargateegg.view.StargateEggPlayerView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.FrameLayout;
import android.view.View$MeasureSpec;

public final class StargateEggPlayerView$k implements Runnable	// class@000b5b
{
    public final StargateEggPlayerView b;

    public void StargateEggPlayerView$k(StargateEggPlayerView p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, StargateEggPlayerView$k.class, "1")) {
          return;
       }
       this.b.destroyDrawingCache();
       StargateEggPlayerView$k tb = this.b;
       tb.measure(View$MeasureSpec.makeMeasureSpec(tb.getWidth(), 0x40000000), View$MeasureSpec.makeMeasureSpec(this.b.getHeight(), 0x40000000));
       tb = this.b;
       tb.layout(tb.getLeft(), this.b.getTop(), this.b.getRight(), this.b.getBottom());
       return;
    }
}
