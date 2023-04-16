package com.kwai.video.wayne.player.main.PlayerLoadingProcessor$seekRunable$1;
import java.lang.Runnable;
import com.kwai.video.wayne.player.main.PlayerLoadingProcessor;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.wayne.player.main.LoadingType;

public final class PlayerLoadingProcessor$seekRunable$1 implements Runnable	// class@000d80
{
    public final PlayerLoadingProcessor this$0;

    public void PlayerLoadingProcessor$seekRunable$1(PlayerLoadingProcessor p0){
       this.this$0 = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, PlayerLoadingProcessor$seekRunable$1.class, "1")) {
          return;
       }
       this.this$0.isSeeking = true;
       this.this$0.notifyPlayerLoadingChanged(LoadingType.STATE_SEEKSTART, true);
       return;
    }
}
