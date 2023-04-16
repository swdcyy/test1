package com.kuaishou.tuna.plc.plc2.PlcLifecycleOwnerImpl$c;
import erd.r;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;

public final class PlcLifecycleOwnerImpl$c implements r	// class@001047
{
    public static final PlcLifecycleOwnerImpl$c b;

    static {
       PlcLifecycleOwnerImpl$c.b = new PlcLifecycleOwnerImpl$c();
    }
    public void PlcLifecycleOwnerImpl$c(){
       super();
    }
    public boolean test(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, PlcLifecycleOwnerImpl$c.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "code");
          b = (p0.intValue() != 22 && (p0.intValue() == 23 || p0.intValue() == 24))? true: false;
       }
       return b;
    }
}
