package ez6.a;
import java.lang.Object;
import android.content.Context;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Number;
import com.cmic.sso.sdk.auth.AuthnHelper;
import org.json.JSONObject;
import java.lang.Integer;
import com.cmic.sso.sdk.e.j;
import java.lang.Boolean;
import android.telephony.TelephonyManager;

public class a	// class@0015b4
{
    public static String a;
    public static int b;

    public void a(){
       super();
    }
    public static String a(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.isEmpty(a.a)) {
          return a.a;
       }
       if (!a.d(p0)) {
          return "";
       }
       try{
          int i = a.b(p0);
          if (i != 1) {
             if (i != 2) {
                if (i != 3) {
                   a.a = "";
                   return a.a;
                }else {
                   a.a = "CTCC";
                   return a.a;
                }
             }else {
                a.a = "CUCC";
                return a.a;
             }
          }else {
             a.a = "CMCC";
             return a.a;
          }
       }catch(java.lang.Exception e0){
          return "";
       }
    }
    public static int b(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (a.b != -1) {
          return a.b;
       }
       if (!a.d(p0)) {
          return 0;
       }
       a.b = Integer.parseInt(AuthnHelper.getInstance(p0).getNetworkType(p0).optString("operatortype"));
       return a.b;
    }
    public static String c(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (j.a() == null) {
          j.a(p0.getApplicationContext());
       }
       String str = j.a().b();
       if (!TextUtils.isEmpty(str) && str.length() >= 5) {
          return str.substring(0, 5);
       }else {
          return "";
       }
    }
    public static boolean d(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int simState = p0.getSystemService("phone").getSimState();
       if (simState && simState != 1) {
          return true;
       }
       return false;
    }
}
