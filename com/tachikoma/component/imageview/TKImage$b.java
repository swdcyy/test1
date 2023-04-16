package com.tachikoma.component.imageview.TKImage$b;
import vn8.v$b;
import com.tachikoma.component.imageview.TKImage;
import com.tkruntime.v8.V8Function;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.tkruntime.v8.V8Value;
import com.tkruntime.v8.JsValueRef;
import tx4.y;
import com.tkruntime.v8.V8Object;
import com.tachikoma.core.bridge.d;
import com.tachikoma.core.component.TKBaseNativeModule;
import java.lang.Throwable;
import wp8.a;

public class TKImage$b implements v$b	// class@000cfb
{
    public final V8Function a;
    public final TKImage b;

    public void TKImage$b(TKImage p0,V8Function p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(int p0,String p1){
       TKImage$b uob = TKImage$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uob, "1")) {
          return;
       }
       JsValueRef jsValueRef = y.b(this.a, this);
       if (jsValueRef == null) {
          return;
       }
       if (y.a(jsValueRef.get())) {
          try{
             Object[] objArray = new Object[]{p1,Integer.valueOf(p0)};
             jsValueRef.get().call(null, objArray);
          }catch(java.lang.Exception e5){
             a.b(e5, this.b.getTKJSContext().hashCode());
          }
       }
    }
}
