package com.kwai.video.aemonplayer.AemonMediaPlayerAdapter$14;
import com.kwai.video.player.kwai_player.KwaiMediaPlayer$IHeadTrackerListener;
import com.kwai.video.aemonplayer.AemonMediaPlayerAdapter;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;

public class AemonMediaPlayerAdapter$14 implements KwaiMediaPlayer$IHeadTrackerListener	// class@00199f
{
    public final AemonMediaPlayerAdapter this$0;

    public void AemonMediaPlayerAdapter$14(AemonMediaPlayerAdapter p0){
       this.this$0 = p0;
       super();
    }
    public void onHeadTracker(float p0,float p1,float p2){
       if (PatchProxy.isSupport(AemonMediaPlayerAdapter$14.class) && PatchProxy.applyVoidThreeRefs(Float.valueOf(p0), Float.valueOf(p1), Float.valueOf(p2), this, AemonMediaPlayerAdapter$14.class, "1")) {
          return;
       }
       this.this$0.setHeadTracker(p0, p1, p2);
       return;
    }
}
