package com.kwai.video.waynelive.wayneplayer.LivePlayerStatusMonitorImpl$LiveExtraInfoListener;
import com.kwai.video.player.IKwaiMediaPlayer$OnLiveExtraInfoListener;
import com.kwai.video.waynelive.wayneplayer.LivePlayerStatusMonitorImpl;
import java.lang.Object;
import com.kwai.video.waynelive.wayneplayer.LivePlayerStatusMonitorImpl$1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.Iterator;
import java.util.List;

public class LivePlayerStatusMonitorImpl$LiveExtraInfoListener implements IKwaiMediaPlayer$OnLiveExtraInfoListener	// class@000e2b
{
    public final LivePlayerStatusMonitorImpl this$0;

    public void LivePlayerStatusMonitorImpl$LiveExtraInfoListener(LivePlayerStatusMonitorImpl p0){
       this.this$0 = p0;
       super();
    }
    public void LivePlayerStatusMonitorImpl$LiveExtraInfoListener(LivePlayerStatusMonitorImpl p0,LivePlayerStatusMonitorImpl$1 p1){
       super(p0);
    }
    public void onLiveTypeChangeExtra(int p0){
       LivePlayerStatusMonitorImpl$LiveExtraInfoListener liveExtraInf = LivePlayerStatusMonitorImpl$LiveExtraInfoListener.class;
       if (PatchProxy.isSupport(liveExtraInf) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, liveExtraInf, "2")) {
          return;
       }
       Iterator iterator = this.this$0.mLiveExtraInfoListeners.iterator();
       while (iterator.hasNext()) {
          iterator.next().onLiveTypeChangeExtra(p0);
       }
       return;
    }
    public void onVideoSizeChangeExtra(int p0,int p1){
       LivePlayerStatusMonitorImpl$LiveExtraInfoListener liveExtraInf = LivePlayerStatusMonitorImpl$LiveExtraInfoListener.class;
       if (PatchProxy.isSupport(liveExtraInf) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, liveExtraInf, "1")) {
          return;
       }
       Iterator iterator = this.this$0.mLiveExtraInfoListeners.iterator();
       while (iterator.hasNext()) {
          iterator.next().onVideoSizeChangeExtra(p0, p1);
       }
       return;
    }
}
