package com.kwai.video.krtc.rtcengine.internal.i;
import com.kwai.video.krtc.rtcengine.RtcEngineConfig;
import com.kwai.video.krtc.rtcengine.internal.z;
import java.lang.Object;
import com.kwai.video.krtc.Arya;
import com.kwai.video.krtc.rtcengine.JoinChannelParam;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;
import com.kwai.video.krtc.utils.Log;
import com.kwai.video.krtc.rtcengine.internal.a;
import com.kwai.video.krtc.Arya$AryaAudioRouteListener;
import java.lang.Integer;

public class i	// class@00087a
{
    public RtcEngineConfig a;
    public Arya b;
    public z c;
    public String d;

    public void i(RtcEngineConfig p0,z p1){
       super();
       this.a = p0;
       this.b = p1.a();
       this.c = p1;
    }
    public int a(JoinChannelParam p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, i.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("RtcEngineCall", "joinChannel chId "+p0.channelId+" profile "+p0.channelProfile+" audioOnly "+p0.isAudioOnly);
       JoinChannelParam token = p0.token;
       this.d = token;
       this.b.joinChannel(token, this.a.mUserId, p0.channelId, 0, p0.isAudioOnly, p0.channelProfile);
       this.c.e().a(p0.channelId, p0.channelProfile);
       return 0;
    }
    public int a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, i.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("RtcEngineCall", "leaveChannel chId "+p0);
       this.b.leaveChannel(p0, 0, this.c.e().c(p0));
       this.b.setAudioRouteListener(null);
       return 0;
    }
    public int a(String p0,int p1){
       i oi = i.class;
       if (PatchProxy.isSupport(oi)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, oi, "3");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       Log.i("RtcEngineCall", "leaveChannel chId "+p0+" role "+p1);
       this.b.setClientRole(p0, p1);
       return 0;
    }
    public int a(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, i.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.setAVSyncSource(p0, p1);
    }
    public int b(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, i.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       this.b.joinChannel(this.d, this.a.mUserId, p0, 1, false, 2);
       return 0;
    }
    public int c(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, i.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       this.b.leaveChannel(p0, 1, 2);
       return 0;
    }
}
