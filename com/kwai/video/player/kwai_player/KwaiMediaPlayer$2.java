package com.kwai.video.player.kwai_player.KwaiMediaPlayer$2;
import com.kwai.video.player.kwai_player.KwaiMediaPlayer$IHeadTrackerListener;
import com.kwai.video.player.kwai_player.KwaiMediaPlayer;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;

public class KwaiMediaPlayer$2 implements KwaiMediaPlayer$IHeadTrackerListener	// class@000b35
{
    public final KwaiMediaPlayer this$0;

    public void KwaiMediaPlayer$2(KwaiMediaPlayer p0){
       this.this$0 = p0;
       super();
    }
    public void onHeadTracker(float p0,float p1,float p2){
       if (PatchProxy.isSupport(KwaiMediaPlayer$2.class) && PatchProxy.applyVoidThreeRefs(Float.valueOf(p0), Float.valueOf(p1), Float.valueOf(p2), this, KwaiMediaPlayer$2.class, "1")) {
          return;
       }
       this.this$0.setHeadTracker(p0, p1, p2);
       return;
    }
}
