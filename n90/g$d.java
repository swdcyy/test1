package n90.g$d;
import erd.g;
import java.lang.String;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.System;
import t90.j;

public final class g$d implements g	// class@0026d7
{
    public final long b;
    public final String c;

    public void g$d(long p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$d.class, "1")) {
       }else {
          j.h(8, (System.currentTimeMillis() - this.b), this.c);
       }
       return;
    }
}
