package com.kwai.video.waynelive.wayneplayer.WayneLivePlayer$LiveInterActiveListener;
import com.kwai.video.player.IKwaiMediaPlayer$OnLiveInterActiveListener;
import com.kwai.video.waynelive.wayneplayer.WayneLivePlayer;
import java.lang.Object;
import com.kwai.video.waynelive.wayneplayer.WayneLivePlayer$1;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Integer;
import com.kwai.video.waynelive.wayneplayer.LivePlayerStatusMonitorImpl;
import java.util.Iterator;
import java.util.List;
import com.kwai.video.waynelive.cache.LivePlayerCacheControllerManager;
import com.kwai.video.waynelive.wayneplayer.StaticsProcessor;

public class WayneLivePlayer$LiveInterActiveListener implements IKwaiMediaPlayer$OnLiveInterActiveListener	// class@000e49
{
    public final WayneLivePlayer this$0;

    public void WayneLivePlayer$LiveInterActiveListener(WayneLivePlayer p0){
       this.this$0 = p0;
       super();
    }
    public void WayneLivePlayer$LiveInterActiveListener(WayneLivePlayer p0,WayneLivePlayer$1 p1){
       super(p0);
    }
    public void onParseAdSei(long p0,int p1,String p2){
       if (PatchProxy.isSupport(WayneLivePlayer$LiveInterActiveListener.class) && PatchProxy.applyVoidThreeRefs(Long.valueOf(p0), Integer.valueOf(p1), p2, this, WayneLivePlayer$LiveInterActiveListener.class, "2")) {
          return;
       }
       Iterator iterator = this.this$0.mLiveInterActiveListenerList.iterator();
       while (iterator.hasNext()) {
          iterator.next().onParseAdSei(p0, p1, p2);
       }
       return;
    }
    public void onTsptInfo(byte[] p0,int p1){
       WayneLivePlayer$LiveInterActiveListener liveInterAct = WayneLivePlayer$LiveInterActiveListener.class;
       if (PatchProxy.isSupport(liveInterAct) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, liveInterAct, "3")) {
          return;
       }
       liveInterAct = this.this$0;
       liveInterAct.mLatestTsptExtraData = p0;
       liveInterAct.mLivePlayerCacheControllerManager.onInterActiveTsptInfoChanged(p0, p1);
       Iterator iterator = this.this$0.mLiveInterActiveListenerList.iterator();
       while (iterator.hasNext()) {
          iterator.next().onTsptInfo(p0, p1);
       }
       return;
    }
    public void onVideoFrameRender(long p0){
       WayneLivePlayer$LiveInterActiveListener liveInterAct = WayneLivePlayer$LiveInterActiveListener.class;
       if (PatchProxy.isSupport(liveInterAct) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, liveInterAct, "1")) {
          return;
       }
       this.this$0.getProcessor(StaticsProcessor.class).onVideoFrameRenderInterActive();
       Iterator iterator = this.this$0.mLiveInterActiveListenerList.iterator();
       while (iterator.hasNext()) {
          iterator.next().onVideoFrameRender(p0);
       }
       return;
    }
}
