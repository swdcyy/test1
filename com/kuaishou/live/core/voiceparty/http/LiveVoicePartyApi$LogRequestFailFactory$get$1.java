package com.kuaishou.live.core.voiceparty.http.LiveVoicePartyApi$LogRequestFailFactory$get$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.http.LiveVoicePartyApi$LogRequestFailFactory;
import brd.t;
import retrofit2.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import erd.g;

public final class LiveVoicePartyApi$LogRequestFailFactory$get$1 extends Lambda implements p	// class@001504
{
    public final LiveVoicePartyApi$LogRequestFailFactory this$0;

    public void LiveVoicePartyApi$LogRequestFailFactory$get$1(LiveVoicePartyApi$LogRequestFailFactory p0){
       this.this$0 = p0;
       super(2);
    }
    public final t invoke(t p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveVoicePartyApi$LogRequestFailFactory$get$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "observable");
       a.p(p1, "call");
       p0 = p0.doOnSubscribe(this.this$0.c(p1)).doOnNext(this.this$0.a(p1)).doOnError(this.this$0.b(p1));
       a.o(p0, "observable\n             бн.doOnError\(logFail\(call\)\)");
       return p0;
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1);
    }
}
