package com.kuaishou.live.lite.player.basic.LiveLitePlayerViewController$b;
import com.kwai.video.waynelive.listeners.LivePlayerRenderListener;
import com.kuaishou.live.lite.player.basic.LiveLitePlayerViewController;
import java.lang.Object;
import jw7.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.player.LiteColdStartFinishReporter;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kwai.framework.model.feed.BaseFeed;
import java.util.Objects;
import kotlin.jvm.internal.a;
import kc3.a;
import msd.a;
import pp.c;
import java.lang.StringBuilder;
import com.kuaishou.android.live.log.b;
import wkd.b;
import gb5.a;
import androidx.fragment.app.Fragment;

public final class LiveLitePlayerViewController$b implements LivePlayerRenderListener	// class@000a62
{
    public final LiveLitePlayerViewController b;

    public void LiveLitePlayerViewController$b(LiveLitePlayerViewController p0){
       this.b = p0;
       super();
    }
    public void onAudioRenderingStart(){
       a.a(this);
    }
    public void onLivePlayViewShow(){
       a.b(this);
    }
    public void onRenderingStartAfterResume(){
       a.c(this);
    }
    public void onSwitchToAudioStreamFromVideoStream(){
       a.d(this);
    }
    public void onSwitchToVideoStreamFromAudioStream(){
       a.e(this);
    }
    public void onVideoRenderingStart(){
       if (PatchProxy.applyVoid(null, this, LiveLitePlayerViewController$b.class, "1")) {
          return;
       }
       a.f(this);
       LiteColdStartFinishReporter d = LiteColdStartFinishReporter.d;
       LiveLitePlayerViewController q = this.b.q;
       QPhoto qPhoto = new QPhoto(this.b.l.mEntity);
       Objects.requireNonNull(d);
       if (!PatchProxy.applyVoidTwoRefs(q, qPhoto, d, LiteColdStartFinishReporter.class, "2")) {
          a.p(q, "fragment");
          a.p(qPhoto, "photo");
          if (d.a() && !LiteColdStartFinishReporter.c) {
             LiteColdStartFinishReporter.c = true;
             a b = LiteColdStartFinishReporter.b;
             if (b != null) {
                b = new a(b);
             }
             b.Z(b, "onSlideFirstFrameSuccess, "+qPhoto.getPhotoId());
             b.a(0x8708467).n(q, true, qPhoto);
          }
       }
       return;
    }
}
