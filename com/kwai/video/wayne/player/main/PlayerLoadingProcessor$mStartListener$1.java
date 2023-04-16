package com.kwai.video.wayne.player.main.PlayerLoadingProcessor$mStartListener$1;
import com.kwai.video.wayne.player.listeners.OnStartListener;
import com.kwai.video.wayne.player.main.PlayerLoadingProcessor;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.wayne.player.main.LoadingType;

public final class PlayerLoadingProcessor$mStartListener$1 implements OnStartListener	// class@000d7d
{
    public final PlayerLoadingProcessor this$0;

    public void PlayerLoadingProcessor$mStartListener$1(PlayerLoadingProcessor p0){
       this.this$0 = p0;
       super();
    }
    public final void onStart(){
       if (PatchProxy.applyVoid(null, this, PlayerLoadingProcessor$mStartListener$1.class, "1")) {
          return;
       }
       if (this.this$0.isBufferingBeforePlay == null && (this.this$0.isSeeking != null || this.this$0.isBuffering != null)) {
          this.this$0.notifyPlayerLoadingChanged(LoadingType.STATE_START, true);
       }else {
          this.this$0.notifyPlayerLoadingChanged(LoadingType.STATE_START, false);
       }
       return;
    }
}
