package com.kuaishou.live.lite.player.basic.LiveLitePlayerViewController$c;
import com.kwai.video.waynelive.listeners.LivePlayerStateChangeListener;
import com.kuaishou.live.lite.player.basic.LiveLitePlayerViewController;
import java.lang.Object;
import com.kwai.video.waynelive.LivePlayerState;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.player.LiteColdStartFinishReporter;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kwai.framework.model.feed.BaseFeed;
import java.util.Objects;
import androidx.fragment.app.Fragment;

public final class LiveLitePlayerViewController$c implements LivePlayerStateChangeListener	// class@000a63
{
    public final LiveLitePlayerViewController b;

    public void LiveLitePlayerViewController$c(LiveLitePlayerViewController p0){
       this.b = p0;
       super();
    }
    public final void onStateChange(LivePlayerState p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLitePlayerViewController$c.class, "1")) {
          return;
       }
       a.p(p0, "state");
       if (p0 == LivePlayerState.ERROR) {
          LiteColdStartFinishReporter d = LiteColdStartFinishReporter.d;
          LiveLitePlayerViewController q = this.b.q;
          QPhoto qPhoto = new QPhoto(this.b.l.mEntity);
          Objects.requireNonNull(d);
          if (!PatchProxy.applyVoidTwoRefs(q, qPhoto, d, LiteColdStartFinishReporter.class, "4")) {
             a.p(q, "fragment");
             a.p(qPhoto, "photo");
             d.b(q, qPhoto, "PlayerError");
          }
       }
       return;
    }
}
