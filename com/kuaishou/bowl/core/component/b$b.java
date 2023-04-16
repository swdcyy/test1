package com.kuaishou.bowl.core.component.b$b;
import java.lang.Runnable;
import com.kuaishou.bowl.core.component.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.bowl.core.component.a;

public class b$b implements Runnable	// class@00119e
{
    public final b b;

    public void b$b(b p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, b$b.class, "1")) {
          return;
       }
       this.b.reportModuleShowEvent();
       this.b.reportShowEvent();
       return;
    }
}
