package com.kuaishou.bizmonitor.framework.funnel.collector.registers.a$f;
import mn.d;
import java.lang.String;
import mn.b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import pu.a;
import mn.c;
import com.kuaishou.bizmonitor.framework.funnel.collector.registers.AppEventRegister;
import com.kuaishou.bizmonitor.framework.funnel.collector.registers.AppEventRegister$Type;
import qu.a;
import com.kuaishou.bizmonitor.framework.funnel.collector.registers.a;
import java.lang.Integer;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;

public class a$f extends d	// class@00118c
{

    public void a$f(String p0,int p1,int p2){
       super(p0, p1, p2);
    }
    public Object b(b p0,Object[] p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a$f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 0;
       if (!p1[i] instanceof a) {
          throw new IllegalArgumentException("onAppEvent\(\) arg0 must be AppEvent.event, "+p1[i]);
       }
       int i1 = 1;
       if (!p1[i1] instanceof c) {
          throw new IllegalArgumentException("onAppEvent\(\) arg1 not valid, "+p1[i1]);
       }
       if (!p1[2] instanceof c) {
          throw new IllegalArgumentException("onAppEvent\(\) arg2 not valid, "+p1[2]);
       }
       a.a(p0, new AppEventRegister(p1[i].b, p1[i1], p1[2]));
       return Integer.valueOf(i1);
    }
}
