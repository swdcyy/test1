package com.kwai.component.realtime.startup.RealtimeStartupManagerImpl$b;
import lnc.c2;
import java.lang.Object;
import jg5.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class RealtimeStartupManagerImpl$b implements c2	// class@000b06
{
    public static final RealtimeStartupManagerImpl$b a;

    static {
       RealtimeStartupManagerImpl$b.a = new RealtimeStartupManagerImpl$b();
    }
    public void RealtimeStartupManagerImpl$b(){
       super();
    }
    public boolean accept(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, RealtimeStartupManagerImpl$b.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(p0 != null && (p0.c() || p0.e())){
          b = true;
       }else {
          b = false;
       }
       return b;
    }
}
