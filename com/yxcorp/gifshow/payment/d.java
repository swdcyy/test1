package com.yxcorp.gifshow.payment.d;
import go7.e;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import com.yxcorp.gifshow.payment.GatewayPayBaseInitModule;
import eda.y$b;
import java.util.Objects;
import eda.y;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.HashMap;
import java.lang.System;
import java.lang.Long;
import dt7.d;
import java.lang.StringBuilder;
import fg6.a;
import com.google.gson.Gson;
import qj7.d;

public final class d implements e	// class@000e42
{
    public static final d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
    }
    public final void b4(String p0,Map p1,String p2){
       HashMap hashMap;
       y a = y$b.a;
       Objects.requireNonNull(a);
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, a, y.class, "1")) {
       }else if(p1 == null){
          hashMap = new HashMap();
       }
       hashMap.put("ts", Long.valueOf(System.currentTimeMillis()));
       a.a.b(p0, hashMap, p2, null);
       d.c("qinshanshan_rubasevent_name:"+p0+"-----"+a.a.q(hashMap)+"------"+p2);
       return;
    }
}
