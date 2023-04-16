package com.kwai.video.player.kwai_player.KwaiMediaPlayer$1;
import java.lang.Runnable;
import com.kwai.video.player.kwai_player.KwaiMediaPlayer;
import ai7.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.player.qos.KwaiPlayerResultQos;

public class KwaiMediaPlayer$1 implements Runnable	// class@000b34
{
    public final KwaiMediaPlayer this$0;
    public final e val$listener;

    public void KwaiMediaPlayer$1(KwaiMediaPlayer p0,e p1){
       this.this$0 = p0;
       this.val$listener = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, KwaiMediaPlayer$1.class, "1")) {
          return;
       }
       this.this$0.shutdownWaitStop();
       if (this.val$listener != null) {
          this.val$listener.onRelease(this.this$0._getResultQos());
       }
       this.this$0.release();
       return;
    }
}
