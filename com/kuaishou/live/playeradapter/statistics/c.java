package com.kuaishou.live.playeradapter.statistics.c;
import java.lang.Runtime;
import com.yxcorp.utility.SystemUtil;
import java.lang.Object;
import com.kuaishou.live.playeradapter.statistics.c$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class c	// class@000d65
{
    public static final long a;
    public static final long b;

    static {
       c.a = Runtime.getRuntime().maxMemory() / 1024;
       c.b = SystemUtil.t() / 1024;
    }
    public void c(){
       super();
    }
    public static c$a a(){
       c$a obj = PatchProxy.apply(null, null, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new c$a();
       obj.a = c.b;
       obj.b = c.a;
       obj.c = (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / 1024;
       return obj;
    }
}
