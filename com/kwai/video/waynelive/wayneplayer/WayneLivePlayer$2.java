package com.kwai.video.waynelive.wayneplayer.WayneLivePlayer$2;
import java.lang.Runnable;
import com.kwai.video.waynelive.wayneplayer.WayneLivePlayer;
import java.util.Map;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.waynelive.listeners.OnLiveRtcSpeakerChangedListener;

public class WayneLivePlayer$2 implements Runnable	// class@000e43
{
    public final WayneLivePlayer this$0;
    public final Map val$userVoice;

    public void WayneLivePlayer$2(WayneLivePlayer p0,Map p1){
       this.this$0 = p0;
       this.val$userVoice = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, WayneLivePlayer$2.class, "1")) {
          return;
       }
       WayneLivePlayer mLiveRtcActi = this.this$0.mLiveRtcActiveSpeakerChangedListener;
       if (mLiveRtcActi != null) {
          mLiveRtcActi.onLiveRtcSpeakerChanged(this.val$userVoice);
       }
       return;
    }
}
