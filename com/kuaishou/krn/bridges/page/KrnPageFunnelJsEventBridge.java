package com.kuaishou.krn.bridges.page.KrnPageFunnelJsEventBridge;
import com.kuaishou.krn.base.KrnBridge;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.String;
import com.facebook.react.bridge.ReadableMap;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Double;
import java.lang.Object;
import lj0.c;
import lj0.d;
import bk0.k;
import java.lang.Long;
import java.util.Map;
import java.util.Objects;
import com.kuaishou.krn.log.model.KrnPageFunnelLoadTime;
import java.lang.Throwable;
import java.lang.RuntimeException;

public class KrnPageFunnelJsEventBridge extends KrnBridge	// class@00082d
{

    public void KrnPageFunnelJsEventBridge(ReactApplicationContext p0){
       super(p0);
    }
    public String getName(){
       return "KrnPageFunnelJsEventBridge";
    }
    public void onFMPTimeCompleted(int p0,double p1,ReadableMap p2){
       if (PatchProxy.isSupport(KrnPageFunnelJsEventBridge.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Double.valueOf(p1), p2, this, KrnPageFunnelJsEventBridge.class, "3")) {
          return;
       }
       c uoc = d.b(p0);
       if (uoc != null && uoc.g() != null) {
          k ok = uoc.g();
          Long longx = Long.valueOf((long)p1);
          Objects.requireNonNull(ok);
          if (!PatchProxy.applyVoidTwoRefs(longx, this.toHashMap(p2), ok, k.class, "19") && longx != null) {
             ok.c.setFmpTime(longx);
             k.I(ok, "FMP", null, 2, null);
          }
       }
       return;
    }
    public void onJsDataRequestEnd(int p0,double p1,int p2,ReadableMap p3){
       if (PatchProxy.isSupport(KrnPageFunnelJsEventBridge.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Double.valueOf(p1), Integer.valueOf(p2), p3, this, KrnPageFunnelJsEventBridge.class, "2")) {
          return;
       }
       c uoc = d.b(p0);
       if (uoc != null && uoc.g() != null) {
          k ok = uoc.g();
          Long longx = Long.valueOf((long)p1);
          Map map = this.toHashMap(p3);
          Objects.requireNonNull(ok);
          if (!PatchProxy.isSupport(k.class) || (!PatchProxy.applyVoidThreeRefs(longx, Integer.valueOf(p2), map, ok, k.class, "21") && longx != null)) {
             ok.c.setJsDataRequestEndTime(longx);
             if (!p2) {
                ok.G("JS_DATA_REQUEST_END", new RuntimeException("js data request failed"));
             }
          }
       }
       return;
    }
    public void onJsDataRequestStart(int p0,double p1,ReadableMap p2){
       if (PatchProxy.isSupport(KrnPageFunnelJsEventBridge.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Double.valueOf(p1), p2, this, KrnPageFunnelJsEventBridge.class, "1")) {
          return;
       }
       c uoc = d.b(p0);
       if (uoc != null && uoc.g() != null) {
          k ok = uoc.g();
          Long longx = Long.valueOf((long)p1);
          Objects.requireNonNull(ok);
          if (!PatchProxy.applyVoidTwoRefs(longx, this.toHashMap(p2), ok, k.class, "20") && longx != null) {
             ok.c.setJsDataRequestStartTime(longx);
          }
       }
       return;
    }
}
