package com.kuaishou.bizmonitor.framework.funnel.collector.registers.a$c;
import mn.d;
import java.lang.String;
import mn.b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import pu.f;
import mn.c;
import com.kuaishou.bizmonitor.framework.funnel.collector.registers.KSUEventRegister;
import com.kuaishou.bizmonitor.framework.funnel.collector.registers.KSUEventRegister$Type;
import qu.a;
import com.kuaishou.bizmonitor.framework.funnel.collector.registers.a;
import java.lang.Integer;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;

public class a$c extends d	// class@001189
{

    public void a$c(String p0,int p1,int p2){
       super(p0, p1, p2);
    }
    public Object b(b p0,Object[] p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 0;
       if (!p1[i] instanceof f) {
          throw new IllegalArgumentException("onKSUEvent\(\) arg0 must be KSU.event, "+p1[i]);
       }
       int i1 = 1;
       if (!p1[i1] instanceof c) {
          throw new IllegalArgumentException("onKSUEvent\(\) arg1 not valid, "+p1[i1]);
       }
       if (!p1[2] instanceof c) {
          throw new IllegalArgumentException("onKSUEvent\(\) arg2 not valid, "+p1[2]);
       }
       a.a(p0, new KSUEventRegister(p1[i].b, p1[i1], p1[2]));
       return Integer.valueOf(i1);
    }
}
