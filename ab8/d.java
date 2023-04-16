package ab8.d;
import ja8.f;
import com.mini.js.jsapi.inner.WebViewConfigInvokeApi;
import java.lang.Object;
import ja8.e;
import java.lang.String;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import na8.a;
import ga8.g;
import com.mini.js.commonapitracer.c$b;
import com.mini.js.commonapitracer.b;
import com.mini.js.jsapi.inner.WebViewConfigInvokeApi$ConfigData;
import com.mini.js.jsapi.inner.WebViewConfigInvokeApi$a;
import n88.b;
import ma8.i;
import zh8.g;
import com.mini.pms.packagemanager.model.MiniAppInfo;
import com.mini.pms.packagemanager.model.DomainType;
import java.util.List;
import java.lang.Throwable;
import android.util.Log;
import com.mini.js.helper.a;

public final class d implements f	// class@00005c
{
    public final WebViewConfigInvokeApi a;

    public void d(WebViewConfigInvokeApi p0){
       this.a = p0;
    }
    public final String a(e p0){
       MiniAppInfo n;
       d ta = this.a;
       Objects.requireNonNull(ta);
       String str = PatchProxy.applyOneRefs(p0, ta, WebViewConfigInvokeApi.class, "1");
       if (str != PatchProxyResult.class) {
       }else {
          a c = ta.c;
          c.b(c.j(p0), p0);
          WebViewConfigInvokeApi$ConfigData uConfigData = new WebViewConfigInvokeApi$ConfigData(ta, null);
          List list = ta.b.i().i0().M5().a(DomainType.WEB, ta.b.i());
          try{
             uConfigData.webDomainList = list;
             n = ta.b.e.i0().M5().N;
          }catch(java.lang.Exception e3){
             Log.getStackTraceString(e3);
             n = null;
          }
          if (n == null) {
             n = "";
          }
          uConfigData.apiBlacklist = n;
          a c1 = ta.c;
          c1.h(c1.e(p0, 0, 0, "", true), p0);
          str = a.k(p0, true, uConfigData, null);
       }
       return str;
    }
}
