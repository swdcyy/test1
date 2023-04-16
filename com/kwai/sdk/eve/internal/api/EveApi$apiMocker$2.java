package com.kwai.sdk.eve.internal.api.EveApi$apiMocker$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.sdk.eve.internal.api.EveApi;
import com.kwai.sdk.eve.internal.api.EveApi$apiMocker$2$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class EveApi$apiMocker$2 extends Lambda implements a	// class@00145f
{
    public final EveApi this$0;

    public void EveApi$apiMocker$2(EveApi p0){
       this.this$0 = p0;
       super(0);
    }
    public final EveApi$apiMocker$2$a invoke(){
       Object obj = PatchProxy.apply(null, this, EveApi$apiMocker$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new EveApi$apiMocker$2$a(this);
    }
    public Object invoke(){
       return this.invoke();
    }
}
