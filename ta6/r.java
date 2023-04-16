package ta6.r;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.Object;
import com.google.common.collect.ImmutableList;
import okhttp3.Request;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.text.TextUtils;
import okhttp3.HttpUrl;
import java.lang.StringBuilder;
import k2b.u1;
import com.kwai.robust.PatchProxyResult;
import zb6.d;
import java.lang.Boolean;
import android.content.SharedPreferences;
import pkd.a;
import android.os.SystemClock;
import com.kuaishou.android.security.KSecurity;
import com.kuaishou.android.security.base.exception.KSException;
import java.lang.Exception;
import java.lang.Throwable;
import android.util.Log;

public class r	// class@00249c
{
    public static AtomicBoolean a;
    public static final ImmutableList b;

    static {
       r.a = new AtomicBoolean(true);
       r.b = ImmutableList.of("/rest/system/startup", "/rest/n/system/abtest/config", "/rest/system/keyconfig", "/rest/n/system/realtime/startup", "/rest/n/live/config/startup", "/rest/n/feed/selectionFast");
    }
    public void r(){
       super();
    }
    public static void a(Request p0,Map p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, r.class, "1")) {
          return;
       }
       String str = p1.get("sig");
       if (TextUtils.isEmpty(str)) {
          return;
       }
       String str1 = p0.url().encodedPath();
       if (r.b.contains(str1)) {
          return;
       }
       str1 = r.b(str1+str);
       if (str.length() != 32) {
          Object[] objArray = new Object[]{str,str1};
          u1.R("sig3_fail", String.format("sig3 sig length <> 32 sig[%s]sig3[%s]", objArray), 21);
       }
       if (!TextUtils.isEmpty(str1)) {
          p1.put("__NS_sig3", str1);
       }
       return;
    }
    public static String b(String p0){
       int b;
       Object[] objArray;
       String str = "null";
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Boolean uBoolean = null;
       Object[] obj = PatchProxy.applyOneRefs(p0, uBoolean, r.class, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (TextUtils.isEmpty(p0)) {
          return "";
       }
       obj = PatchProxy.applyOneRefs("disableSig3OBF_Android_kuaishou_gt8120", uBoolean, d.class, "1");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else {
          String str2 = d.b.getString("security_last_launch_app_version", "");
          String e = a.e;
          if (!TextUtils.isEmpty(e) && (!e.equals("UNKNOWN") && (!TextUtils.isEmpty(str2) && TextUtils.equals(e, str2)))) {
             uBoolean = Boolean.valueOf(d.b.getBoolean(d.b("host_se_s_d_ks"), false));
          }
       label_0067 :
          if (uBoolean == null) {
             uBoolean = Boolean.FALSE;
          }
          uBoolean.booleanValue();
          b = uBoolean.booleanValue();
       }
       if (b) {
          return "";
       }else {
          b = 21;
          try{
             long l = SystemClock.elapsedRealtime();
             String str1 = KSecurity.atlasSign(p0);
             if (r.a.get()) {
                u1.R("sig3_cost_first", (SystemClock.elapsedRealtime() - l), b);
                r.a.set(false);
             }else {
                u1.U("sig3_cost", (SystemClock.elapsedRealtime() - l));
             }
             if (str1.contains(str) || !str1.length()) {
                objArray = new Object[]{p0,str1};
                u1.R("sig3_fail", String.format("sig3 result null sig[%s]sig3[%s]", objArray), b);
             }else if(str1.length() != 42 && str1.length() != 48){
                objArray = new Object[]{p0,str1};
                u1.R("sig3_fail", String.format("sig3 result length <> 42,48 sig[%s]sig3[%s]", objArray), b);
             }
             if (p0.contains(str) || !p0.length()) {
                obj = new Object[]{p0,str1};
                u1.R("sig3_fail", String.format("sig3 sig null sig[%s]sig3[%s]", obj), b);
             }
             return str1;
          }catch(java.lang.Exception e12){
             if (e12 instanceof KSException) {
                u1.R("sig3_fail", e12.getErrorCode()+"_"+e12.getMessage(), b);
             }else {
                u1.R("sig3_error", Log.getStackTraceString(e12), b);
             }
             return "";
          }
       }
    }
}
