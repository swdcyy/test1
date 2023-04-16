package com.kwai.tokenshare.a;
import java.lang.Object;
import com.kwai.tokenshare.a$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import bu7.b;
import bu7.a;
import erd.g;
import crd.b;

public class a	// class@001918
{
    public b a;
    public int b;

    public void a(){
       super();
       this.b = 0;
    }
    public void a(a$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       this.b();
       this.a = t.interval(100, 200, TimeUnit.MILLISECONDS).observeOn(d.a).subscribe(new b(this, p0), new a(this));
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       a ta = this.a;
       if (ta != null && !ta.isDisposed()) {
          this.b = 0;
          this.a.dispose();
          this.a = null;
       }
       return;
    }
}
