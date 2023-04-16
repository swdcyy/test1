package com.kwai.video.waynelive.wayneplayer.WayneLivePlayer$PreparedListener;
import com.kwai.video.player.IMediaPlayer$OnPreparedListener;
import com.kwai.video.waynelive.wayneplayer.WayneLivePlayer;
import java.lang.Object;
import com.kwai.video.waynelive.wayneplayer.WayneLivePlayer$1;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.waynelive.wayneplayer.LivePlayerStatusMonitorImpl;
import java.util.ArrayList;
import com.kwai.video.waynelive.LivePlayerState;
import java.util.List;
import com.kwai.video.player.IKwaiMediaPlayer;
import com.kwai.video.waynelive.qosmoniter.LivePlayerQosMonitor;
import java.lang.System;

public class WayneLivePlayer$PreparedListener implements IMediaPlayer$OnPreparedListener	// class@000e4a
{
    public final WayneLivePlayer this$0;

    public void WayneLivePlayer$PreparedListener(WayneLivePlayer p0){
       this.this$0 = p0;
       super();
    }
    public void WayneLivePlayer$PreparedListener(WayneLivePlayer p0,WayneLivePlayer$1 p1){
       super(p0);
    }
    public void onPrepared(IMediaPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WayneLivePlayer$PreparedListener.class, "1")) {
          return;
       }
       if (!this.this$0.isDestroyed()) {
          WayneLivePlayer$PreparedListener tthis$0 = this.this$0;
          if (tthis$0.mLiveMediaPlayer != null) {
             tthis$0.moveToState(new ArrayList(), LivePlayerState.PLAYING);
             tthis$0 = this.this$0;
             tthis$0.mLivePlayerQosMonitor.startMonitor(tthis$0.mLiveMediaPlayer);
             tthis$0.mStartPlayTimeMs = System.currentTimeMillis();
          }
       }
       return;
    }
}
