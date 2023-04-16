package com.kuaishou.bizmonitor.framework.funnel.collector.registers.a$a;
import mn.d;
import java.lang.String;
import mn.b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import pu.d;
import mn.c;
import qu.c;
import qu.a;
import com.kuaishou.bizmonitor.framework.funnel.collector.registers.a;
import java.lang.Integer;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;

public class a$a extends d	// class@001187
{

    public void a$a(String p0,int p1,int p2){
       super(p0, p1, p2);
    }
    public Object b(b p0,Object[] p1){
       object obj = PatchProxy.applyTwoRefs(p0, p1, this, a$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 0;
       if (!p1[i] instanceof d) {
          throw new IllegalArgumentException("onFunnelUpload\(\) arg0 must be funnel, "+p1[i]);
       }
       int i1 = 1;
       if (!p1[i1] instanceof c) {
          throw new IllegalArgumentException("onFunnelUpload\(\) arg1 not valid, "+p1[i1]);
       }
       if (!p1[2] instanceof c) {
          throw new IllegalArgumentException("onFunnelUpload\(\) arg2 not valid, "+p1[2]);
       }
       obj = p1[i];
       if (obj.c != null) {
          throw new IllegalArgumentException("onFunnelUpload\(\) invalid funnel, "+obj);
       }
       a.a(p0, new c(obj.b, p1[i1], p1[2]));
       return Integer.valueOf(i1);
    }
}
