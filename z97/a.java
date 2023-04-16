package z97.a;
import z97.b;
import android.content.Context;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import android.content.SharedPreferences;
import oe6.o;
import com.kwai.middleware.azeroth.Azeroth2;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;

public final class a extends b	// class@002907
{
    public SharedPreferences a;
    public final String b;

    public void a(Context p0,String p1){
       a.q(p0, "context");
       a.q(p1, "name");
       super();
       this.b = p1;
       SharedPreferences sharedPrefer = o.c(p0, p1, 0);
       a.h(sharedPrefer, "context.getSharedPrefere¡­me, Context.MODE_PRIVATE\)");
       this.a = sharedPrefer;
    }
    public SharedPreferences a(){
       return this.a;
    }
    public void c(String p0){
       a.q(p0, "msg");
       Azeroth2.B.v(new IllegalArgumentException(p0));
    }
    public void e(Context p0){
       a.q(p0, "context");
       SharedPreferences sharedPrefer = o.c(p0, this.b, 0);
       a.h(sharedPrefer, "context.getSharedPrefere¡­me, Context.MODE_PRIVATE\)");
       this.a = sharedPrefer;
    }
}
