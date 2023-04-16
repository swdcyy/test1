package com.kuaishou.bizmonitor.framework.funnel.collector.registers.a$e;
import mn.d;
import java.lang.String;
import mn.b;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import pu.e;
import java.lang.Integer;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import mn.c;
import com.kuaishou.bizmonitor.framework.funnel.collector.registers.KLogRegister;
import java.lang.Number;
import com.kuaishou.bizmonitor.framework.funnel.collector.registers.KLogRegister$Type;
import qu.a;
import com.kuaishou.bizmonitor.framework.funnel.collector.registers.a;

public class a$e extends d	// class@00118b
{

    public void a$e(String p0,int p1,int p2){
       super(p0, p1, p2);
    }
    public Object b(b p0,Object[] p1){
       int i1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "1";
       object obj = PatchProxy.applyTwoRefs(p0, p1, this, a$e.class, str);
       if (obj != patchProxyRe) {
          return obj;
       }
       int i = 0;
       if (!p1[i] instanceof e) {
          throw new IllegalArgumentException("onKLog\(\) arg0 must be KLog.xxx, "+p1[i]);
       }
       if (!p1[1] instanceof String && !p1[1] instanceof Integer) {
          throw new IllegalArgumentException("onKLog\(\) arg1 is not log level, "+p1[1]);
       }
       if (!p1[2] instanceof c) {
          throw new IllegalArgumentException("onKLog\(\) arg1 not valid, "+p1[2]);
       }
       if (!p1[3] instanceof c) {
          throw new IllegalArgumentException("onKLog\(\) arg2 not valid, "+p1[3]);
       }
       obj = p1[i];
       if (p1[1] instanceof Integer) {
          i1 = p1[1].intValue();
       }else {
          String str1 = String.valueOf(p1[1]);
          Object obj1 = PatchProxy.applyOneRefs(str1, null, KLogRegister.class, str);
          if (obj1 != patchProxyRe) {
             i1 = obj1.intValue();
          }else if(("V").equals(str1)){
             i1 = 2;
          }else if(("D").equals(str1)){
             i1 = 3;
          }else if(("I").equals(str1)){
             if (("W").equals(str1)) {
                i1 = 5;
             }else if(("E").equals(str1)){
                i1 = 6;
             }
          }
          i1 = 4;
       }
       KLogRegister kLogRegister = new KLogRegister(obj.b, obj.c, i1, p1[2], p1[3]);
       a.a(p0, i1);
       return Integer.valueOf(1);
    }
}
