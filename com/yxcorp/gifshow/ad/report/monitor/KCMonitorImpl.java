package com.yxcorp.gifshow.ad.report.monitor.KCMonitorImpl;
import p49.f;
import p49.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.ad.report.monitor.KCMonitorImpl$mRealRatio$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.ad.report.monitor.KCMonitorImpl$mCanReport$2;
import q35.c$a;
import p49.a;
import com.yxcorp.gifshow.ad.report.monitor.KCMonitorImpl$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Float;
import java.lang.Number;
import yx.j0;
import q35.c;
import com.google.gson.JsonObject;
import java.math.BigDecimal;
import java.lang.Double;
import java.lang.CharSequence;
import o35.b;
import java.util.Objects;
import java.lang.StringBuilder;

public final class KCMonitorImpl implements f	// class@0017bc
{
    public Float b;
    public String c;
    public int d;
    public final p e;
    public final p f;
    public final c g;

    public void KCMonitorImpl(c p0){
       a.p(p0, "mEventId");
       super();
       this.g = p0;
       this.d = 1;
       this.e = s.c(new KCMonitorImpl$mRealRatio$2(this));
       this.f = s.c(new KCMonitorImpl$mCanReport$2(this));
    }
    public static boolean l(KCMonitorImpl p0,c$a p1,a p2,KCMonitorImpl$a p3,int p4,Object p5){
       return p0.k(p1, p2, null);
    }
    public boolean a(String p0,boolean p1,a p2){
       c$a obj;
       if (PatchProxy.isSupport(KCMonitorImpl.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Boolean.valueOf(p1), p2, this, KCMonitorImpl.class, "8");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       a.p(p0, "sessionId");
       a.p(p2, "assembleLog");
       obj = c$a.b();
       a.o(obj, "RTLog.Builder.getAPMLogBuilder\(\)");
       return this.k(obj, p2, new KCMonitorImpl$a(p1, p0));
    }
    public f b(float p0){
       KCMonitorImpl kCMonitorImp = KCMonitorImpl.class;
       if (PatchProxy.isSupport(kCMonitorImp)) {
          Object obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, kCMonitorImp, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.b = Float.valueOf(p0);
       return this;
    }
    public boolean c(){
       Object obj = PatchProxy.apply(null, this, KCMonitorImpl.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.i();
    }
    public f d(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KCMonitorImpl.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "custom");
       this.c = p0;
       return this;
    }
    public boolean e(String p0,boolean p1,a p2){
       c$a obj;
       if (PatchProxy.isSupport(KCMonitorImpl.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Boolean.valueOf(p1), p2, this, KCMonitorImpl.class, "7");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       a.p(p0, "sessionId");
       a.p(p2, "assembleLog");
       obj = c$a.c();
       a.o(obj, "RTLog.Builder.getRELogBuilder\(\)");
       return this.k(obj, p2, new KCMonitorImpl$a(p1, p0));
    }
    public f f(int p0){
       this.d = p0;
       return this;
    }
    public boolean g(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KCMonitorImpl.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "assembleLog");
       c$a uoa = c$a.c();
       a.o(uoa, "RTLog.Builder.getRELogBuilder\(\)");
       return KCMonitorImpl.l(this, uoa, p0, null, 4, null);
    }
    public boolean h(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KCMonitorImpl.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "assembleLog");
       c$a uoa = c$a.b();
       a.o(uoa, "RTLog.Builder.getAPMLogBuilder\(\)");
       return KCMonitorImpl.l(this, uoa, p0, null, 4, null);
    }
    public final boolean i(){
       Object obj = PatchProxy.apply(null, this, KCMonitorImpl.class, "2");
       if (obj == PatchProxyResult.class) {
          obj = this.f.getValue();
       }
       return obj.booleanValue();
    }
    public final float j(){
       Object obj = PatchProxy.apply(null, this, KCMonitorImpl.class, "1");
       if (obj == PatchProxyResult.class) {
          obj = this.e.getValue();
       }
       return obj.floatValue();
    }
    public final boolean k(c$a p0,a p1,KCMonitorImpl$a p2){
       String str1;
       j0 oj0 = j0.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, KCMonitorImpl.class, "9");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this.i()) {
          p1.a(p0);
          p0.e(this.g.a());
          c uoc = p0.a();
          if (uoc != null) {
             if (PatchProxy.applyOneRefs(uoc, this, KCMonitorImpl.class, "10") != patchProxyRe) {
             }else {
                c f = uoc.f;
                if (f != null) {
                   f.a0("ratio", Float.valueOf(this.j()));
                   double d = (this.j() - null <= 0)? 0: super(String.valueOf(0x3ff0000000000000)).divide(new BigDecimal(String.valueOf(this.j())), 0, 4).doubleValue();
                   f.a0("ratio_count", Double.valueOf(d));
                }
             }
          }
          if (p2 != null) {
             KCMonitorImpl$a uoa = (!p2.a().length())? 1: null;
             if (!uoa) {
                String str = "sessionId";
                if (p2.a != null) {
                   str1 = p2.a();
                   if (!PatchProxy.applyVoidTwoRefs(uoc, str1, null, oj0, "14")) {
                      a.p(str1, str);
                      b uob = b.g();
                      Objects.requireNonNull(uob);
                      if (!PatchProxy.applyVoidTwoRefs(uoc, str1, uob, b.class, "18")) {
                         String[] stringArray = new String[b];
                         stringArray[0] = str1;
                         uob.n(uoc, stringArray, 0, 0x3f800000);
                      }
                   }
                }else {
                   str1 = p2.a();
                   if (!PatchProxy.applyVoidTwoRefs(uoc, str1, null, oj0, "13")) {
                      a.p(str1, str);
                      b.g().m(uoc, str1);
                   }
                }
             }
          }
          j0.g(uoc);
       }else {
          Object[] objArray = new Object[0];
          j0.f("KCMonitor", "can not report "+this.g, objArray);
          b = false;
       }
    label_0103 :
       return b;
    }
}
