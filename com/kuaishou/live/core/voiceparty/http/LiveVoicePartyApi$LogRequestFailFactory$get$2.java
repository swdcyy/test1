package com.kuaishou.live.core.voiceparty.http.LiveVoicePartyApi$LogRequestFailFactory$get$2;
import msd.p;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.http.LiveVoicePartyApi$LogRequestFailFactory;
import brd.h;
import retrofit2.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import erd.g;
import java.util.Objects;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.a;
import io.reactivex.internal.operators.flowable.f;
import erd.q;
import erd.a;
import ird.a;

public final class LiveVoicePartyApi$LogRequestFailFactory$get$2 extends Lambda implements p	// class@001505
{
    public final LiveVoicePartyApi$LogRequestFailFactory this$0;

    public void LiveVoicePartyApi$LogRequestFailFactory$get$2(LiveVoicePartyApi$LogRequestFailFactory p0){
       this.this$0 = p0;
       super(2);
    }
    public final h invoke(h p0,a p1){
       g obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveVoicePartyApi$LogRequestFailFactory$get$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "flowable");
       a.p(p1, "call");
       obj = this.this$0.c(p1);
       Objects.requireNonNull(p0);
       q g = Functions.g;
       a c = Functions.c;
       a.c(obj, "onSubscribe is null");
       a.c(g, "onRequest is null");
       a.c(c, "onCancel is null");
       p0 = a.f(new f(p0, obj, g, c)).f(this.this$0.a(p1)).e(Functions.d(), this.this$0.b(p1), c, c);
       a.o(p0, "flowable\n              .бн.doOnError\(logFail\(call\)\)");
       return p0;
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1);
    }
}
