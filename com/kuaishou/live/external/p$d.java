package com.kuaishou.live.external.p$d;
import mf3.b$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import o56.a;
import java.util.HashMap;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import pp.c;
import java.util.Map;
import com.kuaishou.android.live.log.b;

public class p$d implements b$a	// class@001baf
{

    public void p$d(){
       super();
    }
    public boolean a(){
       Object obj = PatchProxy.apply(null, this, p$d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.d();
    }
    public void b(String p0,String p1,Object[] p2){
    }
    public void c(String p0,String p1,Object[] p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, p$d.class, "2")) {
          return;
       }
       HashMap hashMap = new HashMap();
       for (int i = 0; i < p2.length; i = i + 1) {
          hashMap.put(String.valueOf(i), p2[i]);
       }
       b.h0(LiveLogTag.LIVE_SOCKET, p0+" "+p1, hashMap);
       return;
    }
}
