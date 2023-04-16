package com.kwai.video.krtc.rtcengine.AudioMixingParam;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Object;
import java.lang.RuntimeException;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class AudioMixingParam	// class@0007df
{
    public int bgmId;
    public int bgmStartPos;
    public int cycle;
    public String instanceId;
    public ArrayList keyList;
    public int mixIntoChannelProfile;
    public int mode;
    public int progressIntervalMs;
    public boolean publishBgmOffset;
    public boolean replace;
    public int role;
    public ArrayList urlList;

    public void AudioMixingParam(int p0,ArrayList p1,int p2,int p3,int p4,int p5,String p6){
       super();
       if (p0 != 1) {
          throw new RuntimeException("AudioMixingParam mode must be RtcEngineAudioMixingModeKtv\(1\)");
       }
       this.mode = p0;
       this.urlList = p1;
       this.progressIntervalMs = p2;
       this.role = p3;
       this.bgmId = p4;
       this.bgmStartPos = p5;
       this.instanceId = p6;
       return;
    }
    public void AudioMixingParam(int p0,ArrayList p1,boolean p2,int p3,int p4,int p5,String p6){
       super();
       if (p0) {
          throw new RuntimeException("AudioMixingParam mode must be RtcEngineAudioMixingModeBgm\(0\)");
       }
       this.mode = p0;
       this.urlList = p1;
       this.replace = p2;
       this.cycle = p3;
       this.progressIntervalMs = p4;
       this.mixIntoChannelProfile = p5;
       this.instanceId = p6;
       return;
    }
    public String toString(){
       StringBuilder obj = PatchProxy.apply(null, this, AudioMixingParam.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "AudioMixingParam: {mode="+this.mode+", urlList=";
       AudioMixingParam turlList = this.urlList;
       String str = "";
       String str1 = (turlList != null)? turlList.toString(): str;
       obj = obj+str1+", replace="+this.replace+", cycle="+this.cycle+", progressIntervalMs="+this.progressIntervalMs+", mixIntoChannelProfile="+this.mixIntoChannelProfile+", role="+this.role+", bgmId="+this.bgmId+", bgmStartPos="+this.bgmStartPos+", publishBgmOffset="+this.publishBgmOffset+", keyList=";
       turlList = this.keyList;
       if (turlList != null) {
          str = turlList.toString();
       }
       return obj+str+"}";
    }
}
