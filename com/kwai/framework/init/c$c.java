package com.kwai.framework.init.c$c;
import hkd.d;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class c$c extends d	// class@00156d
{
    public final Runnable b;

    public void c$c(Runnable p0){
       this.b = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, c$c.class, "1")) {
          return;
       }
       this.b.run();
       return;
    }
}
