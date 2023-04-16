package com.tachikoma.core.component.e$c;
import java.lang.Runnable;
import com.tachikoma.core.component.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class e$c implements Runnable	// class@000d6a
{
    public final e b;

    public void e$c(e p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, e$c.class, "1")) {
          return;
       }
       e.access$600(this.b);
       return;
    }
}
