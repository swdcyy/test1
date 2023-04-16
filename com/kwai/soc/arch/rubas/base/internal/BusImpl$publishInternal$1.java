package com.kwai.soc.arch.rubas.base.internal.BusImpl$publishInternal$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import dt7.h;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class BusImpl$publishInternal$1 extends Lambda implements a	// class@001896
{
    public final h $revent;

    public void BusImpl$publishInternal$1(h p0){
       this.$revent = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       Object obj = PatchProxy.apply(null, this, BusImpl$publishInternal$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "publish event: "+this.$revent;
    }
}
