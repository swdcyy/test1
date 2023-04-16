package com.tachikoma.core.bridge.d$b;
import java.lang.Object;
import java.util.Stack;
import com.tachikoma.core.bridge.d$b$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.tachikoma.core.component.e$e;
import java.lang.StringBuilder;

public class d$b	// class@000d45
{
    public int a;
    public Stack b;

    public void d$b(){
       super();
       this.a = 0;
       this.b = new Stack();
    }
    public d$b$a a(){
       Object obj = PatchProxy.apply(null, this, d$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.b.isEmpty()) {
          return null;
       }
       return this.b.peek();
    }
    public void b(e$e p0){
       Object obj = null;
       if (PatchProxy.applyVoidOneRefs(obj, this, d$b.class, "1")) {
          return;
       }
       d$b$a uob$a = new d$b$a();
       d$b ta = this.a;
       this.a = ta + 1;
       uob$a.a = this.toString()+"_"+ta;
       uob$a.b = obj;
       this.b.push(uob$a);
       return;
    }
}
