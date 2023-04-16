package com.tachikoma.core.component.e$b$a;
import java.lang.Runnable;
import com.tachikoma.core.component.e$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.tachikoma.core.component.e;
import com.tkruntime.v8.JsValueRef;
import com.tkruntime.v8.V8Object;
import tx4.y;
import com.tachikoma.core.component.TKBaseNativeModule;
import com.tkruntime.v8.V8Function;
import iq8.n;
import java.lang.Integer;
import com.tachikoma.core.bridge.d;
import java.lang.Throwable;
import wp8.a;

public class e$b$a implements Runnable	// class@000d68
{
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final e$b f;

    public void e$b$a(e$b p0,int p1,int p2,int p3,int p4){
       this.f = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, e$b$a.class, "1")) {
          return;
       }
       e mLayoutObser = this.f.c.mLayoutObserverRef;
       if (mLayoutObser != null && y.a(mLayoutObser.get())) {
          if (this.f.c.isDestroy()) {
             return;
          }else {
             Object[] objArray = new Object[]{Integer.valueOf(n.f(this.b)),Integer.valueOf(n.f(this.c)),Integer.valueOf(n.f(this.d)),Integer.valueOf(n.f(this.e))};
             this.f.c.mLayoutObserverRef.get().call(null, objArray);
             y.c(this.f.c.mLayoutObserverRef);
          }
       }
       return;
    }
}
