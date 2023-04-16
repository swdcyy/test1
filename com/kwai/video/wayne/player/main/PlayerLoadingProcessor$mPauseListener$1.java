package com.kwai.video.wayne.player.main.PlayerLoadingProcessor$mPauseListener$1;
import com.kwai.video.wayne.player.listeners.OnPauseListener;
import com.kwai.video.wayne.player.main.PlayerLoadingProcessor;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.wayne.player.main.LoadingType;

public final class PlayerLoadingProcessor$mPauseListener$1 implements OnPauseListener	// class@000d7c
{
    public final PlayerLoadingProcessor this$0;

    public void PlayerLoadingProcessor$mPauseListener$1(PlayerLoadingProcessor p0){
       this.this$0 = p0;
       super();
    }
    public final void onPause(){
       if (PatchProxy.applyVoid(null, this, PlayerLoadingProcessor$mPauseListener$1.class, "1")) {
          return;
       }
       this.this$0.notifyPlayerLoadingChanged(LoadingType.STATE_PAUSE, false);
       return;
    }
}
