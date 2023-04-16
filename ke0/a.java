package ke0.a;
import java.lang.String;
import ke0.b;
import java.lang.Throwable;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import java.text.SimpleDateFormat;
import java.lang.System;
import java.lang.Long;
import nsd.u;
import ke0.b$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.util.Log;

public final class a	// class@002cf9
{
    public final String a;
    public final String b;
    public final String c;
    public final b d;
    public final Throwable e;

    public void a(String p0,String p1,b p2,Throwable p3){
       a.p(p0, "tag");
       a.p(p2, "level");
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.a = '['+new SimpleDateFormat("HH:mm:ss.SSS").format(Long.valueOf(System.currentTimeMillis()))+']';
    }
    public void a(String p0,String p1,b p2,Throwable p3,int p4,u p5){
       b$b b;
       if (p4 & 0x02) {
          p1 = null;
       }
       if (p4 & 0x04) {
          b = b$b.b;
       }
       if (p4 & 0x08) {
          p3 = null;
       }
       super(p0, p1, b, p3);
       return;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a+'['+this.b+']'+this.c+", "+Log.getStackTraceString(this.e);
    }
}
