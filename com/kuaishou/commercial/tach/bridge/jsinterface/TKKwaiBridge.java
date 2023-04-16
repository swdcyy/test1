package com.kuaishou.commercial.tach.bridge.jsinterface.TKKwaiBridge;
import com.tachikoma.core.component.TKBaseNativeModule;
import gx4.f;
import android.content.Context;
import android.app.Activity;
import com.kwai.framework.activitycontext.ActivityContext;
import com.tachikoma.core.bridge.d;
import java.lang.String;
import oz.a;
import com.tkruntime.v8.V8Function;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.tkruntime.v8.V8Value;
import com.tkruntime.v8.JsValueRef;
import tx4.y;
import no8.a;
import java.lang.Boolean;
import java.lang.System;
import com.tachikoma.core.bridge.c;
import com.tkruntime.v8.V8;
import mp8.a;
import lp8.e;
import com.kuaishou.commercial.tach.bridge.jsinterface.TKKwaiBridge$a;
import com.kwai.bridge.a;
import kotlin.jvm.internal.a;
import org.json.JSONObject;
import p55.a;
import f55.g;
import java.lang.Float;
import java.util.Objects;
import com.kuaishou.commercial.tach.bridge.jsinterface.a;
import crd.a;
import com.tkruntime.v8.V8Object;
import java.lang.Throwable;
import wp8.a;
import com.tachikoma.core.bridge.a$b;
import java.util.concurrent.Executor;
import com.tachikoma.core.bridge.a;
import oz.d;
import java.lang.Runnable;
import com.kuaishou.commercial.tach.bridge.jsinterface.TKKwaiBridge$b;
import iq8.x;
import com.kuaishou.commercial.tach.bridge.jsinterface.TKKwaiBridge$Result;
import com.kwai.robust.PatchProxyResult;
import fg6.a;
import com.google.gson.Gson;
import com.yxcorp.utility.Log;

public class TKKwaiBridge extends TKBaseNativeModule	// class@001644
{
    public a f;

    public void TKKwaiBridge(f p0){
       super(p0);
       Context context = this.getContext();
       if (!context instanceof Activity) {
          context = ActivityContext.g().e();
       }
       d tKJSContext = this.getTKJSContext();
       String str = (tKJSContext == null)? "": tKJSContext.e();
       this.f = new a(context, str);
       return;
    }
    public void commonBridge(String p0,V8Function p1){
       String str;
       V8 v8;
       long l1;
       long l2;
       Object obj = this;
       Object obj1 = p0;
       TKKwaiBridge$a obj2 = p1;
       if (PatchProxy.applyVoidTwoRefs(obj1, obj2, obj, TKKwaiBridge.class, "1")) {
          return;
       }
       Object obj3 = null;
       JsValueRef jsValueRef = y.b(obj2, obj3);
       Boolean c = a.c;
       long l = 0;
       if (c.booleanValue()) {
          str = this.getJSContext().h();
          v8 = this.getJSContext().g().sessionId;
          l1 = System.nanoTime();
          l2 = a.n().m();
       }else {
          str = obj3;
          v8 = str;
          l1 = l;
          l2 = l1;
       }
       int i = 1;
       boolean[] uobooleanArr = new boolean[i];
       boolean b = false;
       uobooleanArr[b] = b;
       obj2 = v5;
       boolean[] uobooleanArr1 = uobooleanArr;
       TKKwaiBridge$a uoa = v5;
       boolean[] uobooleanArr2 = uobooleanArr;
       TKKwaiBridge tKKwaiBridge = obj.f;
       obj2 = new TKKwaiBridge$a(this, uobooleanArr1, str, v8, l2, l1, jsValueRef);
       if (!PatchProxy.applyVoidThreeRefs(tKKwaiBridge, p0, uoa, null, a.class, "17")) {
          a.q(obj1, "content");
          JSONObject jSONObject = new JSONObject(obj1);
          String str1 = jSONObject.optString("nameSpace");
          String str2 = jSONObject.optString("methodName");
          String str3 = "params";
          String str4 = jSONObject.optString(str3);
          a.h(str1, "nameSpace");
          a.h(str2, "methodName");
          a.h(str4, str3);
          a.f(tKKwaiBridge, str1, str2, str4, uoa);
       }
       if (c.booleanValue()) {
          if (!uobooleanArr2[b]) {
             uobooleanArr2[b] = i;
             float f = 1000.00f;
             a.n().g(str, v8, l2, "commonBridge", "cost", Float.valueOf((((float)(System.nanoTime() - l1) / f) / f)));
          }
          a.n().g(str, v8, l2, "commonBridge", "params", p0);
       }
       return;
    }
    public void destroy(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, TKKwaiBridge.class, "2")) {
          return;
       }
       TKKwaiBridge tf = this.f;
       Objects.requireNonNull(tf);
       if (!PatchProxy.applyVoid(objArray, tf, a.class, "1")) {
          a j = tf.j;
          if (j != null && !PatchProxy.applyVoid(objArray, j, a.class, "3")) {
             a f = j.f;
             if (f != null && !f.isDisposed()) {
                j.f.dispose();
             }
          }
       }
       return;
    }
    public void functionCall(JsValueRef p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TKKwaiBridge.class, "4")) {
          return;
       }
       if (p0 != null && y.a(p0.get())) {
          Object[] objArray = new Object[]{p1};
          p0.get().call(null, objArray);
       }
       y.c(p0);
       return;
    }
    public void onInvoke(JsValueRef p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TKKwaiBridge.class, "3")) {
          return;
       }
       if (this.getTKJSContext().j()) {
          a.b(false, this.getTKJSContext().b().f()).execute(new d(this, p0, p1));
       }else {
          x.b(new TKKwaiBridge$b(this, p0, p1));
       }
       return;
    }
    public String parseResult2Json(TKKwaiBridge$Result p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TKKwaiBridge.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          return a.a.q(p0);
       }catch(java.lang.Exception e3){
          Log.d("TKKwaiBridge", Log.f(e3));
          return "";
       }
    }
}
