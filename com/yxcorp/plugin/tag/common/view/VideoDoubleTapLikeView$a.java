package com.yxcorp.plugin.tag.common.view.VideoDoubleTapLikeView$a;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.plugin.tag.common.view.VideoDoubleTapLikeView;
import com.airbnb.lottie.LottieAnimationView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.animation.Animator$AnimatorListener;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.ImageView;
import java.util.LinkedList;

public class VideoDoubleTapLikeView$a extends AnimatorListenerAdapter	// class@000944
{
    public final LottieAnimationView a;
    public final VideoDoubleTapLikeView b;

    public void VideoDoubleTapLikeView$a(VideoDoubleTapLikeView p0,LottieAnimationView p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoDoubleTapLikeView$a.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       this.a.v(this);
       if (this.b.indexOfChild(this.a) > -1) {
          this.a.setVisibility(4);
          if (!this.b.e.contains(this.a)) {
             this.b.e.offer(this.a);
          }
       }
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoDoubleTapLikeView$a.class, "2")) {
          return;
       }
       super.onAnimationStart(p0);
       this.a.setVisibility(0);
       this.a.bringToFront();
       return;
    }
}
