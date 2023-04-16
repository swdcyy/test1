package com.kuaishou.live.playback.play.a;
import java.lang.Runnable;
import com.kuaishou.live.playback.play.LivePlaybackAnimationIconView;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.view.animation.DecelerateInterpolator;
import android.animation.TimeInterpolator;
import ki3.e;

public final class a implements Runnable	// class@000d2e
{
    public final LivePlaybackAnimationIconView b;

    public void a(LivePlaybackAnimationIconView p0){
       this.b = p0;
    }
    public final void run(){
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, LivePlaybackAnimationIconView.class, "4")) {
       }else {
          tb.p0(0x3f99999a);
          tb.animate().withLayer().scaleX(0x3f800000).scaleY(0x3f800000).setDuration(500).setInterpolator(new DecelerateInterpolator()).withEndAction(new e(tb)).start();
       }
       return;
    }
}
