package com.kuaishou.live.livestage.videopipe.source.RTCVideoSource;
import pe3.f;
import je3.k;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.livestage.videopipe.source.RTCVideoSource$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.live.livestage.utils.CommonUtil;
import com.kuaishou.live.livestage.videopipe.source.RTCVideoSource$startPoll$1;
import msd.a;
import com.kuaishou.live.livestage.videopipe.source.RTCVideoSource$stopPoll$1;
import java.lang.Number;

public final class RTCVideoSource extends f	// class@000c1c
{
    public final RTCVideoSource$a e;
    public final k f;

    public void RTCVideoSource(k p0){
       a.p(p0, "snow");
       super();
       this.f = p0;
       this.e = new RTCVideoSource$a(this);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RTCVideoSource.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof RTCVideoSource) {
          return false;
       }
       if (a.g(this.f, p0.f) ^ true) {
          return false;
       }
       return true;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, RTCVideoSource.class, "1")) {
          return;
       }
       CommonUtil.e.e(new RTCVideoSource$startPoll$1(this));
       return;
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, RTCVideoSource.class, "2")) {
          return;
       }
       CommonUtil.e.e(new RTCVideoSource$stopPoll$1(this));
       return;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, RTCVideoSource.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.f.hashCode();
    }
}
