package com.kuaishou.tk.api.view.player.TKOlympicPlayerView$j;
import java.lang.Runnable;
import com.kuaishou.tk.api.view.player.TKOlympicPlayerView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.FrameLayout;
import android.view.View$MeasureSpec;

public final class TKOlympicPlayerView$j implements Runnable	// class@000fa4
{
    public final TKOlympicPlayerView b;

    public void TKOlympicPlayerView$j(TKOlympicPlayerView p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, TKOlympicPlayerView$j.class, "1")) {
          return;
       }
       this.b.destroyDrawingCache();
       TKOlympicPlayerView$j tb = this.b;
       tb.measure(View$MeasureSpec.makeMeasureSpec(tb.getWidth(), 0x40000000), View$MeasureSpec.makeMeasureSpec(this.b.getHeight(), 0x40000000));
       tb = this.b;
       tb.layout(tb.getLeft(), this.b.getTop(), this.b.getRight(), this.b.getBottom());
       return;
    }
}
