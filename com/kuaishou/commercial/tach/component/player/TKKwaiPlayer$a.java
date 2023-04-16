package com.kuaishou.commercial.tach.component.player.TKKwaiPlayer$a;
import java.lang.Runnable;
import com.kuaishou.commercial.tach.component.player.TKKwaiPlayer;
import xx6.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.tkruntime.v8.JsValueRef;
import com.tkruntime.v8.V8Object;
import tx4.y;
import com.tkruntime.v8.V8Function;
import com.tkruntime.v8.NativeObjectWrapper;
import com.tachikoma.core.bridge.d;
import com.tachikoma.core.component.TKBaseNativeModule;
import java.lang.Throwable;
import wp8.a;

public class TKKwaiPlayer$a implements Runnable	// class@00166c
{
    public final e b;
    public final TKKwaiPlayer c;

    public void TKKwaiPlayer$a(TKKwaiPlayer p0,e p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, TKKwaiPlayer$a.class, "1")) {
          return;
       }
       TKKwaiPlayer onSessionRep = this.c.onSessionReportRef;
       if (onSessionRep != null && y.a(onSessionRep.get())) {
          Object[] objArray = new Object[]{NativeObjectWrapper.wrapNativeObject(this.b)};
          this.c.onSessionReportRef.get().call(null, objArray);
       }
    label_0043 :
       return;
    }
}
