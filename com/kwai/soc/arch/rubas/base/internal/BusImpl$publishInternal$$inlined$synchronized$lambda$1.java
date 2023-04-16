package com.kwai.soc.arch.rubas.base.internal.BusImpl$publishInternal$$inlined$synchronized$lambda$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.soc.arch.rubas.base.internal.BusImpl;
import java.lang.String;
import dt7.h;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class BusImpl$publishInternal$$inlined$synchronized$lambda$1 extends Lambda implements a	// class@001895
{
    public final String $event$inlined;
    public final h $revent$inlined;
    public final Object $token$inlined;
    public final BusImpl this$0;

    public void BusImpl$publishInternal$$inlined$synchronized$lambda$1(BusImpl p0,String p1,h p2,Object p3){
       this.this$0 = p0;
       this.$event$inlined = p1;
       this.$revent$inlined = p2;
       this.$token$inlined = p3;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       Object obj = PatchProxy.applyWithListener(null, this, BusImpl$publishInternal$$inlined$synchronized$lambda$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(BusImpl$publishInternal$$inlined$synchronized$lambda$1.class, "1");
       return "no any listeners, ["+this.$event$inlined+"] add to pending pool.";
    }
}
