package com.tachikoma.core.component.TKBaseNativeModule;
import gx4.a;
import gx4.f;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import zp8.a;
import com.tachikoma.core.component.TKBaseNativeModule$DestroyReason;
import iq8.x;
import android.content.Context;
import com.kwai.robust.PatchProxyResult;
import gx4.e;
import com.tachikoma.core.bridge.c;
import com.tachikoma.core.bridge.d;
import com.tkruntime.v8.V8Object;
import gx4.c;
import iq8.r;
import java.lang.RuntimeException;
import com.tkruntime.v8.V8Value;
import com.tkruntime.v8.JsValueRef;
import tx4.y;

public abstract class TKBaseNativeModule implements a	// class@000d4d
{
    public boolean b;
    public final V8Object c;
    public final e d;
    public JsValueRef e;
    public f mInitParams;

    public void TKBaseNativeModule(f p0){
       super();
       this.b = false;
       this.mInitParams = p0;
       this.d = p0.a;
       this.c = p0.c;
    }
    public final void destroy(boolean p0){
       TKBaseNativeModule tKBaseNative = TKBaseNativeModule.class;
       if (PatchProxy.isSupport(tKBaseNative) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, tKBaseNative, "1")) {
          return;
       }
       if (this.b != null) {
          a.c("TKBaseNativeModule is already destroy.");
       }else {
          this.b = true;
          if (!p0) {
             this.unRetainAllJsObj();
          }
          TKBaseNativeModule$DestroyReason rELEASE = (p0)? TKBaseNativeModule$DestroyReason.RELEASE: TKBaseNativeModule$DestroyReason.GC;
          this.onDestroy(rELEASE, x.c());
       }
       return;
    }
    public final Context getContext(){
       Object obj = PatchProxy.apply(null, this, TKBaseNativeModule.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d.getContext();
    }
    public c getJSContext(){
       Object obj = PatchProxy.apply(null, this, TKBaseNativeModule.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getTKJSContext().b();
    }
    public V8Object getJsObj(){
       return this.c;
    }
    public final c getNativeModule(V8Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TKBaseNativeModule.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       c uoc = this.getTKContext().a(p0);
       if (uoc != null || !r.a()) {
          return uoc;
       }
       throw new RuntimeException("获取 js object 对应的 native 对象返回了 null");
    }
    public String getRootDir(){
       Object obj = PatchProxy.apply(null, this, TKBaseNativeModule.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getTKJSContext().g();
    }
    public e getTKContext(){
       return this.d;
    }
    public d getTKJSContext(){
       Object obj = PatchProxy.apply(null, this, TKBaseNativeModule.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getTKContext();
    }
    public final boolean isDestroy(){
       return this.b;
    }
    public void onDestroy(TKBaseNativeModule$DestroyReason p0,boolean p1){
    }
    public V8Object retainJsObj(){
       if (this.e == null) {
          this.e = y.b(this.c, this);
       }
       TKBaseNativeModule te = this.e;
       V8Object v8Object = (te == null)? null: te.get();
       return v8Object;
    }
    public void unRetainAllJsObj(){
       if (PatchProxy.applyVoid(null, this, TKBaseNativeModule.class, "2")) {
          return;
       }
       y.c(this.e);
       return;
    }
    public void unRetainJsObj(){
       y.c(this.e);
    }
}
