package com.kwai.sdk.eve.internal.capsule.EveCapsule$setUp$1$1$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class EveCapsule$setUp$1$1$1 extends Lambda implements a	// class@00146a
{
    public final String $currentInferId;

    public void EveCapsule$setUp$1$1$1(String p0){
       this.$currentInferId = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       Object obj = PatchProxy.apply(null, this, EveCapsule$setUp$1$1$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "EveCapsule: current inferId is "+this.$currentInferId;
    }
}
