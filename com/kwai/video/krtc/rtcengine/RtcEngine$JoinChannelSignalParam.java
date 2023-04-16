package com.kwai.video.krtc.rtcengine.RtcEngine$JoinChannelSignalParam;
import java.lang.Object;

public class RtcEngine$JoinChannelSignalParam	// class@0007e8
{
    public boolean audioOnly;
    public String channelId;
    public String edgeRoomIp;
    public int edgeRoomPort;
    public String idc;
    public boolean isAudience;
    public Arya$NicInfo[] localNics;
    public boolean pushOrigin;
    public String rtmpUrl;
    public byte[] signalMessage;
    public String userId;

    public void RtcEngine$JoinChannelSignalParam(){
       super();
       this.channelId = "";
       this.userId = "";
       this.pushOrigin = true;
       this.idc = "";
       this.rtmpUrl = "";
       this.audioOnly = false;
       this.edgeRoomIp = "";
       this.edgeRoomPort = 0;
       this.isAudience = false;
    }
}
