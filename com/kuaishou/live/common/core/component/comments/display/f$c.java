package com.kuaishou.live.common.core.component.comments.display.f$c;
import java.lang.Runnable;
import com.kuaishou.live.common.core.component.comments.display.f;
import java.lang.Object;
import java.lang.ref.WeakReference;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class f$c implements Runnable	// class@001076
{
    public final WeakReference b;

    public void f$c(f p0){
       super();
       this.b = new WeakReference(p0);
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, f$c.class, "1")) {
          return;
       }
       f uof = this.b.get();
       if (uof != null) {
          uof.g();
       }
       return;
    }
}
