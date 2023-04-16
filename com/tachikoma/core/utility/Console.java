package com.tachikoma.core.utility.Console;
import com.tachikoma.core.component.TKBaseNativeModule;
import gx4.f;
import iq8.r;
import com.tachikoma.core.bridge.d;
import com.tachikoma.core.bridge.c;
import java.lang.String;
import no8.e;
import oo8.t;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.tkruntime.v8.JsValueRef;
import com.tkruntime.v8.V8Object;
import tx4.y;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.lang.Boolean;
import com.tachikoma.core.debug.b;
import oo8.j;
import java.lang.System;
import java.io.PrintStream;
import com.tkruntime.v8.V8Array;
import java.util.Map;

public class Console extends TKBaseNativeModule	// class@000dcf
{
    public boolean f;
    public final String g;
    public static JsValueRef h;

    public void Console(f p0){
       super(p0);
       if (r.a()) {
          Console.h = this.getTKJSContext().f;
       }
       this.g = this.getJSContext().h();
       this.f = e.b().a().b();
       return;
    }
    public static void exception(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, Console.class, "7")) {
          return;
       }
       if (r.a()) {
          JsValueRef h = Console.h;
          if (h != null && y.a(h.get())) {
             Object[] objArray = new Object[]{p0};
             Console.h.get().executeJSFunction("error", objArray);
          }
       }
       return;
    }
    public final String d(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, Console.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Tachikoma-JS["+p0+"]";
    }
    public final boolean e(){
       boolean b;
       JsValueRef obj = PatchProxy.apply(null, this, Console.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (r.a() && b.d()) {
          obj = Console.h;
          if (obj != null && y.a(obj.get())) {
             b = true;
          label_0033 :
             return b;
          }
       }
       b = false;
       goto label_0033 ;
    }
    public void error(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Console.class, "6")) {
          return;
       }
       if (this.e()) {
          Object[] objArray = new Object[]{p0};
          Console.h.get().executeJSFunction("error", objArray);
       }
       p0 = this.f(p0);
       if (this.f != null) {
          String str = "ERROR";
          if (e.b().g() != null) {
             e.b().g().e(this.d(str), p0);
             return;
          }else if(r.a()){
             System.out.println(this.d(str)+p0);
          }
       }
       return;
    }
    public final String f(Object p0){
       String obj = PatchProxy.applyOneRefs(p0, this, Console.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "null";
       if (p0 == null) {
          return obj;
       }
       if (p0 instanceof String) {
          return p0;
       }
       if (p0 instanceof V8Array) {
          return "["+p0.toString()+"]";
       }
       if (!p0 instanceof V8Object) {
          return p0.toString();
       }
       p0 = p0.getAll();
       if (p0 == null) {
          return obj;
       }
       return p0.toString();
    }
    public void info(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Console.class, "4")) {
          return;
       }
       if (this.e()) {
          Object[] objArray = new Object[]{p0};
          Console.h.get().executeJSFunction("info", objArray);
       }
       p0 = this.f(p0);
       if (this.f != null) {
          String str = "INFO";
          if (e.b().g() != null) {
             e.b().g().i(this.d(str), p0);
             return;
          }else if(r.a()){
             System.out.println(this.d(str)+p0);
          }
       }
       return;
    }
    public void log(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Console.class, "3")) {
          return;
       }
       if (this.e()) {
          Object[] objArray = new Object[]{p0};
          Console.h.get().executeJSFunction("log", objArray);
       }
       p0 = this.f(p0);
       if (this.f != null) {
          String str = "LOG";
          if (e.b().g() != null) {
             e.b().g().i(this.d(str), p0);
             return;
          }else if(r.a()){
             System.out.println(this.d(str)+p0);
          }
       }
       return;
    }
    public void warn(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Console.class, "5")) {
          return;
       }
       if (this.e()) {
          Object[] objArray = new Object[]{p0};
          Console.h.get().executeJSFunction("warn", objArray);
       }
       p0 = this.f(p0);
       if (this.f != null) {
          String str = "WARN";
          if (e.b().g() != null) {
             e.b().g().w(this.d(str), p0);
             return;
          }else if(r.a()){
             System.out.println(this.d(str)+p0);
          }
       }
       return;
    }
}
