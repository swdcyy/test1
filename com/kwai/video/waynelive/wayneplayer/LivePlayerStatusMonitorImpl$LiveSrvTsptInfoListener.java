package com.kwai.video.waynelive.wayneplayer.LivePlayerStatusMonitorImpl$LiveSrvTsptInfoListener;
import com.kwai.video.player.IKwaiMediaPlayer$OnLiveSrvTsptInfoListener;
import com.kwai.video.waynelive.wayneplayer.LivePlayerStatusMonitorImpl;
import java.lang.Object;
import com.kwai.video.waynelive.wayneplayer.LivePlayerStatusMonitorImpl$1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.video.waynelive.cache.LivePlayerCacheControllerManager;
import java.util.Iterator;
import java.util.Set;

public class LivePlayerStatusMonitorImpl$LiveSrvTsptInfoListener implements IKwaiMediaPlayer$OnLiveSrvTsptInfoListener	// class@000e2c
{
    public final LivePlayerStatusMonitorImpl this$0;

    public void LivePlayerStatusMonitorImpl$LiveSrvTsptInfoListener(LivePlayerStatusMonitorImpl p0){
       this.this$0 = p0;
       super();
    }
    public void LivePlayerStatusMonitorImpl$LiveSrvTsptInfoListener(LivePlayerStatusMonitorImpl p0,LivePlayerStatusMonitorImpl$1 p1){
       super(p0);
    }
    public void onSrvTsptInfo(byte[] p0,int p1){
       LivePlayerStatusMonitorImpl$LiveSrvTsptInfoListener liveSrvTsptI = LivePlayerStatusMonitorImpl$LiveSrvTsptInfoListener.class;
       if (PatchProxy.isSupport(liveSrvTsptI) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, liveSrvTsptI, "1")) {
          return;
       }
       this.this$0.mLivePlayerCacheControllerManager.onSrvTsptInfoChanged(p0, p1);
       Iterator iterator = this.this$0.mOnLiveSrvTsptInfoListeners.iterator();
       while (iterator.hasNext()) {
          iterator.next().onSrvTsptInfo(p0, p1);
       }
       return;
    }
}
