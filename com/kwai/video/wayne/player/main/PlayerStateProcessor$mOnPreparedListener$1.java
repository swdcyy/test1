package com.kwai.video.wayne.player.main.PlayerStateProcessor$mOnPreparedListener$1;
import com.kwai.video.player.IMediaPlayer$OnPreparedListener;
import com.kwai.video.wayne.player.main.PlayerStateProcessor;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.wayne.player.main.AbsKpMidProcessor;
import java.lang.StringBuilder;
import com.kwai.video.wayne.player.util.DebugLog;
import com.kwai.video.wayne.player.main.WaynePlayer;
import com.kwai.video.wayne.player.logreport.KPMidTrace;
import com.kwai.video.wayne.player.main.PlayerState;

public final class PlayerStateProcessor$mOnPreparedListener$1 implements IMediaPlayer$OnPreparedListener	// class@000d85
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
       DebugLog.i(this.this$0.getLogTag(), "onprepared mStartOnPrepared "+this.this$0.mStartOnPrepared);
       this.this$0.getMediaPlayer().getMKPMidTrace().addStamp("prepared");
       this.this$0.notifyStateChanged$kp_mid_release(PlayerState.Prepared, false);
       if (this.this$0.mStartOnPrepared != null) {
          try{
             p0.start();
             this.this$0.notifyStateChanged$kp_mid_release(PlayerState.Playing, false);
             p0.mStartOnPrepared = false;
          }catch(java.lang.IllegalStateException e0){
             DebugLog.e(this.this$0.getLogTag(), " start IllegalStateException ");
          }
       }
    }
}
