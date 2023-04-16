package com.kuaishou.live.playeradapter.dns.RavenManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import mc6.d;

public class RavenManager	// class@000d51
{
    public static boolean a;
    public static d b;

    public void RavenManager(){
       super();
    }
    public static synchronized boolean a(){
       _monitor_enter(RavenManager.class);
       Object obj = PatchProxy.apply(null, null, RavenManager.class, "3");
       if (obj != PatchProxyResult.class) {
          _monitor_exit(RavenManager.class);
          return obj.booleanValue();
       }else {
          _monitor_exit(RavenManager.class);
          return d.b("raven");
       }
    }
}
