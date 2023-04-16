package k2b.r;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kuaishou.client.log.packages.nano.ClientBase$IdentityPackage;
import com.yxcorp.utility.TextUtils;

public class r	// class@001bb8
{
    public static String a = "ANDROID_UNKNOWN";
    public static String b = "0";
    public static final Object c;

    static {
       r.c = new Object();
    }
    public void r(){
       super();
    }
    public static String a(){
       return r.a;
    }
    public static void b(String p0,int p1){
       r or = r.class;
       if (PatchProxy.isSupport(or) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), null, or, "1")) {
          return;
       }
       Object c = r.c;
       _monitor_enter(c);
       r.a = p0;
       r.b = String.valueOf(p1);
       _monitor_exit(c);
       return;
    }
    public static void c(ClientBase$IdentityPackage p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, r.class, "2")) {
          return;
       }
       Object c = r.c;
       _monitor_enter(c);
       p0.deviceId = TextUtils.k(r.a);
       p0.cloudDeviceIdTag = TextUtils.k(r.b);
       _monitor_exit(c);
       return;
    }
}
