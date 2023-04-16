package c7.b;
import java.lang.Object;
import android.content.Context;
import t6.a;
import c7.a;
import java.lang.String;
import java.lang.Long;
import s6.b;
import q6.c;
import s6.a;
import p6.b;
import p6.e;
import org.json.JSONObject;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Objects;
import u6.c;
import u6.b;
import m6.d;
import android.os.Looper;
import java.lang.Exception;

public class b	// class@000ce4
{

    public void b(){
       super();
    }
    public static a a(Context p0,a p1){
       if (p1 == null || p1.g()) {
          return null;
       }
       return new a(p1.e(), p1.d(), p1.f().longValue());
    }
    public static void a(Context p0){
       if (p0 == null) {
          return;
       }
       b.d().a(p0);
       return;
    }
    public static a b(Context p0){
       b uob = new c().g(null, p0);
       if (uob == null) {
          return null;
       }
       JSONObject jSONObject = new JSONObject(uob.a());
       a uoa = a.a(p0);
       String str = jSONObject.optString("tid");
       String str1 = jSONObject.getString("client_key");
       if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str1)) {
          uoa.b(str, str1);
       }
       return b.a(p0, uoa);
    }
    public static void clearTID(Context p0){
       a uoa = a.a(p0);
       Objects.requireNonNull(uoa);
       c.e("mspl", "tid_str: del");
       uoa.j();
    }
    public static String getIMEI(Context p0){
       b.a(p0);
       Objects.requireNonNull(b.a(p0));
       return "000000000000000";
    }
    public static String getIMSI(Context p0){
       b.a(p0);
       Objects.requireNonNull(b.a(p0));
       return "000000000000000";
    }
    public static synchronized String getTIDValue(Context p0){
       _monitor_enter(b.class);
       a uoa = b.loadOrCreateTID(p0);
       String str = (a.isEmpty(uoa))? "": uoa.getTid();
       _monitor_exit(b.class);
       return str;
    }
    public static String getVirtualImei(Context p0){
       b.a(p0);
       d.d();
       return d.f();
    }
    public static String getVirtualImsi(Context p0){
       b.a(p0);
       d.d();
       return d.g();
    }
    public static a loadLocalTid(Context p0){
       a uoa = a.a(p0);
       if (uoa.g()) {
          return null;
       }
       return new a(uoa.e(), uoa.d(), uoa.f().longValue());
    }
    public static synchronized a loadOrCreateTID(Context p0){
       _monitor_enter(b.class);
       c.e("mspl", "load_create_tid");
       b.a(p0);
       a uoa = b.loadTID(p0);
       if (a.isEmpty(uoa)) {
          if (Looper.myLooper() == Looper.getMainLooper()) {
             _monitor_exit(b.class);
             return null;
          }else {
             uoa = b.b(p0);
          }
       }
       _monitor_exit(b.class);
       return uoa;
    }
    public static a loadTID(Context p0){
       b.a(p0);
       a uoa = b.a(p0, a.a(p0));
       if (uoa == null) {
          c.e("mspl", "load_tid null");
       }
       return uoa;
    }
    public static boolean resetTID(Context p0){
       c.e("mspl", "reset_tid");
       if (Looper.myLooper() == Looper.getMainLooper()) {
          throw new Exception("Must be called on worker thread");
       }
       b.a(p0);
       b.clearTID(p0);
       a uoa = b.b(p0);
       if (a.isEmpty(uoa)) {
          return false;
       }
       return true;
    }
}
