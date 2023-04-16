package com.kuaishou.commercial.tach.bridge.jsinterface.TKKwaiBridge$a;
import f55.g;
import com.kuaishou.commercial.tach.bridge.jsinterface.TKKwaiBridge;
import java.lang.String;
import com.tkruntime.v8.JsValueRef;
import java.lang.Object;
import android.os.Bundle;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kuaishou.commercial.tach.bridge.jsinterface.TKKwaiBridge$Result;
import no8.a;
import java.lang.Boolean;
import mp8.a;
import java.lang.System;
import java.lang.Float;
import lp8.e;

public class TKKwaiBridge$a implements g	// class@001642
{
    public final boolean[] b;
    public final String c;
    public final String d;
    public final long e;
    public final long f;
    public final JsValueRef g;
    public final TKKwaiBridge h;

    public void TKKwaiBridge$a(TKKwaiBridge p0,boolean[] p1,String p2,String p3,long p4,long p5,JsValueRef p6){
       this.h = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       super();
    }
    public void a(int p0,String p1,Bundle p2){
       if (PatchProxy.isSupport(TKKwaiBridge$a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, TKKwaiBridge$a.class, "2")) {
          return;
       }
       TKKwaiBridge$Result result = new TKKwaiBridge$Result(null);
       result.mResult = p0;
       result.mMessage = p1;
       String str = this.h.parseResult2Json(result);
       if (a.c.booleanValue()) {
          TKKwaiBridge$a tb = this.b;
          int i = 0;
          if (!tb[i]) {
             tb[i] = true;
             float f = 1000.00f;
             a.n().g(this.c, this.d, this.e, "commonBridge", "cost", Float.valueOf((((float)(System.nanoTime() - this.f) / f) / f)));
          }
          a.n().g(this.c, this.d, this.e, "commonBridge", "return", str);
       }
       this.h.onInvoke(this.g, str);
       return;
    }
    public void onSuccess(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKKwaiBridge$a.class, "1")) {
          return;
       }
       TKKwaiBridge$Result result = new TKKwaiBridge$Result(null);
       int i = 1;
       result.mResult = i;
       result.mData = p0;
       p0 = this.h.parseResult2Json(result);
       if (a.c.booleanValue()) {
          TKKwaiBridge$a tb = this.b;
          int i1 = 0;
          if (!tb[i1]) {
             tb[i1] = i;
             float f = 1000.00f;
             a.n().g(this.c, this.d, this.e, "commonBridge", "cost", Float.valueOf((((float)(System.nanoTime() - this.f) / f) / f)));
          }
          a.n().g(this.c, this.d, this.e, "commonBridge", "return", p0);
       }
       this.h.onInvoke(this.g, p0);
       return;
    }
}
