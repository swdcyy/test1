package com.kuaishou.bizmonitor.framework.funnel.collector.kwai.g0;
import nn.f;
import com.kuaishou.bizmonitor.framework.funnel.collector.kwai.PersistentStorage;
import java.lang.Object;
import java.lang.String;
import nn.e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.bizmonitor.framework.funnel.collector.kwai.PersistentStorage$c;

public class g0 implements f	// class@00116c
{
    public final PersistentStorage a;

    public void g0(PersistentStorage p0){
       this.a = p0;
       super();
    }
    public e a(String p0){
       String obj = PatchProxy.applyOneRefs(p0, this, g0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String str = null;
       if (p0.startsWith("pstore.")) {
          int i = 7;
          if (p0.length() > i) {
             obj = p0.substring(i);
             i = obj.indexOf(46);
             if (i < 0) {
                return new PersistentStorage$c(this.a, p0, obj, str);
             }else {
                str = new PersistentStorage$c(this.a, p0, obj.substring(0, i), obj.substring((i + 1)));
             }
          }
       }
       return str;
    }
    public int priority(){
       return 19;
    }
}
