package com.kuaishou.tachikoma.api.TachikomaBundleApi;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import oo8.h;
import com.kuaishou.tachikoma.api.TachikomaBundleApi$1;
import tw4.o;
import android.app.Application;
import tw4.a;
import java.lang.Boolean;
import com.tkruntime.v8.V8Trace;
import zu6.b;
import brd.a0;
import java.lang.Exception;
import java.lang.Throwable;
import java.lang.StringBuilder;
import qp8.d;
import com.tachikoma.core.bridge.d;
import wp8.a;

public class TachikomaBundleApi	// class@000f5f
{
    public o a;
    public Application b;
    public boolean c;
    public static TachikomaBundleApi d;

    public void TachikomaBundleApi(){
       super();
       this.c = false;
    }
    public static TachikomaBundleApi c(){
       TachikomaBundleApi tachikomaBun = TachikomaBundleApi.class;
       Object obj = PatchProxy.apply(null, null, tachikomaBun, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TachikomaBundleApi.d == null) {
          _monitor_enter(tachikomaBun);
          if (TachikomaBundleApi.d == null) {
             TachikomaBundleApi.d = new TachikomaBundleApi();
          }
          _monitor_exit(tachikomaBun);
       }
       return TachikomaBundleApi.d;
    }
    public final h a(h p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TachikomaBundleApi.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new TachikomaBundleApi$1(this, p0);
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, TachikomaBundleApi.class, "10")) {
          return;
       }
       TachikomaBundleApi ta = this.a;
       if (ta != null) {
          ta.h();
       }else {
          this.h();
       }
       return;
    }
    public synchronized void d(Application p0,o p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TachikomaBundleApi.class, "2")) {
          return;
       }
       if (this.c != null) {
          return;
       }
       if (a.c.booleanValue()) {
          V8Trace.traceLog("TachikomaBundleApi", "init");
       }
       this.c = true;
       this.b = p0;
       this.a = p1;
       return;
    }
    public a0 e(b p0){
       TachikomaBundleApi obj = PatchProxy.applyOneRefs(p0, this, TachikomaBundleApi.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a;
       if (obj != null) {
          return obj.F(p0);
       }
       this.h();
       return a0.s(new Exception("mBundleService is null"));
    }
    public a0 f(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TachikomaBundleApi.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.a != null) {
          if (a.c.booleanValue()) {
             V8Trace.traceLog("installBundle", "installBundleById");
          }
          return this.a.b(p0);
       }else {
          this.h();
          return a0.s(new Exception("mBundleService is null"));
       }
    }
    public a0 g(String p0,int p1,h p2){
       if (this.a != null) {
          if (a.c.booleanValue()) {
             V8Trace.traceLog("loadBundle", "loadTKBundleByIdWithInstallAndTrace: bundleId = "+p0+", minBundleVersion = "+p1);
             d.p().i(p0, "", "loadBundle");
          }
          return this.a.d(p0, p1, this.a(p2));
       }else {
          this.h();
          return a0.s(new Exception("mBundleService is null"));
       }
    }
    public final void h(){
       if (PatchProxy.applyVoid(null, this, TachikomaBundleApi.class, "15")) {
          return;
       }
       a.d(null, new Exception("mBundleService is null"));
       return;
    }
    public a0 i(String p0){
       TachikomaBundleApi obj = PatchProxy.applyOneRefs(p0, this, TachikomaBundleApi.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a;
       if (obj != null) {
          return obj.g(p0);
       }
       this.h();
       return a0.B(Boolean.FALSE);
    }
}
