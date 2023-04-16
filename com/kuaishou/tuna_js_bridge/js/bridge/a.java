package com.kuaishou.tuna_js_bridge.js.bridge.a;
import dy5.a;
import java.lang.Object;
import dy5.e;
import dy5.d;
import dy5.h;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import fg6.a;
import com.google.gson.Gson;
import lnc.i3;
import k2b.u1;
import com.kuaishou.tuna_logger.KsLogTunaCoreTag;
import java.util.List;
import wx4.e;
import msd.a;
import java.lang.Throwable;
import c15.b;
import android.app.Activity;
import com.kwai.feature.api.tuna.BusinessJsBridgeResult;
import java.io.Serializable;

public class a	// class@001145
{
    public e a;
    public a b;

    public void a(a p0){
       super();
       this.b = p0;
    }
    public void a(e p0){
       super();
       this.a = p0;
    }
    public void a(d p0,Object p1,h p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a.class, "2")) {
          return;
       }
       String str = PatchProxy.applyOneRefs(p1, this, a.class, "3");
       if (str != PatchProxyResult.class) {
       }else {
          str = a.a.q(p1);
          if (str == null) {
             str = "";
          }
       }
       i3 oi3 = i3.f();
       oi3.d("model", str);
       String str1 = oi3.e();
       try{
          u1.R("TUNA_BRIDGE_RESULT", str1, 10);
          this.b(p0, p1, p2);
       }catch(java.lang.Exception e7){
          b.e(KsLogTunaCoreTag.TUNA_BRIDGE.appendTag("TunaBridge"), new e(str), e7);
       }
       return;
    }
    public final void b(d p0,Object p1,h p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a.class, "1")) {
          return;
       }
       if (p1 == null || p0.c() == null) {
          p2.a(902, "params is null");
          return;
       }else {
          a ta = this.a;
          if (ta != null) {
             BusinessJsBridgeResult uBusinessJsB = ta.a(p0, p1);
             if (uBusinessJsB != null) {
                if (uBusinessJsB.getResult() == 1) {
                   p2.b(uBusinessJsB.getData());
                }else {
                   p2.a(uBusinessJsB.getResult(), uBusinessJsB.getErrorMsg());
                }
             }
          }else {
             ta = this.b;
             if (ta != null) {
                ta.a(p0, p1, p2);
             }
          }
          return;
       }
    }
}
