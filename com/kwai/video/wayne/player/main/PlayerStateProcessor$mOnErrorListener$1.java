package com.kwai.video.wayne.player.main.PlayerStateProcessor$mOnErrorListener$1;
import com.kwai.video.player.IMediaPlayer$OnErrorListener;
import com.kwai.video.wayne.player.main.PlayerStateProcessor;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.video.wayne.player.main.PlayerState;

public final class PlayerStateProcessor$mOnErrorListener$1 implements IMediaPlayer$OnErrorListener	// class@000d84
{
    public final PlayerStateProcessor this$0;

    public void PlayerStateProcessor$mOnErrorListener$1(PlayerStateProcessor p0){
       this.this$0 = p0;
       super();
    }
    public final boolean onError(IMediaPlayer p0,int p1,int p2){
       if (PatchProxy.isSupport(PlayerStateProcessor$mOnErrorListener$1.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, PlayerStateProcessor$mOnErrorListener$1.class, "1");
          if (p0 != PatchProxyResult.class) {
             return p0.booleanValue();
          }
       }
       this.this$0.notifyStateChanged$kp_mid_release(PlayerState.Error, false);
       return false;
    }
}
