package com.kwai.video.krtc.Arya$LiveStreamParam;
import java.lang.Object;

public class Arya$LiveStreamParam	// class@00068b
{
    public boolean audioOnly;
    public String callId;
    public String edgeRoomIp;
    public int edgeRoomPort;
    public String idc;
    public boolean isAudience;
    public Arya$NicInfo[] localNics;
    public boolean pushOrigin;
    public String rtmpUrl;

    public void Arya$LiveStreamParam(){
       super();
       this.pushOrigin = true;
       this.callId = "";
       this.idc = "";
       this.rtmpUrl = "";
       this.audioOnly = false;
       this.edgeRoomIp = "";
       this.edgeRoomPort = 0;
       this.isAudience = false;
    }
}
