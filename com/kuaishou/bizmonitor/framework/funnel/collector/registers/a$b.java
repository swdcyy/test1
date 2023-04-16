package com.kuaishou.bizmonitor.framework.funnel.collector.registers.a$b;
import mn.d;
import java.lang.String;
import mn.b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import pu.b;
import mn.c;
import qu.c;
import qu.a;
import com.kuaishou.bizmonitor.framework.funnel.collector.registers.a;
import java.lang.Integer;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;

public class a$b extends d	// class@001188
{

    public void a$b(String p0,int p1,int p2){
       super(p0, p1, p2);
    }
    public Object b(b p0,Object[] p1){
       object obj = PatchProxy.applyTwoRefs(p0, p1, this, a$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 0;
       if (!p1[i] instanceof b) {
          throw new IllegalArgumentException("onErrorUpload\(\) arg0 must be funnel, "+p1[i]);
       }
       int i1 = 1;
       if (!p1[i1] instanceof c) {
          throw new IllegalArgumentException("onErrorUpload\(\) arg1 not valid, "+p1[i1]);
       }
       if (!p1[2] instanceof c) {
          throw new IllegalArgumentException("onErrorUpload\(\) arg2 not valid, "+p1[2]);
       }
       obj = p1[i];
       if (obj.c != null) {
          throw new IllegalArgumentException("onErrorUpload\(\) invalid funnel, "+obj);
       }
       a.a(p0, new c(obj.b, p1[i1], p1[2]));
       return Integer.valueOf(i1);
    }
}
