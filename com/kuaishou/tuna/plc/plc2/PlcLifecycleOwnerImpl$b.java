package com.kuaishou.tuna.plc.plc2.PlcLifecycleOwnerImpl$b;
import erd.r;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;

public final class PlcLifecycleOwnerImpl$b implements r	// class@001046
{
    public final int b;

    public void PlcLifecycleOwnerImpl$b(int p0){
       this.b = p0;
       super();
    }
    public boolean test(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, PlcLifecycleOwnerImpl$b.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "code");
          b = (p0.intValue() == this.b)? true: false;
       }
       return b;
    }
}
