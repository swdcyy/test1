package com.kwai.video.waynelive.wayneplayer.LivePlayerStatusMonitorImpl$MidOnLiveSeiInfoListener;
import com.kwai.video.player.IKwaiMediaPlayer$OnLiveSeiInfoListener;
import com.kwai.video.waynelive.wayneplayer.LivePlayerStatusMonitorImpl;
import java.lang.Object;
import com.kwai.video.waynelive.wayneplayer.LivePlayerStatusMonitorImpl$1;
import com.kwai.video.waynelive.util.SeiExtraData;
import java.lang.String;
import com.kwai.video.waynelive.debug.DebugLog;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.video.waynelive.cache.LivePlayerCacheControllerManager;
import mw7.f;
import java.lang.Runnable;
import ekd.k1;
import java.util.Iterator;
import java.util.List;

public class LivePlayerStatusMonitorImpl$MidOnLiveSeiInfoListener implements IKwaiMediaPlayer$OnLiveSeiInfoListener	// class@000e2d
{
    public final LivePlayerStatusMonitorImpl this$0;

    public void LivePlayerStatusMonitorImpl$MidOnLiveSeiInfoListener(LivePlayerStatusMonitorImpl p0){
       this.this$0 = p0;
       super();
    }
    public void LivePlayerStatusMonitorImpl$MidOnLiveSeiInfoListener(LivePlayerStatusMonitorImpl p0,LivePlayerStatusMonitorImpl$1 p1){
       super(p0);
    }
    public static void b(LivePlayerStatusMonitorImpl$MidOnLiveSeiInfoListener p0,byte[] p1,int p2,int p3){
       p0.lambda$onSeiInfo$0(p1, p2, p3);
    }
    private void lambda$onSeiInfo$0(byte[] p0,int p1,int p2){
       this.this$0.mPkSeiCache = new SeiExtraData(p0, p1);
       LivePlayerStatusMonitorImpl mPkSeiListen = this.this$0.mPkSeiListener;
       if (mPkSeiListen != null) {
          DebugLog.i("PkSeiListener", mPkSeiListen.toString());
          this.this$0.mPkSeiListener.onSeiInfo(p0, p2, p1);
       }
       return;
    }
    public void onSeiInfo(byte[] p0,int p1,int p2){
       if (PatchProxy.isSupport(LivePlayerStatusMonitorImpl$MidOnLiveSeiInfoListener.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, LivePlayerStatusMonitorImpl$MidOnLiveSeiInfoListener.class, "1")) {
          return;
       }
       SeiExtraData seiExtraData = new SeiExtraData(p0, p2);
       this.this$0.mLatestSeiExtraData = seiExtraData;
       this.this$0.mLivePlayerCacheControllerManager.onSeiExtraDataChanged(seiExtraData);
       k1.p(new f(this, p0, p2, p1), this.this$0);
       DebugLog.i("onSeiInfo", this.this$0.mLivePlayerSeiInfoListeners.toString());
       Iterator iterator = this.this$0.mLivePlayerSeiInfoListeners.iterator();
       while (iterator.hasNext()) {
          iterator.next().onSeiInfo(p0, p1, p2);
       }
       return;
    }
}
