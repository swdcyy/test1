package k79.o;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class o	// class@002b5c
{
    public final String a;
    public final int b;
    public Context c;

    public void o(Context p0){
       a.q(p0, "context");
       super();
       this.c = p0;
       p0 = p0.getApplicationContext();
       a.h(p0, "context.applicationContext");
       this.c = p0;
       this.a = "/system/media/audio";
       this.b = 3000;
    }
}
