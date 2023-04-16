package com.kwai.video.aemonplayer.AemonMediaPlayerAdapter$1;
import com.kwai.video.aemonplayer.AemonMediaPlayerListener$OnPreparedListener;
import com.kwai.video.aemonplayer.AemonMediaPlayerAdapter;
import java.lang.Object;
import com.kwai.video.aemonplayer.AemonMediaPlayer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.player.AbstractMediaPlayer;

public class AemonMediaPlayerAdapter$1 implements AemonMediaPlayerListener$OnPreparedListener	// class@0019a1
{
    public final AemonMediaPlayerAdapter this$0;

    public void AemonMediaPlayerAdapter$1(AemonMediaPlayerAdapter p0){
       this.this$0 = p0;
       super();
    }
    public void onPrepared(AemonMediaPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AemonMediaPlayerAdapter$1.class, "1")) {
          return;
       }
       this.this$0.notifyOnPrepared();
       return;
    }
}
