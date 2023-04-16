package hh1.e$c;
import erd.g;
import hh1.e;
import kotlin.jvm.internal.Ref$BooleanRef;
import yg1.a;
import java.lang.String;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import yg1.f;
import android.util.Log;
import nsd.u;

public final class e$c implements g	// class@0026b4
{
    public final e b;
    public final Ref$BooleanRef c;
    public final a d;
    public final String e;

    public void e$c(e p0,Ref$BooleanRef p1,a p2,String p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public void accept(Object p0){
       e d;
       if (PatchProxy.applyVoidOneRefs(p0, this, e$c.class, "1")) {
       }else if(this.c.element != null){
          d = this.b.d;
          if (d != null) {
             a.m(d);
             this.d.a(this.e, d);
          }
       }
       String stackTraceSt = Log.getStackTraceString(p0);
       a.o(stackTraceSt, "Log.getStackTraceString\(it\)");
       f uof = new f(0, stackTraceSt, null, 4, null);
       this.d.a(this.e, d);
       return;
    }
}
