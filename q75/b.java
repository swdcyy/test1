package q75.b;
import e85.a;
import java.lang.String;
import q75.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.chat.kwailink.service.a;
import android.os.Build;
import com.kwai.chat.kwailink.utils.PropertyUtils;
import com.kwai.chat.kwailink.utils.Utils;
import java.lang.Number;
import com.kwai.chat.kwailink.net.a;
import com.kwai.chat.kwailink.base.b;
import n75.b;

public class b	// class@002242
{
    public static final a a;
    public static long b;
    public static long c;
    public static final boolean d;
    public static final boolean e;
    public static final boolean f;
    public static final String g;
    public static final boolean h;
    public static final boolean i;
    public static final boolean j;
    public static final int k;
    public static final boolean l;
    public static final boolean m;

    static {
       int b;
       b.a = new a("pref_kwailink_config");
       b.b = -1;
       b.c = Long.MAX_VALUE;
       b = a.a("klink_enable_transport_layer_keepalive_huidu2", false);
       b.d = b;
       boolean b1 = a.a("klink_enable_transport_layer_keepalive2", false);
       b.e = b1;
       boolean b2 = true;
       b1 = (b || b1)? true: false;
       b.f = b1;
       String str = "";
       String str1 = (b)? a.e("klink_transport_layer_keepalive_config_huidu", str): a.e("klink_transport_layer_keepalive_config", str);
       b.g = str1;
       b = a.a("kwailink_enable_foreground_heartbeat_interval_for_tcp_huidu", false);
       b.h = b;
       b1 = a.a("kwailink_enable_foreground_heartbeat_interval_for_tcp", false);
       b.i = b1;
       b1 = (b || b1)? true: false;
       b.j = b1;
       b = (b)? a.c("kwailink_foreground_heartbeat_interval_for_tcp_huidu", 270): a.c("kwailink_foreground_heartbeat_interval_for_tcp", 270);
       b.k = b * 1000;
       if (b.a() || (!a.a("kwailink_enable_background_heartbeat_interval3", false) && !a.a("kwailink_enable_background_heartbeat_interval_huidu3", false))) {
          b2 = false;
       }
    label_008a :
       b.l = b2;
       b.m = a.a("klink_enable_perf_opt_v1", false);
    }
    public void b(){
       super();
    }
    public static boolean a(){
       boolean b;
       String obj = PatchProxy.apply(null, null, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b = true;
       if (b.m) {
          obj = (a.c == 3)? 1: null;
          if (obj) {
             return b;
          }
       }
       if ((Build.BRAND).compareToIgnoreCase("vivo")) {
          return false;
       }else {
          obj = PropertyUtils.getKpn();
          if (Utils.isInvalidStr(obj) || (!obj.equals("KUAISHOU") && !obj.equals("NEBULA"))) {
             b = false;
          }
       label_004c :
          return b;
       }
    }
    public static int b(){
       Object obj = PatchProxy.apply(null, null, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 4000;
       if (a.f()) {
          i = 6000;
       }
       return i;
    }
    public static int c(){
       int i;
       b b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.apply(null, null, b.class, "4");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       obj = PatchProxy.apply(null, null, b.class, "7");
       if (obj != patchProxyRe) {
          i = obj.intValue();
       }else {
          b = b.b;
          b = (b != null)? b.f: 0x41eb0;
       }
       return i;
    }
    public static synchronized long d(){
       _monitor_enter(b.class);
       Object obj = PatchProxy.apply(null, null, b.class, "6");
       if (obj != PatchProxyResult.class) {
          _monitor_exit(b.class);
          return obj.longValue();
       }else if(!b.b - -1){
          b.b = b.a.a("key_instance_id", 0);
       }
       _monitor_exit(b.class);
       return b.b;
    }
    public static int e(){
       Object obj = PatchProxy.apply(null, null, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0x3a98;
       if (a.f()) {
          i = 0x4e20;
       }
       return i;
    }
    public static synchronized long f(){
       _monitor_enter(b.class);
       Object obj = PatchProxy.apply(null, null, b.class, "8");
       if (obj != PatchProxyResult.class) {
          _monitor_exit(b.class);
          return obj.longValue();
       }else if(!b.c - Long.MAX_VALUE){
          b.c = b.a.a("server_client_time_offset", 0);
       }
       _monitor_exit(b.class);
       return b.c;
    }
}
