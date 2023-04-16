package aegon.chrome.net.a;
import java.lang.Object;
import i0.a;
import java.lang.Runnable;
import aegon.chrome.base.ThreadUtils;
import android.telephony.TelephonyManager;
import android.content.Context;
import a0.f;
import java.lang.String;

public class a	// class@0001a9
{
    public String a;
    public String b;
    public String c;
    public a$a d;
    public static a e;

    public void a(){
       super();
    }
    public static a a(){
       a e = a.e;
       if (e == null) {
          _monitor_enter(a.class);
          e = a.e;
          if (e == null) {
             e = new a();
             ThreadUtils.d(new a(e));
             a.e = e;
          }
          _monitor_exit(a.class);
       }
       return e;
    }
    public static TelephonyManager b(){
       return f.a().getSystemService("phone");
    }
}
