package com.kuaishou.live.core.voiceparty.background.LiveMultiLayerViewController$b;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.core.voiceparty.background.LiveMultiLayerViewController;
import android.view.View;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.FrameLayout;
import android.graphics.drawable.Drawable;

public final class LiveMultiLayerViewController$b extends AnimatorListenerAdapter	// class@00133f
{
    public final LiveMultiLayerViewController a;
    public final View b;

    public void LiveMultiLayerViewController$b(LiveMultiLayerViewController p0,View p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiLayerViewController$b.class, "2")) {
          return;
       }
       LiveMultiLayerViewController$b tb = this.b;
       if (tb != null) {
          this.a.m.removeView(tb);
       }
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiLayerViewController$b.class, "1")) {
          return;
       }
       LiveMultiLayerViewController$b tb = this.b;
       if (tb != null) {
          this.a.m.removeView(tb);
       }
       tb = this.a;
       LiveMultiLayerViewController b = tb.b;
       if (b != null) {
          tb.m.removeView(b);
          tb.b = null;
       }
       this.a.a.setBackground(null);
       return;
    }
}
