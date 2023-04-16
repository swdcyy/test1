package com.kwai.video.krtc.rtcengine.internal.p;
import com.kwai.video.krtc.Arya;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;
import com.kwai.video.krtc.utils.Log;
import com.kwai.video.krtc.rtcengine.LiveTranscoding;

public class p	// class@00088e
{
    public Arya a;

    public void p(Arya p0){
       super();
       this.a = p0;
    }
    public int a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, p.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("RtcEngineLiveTranscoding", "StopLiveTranscoding channelId "+p0);
       return this.a.StopLiveTranscoding(p0);
    }
    public int a(String p0,LiveTranscoding p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, p.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("RtcEngineLiveTranscoding", "SetLiveTranscoding channelId "+p0+" tanscoding "+p1);
       return this.a.SetLiveTranscoding(p0, p1);
    }
    public int a(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, p.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("RtcEngineLiveTranscoding", "AddPublishStreamUrl channelId "+p0+" url "+p1);
       return this.a.AddPublishStreamUrl(p0, p1);
    }
    public int b(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, p.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("RtcEngineLiveTranscoding", "RemovePublishStreamUrl channelId "+p0+" url "+p1);
       return this.a.RemovePublishStreamUrl(p0, p1);
    }
}
