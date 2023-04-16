package com.kuaishou.live.core.voiceparty.http.LiveVoicePartyApi$LogRequestFailFactory$e;
import retrofit2.b;
import msd.p;
import java.lang.Object;
import retrofit2.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.lang.reflect.Type;

public final class LiveVoicePartyApi$LogRequestFailFactory$e implements b	// class@001503
{
    public final b a;
    public final p b;

    public void LiveVoicePartyApi$LogRequestFailFactory$e(b p0,p p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public Object adapt(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveVoicePartyApi$LogRequestFailFactory$e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "call");
       Object obj1 = this.a.adapt(p0);
       Objects.requireNonNull(obj1, "null cannot be cast to non-null type T");
       return this.b.invoke(obj1, p0);
    }
    public Type responseType(){
       Type obj = PatchProxy.apply(null, this, LiveVoicePartyApi$LogRequestFailFactory$e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.responseType();
       a.o(obj, "adapter.responseType\(\)");
       return obj;
    }
}
