package com.kwai.video.aemonplayer.AemonMediaPlayerAdapter$5;
import com.kwai.video.aemonplayer.AemonMediaPlayerListener$OnErrorListener;
import com.kwai.video.aemonplayer.AemonMediaPlayerAdapter;
import java.lang.Object;
import com.kwai.video.aemonplayer.AemonMediaPlayer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.video.player.AbstractMediaPlayer;

public class AemonMediaPlayerAdapter$5 implements AemonMediaPlayerListener$OnErrorListener	// class@0019a5
{
    public final AemonMediaPlayerAdapter this$0;

    public void AemonMediaPlayerAdapter$5(AemonMediaPlayerAdapter p0){
       this.this$0 = p0;
       super();
    }
    public boolean onError(AemonMediaPlayer p0,int p1,int p2){
       if (PatchProxy.isSupport(AemonMediaPlayerAdapter$5.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, AemonMediaPlayerAdapter$5.class, "1");
          if (p0 != PatchProxyResult.class) {
             return p0.booleanValue();
          }
       }
       this.this$0.stayAwake(false);
       return this.this$0.notifyOnError(p1, p2);
    }
}
