package com.kuaishou.live.preview.item.view.LivePreviewFollowAnimationView$a;
import ekd.f$j;
import com.kuaishou.live.preview.item.view.LivePreviewFollowAnimationView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.FrameLayout;

public class LivePreviewFollowAnimationView$a extends f$j	// class@000e53
{
    public final LivePreviewFollowAnimationView a;

    public void LivePreviewFollowAnimationView$a(LivePreviewFollowAnimationView p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePreviewFollowAnimationView$a.class, "1")) {
          return;
       }
       LivePreviewFollowAnimationView$a ta = this.a;
       ta.e = false;
       ta.setVisibility(8);
       this.a.e();
       return;
    }
}
