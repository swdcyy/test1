package com.kwai.video.stannis.Stannis$KWStannisConfig;
import com.kwai.video.stannis.Stannis;
import java.lang.Object;

public class Stannis$KWStannisConfig	// class@000bde
{
    public long activeSpeakerForceNotifyInterval;
    public long activeSpeakerHangOverInterval;
    public int audioChannel;
    public int audioOutputChannel;
    public int dumpFlag;
    public String dumpPath;
    public boolean enableAudioVad;
    public int qosFlag;
    public int qosUploadInterval;
    public final Stannis this$0;
    public boolean useExternalDevice;

    public void Stannis$KWStannisConfig(Stannis p0){
       this.this$0 = p0;
       super();
       this.dumpPath = "";
       this.dumpFlag = 0;
       this.qosFlag = 3;
       this.qosUploadInterval = 0x2710;
       this.enableAudioVad = false;
       this.activeSpeakerHangOverInterval = 500;
       this.activeSpeakerForceNotifyInterval = 0;
       this.useExternalDevice = false;
       this.audioChannel = 1;
       this.audioOutputChannel = 1;
    }
}
