package com.facebook.react.uimanager.e$a;
import com.facebook.react.uimanager.f$b;
import com.facebook.react.uimanager.e;
import java.lang.Object;
import gf.i;
import ze.x;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import gf.f;
import java.lang.Integer;
import java.util.Objects;
import java.lang.ref.WeakReference;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.util.RCTLog;
import com.facebook.react.bridge.JavaScriptModule;
import java.util.Locale;
import android.graphics.Rect;

public class e$a implements f$b	// class@00133e
{
    public i a;
    public final e b;

    public void e$a(e p0){
       this.b = p0;
       super();
       this.a = new i();
    }
    public void a(x p0,boolean p1){
       e$a uoa = e$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoa, "1")) {
          return;
       }
       uoa = this.a;
       uoa.b = uoa.b + 1;
       this.b.c.b(p0, p1);
       return;
    }
    public void b(x p0,int p1){
       e$a tb;
       e c;
       e$a uoa = e$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "2")) {
          return;
       }
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p1), this, uoa, "3")) {
          tb = this.a;
          tb.a = p1;
          e a = this.b.a;
          Objects.requireNonNull(a);
          i b = tb.b;
          if (b > a.b) {
             a.b = b;
          }
          b = tb.a;
          if (b > a.a) {
             a.a = b;
          }
          a.c = tb.b;
          a.d = tb.a;
          this.a = new i();
       }
       if (!PatchProxy.applyVoid(null, this, uoa, "4")) {
          tb = this.b;
          if (tb.c.a > 50) {
             ReactContext reactContext = tb.d.get();
             if (reactContext != null && reactContext.hasActiveCatalystInstance()) {
                CatalystInstance catalystInst = reactContext.getCatalystInstance();
                if (catalystInst.useDeveloperSupport() && this.b.e == null) {
                   RCTLog jSModule = catalystInst.getJSModule(RCTLog.class);
                   if (jSModule != null) {
                      Object[] objArray = new Object[]{Integer.valueOf(this.b.c.b),Integer.valueOf(this.b.c.a),c.c,c.d.toString()};
                      c = this.b.c;
                      jSModule.logIfNoNativeHook("warn", String.format(Locale.US, "Layout TOO MUCH!!! tag:%d layoutCount:%d className:%s Location:%s", objArray));
                      jSModule.e = true;
                   }
                }
             }
          }
          tb = this.b;
          tb.b = tb.c;
       }
       return;
    }
    public void c(x p0){
    }
}
