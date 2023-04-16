package com.kwai.video.waynelive.wayneplayer.PlayerStateProcessor$mOnPreparedListener$1;
import com.kwai.video.player.IMediaPlayer$OnPreparedListener;
import com.kwai.video.waynelive.wayneplayer.PlayerStateProcessor;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.waynelive.wayneplayer.AbsWayneProcessor;
import com.kwai.video.waynelive.wayneplayer.WayneLivePlayer;
import com.kwai.video.waynelive.wayneplayer.WayneTrace;
import com.kwai.video.waynelive.LivePlayerState;

public final class PlayerStateProcessor$mOnPreparedListener$1 implements IMediaPlayer$OnPreparedListener	// class@000e31
{
    public final PlayerStateProcessor this$0;

    public void PlayerStateProcessor$mOnPreparedListener$1(PlayerStateProcessor p0){
       this.this$0 = p0;
       super();
    }
    public final void onPrepared(IMediaPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlayerStateProcessor$mOnPreparedListener$1.class, "1")) {
          return;
       }
       if (!this.this$0.getHasKernelPlayer()) {
          return;
       }
       this.this$0.getMediaPlayer().mKPMidTrace.addStamp("prepared");
       this.this$0.notifyStateChanged(LivePlayerState.PLAYING, false);
       return;
    }
}
