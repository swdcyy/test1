package com.tachikoma.core.module.TKBaseBridge;
import oo8.c;
import com.tachikoma.core.component.TKBaseNativeModule;
import gx4.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.tachikoma.core.bridge.d;
import com.tkruntime.v8.V8Function;
import no8.a;
import java.lang.Boolean;
import mp8.b;
import lp8.e;
import java.lang.StringBuilder;
import java.lang.System;
import java.util.HashMap;
import java.lang.Float;
import com.tachikoma.core.bridge.c;
import com.tkruntime.v8.V8;
import java.util.Map;

public class TKBaseBridge extends TKBaseNativeModule implements c	// class@000dcb
{

    public void TKBaseBridge(f p0){
       super(p0);
    }
    public final c d(){
       Object obj = PatchProxy.apply(null, this, TKBaseBridge.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getTKJSContext().p;
    }
    public Object invoke(String p0,String p1,V8Function p2){
       long l1;
       Boolean obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, TKBaseBridge.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.c;
       long l = 0;
       if (obj.booleanValue()) {
          l = b.n().m();
          if (p2 != null) {
             p2.setFunctionName("TKBaseBridge_invoke"+p0+"_callback");
          }
          l1 = l;
          l = System.nanoTime();
       }else {
          l1 = l;
       }
       p2 = this.d().invoke(p0, p1, p2);
       if (obj.booleanValue()) {
          HashMap hashMap = new HashMap();
          String str = "null";
          if (p1 == null) {
             p1 = str;
          }
          hashMap.put("jsonData", p1);
          hashMap.put("cost", Float.valueOf((((float)(System.nanoTime() - l) / 1000.00f) / 1000.00f)));
          if (p2 != null) {
             str = p2;
          }
          hashMap.put("return", str);
          b.n().h(this.getJSContext().h(), this.getJSContext().g().sessionId, l1, p0, hashMap);
       }
       return p2;
    }
    public Object invokeM(String p0,String p1,String p2,V8Function p3){
       long l1;
       Boolean obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, TKBaseBridge.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.c;
       long l = 0;
       if (obj.booleanValue()) {
          l = b.n().m();
          if (p3 != null) {
             p3.setFunctionName("TKBaseBridge_invokeM"+p1+"_callback");
          }
          l1 = l;
          l = System.nanoTime();
       }else {
          l1 = l;
       }
       p3 = this.d().invokeM(p0, p1, p2, p3);
       if (obj.booleanValue()) {
          HashMap hashMap = new HashMap();
          hashMap.put("moduleName", p0);
          p0 = "null";
          if (p2 == null) {
             p2 = p0;
          }
          hashMap.put("jsonData", p2);
          hashMap.put("cost", Float.valueOf((((float)(System.nanoTime() - l) / 1000.00f) / 1000.00f)));
          if (p3 != null) {
             p0 = p3;
          }
          hashMap.put("return", p0);
          b.n().h(this.getJSContext().h(), this.getJSContext().g().sessionId, l1, p1, hashMap);
       }
       return p3;
    }
}
