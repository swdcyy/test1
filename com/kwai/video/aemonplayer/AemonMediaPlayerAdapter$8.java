package com.kwai.video.aemonplayer.AemonMediaPlayerAdapter$8;
import com.kwai.video.aemonplayer.AemonMediaPlayerListener$OnRenderingStartListener;
import com.kwai.video.aemonplayer.AemonMediaPlayerAdapter;
import java.lang.Object;
import com.kwai.video.aemonplayer.AemonMediaPlayer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.video.player.AbstractMediaPlayer;

public class AemonMediaPlayerAdapter$8 implements AemonMediaPlayerListener$OnRenderingStartListener	// class@0019a8
{
    public final AemonMediaPlayerAdapter this$0;

    public void AemonMediaPlayerAdapter$8(AemonMediaPlayerAdapter p0){
       this.this$0 = p0;
       super();
    }
    public void onRenderingStart(AemonMediaPlayer p0,int p1,int p2){
       if (PatchProxy.isSupport(AemonMediaPlayerAdapter$8.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, AemonMediaPlayerAdapter$8.class, "1")) {
          return;
       }
       this.this$0.notifyOnRenderingStart(p1, p2);
       return;
    }
}
