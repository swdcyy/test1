package com.kwai.video.waynelive.wayneplayer.WayneLivePlayer$LiveEventListener;
import com.kwai.video.player.IMediaPlayer$OnLiveEventListener;
import com.kwai.video.waynelive.wayneplayer.WayneLivePlayer;
import java.lang.Object;
import com.kwai.video.waynelive.wayneplayer.WayneLivePlayer$1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.waynelive.wayneplayer.LivePlayerStatusMonitorImpl;
import com.kwai.video.waynelive.cache.LivePlayerCacheControllerManager;
import java.util.Iterator;
import java.util.List;
import com.kwai.video.waynelive.listeners.LivePlayerEventListener;

public class WayneLivePlayer$LiveEventListener implements IMediaPlayer$OnLiveEventListener	// class@000e48
{
    public final WayneLivePlayer this$0;

    public void WayneLivePlayer$LiveEventListener(WayneLivePlayer p0){
       this.this$0 = p0;
       super();
    }
    public void WayneLivePlayer$LiveEventListener(WayneLivePlayer p0,WayneLivePlayer$1 p1){
       super(p0);
    }
    public void onLiveEventChange(byte[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WayneLivePlayer$LiveEventListener.class, "1")) {
          return;
       }
       WayneLivePlayer$LiveEventListener tthis$0 = this.this$0;
       tthis$0.mLatestAACExtraData = p0;
       tthis$0.mLivePlayerCacheControllerManager.onAACChanged(p0);
       Iterator iterator = this.this$0.mLiveEventListenerList.iterator();
       while (iterator.hasNext()) {
          iterator.next().onLiveEventChange(p0);
       }
       tthis$0 = this.this$0;
       if (tthis$0.mLiveRtcActiveSpeakerChangedListener != null) {
          tthis$0.onReceiveLiveData(p0);
       }
       return;
    }
}
