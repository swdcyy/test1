package kb6.c;
import ijd.a;
import java.lang.Object;
import java.lang.String;
import javax.net.ssl.HostnameVerifier;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.retrofit.idc.models.Host;
import java.lang.CharSequence;
import android.text.TextUtils;
import kb6.a;
import java.lang.Boolean;
import xf6.h;
import java.util.Objects;
import java.util.Map;
import lb6.a;
import jjd.a;
import uk.a;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import kb6.b;
import javax.net.ssl.SSLContext;
import javax.net.ssl.KeyManager;
import java.security.SecureRandom;
import xf6.l;

public class c implements a	// class@001bf1
{
    public static SSLSocketFactory a;

    public void c(){
       super();
    }
    public HostnameVerifier a(String p0,String p1){
       p1 = PatchProxy.applyTwoRefs(p0, p1, this, c.class, "5");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       Host host = this.c(p0);
       if (host != null && !TextUtils.isEmpty(host.mHost)) {
          return a.a;
       }
       return null;
    }
    public boolean b(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!h.v()) {
          return false;
       }
       if (h.p()) {
          return true;
       }
       Objects.requireNonNull(p0);
       if (p0.equals("pay_check")) {
          return h.t();
       }
       if (!p0.equals("game_center")) {
          return false;
       }
       return (TextUtils.isEmpty(h.b()) ^ true);
    }
    public Host c(String p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       a obj = PatchProxy.applyOneRefs(p0, this, uoc, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       Host host = null;
       if (h.v() && !h.q()) {
          obj = a.a().get(p0);
          if (obj != null) {
             String str = obj.e();
             Host host1 = PatchProxy.applyOneRefs(str, this, uoc, "2");
             if (host1 != patchProxyRe) {
             }else if(TextUtils.isEmpty(str)){
                host = new Host(str);
             }
             host1 = host;
             if (("https").equals(p0) && host1 != null) {
                a.c(host1.mHost);
             }
             return host1;
          }
       }
       return host;
    }
    public SSLSocketFactory d(String p0,String p1){
       SSLSocketFactory sSLSocketFac;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p1 = PatchProxy.applyTwoRefs(p0, p1, this, c.class, "4");
       if (p1 != patchProxyRe) {
          return p1;
       }
       Host host = this.c(p0);
       Object[] objArray = null;
       if (host == null || TextUtils.isEmpty(host.mHost)) {
          return objArray;
       }
       try{
          host = PatchProxy.apply(objArray, objArray, c.class, "7");
          if (host != patchProxyRe) {
             sSLSocketFac = host;
          }else {
             SSLSocketFactory a = c.a;
             if (a == null) {
                _monitor_enter(c.class);
                a = c.a;
                if (a != null) {
                   _monitor_exit(c.class);
                }else {
                   int i = 1;
                   TrustManager[] trustManager = new TrustManager[i];
                   trustManager[0] = new b();
                   SSLContext instance = SSLContext.getInstance("TLSv1");
                   instance.init(objArray, trustManager, objArray);
                   a = instance.getSocketFactory();
                   c.a = a;
                   _monitor_exit(c.class);
                }
             }
             sSLSocketFac = a;
          }
       }catch(java.lang.Exception e0){
          _monitor_exit(c.class);
       }
       return sSLSocketFac;
    }
    public boolean e(){
       Object obj = PatchProxy.apply(null, this, c.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!h.v()) {
          return false;
       }
       return l.c("idc_test_mode", false);
    }
}
