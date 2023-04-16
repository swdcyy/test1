package fd6.d;
import gd6.b;
import fd6.d$a;
import nsd.u;
import java.lang.Object;
import gd6.a;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.sdk.switchconfig.a;
import java.lang.CharSequence;
import java.lang.StringBuilder;
import qj7.d;
import ae6.a;
import zsd.u;
import com.kuaishou.android.security.KSecurity;
import android.util.Base64;
import zsd.d;
import java.nio.charset.Charset;
import java.net.URI;
import java.lang.Throwable;
import com.yxcorp.utility.Log;

public final class d implements b	// class@0015fe
{
    public static final d$a b;

    static {
       d.b = new d$a(null);
    }
    public void d(){
       super();
    }
    public String a(a p0){
       String str3;
       String host;
       d uod = d.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "1";
       StringBuilder obj = PatchProxy.applyOneRefs(p0, this, uod, str);
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "pluginUrlInfo");
       obj = "";
       String str1 = PatchProxy.apply(null, this, uod, "2");
       if (str1 != patchProxyRe) {
       }else {
          str1 = a.t().c("dva_cdn_host", obj);
          a.o(str1, "SwitchConfigManager.getI¡­\(SWITCH_DVA_CDN_HOST, \"\"\)");
          str1 = str1;
       }
       int i = 1;
       boolean b = false;
       obj = (!str1.length())? 1: null;
       if (obj) {
          return null;
       }else {
          d.c("UrlInterceptor replace new host: "+str1);
          String str2 = p0.a();
          a uoa = a.class;
          Object obj1 = PatchProxy.applyTwoRefs(str2, str1, null, uoa, str);
          if (obj1 != patchProxyRe) {
          }else {
             str = "originUrl";
             a.p(str2, str);
             if (u.q2(str2, "ss://", b, 2, null) && KSecurity.isInitialize()) {
                byte[] uobyteArray = KSecurity.uDecrypt(Base64.decode(u.g2(str2, "ss://", "", false, 4, null), b));
                a.o(uobyteArray, "KSecurity.uDecrypt\(Base6¡­/\", \"\"\), Base64.DEFAULT\)\)");
                str3 = new String(uobyteArray, d.a);
             }else {
                str3 = str2;
             }
             if (str1 != null && str1.length()) {
                i = null;
             }
             if (i) {
                obj1 = str3;
             }else {
                Object obj2 = PatchProxy.applyTwoRefs(str3, str1, null, uoa, "2");
                if (obj2 != patchProxyRe) {
                   obj1 = obj2;
                }else {
                   a.p(str3, str);
                   a.p(str1, "host");
                   host = new URI(str3).getHost();
                   a.o(host, "oldUri.host");
                   obj1 = u.g2(str3, host, str1, false, 4, null);
                }
             }
             StringBuilder str4 = "originUrl: "+str2+'('+str3+"\) host: ";
             if (str1 == null) {
                str1 = "empty";
             }
             Log.b("PluginCdnUtil", str4+str1+", result: "+obj1);
          }
          return obj1;
       }
    }
}
