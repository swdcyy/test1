package n90.g$c;
import erd.a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.System;
import t90.j;

public final class g$c implements a	// class@0026d6
{
    public final long b;
    public final String c;

    public void g$c(long p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, g$c.class, "1")) {
          return;
       }
       j.h(9, (System.currentTimeMillis() - this.b), this.c);
       return;
    }
}
