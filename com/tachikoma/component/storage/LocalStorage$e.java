package com.tachikoma.component.storage.LocalStorage$e;
import java.lang.Runnable;
import com.tachikoma.component.storage.LocalStorage;
import com.tkruntime.v8.JsValueRef;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.tachikoma.core.component.TKBaseNativeModule;
import com.tkruntime.v8.V8Object;
import tx4.y;
import com.tkruntime.v8.V8Function;
import com.tachikoma.core.bridge.d;
import java.lang.Throwable;
import wp8.a;

public class LocalStorage$e implements Runnable	// class@000d2c
{
    public final JsValueRef b;
    public final boolean c;
    public final Object d;
    public final Map e;
    public final LocalStorage f;

    public void LocalStorage$e(LocalStorage p0,JsValueRef p1,boolean p2,Object p3,Map p4){
       this.f = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, LocalStorage$e.class, "1")) {
          return;
       }
       if (this.f.isDestroy()) {
          return;
       }
       LocalStorage$e tb = this.b;
       if (tb != null && y.a(tb.get())) {
          int i = 0;
          int i1 = 1;
          if (this.c != null) {
             Object[] objArray = new Object[]{this.d,this.e};
             this.b.get().call(null, objArray);
          }else {
             Object[] objArray1 = new Object[i1];
             objArray1[i] = this.e;
             this.b.get().call(null, objArray1);
          }
       }
       return;
    }
}
