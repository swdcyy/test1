package kka.w;
import java.lang.Object;
import android.content.Context;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.cmic.sso.sdk.e.j;
import com.yxcorp.utility.SystemUtil;
import qe6.b;
import lnc.b6;
import ekd.u0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;
import android.telephony.TelephonyManager;
import ez6.a;
import java.lang.Boolean;
import android.text.TextUtils;
import o56.c;
import o56.a;
import android.app.Application;

public class w	// class@001c20
{
    public static String a;

    public void w(){
       super();
    }
    public static String a(Context p0){
       int i;
       String str = null;
       Object obj = PatchProxy.applyOneRefs(p0, str, w.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (j.a() == null) {
          j.a(p0.getApplicationContext());
       }
       if (SystemUtil.a(29) || !b.a()) {
          i = b6.a(p0);
          if (i >= 0) {
             str = b6.b(p0, i);
          }
          if (TextUtils.x(str)) {
             str = w.b(p0);
          }
          return str+i;
       }else if(!SystemUtil.a(21)){
          return SystemUtil.n(p0);
       }else {
          i = b6.a(p0);
          if (i >= 0) {
             str = u0.e(i, p0);
          }
          if (TextUtils.x(str)) {
             str = j.a().b();
          }
          return str;
       }
    }
    public static String b(Context p0){
       TelephonyManager obj = PatchProxy.applyOneRefs(p0, null, w.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.getSystemService("phone");
       if (obj == null) {
          return a.c(p0);
       }
       String networkOpera = obj.getNetworkOperator();
       if (TextUtils.x(networkOpera) || networkOpera.length() < 5) {
          return a.c(p0);
       }
       return networkOpera.substring(0, 5);
    }
    public static boolean c(){
       Object obj = PatchProxy.apply(null, null, w.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (TextUtils.isEmpty(w.a)) {
          w.a = w.b(a.a().a());
       }
       return u0.h(w.a);
    }
}
