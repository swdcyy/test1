package com.tachikoma.core.bridge.TachikomaGlobalObject$b$a;
import java.lang.Runnable;
import com.tachikoma.core.bridge.TachikomaGlobalObject$b;
import java.io.File;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.tkruntime.v8.JsValueRef;
import com.tkruntime.v8.V8Object;
import tx4.y;
import com.tkruntime.v8.V8Function;
import com.tachikoma.core.bridge.d;
import com.tachikoma.core.component.TKBaseNativeModule;
import java.lang.Throwable;
import wp8.a;

public class TachikomaGlobalObject$b$a implements Runnable	// class@000d39
{
    public final File b;
    public final TachikomaGlobalObject$b c;

    public void TachikomaGlobalObject$b$a(TachikomaGlobalObject$b p0,File p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, TachikomaGlobalObject$b$a.class, "1")) {
          return;
       }
       TachikomaGlobalObject$b c = this.c.c;
       if (c != null && y.a(c.get())) {
          TachikomaGlobalObject$b$a tb = this.b;
          int i = 0;
          if (tb != null) {
             Object[] objArray = new Object[]{tb.getAbsolutePath()};
             this.c.c.get().call(null, objArray);
          }else {
             Object[] objArray1 = new Object[i];
             this.c.c.get().call(null, objArray1);
          }
          y.c(this.c.c);
       }
       return;
    }
}
