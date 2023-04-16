package com.kwai.feature.api.live.base.service.perf.LivePerfBizInfo;
import com.kwai.feature.api.live.base.service.perf.LivePerfBizInfo$a;
import nsd.u;
import java.lang.Object;
import com.kwai.feature.api.live.base.service.perf.LivePerfBizInfo$_extras$1;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.String;
import java.util.HashMap;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.lang.Number;

public final class LivePerfBizInfo	// class@000fa3
{
    public String a;
    public final p b;
    public static final LivePerfBizInfo$a c;

    static {
       LivePerfBizInfo.c = new LivePerfBizInfo$a(null);
    }
    public void LivePerfBizInfo(){
       super();
       this.b = s.c(LivePerfBizInfo$_extras$1.INSTANCE);
    }
    public final String a(){
       LivePerfBizInfo ta = this.a;
       if (ta != null) {
       }else {
          ta = "";
       }
       return ta;
    }
    public final HashMap b(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, LivePerfBizInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.b.isInitialized()) {
          objArray = this.b.getValue();
       }
       return objArray;
    }
    public boolean equals(Object p0){
       LivePerfBizInfo livePerfBizI = LivePerfBizInfo.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, livePerfBizI, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this == p0) {
          return b;
       }
       Class class = (p0 != null)? p0.getClass(): null;
       if (a.g(livePerfBizI, class) ^ b) {
          return false;
       }else {
          Objects.requireNonNull(p0, "null cannot be cast to non-null type com.kwai.feature.api.live.base.service.perf.LivePerfBizInfo");
          if (!a.g(this.a(), p0.a()) || !a.g(this.b(), p0.b())) {
             b = false;
          }
          return b;
       }
    }
    public int hashCode(){
       HashMap obj = PatchProxy.apply(null, this, LivePerfBizInfo.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.b();
       int i = (obj != null)? obj.hashCode(): 0;
       return ((i * 31) + (this.a()).hashCode());
    }
}
