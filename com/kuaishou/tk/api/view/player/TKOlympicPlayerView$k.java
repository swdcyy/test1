package com.kuaishou.tk.api.view.player.TKOlympicPlayerView$k;
import android.view.View$OnClickListener;
import com.kuaishou.tk.api.view.player.TKOlympicPlayerView;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.tk.api.view.player.TextureRenderView;
import java.util.Objects;
import android.widget.FrameLayout;

public final class TKOlympicPlayerView$k implements View$OnClickListener	// class@000fa5
{
    public final TKOlympicPlayerView b;

    public void TKOlympicPlayerView$k(TKOlympicPlayerView p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKOlympicPlayerView$k.class, "1")) {
          return;
       }
       TKOlympicPlayerView$k tb = this.b;
       if (tb.y != null && tb.x == null) {
          TKOlympicPlayerView b = tb.B;
          if (b instanceof TextureRenderView) {
             Objects.requireNonNull(b, "null cannot be cast to non-null type com.kuaishou.tk.api.view.player.TextureRenderView");
             tb.removeView(b);
          }
          this.b.d();
          tb.B = null;
       }
       return;
    }
}
