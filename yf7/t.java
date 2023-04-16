package yf7.t;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import kotlin.Result;
import yf7.k;
import com.kwai.performance.monitor.base.d;
import msd.l;
import java.lang.Boolean;
import java.lang.Throwable;
import qrd.j0;
import java.lang.StringBuilder;
import android.util.Log;
import yf7.h;

public final class t	// class@0028aa
{

    public static final boolean a(String p0){
       a.q(p0, "soName");
       k.c.c().r.invoke(p0);
       Boolean uBoolean = Result.constructor-impl(Boolean.TRUE);
       Throwable throwable = Result.exceptionOrNull-impl(uBoolean);
       if (throwable != null) {
          h.b("MonitorSo", throwable.getMessage()+"\n"+Log.getStackTraceString(throwable));
       }
       if (Result.exceptionOrNull-impl(uBoolean) != null) {
          uBoolean = Boolean.FALSE;
       }
       return uBoolean.booleanValue();
    }
}
