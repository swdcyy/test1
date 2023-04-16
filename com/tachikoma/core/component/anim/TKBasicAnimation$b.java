package com.tachikoma.core.component.anim.TKBasicAnimation$b;
import java.lang.Runnable;
import com.tachikoma.core.component.anim.TKBasicAnimation;
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

public class TKBasicAnimation$b implements Runnable	// class@000d5a
{
    public final TKBasicAnimation b;

    public void TKBasicAnimation$b(TKBasicAnimation p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, TKBasicAnimation$b.class, "1")) {
          return;
       }
       TKBasicAnimation animNJStartL = this.b.animNJStartListenerRef;
       if (animNJStartL != null && y.a(animNJStartL.get())) {
          Object[] objArray = new Object[0];
          this.b.animNJStartListenerRef.get().call(null, objArray);
       }
    label_0039 :
       return;
    }
}
