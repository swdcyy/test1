package com.kwai.video.player.kwai_player.KwaiSystemMediaPlayer$1;
import java.lang.Runnable;
import com.kwai.video.player.kwai_player.KwaiSystemMediaPlayer;
import ai7.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.player.kwai_player.KwaiSystemPlayerQos;
import com.kwai.player.qos.KwaiPlayerResultQos;

public class KwaiSystemMediaPlayer$1 implements Runnable	// class@000b46
{
    public final KwaiSystemMediaPlayer this$0;
    public final e val$listener;

    public void KwaiSystemMediaPlayer$1(KwaiSystemMediaPlayer p0,e p1){
       this.this$0 = p0;
       this.val$listener = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, KwaiSystemMediaPlayer$1.class, "1")) {
          return;
       }
       this.this$0.mKwaiQos.onAliveDuration();
       KwaiPlayerResultQos kwaiPlayerRe = new KwaiPlayerResultQos();
       kwaiPlayerRe.briefVideoStatJson = this.this$0.getBriefVodStatJson();
       kwaiPlayerRe.videoStatJson = this.this$0.getVodStatJson();
       kwaiPlayerRe.videoAvgFps = this.this$0.getVideoAvgFps();
       this.this$0.shutdownWaitStop();
       this.this$0.release();
       KwaiSystemMediaPlayer$1 tval$listene = this.val$listener;
       if (tval$listene != null) {
          tval$listene.onRelease(kwaiPlayerRe);
       }
       return;
    }
}
