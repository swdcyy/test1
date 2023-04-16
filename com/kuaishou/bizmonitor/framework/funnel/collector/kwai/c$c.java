package com.kuaishou.bizmonitor.framework.funnel.collector.kwai.c$c;
import mn.d;
import java.lang.String;
import mn.b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.SharedPreferences;
import com.kuaishou.bizmonitor.framework.funnel.collector.kwai.c;
import on.a;
import java.lang.Boolean;

public class c$c extends d	// class@00115a
{

    public void c$c(String p0,int p1){
       super(p0, p1);
    }
    public Object a(b p0,Object p1,Object p2){
       p0 = PatchProxy.applyThreeRefs(p0, p1, p2, this, c$c.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return Boolean.valueOf(c.b().getBoolean(p1, a.a(p2)));
    }
}
