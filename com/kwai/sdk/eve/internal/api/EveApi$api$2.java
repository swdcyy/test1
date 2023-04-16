package com.kwai.sdk.eve.internal.api.EveApi$api$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.sdk.eve.internal.api.EveApi;
import java.lang.Object;
import tm7.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import vm7.a;
import com.kwai.sdk.eve.InitConfig;
import sm7.g;
import m97.f;
import w97.a;

public final class EveApi$api$2 extends Lambda implements a	// class@00144f
{
    public final EveApi this$0;

    public void EveApi$api$2(EveApi p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final b invoke(){
       Object[] objArray = null;
       EveApi$api$2 obj = PatchProxy.apply(objArray, this, EveApi$api$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.this$0;
       g b = obj.e().b().e().b;
       if (b != null) {
          objArray = b.get();
       }
       return obj.a(objArray);
    }
}
