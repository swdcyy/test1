package com.kuaishou.bizmonitor.framework.funnel.collector.kwai.c$a;
import mn.d;
import java.lang.String;
import mn.b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.SharedPreferences;
import com.kuaishou.bizmonitor.framework.funnel.collector.kwai.c;
import java.lang.Integer;
import java.lang.Long;

public class c$a extends d	// class@001158
{

    public void c$a(String p0,int p1){
       super(p0, p1);
    }
    public Object a(b p0,Object p1,Object p2){
       p0 = PatchProxy.applyThreeRefs(p0, p1, p2, this, c$a.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return Long.valueOf(c.b().getLong(p1, (long)p2.intValue()));
    }
}
