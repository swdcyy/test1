package com.kwai.framework.init.c$b;
import hkd.d;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class c$b extends d	// class@000b67
{
    public final Runnable b;

    public void c$b(Runnable p0){
       this.b = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, c$b.class, "1")) {
          return;
       }
       this.b.run();
       return;
    }
}
