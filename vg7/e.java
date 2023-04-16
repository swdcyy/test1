package vg7.e;
import java.io.File;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import kotlin.Result;
import qrd.l1;
import java.lang.Throwable;
import qrd.j0;
import yf7.h;

public final class e	// class@0026a7
{

    public static final File a(File p0){
       a.p(p0, "<this>");
       if (!p0.exists()) {
          p0.mkdirs();
       }
       Throwable obj = Result.constructor-impl(l1.a);
       obj = Result.exceptionOrNull-impl(obj);
       if (obj != null) {
          h.b("CrashMonitor", a.C("make dir fail ", obj));
       }
       return p0;
    }
}
