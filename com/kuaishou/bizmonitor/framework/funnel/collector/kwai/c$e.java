package com.kuaishou.bizmonitor.framework.funnel.collector.kwai.c$e;
import mn.d;
import java.lang.String;
import mn.b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.os.Handler;
import com.kuaishou.bizmonitor.framework.funnel.collector.kwai.c;
import java.lang.Integer;

public class c$e extends d	// class@00115c
{

    public void c$e(String p0,int p1){
       super(p0, p1);
    }
    public Object a(b p0,Object p1,Object p2){
       p0 = PatchProxy.applyThreeRefs(p0, p1, p2, this, c$e.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       c.a().removeCallbacksAndMessages(p1);
       return Integer.valueOf(1);
    }
}
