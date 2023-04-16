package com.kwai.video.aemonplayer.AemonMediaPlayerAdapter$2;
import com.kwai.video.aemonplayer.AemonMediaPlayerListener$OnCompletionListener;
import com.kwai.video.aemonplayer.AemonMediaPlayerAdapter;
import java.lang.Object;
import com.kwai.video.aemonplayer.AemonMediaPlayer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.player.AbstractMediaPlayer;

public class AemonMediaPlayerAdapter$2 implements AemonMediaPlayerListener$OnCompletionListener	// class@0019a2
{
    public final AemonMediaPlayerAdapter this$0;

    public void AemonMediaPlayerAdapter$2(AemonMediaPlayerAdapter p0){
       this.this$0 = p0;
       super();
    }
    public void onCompletion(AemonMediaPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AemonMediaPlayerAdapter$2.class, "1")) {
          return;
       }
       this.this$0.notifyOnCompletion();
       this.this$0.stayAwake(false);
       return;
    }
}
