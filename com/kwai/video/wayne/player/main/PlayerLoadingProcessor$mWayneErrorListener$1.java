package com.kwai.video.wayne.player.main.PlayerLoadingProcessor$mWayneErrorListener$1;
import com.kwai.video.wayne.player.listeners.OnWayneErrorListener;
import com.kwai.video.wayne.player.main.PlayerLoadingProcessor;
import java.lang.Object;
import com.kwai.video.wayne.player.main.RetryInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.kwai.video.wayne.player.util.DebugLog;

public final class PlayerLoadingProcessor$mWayneErrorListener$1 implements OnWayneErrorListener	// class@000d7e
{
    public final PlayerLoadingProcessor this$0;

    public void PlayerLoadingProcessor$mWayneErrorListener$1(PlayerLoadingProcessor p0){
       this.this$0 = p0;
       super();
    }
    public final void onWayneError(RetryInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlayerLoadingProcessor$mWayneErrorListener$1.class, "1")) {
          return;
       }
       DebugLog.i(this.this$0.getLogTag(), "on wayne error, mEnablePbDurationFix = "+this.this$0.mEnablePbDurationFix);
       PlayerLoadingProcessor$mWayneErrorListener$1 tthis$0 = this.this$0;
       if (tthis$0.mEnablePbDurationFix != null) {
          tthis$0.checkIsActualPlaying();
       }
       this.this$0.resetState();
       return;
    }
}
