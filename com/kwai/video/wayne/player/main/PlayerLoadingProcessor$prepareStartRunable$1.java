package com.kwai.video.wayne.player.main.PlayerLoadingProcessor$prepareStartRunable$1;
import java.lang.Runnable;
import com.kwai.video.wayne.player.main.PlayerLoadingProcessor;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.wayne.player.main.LoadingType;

public final class PlayerLoadingProcessor$prepareStartRunable$1 implements Runnable	// class@000d7f
{
    public final PlayerLoadingProcessor this$0;

    public void PlayerLoadingProcessor$prepareStartRunable$1(PlayerLoadingProcessor p0){
       this.this$0 = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, PlayerLoadingProcessor$prepareStartRunable$1.class, "1")) {
          return;
       }
       this.this$0.isBufferingBeforePlay = true;
       this.this$0.notifyPlayerLoadingChanged(LoadingType.STATE_PREPARE_START, true);
       return;
    }
}
