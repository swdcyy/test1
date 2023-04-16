package com.tachikoma.core.component.network.Network$a;
import tx4.i;
import com.tachikoma.core.component.network.Network;
import com.tkruntime.v8.V8Function;
import java.lang.Object;
import tx4.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.tachikoma.core.bridge.d;
import com.tachikoma.core.component.TKBaseNativeModule;
import com.tachikoma.core.bridge.c;
import com.tachikoma.core.bridge.a$b;
import java.util.concurrent.Executor;
import com.tachikoma.core.bridge.a;
import bp8.b;
import java.lang.Runnable;
import tx4.u;
import bp8.a;

public class Network$a implements i	// class@000d7d
{
    public final V8Function a;
    public final Network b;

    public void Network$a(Network p0,V8Function p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Network$a.class, "2")) {
          return;
       }
       if (this.b.getTKJSContext().j()) {
          a.b(false, this.b.getTKJSContext().b().f()).execute(new b(this, p0, this.a));
       }else {
          this.b.onPostError(p0, this.a);
       }
       return;
    }
    public void b(u p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Network$a.class, "1")) {
          return;
       }
       if (this.b.getTKJSContext().j()) {
          a.b(false, this.b.getTKJSContext().b().f()).execute(new a(this, p0, this.a));
       }else {
          this.b.onPostSuccess(p0, this.a);
       }
       return;
    }
}
