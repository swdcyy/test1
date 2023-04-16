package com.kwai.video.aemonplayer.AemonMediaPlayerAdapter$3;
import com.kwai.video.aemonplayer.AemonMediaPlayerListener$OnBufferingUpdateListener;
import com.kwai.video.aemonplayer.AemonMediaPlayerAdapter;
import java.lang.Object;
import com.kwai.video.aemonplayer.AemonMediaPlayer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.video.player.AbstractMediaPlayer;

public class AemonMediaPlayerAdapter$3 implements AemonMediaPlayerListener$OnBufferingUpdateListener	// class@0019a3
{
    public final AemonMediaPlayerAdapter this$0;

    public void AemonMediaPlayerAdapter$3(AemonMediaPlayerAdapter p0){
       this.this$0 = p0;
       super();
    }
    public void onBufferingUpdate(AemonMediaPlayer p0,int p1){
       if (PatchProxy.isSupport(AemonMediaPlayerAdapter$3.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, AemonMediaPlayerAdapter$3.class, "1")) {
          return;
       }
       this.this$0.notifyOnBufferingUpdate(p1);
       return;
    }
}
