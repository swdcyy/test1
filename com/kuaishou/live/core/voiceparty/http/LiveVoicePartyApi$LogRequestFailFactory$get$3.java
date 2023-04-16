package com.kuaishou.live.core.voiceparty.http.LiveVoicePartyApi$LogRequestFailFactory$get$3;
import msd.p;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.http.LiveVoicePartyApi$LogRequestFailFactory;
import brd.a0;
import retrofit2.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import erd.g;

public final class LiveVoicePartyApi$LogRequestFailFactory$get$3 extends Lambda implements p	// class@001506
{
    public final LiveVoicePartyApi$LogRequestFailFactory this$0;

    public void LiveVoicePartyApi$LogRequestFailFactory$get$3(LiveVoicePartyApi$LogRequestFailFactory p0){
       this.this$0 = p0;
       super(2);
    }
    public final a0 invoke(a0 p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveVoicePartyApi$LogRequestFailFactory$get$3.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "single");
       a.p(p1, "call");
       p0 = p0.q(this.this$0.c(p1)).r(this.this$0.a(p1)).p(this.this$0.b(p1));
       a.o(p0, "single\n              .do¡­.doOnError\(logFail\(call\)\)");
       return p0;
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1);
    }
}
