package com.kwai.yoda.api.YodaApi$webProxyApi$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.yoda.api.YodaApi;
import java.lang.Object;
import qx7.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import t97.a;

public final class YodaApi$webProxyApi$2 extends Lambda implements a	// class@001170
{
    public final YodaApi this$0;

    public void YodaApi$webProxyApi$2(YodaApi p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final b invoke(){
       Object obj = PatchProxy.apply(null, this, YodaApi$webProxyApi$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.this$0.c().a(b.class);
    }
}
