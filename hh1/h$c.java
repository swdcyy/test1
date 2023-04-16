package hh1.h$c;
import erd.g;
import yg1.a;
import java.lang.String;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import yg1.f;
import android.util.Log;
import kotlin.jvm.internal.a;
import nsd.u;

public final class h$c implements g	// class@0026bd
{
    public final a b;
    public final String c;

    public void h$c(a p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h$c.class, "1")) {
       }else {
          String stackTraceSt = Log.getStackTraceString(p0);
          a.o(stackTraceSt, "Log.getStackTraceString\(it\)");
          f uof = new f(0, stackTraceSt, null, 4, null);
          this.b.a(this.c, v0);
       }
       return;
    }
}
