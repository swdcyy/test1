package com.kuaishou.live.livestage.videopipe.source.RTCVideoSource$a;
import xv4.i;
import com.kuaishou.live.livestage.videopipe.source.RTCVideoSource;
import java.lang.String;
import java.nio.ByteBuffer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import pe3.a;
import fe3.c;
import fe3.c$d;
import fe3.c$a;
import pe3.e;
import pe3.c;
import pe3.f;

public final class RTCVideoSource$a extends i	// class@000c19
{
    public final RTCVideoSource a;

    public void RTCVideoSource$a(RTCVideoSource p0){
       this.a = p0;
       super();
    }
    public void j(String p0,ByteBuffer p1,int p2,int p3,int p4,int p5){
       RTCVideoSource$a uoa = RTCVideoSource$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, this, uoa, "1")) {
             return;
          }
       }
       a.p(p0, "userId");
       if (p1 == null) {
          return;
       }else {
          RTCVideoSource$a ta = this.a;
          a uoa1 = new a(ta, c.a.a(p0), p1, p2, p3);
          ta.e(Integer.valueOf(p5));
          return;
       }
    }
}
