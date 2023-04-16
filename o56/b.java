package o56.b;
import o56.c;
import java.lang.Object;
import android.app.Application;
import o56.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.content.Context;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.app.ActivityManager;

public class b implements c	// class@001fa2
{
    public Boolean a;
    public long b;
    public String c;
    public static c d;

    static {
       b.d = new b();
    }
    public void b(){
       super();
       this.b = -1;
       this.c = "";
    }
    public static c g(){
       return b.d;
    }
    public Application a(){
       return a.B;
    }
    public boolean b(){
       Object obj = PatchProxy.apply(null, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return ("google_play").equalsIgnoreCase(a.k);
    }
    public boolean c(){
       boolean b;
       Object obj = PatchProxy.apply(null, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.a != null) {
          return this.a.booleanValue();
       }
       b = false;
       if (("UNKNOWN").equals(a.k)) {
          return b;
       }
       if (!(a.k).equalsIgnoreCase("test") && (!((a.k).toLowerCase()).startsWith("kmonkey_test") && ((a.k).equalsIgnoreCase("test_google_play") || (a.k).equalsIgnoreCase("auto_test")))) {
          b = true;
       }
       this.a = Boolean.valueOf(b);
       return this.a.booleanValue();
    }
    public void d(long p0){
       this.b = p0;
    }
    public long e(){
       return this.b;
    }
    public Context f(){
       Activity obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = ActivityContext.g().e();
       if (obj != null) {
          return obj;
       }
       return a.B;
    }
    public String t(){
       Object obj = PatchProxy.apply(null, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.x(this.c)) {
          this.c = String.valueOf(a.B.getSystemService("activity").getMemoryClass());
       }
       return this.c;
    }
}
