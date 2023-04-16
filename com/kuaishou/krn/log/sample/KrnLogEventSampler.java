package com.kuaishou.krn.log.sample.KrnLogEventSampler;
import dk0.b;
import com.kuaishou.krn.log.sample.KrnLogEventSampler$mLogConfigList$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.util.List;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.krn.log.sample.KrnLogEventSampler$a;
import java.lang.Math;
import java.lang.Double;

public final class KrnLogEventSampler implements b	// class@0008fc
{
    public static final p a;
    public static final KrnLogEventSampler b;

    static {
       KrnLogEventSampler.b = new KrnLogEventSampler();
       KrnLogEventSampler.a = s.c(KrnLogEventSampler$mLogConfigList$2.INSTANCE);
    }
    public void KrnLogEventSampler(){
       super();
    }
    public boolean a(String p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, KrnLogEventSampler.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "key");
       a.p(p1, "value");
       p1 = this.c();
       boolean b = false;
       if (!p1 instanceof Collection || !p1.isEmpty()) {
          p1 = p1.iterator();
          while (p1.hasNext()) {
             if (a.g(p1.next().a(), p0)) {
                b = true;
                break ;
             }
          }
       }
       return b;
    }
    public boolean b(String p0,Object p1){
       boolean b;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, KrnLogEventSampler.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "key");
       a.p(p1, "value");
       p1 = this.c().iterator();
       while (true) {
          if (p1.hasNext()) {
             obj = p1.next();
             if (!a.g(obj.a(), p0)) {
                continue ;
             }
          }else {
             obj = null;
          }
          b = true;
          if (obj != null && Double.compare(Math.random(), obj.sampleRatio) > 0) {
             b = false;
             break ;
          }
          break ;
       }
       return b;
    }
    public final List c(){
       Object obj = PatchProxy.apply(null, this, KrnLogEventSampler.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KrnLogEventSampler.a.getValue();
    }
}
