package com.kuaishou.live.common.core.basic.heartbeat.a;
import java.lang.Object;
import com.kuaishou.live.common.core.basic.heartbeat.a$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import wkd.b;
import ia0.g;
import com.kwai.framework.model.router.RouteType;
import t45.d;
import brd.z;
import com.yxcorp.retrofit.a;
import com.yxcorp.retrofit.e;

public class a	// class@000ea4
{
    public static a$a a;

    public void a(){
       super();
    }
    public static a$a a(){
       Object obj = PatchProxy.apply(null, null, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (a.a == null) {
          a.a = e.b(b.a(-1961311520).a(RouteType.LIVE, d.b), a$a.class);
       }
       return a.a;
    }
}