package com.kwai.video.waynelive.wayneplayer.WayneLivePlayer$UrlSwitchListener;
import com.kwai.video.waynelive.datasource.LiveUrlSwitchListener;
import com.kwai.video.waynelive.wayneplayer.WayneLivePlayer;
import java.lang.Object;
import com.kwai.video.waynelive.wayneplayer.WayneLivePlayer$1;
import com.kwai.video.waynelive.datasource.LiveUrlSwitchReason;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.waynelive.debug.DebugLog;
import com.kwai.video.waynelive.wayneplayer.LivePlayerStatusMonitorImpl;
import java.util.Iterator;
import java.util.List;
import com.kwai.video.waynelive.wayneplayer.StaticsProcessor;
import com.kwai.video.waynelive.LiveRestartReason;
import java.lang.StringBuilder;

public class WayneLivePlayer$UrlSwitchListener implements LiveUrlSwitchListener	// class@000e4e
{
    public final WayneLivePlayer this$0;

    public void WayneLivePlayer$UrlSwitchListener(WayneLivePlayer p0){
       this.this$0 = p0;
       super();
    }
    public void WayneLivePlayer$UrlSwitchListener(WayneLivePlayer p0,WayneLivePlayer$1 p1){
       super(p0);
    }
    public void onUrlSwitchFail(LiveUrlSwitchReason p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WayneLivePlayer$UrlSwitchListener.class, "2")) {
          return;
       }
       DebugLog.i(this.this$0.getTag(), "onUrlSwitchFail, restartPlay");
       WayneLivePlayer$UrlSwitchListener tthis$0 = this.this$0;
       tthis$0.mRetryReason = p0.mRetryReason;
       Iterator iterator = tthis$0.mLiveUrlSwitchListenerList.iterator();
       while (iterator.hasNext()) {
          iterator.next().onUrlSwitchFail(p0);
       }
       this.this$0.getProcessor(StaticsProcessor.class).onBeforRetry(p0.mReleaseReason);
       this.this$0.setPlayerReleaseReason(p0.mReleaseReason);
       this.this$0.restartPlay(LiveRestartReason.PULL_STREAM_FAIL);
       return;
    }
    public void onUrlSwitchSuccess(LiveUrlSwitchReason p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WayneLivePlayer$UrlSwitchListener.class, "1")) {
          return;
       }
       DebugLog.i(this.this$0.getTag(), "onUrlSwitchSuccess, startPlay");
       WayneLivePlayer$UrlSwitchListener tthis$0 = this.this$0;
       tthis$0.mTotalRetryCount = tthis$0.mTotalRetryCount + 1;
       tthis$0.mRetryReason = p0.mRetryReason;
       Iterator iterator = tthis$0.mLiveUrlSwitchListenerList.iterator();
       while (iterator.hasNext()) {
          iterator.next().onUrlSwitchSuccess(p0);
       }
       this.this$0.getProcessor(StaticsProcessor.class).onBeforRetry(p0.mReleaseReason);
       this.this$0.setPlayerReleaseReason(p0.mReleaseReason);
       this.this$0.mRecreateReason = "UrlSwitch-"+p0.mReleaseReason;
       this.this$0.startPlay();
       return;
    }
}
