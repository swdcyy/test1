package com.kwai.video.aemonplayer.AemonMediaPlayerAdapter$15;
import java.lang.Runnable;
import com.kwai.video.aemonplayer.AemonMediaPlayerAdapter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.player.AbstractMediaPlayer;

public class AemonMediaPlayerAdapter$15 implements Runnable	// class@0019a0
{
    public final AemonMediaPlayerAdapter this$0;
    public final int val$extra;
    public final int val$what;

    public void AemonMediaPlayerAdapter$15(AemonMediaPlayerAdapter p0,int p1,int p2){
       this.this$0 = p0;
       this.val$what = p1;
       this.val$extra = p2;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, AemonMediaPlayerAdapter$15.class, "1")) {
          return;
       }
       this.this$0.notifyOnInfo(this.val$what, this.val$extra);
       return;
    }
}
