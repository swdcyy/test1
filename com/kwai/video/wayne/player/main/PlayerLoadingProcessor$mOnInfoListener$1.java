package com.kwai.video.wayne.player.main.PlayerLoadingProcessor$mOnInfoListener$1;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import com.kwai.video.wayne.player.main.PlayerLoadingProcessor;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.video.wayne.player.main.LoadingType;
import com.kwai.video.wayne.player.main.WaynePlayer;
import com.kwai.video.wayne.player.main.AbsKpMidProcessor;
import com.kwai.video.wayne.player.logreport.KPMidTrace;

public final class PlayerLoadingProcessor$mOnInfoListener$1 implements IMediaPlayer$OnInfoListener	// class@000d7a
{
    public final PlayerLoadingProcessor this$0;

    public void PlayerLoadingProcessor$mOnInfoListener$1(PlayerLoadingProcessor p0){
       this.this$0 = p0;
       super();
    }
    public final boolean onInfo(IMediaPlayer p0,int p1,int p2){
       if (PatchProxy.isSupport(PlayerLoadingProcessor$mOnInfoListener$1.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, PlayerLoadingProcessor$mOnInfoListener$1.class, "1");
          if (p0 != PatchProxyResult.class) {
             return p0.booleanValue();
          }
       }
       if (p1 != 3) {
          if (p1 != 0x2777) {
             if (p1 != 701) {
                if (p1 != 702) {
                   switch (p1){
                       case 0x2712:
                         this.this$0.firstFrame();
                         break;
                       case 0x2713:
                         this.this$0.seekComplete();
                         break;
                       case 0x2714:
                         this.this$0.seekComplete();
                         break;
                       default:
                   }
                }else {
                   p0.isBuffering = false;
                   this.this$0.notifyPlayerLoadingChanged(LoadingType.STATE_BUFFEREND, false);
                }
             }else {
                p0.isBuffering = true;
                this.this$0.notifyPlayerLoadingChanged(LoadingType.STATE_BUFFERSTART, true);
             }
          }else {
             this.this$0.checkIsActualPlaying();
          }
       }else {
          this.this$0.firstFrame();
          this.this$0.getMediaPlayer().getMKPMidTrace().addStamp("rendered");
       }
       return false;
    }
}
