package com.kuaishou.live.common.core.basic.arya.e;
import lw4.a;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import com.kuaishou.live.common.core.basic.arya.LiveSnowManager;
import i91.n;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import lnc.i3;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.Number;
import java.lang.Boolean;
import java.lang.Character;
import k2b.u1;

public final class e implements a	// class@000e77
{
    public static final e a;

    static {
       e.a = new e();
    }
    public void e(){
       super();
    }
    public final void a(String p0,Map p1){
       String str = PatchProxy.applyOneRefs(p1, null, n.class, "1");
       if (str != PatchProxyResult.class) {
       }else {
          a.p(p1, "$this$toJsonString");
          i3 oi3 = i3.f();
          Iterator iterator = p1.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             String key = uEntry.getKey();
             if (key != null) {
                Object value = uEntry.getValue();
                if (value != null) {
                   if (value instanceof Number) {
                      oi3.c(key, value);
                   }else if(value instanceof Boolean){
                      oi3.a(key, value);
                   }else if(value instanceof Character){
                      oi3.b(key, value);
                   }else if(value instanceof String){
                      oi3.d(key, value);
                   }else {
                      oi3.d(key, value.toString());
                   }
                }
             }
          }
          str = oi3.e();
          a.o(str, "builder.build\(\)");
       }
       u1.R(p0, str, 3);
       return;
    }
}
