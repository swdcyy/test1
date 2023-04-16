package com.yxcorp.gifshow.log.timemachine.TMLogManager;
import java.util.UUID;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.util.concurrent.ConcurrentHashMap;
import com.yxcorp.gifshow.log.timemachine.TMLogManager$policyMap$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.log.timemachine.TMLogManager$ratioMap$2;
import a3b.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.concurrent.ConcurrentMap;
import a3b.b;
import java.util.concurrent.atomic.AtomicInteger;
import nsd.u;
import java.util.Map;
import java.lang.Boolean;
import java.lang.Integer;
import org.json.JSONObject;
import com.yxcorp.gifshow.log.timemachine.TMLogManager$a;
import java.lang.Runnable;
import t45.c;

public final class TMLogManager	// class@001b4b
{
    public static final String a;
    public static final ConcurrentHashMap b;
    public static final p c;
    public static final p d;
    public static final TMLogManager e;

    static {
       TMLogManager.e = new TMLogManager();
       String str = UUID.randomUUID().toString();
       a.o(str, "UUID.randomUUID\(\).toString\(\)");
       TMLogManager.a = str;
       TMLogManager.b = new ConcurrentHashMap();
       TMLogManager.c = s.c(TMLogManager$policyMap$2.INSTANCE);
       TMLogManager.d = s.c(TMLogManager$ratioMap$2.INSTANCE);
    }
    public void TMLogManager(){
       super();
    }
    public final a a(String p0){
       ConcurrentHashMap obj = PatchProxy.applyOneRefs(p0, this, TMLogManager.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "bizType");
       obj = TMLogManager.b;
       b uob = obj.get(p0);
       if (uob == null) {
          uob = new b(p0, null, 2, null);
          p0 = obj.putIfAbsent(p0, uob);
          if (p0 != null) {
             uob = p0;
          }
       }
       a.o(uob, "contextMap.getOrPut\(bizT¡­TMContext\(bizType\)\n    }\)");
       return uob;
    }
    public final Map b(){
       Object obj = PatchProxy.apply(null, this, TMLogManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TMLogManager.c.getValue();
    }
    public final boolean c(String p0){
       Integer obj = PatchProxy.applyOneRefs(p0, this, TMLogManager.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "bizType");
       obj = this.b().get(p0);
       boolean b = true;
       if (obj == null || obj.intValue() != 2) {
          Integer integer = this.b().get(p0);
          if (integer == null || integer.intValue() != b) {
          label_0042 :
             return b;
          }
       }
       b = false;
       goto label_0042 ;
    }
    public final void d(String p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, TMLogManager.class, "4")) {
          return;
       }
       a.p(p0, "bizType");
       a.p(p1, "messageType");
       a.p(p2, "messageDetail");
       this.f(p0, p1, p2);
       return;
    }
    public final void e(String p0,String p1,JSONObject p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, TMLogManager.class, "5")) {
          return;
       }
       a.p(p0, "bizType");
       a.p(p1, "messageType");
       a.p(p2, "messageDetail");
       this.f(p0, p1, p2);
       return;
    }
    public final void f(String p0,String p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, TMLogManager.class, "6")) {
          return;
       }
       if (this.c(p0)) {
          return;
       }
       c.a(new TMLogManager$a(p0, p1, p2));
       return;
    }
}
