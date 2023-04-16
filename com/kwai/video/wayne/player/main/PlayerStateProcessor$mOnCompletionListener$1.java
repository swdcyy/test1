package com.kwai.video.wayne.player.main.PlayerStateProcessor$mOnCompletionListener$1;
import com.kwai.video.player.IMediaPlayer$OnCompletionListener;
import com.kwai.video.wayne.player.main.PlayerStateProcessor;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.wayne.player.main.PlayerState;

public final class PlayerStateProcessor$mOnCompletionListener$1 implements IMediaPlayer$OnCompletionListener	// class@000d83
{
    public final PlayerStateProcessor this$0;

    public void PlayerStateProcessor$mOnCompletionListener$1(PlayerStateProcessor p0){
       this.this$0 = p0;
       super();
    }
    public final void onCompletion(IMediaPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlayerStateProcessor$mOnCompletionListener$1.class, "1")) {
          return;
       }
       this.this$0.notifyStateChanged$kp_mid_release(PlayerState.Completion, false);
       return;
    }
}
