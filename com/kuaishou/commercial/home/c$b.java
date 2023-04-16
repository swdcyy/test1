package com.kuaishou.commercial.home.c$b;
import java.lang.Runnable;
import com.kuaishou.commercial.home.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class c$b implements Runnable	// class@0014d9
{
    public final c b;

    public void c$b(c p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, c$b.class, "1")) {
          return;
       }
       c$b tb = this.b;
       if (tb.z != null) {
          tb.R8();
       }
       return;
    }
}
