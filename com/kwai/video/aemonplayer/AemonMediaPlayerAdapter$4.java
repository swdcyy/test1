package com.kwai.video.aemonplayer.AemonMediaPlayerAdapter$4;
import com.kwai.video.aemonplayer.AemonMediaPlayerListener$OnSeekCompleteListener;
import com.kwai.video.aemonplayer.AemonMediaPlayerAdapter;
import java.lang.Object;
import com.kwai.video.aemonplayer.AemonMediaPlayer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.player.AbstractMediaPlayer;

public class AemonMediaPlayerAdapter$4 implements AemonMediaPlayerListener$OnSeekCompleteListener	// class@0019a4
{
    public final AemonMediaPlayerAdapter this$0;

    public void AemonMediaPlayerAdapter$4(AemonMediaPlayerAdapter p0){
       this.this$0 = p0;
       super();
    }
    public void onSeekComplete(AemonMediaPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AemonMediaPlayerAdapter$4.class, "1")) {
          return;
       }
       this.this$0.notifyOnSeekComplete();
       return;
    }
}
