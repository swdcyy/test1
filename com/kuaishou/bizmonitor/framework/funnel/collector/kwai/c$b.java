package com.kuaishou.bizmonitor.framework.funnel.collector.kwai.c$b;
import mn.d;
import java.lang.String;
import mn.b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.SharedPreferences;
import com.kuaishou.bizmonitor.framework.funnel.collector.kwai.c;

public class c$b extends d	// class@001159
{

    public void c$b(String p0,int p1){
       super(p0, p1);
    }
    public Object a(b p0,Object p1,Object p2){
       p0 = PatchProxy.applyThreeRefs(p0, p1, p2, this, c$b.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return c.b().getString(p1, p2);
    }
}
