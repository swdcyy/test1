package com.kwai.video.krtc.rtcengine.extend.a.c;
import com.kwai.video.krtc.Arya;
import java.lang.Object;
import com.kwai.video.krtc.rtcengine.RtcEngineHttpRequestContext;
import com.kwai.video.krtc.observers.IRtcEngineHttpObserver;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public class c	// class@00085a
{
    public Arya a;

    public void c(Arya p0){
       super();
       this.a = p0;
    }
    public int a(RtcEngineHttpRequestContext p0,IRtcEngineHttpObserver p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.a.executeHttpRequest(p0, p1);
    }
}
