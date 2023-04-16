package com.kwai.video.krtc.rtcengine.RtcEngineAudioVolumeInfo;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class RtcEngineAudioVolumeInfo	// class@0007ef
{
    public String channelId;
    public String uid;
    public int vad;
    public int volume;

    public void RtcEngineAudioVolumeInfo(String p0,String p1,int p2,int p3){
       super();
       this.channelId = p0;
       this.uid = p1;
       this.volume = p2;
       this.vad = p3;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, RtcEngineAudioVolumeInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "RtcEngineAudioVolumeInfo{channelId=\'"+this.channelId+'''+", uid="+this.uid+", volume="+this.volume+", vad="+this.vad+'}';
    }
}
