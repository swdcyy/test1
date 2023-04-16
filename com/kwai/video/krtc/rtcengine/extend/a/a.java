package com.kwai.video.krtc.rtcengine.extend.a.a;
import com.kwai.video.krtc.rtcengine.RtcEngineConfig;
import com.kwai.video.krtc.rtcengine.internal.z;
import java.lang.Object;
import com.kwai.video.krtc.Arya;
import com.kwai.video.krtc.rtcengine.internal.f;
import com.kwai.video.krtc.rtcengine.internal.u;
import com.kwai.video.krtc.rtcengine.RtcEngine$JoinChannelSignalParam;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.video.krtc.Arya$LiveStreamParam;
import com.kwai.video.krtc.rtcengine.internal.a;
import com.kwai.video.krtc.Arya$SignalingMessageInfo;
import com.kwai.video.krtc.Arya$AryaAudioRouteListener;

public class a	// class@000856
{
    public RtcEngineConfig a;
    public Arya b;
    public z c;
    public f d;
    public u e;
    public u f;

    public void a(RtcEngineConfig p0,z p1){
       super();
       this.a = p0;
       this.b = p1.a();
       this.c = p1;
       this.d = p1.f();
       this.e = p1.g();
       this.f = p1.h();
    }
    public int a(RtcEngine$JoinChannelSignalParam p0){
       Arya$LiveStreamParam obj = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new Arya$LiveStreamParam();
       obj.pushOrigin = p0.pushOrigin;
       obj.idc = p0.idc;
       obj.localNics = p0.localNics;
       obj.rtmpUrl = p0.rtmpUrl;
       obj.audioOnly = p0.audioOnly;
       obj.edgeRoomIp = p0.edgeRoomIp;
       obj.edgeRoomPort = p0.edgeRoomPort;
       obj.isAudience = p0.isAudience;
       this.b.startCall(p0.channelId, this.a.mUserId, p0.signalMessage, obj);
       this.c.e().a(p0.channelId, 1);
       return 0;
    }
    public int a(String p0,String p1,String p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       this.b.postReceivedSignalingJson(p0, p1, p2);
       return 0;
    }
    public int a(String p0,String p1,byte[] p2){
       Arya$SignalingMessageInfo obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.b.getSignalMessageInfo(p2);
       if (obj != null) {
          if (obj.started != null) {
             this.d.a(this.c.i());
             this.d.d();
             this.e.a(p0);
             this.f.a(p0);
          }else {
             this.e.a();
             this.f.a();
             this.b.setAudioRouteListener(null);
          }
       }
       this.b.postReceivedSignalingMessage(p0, p1, p2);
       return 0;
    }
    public int b(RtcEngine$JoinChannelSignalParam p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       this.b.updateLiveStreamRtmpUrl(p0.rtmpUrl);
       return 0;
    }
}
