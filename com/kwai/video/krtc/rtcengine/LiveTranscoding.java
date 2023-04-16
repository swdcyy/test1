package com.kwai.video.krtc.rtcengine.LiveTranscoding;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class LiveTranscoding	// class@0007e4
{
    public int audioBitrate;
    public int audioChannels;
    public int audioCodecProfile;
    public int audioSampleRate;
    public int height;
    public ArrayList transcodingUsers;
    public int videoBitrate;
    public int videoCodecProfile;
    public int videoFramerate;
    public int videoGop;
    public int width;

    public void LiveTranscoding(){
       super();
       this.width = 640;
       this.height = 360;
       this.videoBitrate = 400;
       this.videoFramerate = 15;
       this.videoGop = 30;
       this.videoCodecProfile = 77;
       this.audioBitrate = 48;
       this.audioChannels = 1;
       this.audioSampleRate = 0xac44;
       this.audioCodecProfile = 0;
       this.transcodingUsers = new ArrayList();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveTranscoding.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveTranscoding{width="+this.width+", height="+this.height+", videoBitrate="+this.videoBitrate+", videoFramerate="+this.videoFramerate+", videoGop="+this.videoGop+", videoCodecProfile="+this.videoCodecProfile+", audioBitrate="+this.audioBitrate+", audioChannels="+this.audioChannels+", audioSampleRate="+this.audioSampleRate+", audioCodecProfile="+this.audioCodecProfile+", transcodingUsers="+this.transcodingUsers+'}';
    }
}
