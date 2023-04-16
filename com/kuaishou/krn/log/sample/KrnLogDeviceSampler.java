package com.kuaishou.krn.log.sample.KrnLogDeviceSampler;
import dk0.b;
import com.kuaishou.krn.log.sample.KrnLogDeviceSampler$a;
import java.lang.String;
import nsd.u;
import java.lang.Object;
import java.util.List;
import trd.t;
import com.kuaishou.krn.log.sample.KrnLogDeviceSampler$mLogConfigList$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.krn.KrnInternalManager;
import kj0.f;
import kj0.d;
import com.kuaishou.krn.log.model.KrnLogCommonParams;
import java.lang.CharSequence;

public final class KrnLogDeviceSampler implements b	// class@0008f8
{
    public static final List a;
    public static final p b;
    public static final KrnLogDeviceSampler c;

    static {
       KrnLogDeviceSampler.c = new KrnLogDeviceSampler();
       KrnLogDeviceSampler$a uoa = new KrnLogDeviceSampler$a("krn_multi_instance_statistics", "kds_log_device_sample", null, 4, null);
       KrnLogDeviceSampler.a = t.k(v0);
       KrnLogDeviceSampler.b = s.c(KrnLogDeviceSampler$mLogConfigList$2.INSTANCE);
    }
    public void KrnLogDeviceSampler(){
       super();
    }
    public static final List c(KrnLogDeviceSampler p0){
       return KrnLogDeviceSampler.a;
    }
    public boolean a(String p0,Object p1){
       List obj = PatchProxy.applyTwoRefs(p0, p1, this, KrnLogDeviceSampler.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "key");
       a.p(p1, "value");
       obj = this.d();
       boolean b = false;
       if (!obj instanceof Collection || !obj.isEmpty()) {
          Iterator iterator = obj.iterator();
          while (iterator.hasNext()) {
             if (KrnLogDeviceSampler.c.e(iterator.next(), p0, p1)) {
                b = true;
                break ;
             }
          }
       }
       return b;
    }
    public boolean b(String p0,Object p1){
       Object obj1;
       boolean b;
       Iterator obj = PatchProxy.applyTwoRefs(p0, p1, this, KrnLogDeviceSampler.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "key");
       a.p(p1, "value");
       obj = this.d().iterator();
       while (true) {
          if (obj.hasNext()) {
             obj1 = obj.next();
             if (!KrnLogDeviceSampler.c.e(obj1, p0, p1)) {
                continue ;
             }
          }else {
             obj1 = null;
          }
          b = true;
          if (obj1 != null) {
             p1 = KrnInternalManager.c.a().c();
             if (p1 != null) {
                b = p1.getBoolean(obj1.sampleKswitch, b);
                break ;
             }
          }
          break ;
       }
       return b;
    }
    public final List d(){
       Object obj = PatchProxy.apply(null, this, KrnLogDeviceSampler.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KrnLogDeviceSampler.b.getValue();
    }
    public final boolean e(KrnLogDeviceSampler$a p0,String p1,Object p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, KrnLogDeviceSampler.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       String str = null;
       if (!p2 instanceof KrnLogCommonParams) {
          p2 = str;
       }
       if (p2 != null) {
          str = p2.a();
       }
       boolean b = true;
       if (a.g(p0.customEventKey, p1)) {
          p1 = p0.a();
          int i = (p1 == null || !p1.length())? 1: 0;
          if (i || a.g(p0.a(), str)) {
          label_004d :
             return b;
          }
       }
       b = false;
       goto label_004d ;
    }
}
