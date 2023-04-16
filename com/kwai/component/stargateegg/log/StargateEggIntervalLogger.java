package com.kwai.component.stargateegg.log.StargateEggIntervalLogger;
import java.util.LinkedHashMap;
import com.kwai.component.stargateegg.log.StargateEggIntervalLogger$handler$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import lnc.i3;
import java.lang.Number;
import qrd.l1;
import ekd.y0;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.component.stargateegg.log.StargateEggIntervalLogger$a;
import java.util.Map;

public final class StargateEggIntervalLogger	// class@000b3a
{
    public static int a;
    public static final Map b;
    public static final Map c;
    public static final p d;
    public static final StargateEggIntervalLogger e;

    static {
       StargateEggIntervalLogger.e = new StargateEggIntervalLogger();
       StargateEggIntervalLogger.b = new LinkedHashMap();
       StargateEggIntervalLogger.c = new LinkedHashMap();
       StargateEggIntervalLogger.d = s.c(StargateEggIntervalLogger$handler$2.INSTANCE);
    }
    public void StargateEggIntervalLogger(){
       super();
    }
    public static void d(StargateEggIntervalLogger p0,String p1,String p2,int p3,int p4,Object p5){
       if (p4 & 0x04) {
          p3 = 1;
       }
       p0.c(p1, p2, p3);
       return;
    }
    public static void f(StargateEggIntervalLogger p0,String p1,String p2,int p3,int p4,Object p5){
       if (p4 & 0x04) {
          p3 = 1;
       }
       p0.e(p1, p2, p3);
       return;
    }
    public final ClientEvent$ElementPackage a(String p0,String p1,String p2,int p3){
       ClientEvent$ElementPackage obj;
       if (PatchProxy.isSupport(StargateEggIntervalLogger.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, p2, Integer.valueOf(p3), this, StargateEggIntervalLogger.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new ClientEvent$ElementPackage();
       obj.action2 = p0;
       i3 oi3 = i3.f();
       oi3.d("activity_id", p1);
       oi3.d("type", p2);
       oi3.c("count", Integer.valueOf(p3));
       obj.params = oi3.e();
       return obj;
    }
    public final y0 b(){
       Object obj = PatchProxy.apply(null, this, StargateEggIntervalLogger.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return StargateEggIntervalLogger.d.getValue();
    }
    public final void c(String p0,String p1,int p2){
       if (PatchProxy.isSupport(StargateEggIntervalLogger.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, StargateEggIntervalLogger.class, "7")) {
          return;
       }
       a.p(p0, "id");
       a.p(p1, "type");
       if (!TextUtils.isEmpty(p0) && p2 > 0) {
          y0 oy0 = this.b();
          if (oy0 != null) {
             StargateEggIntervalLogger$a uoa = new StargateEggIntervalLogger$a(p0, p1);
             Map c = StargateEggIntervalLogger.c;
             Integer integer = c.get(uoa);
             int i = (integer != null)? integer.intValue(): 0;
             c.put(uoa, Integer.valueOf((i + p2)));
             oy0.a();
          }
       }
       return;
    }
    public final void e(String p0,String p1,int p2){
       if (PatchProxy.isSupport(StargateEggIntervalLogger.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, StargateEggIntervalLogger.class, "6")) {
          return;
       }
       a.p(p0, "id");
       a.p(p1, "type");
       if (!TextUtils.isEmpty(p0) && p2 > 0) {
          y0 oy0 = this.b();
          if (oy0 != null) {
             StargateEggIntervalLogger$a uoa = new StargateEggIntervalLogger$a(p0, p1);
             Map b = StargateEggIntervalLogger.b;
             Integer integer = b.get(uoa);
             int i = (integer != null)? integer.intValue(): 0;
             b.put(uoa, Integer.valueOf((i + p2)));
             oy0.a();
          }
       }
       return;
    }
}
