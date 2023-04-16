package com.kwai.video.krtc.rtcengine.extend.a.d;
import com.kwai.video.krtc.Arya;
import com.kwai.video.krtc.rtcengine.internal.z;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.video.krtc.rtcengine.extend.a.d$1;
import com.kwai.video.krtc.observers.AryaWebsocketObserver;

public class d	// class@00085c
{
    public Arya a;
    public z b;

    public void d(Arya p0,z p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public static z a(d p0){
       return p0.b;
    }
    public int a(int p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uod, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.a.websocketClose(p0);
    }
    public int a(int p0,String p1){
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uod, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.a.websocketOpen(p0, p1, new d$1(this));
    }
    public int a(int p0,byte[] p1){
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uod, "3");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.a.websocketSend(p0, p1);
    }
}
