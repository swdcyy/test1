package com.yxcorp.gifshow.performance.monitor.PerformanceMonitorLogger$BlockEventStringTypeAdapter;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.google.gson.stream.JsonToken;
import mwb.d;
import java.lang.Enum;
import com.google.gson.internal.LinkedTreeMap;
import java.util.Map;
import fg6.a;
import com.google.gson.Gson;
import java.lang.IllegalStateException;
import com.google.gson.stream.b;

public final class PerformanceMonitorLogger$BlockEventStringTypeAdapter extends TypeAdapter	// class@001293
{

    public void PerformanceMonitorLogger$BlockEventStringTypeAdapter(){
       super();
    }
    public String a(a p0){
       String str;
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PerformanceMonitorLogger$BlockEventStringTypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "reader");
       obj = p0.J();
       if (obj != null) {
          int i = d.a[obj.ordinal()];
          if (i != 1) {
             if (i != 2) {
                if (i == 3) {
                   p0.A();
                   str = null;
                }
             }else {
                str = p0.E();
             }
          }else {
             LinkedTreeMap linkedTreeMa = new LinkedTreeMap();
             p0.c();
             while (p0.l()) {
                linkedTreeMa.put(p0.y(), this.a(p0));
             }
             p0.j();
             str = a.a.q(linkedTreeMa);
          }
          return str;
       }
       throw new IllegalStateException();
    }
    public Object read(a p0){
       return this.a(p0);
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PerformanceMonitorLogger$BlockEventStringTypeAdapter.class, "1")) {
       }else {
          a.p(p0, "out");
          if (p1 == null) {
             p0.u();
          }else {
             p0.O(p1);
          }
       }
       return;
    }
}
