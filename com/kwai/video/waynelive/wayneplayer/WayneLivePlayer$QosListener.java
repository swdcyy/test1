package com.kwai.video.waynelive.wayneplayer.WayneLivePlayer$QosListener;
import com.kwai.video.waynelive.qosmoniter.LivePlayerQosListener;
import com.kwai.video.waynelive.wayneplayer.WayneLivePlayer;
import java.lang.Object;
import com.kwai.video.waynelive.wayneplayer.WayneLivePlayer$1;
import com.kwai.player.qos.KwaiQosInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.waynelive.wayneplayer.LivePlayerStatusMonitorImpl;
import java.util.Iterator;
import java.util.List;
import com.kwai.video.waynelive.qosmoniter.QosLowReason;
import com.kwai.video.waynelive.debug.DebugLog;
import com.kwai.video.waynelive.wayneplayer.LiveDataSourceProvider;

public class WayneLivePlayer$QosListener implements LivePlayerQosListener	// class@000e4b
{
    public final WayneLivePlayer this$0;

    public void WayneLivePlayer$QosListener(WayneLivePlayer p0){
       this.this$0 = p0;
       super();
    }
    public void WayneLivePlayer$QosListener(WayneLivePlayer p0,WayneLivePlayer$1 p1){
       super(p0);
    }
    public void onTickQosInfo(KwaiQosInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WayneLivePlayer$QosListener.class, "1")) {
          return;
       }
       Iterator iterator = this.this$0.mLivePlayerQosListenerList.iterator();
       while (iterator.hasNext()) {
          iterator.next().onTickQosInfo(p0);
       }
       return;
    }
    public void qosTooLow(QosLowReason p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WayneLivePlayer$QosListener.class, "2")) {
          return;
       }
       DebugLog.i(this.this$0.getTag(), "qosTooLow");
       Iterator iterator = this.this$0.mLivePlayerQosListenerList.iterator();
       while (iterator.hasNext()) {
          iterator.next().qosTooLow(p0);
       }
       this.this$0.mLiveDataSourceManager.trySwitchPlayUrlWhenQosLow(p0);
       return;
    }
}
