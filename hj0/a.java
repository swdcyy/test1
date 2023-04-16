package hj0.a;
import iu6.a;
import fk0.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.kxb.BundleSource;
import nsd.u;
import java.io.File;
import jj0.a;
import org.json.JSONObject;
import com.kuaishou.krn.c;
import kj0.f;
import java.lang.StringBuilder;
import java.lang.Throwable;
import ek0.d;

public final class a	// class@0026e9
{

    public static final a a(a p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       a uoa1 = null;
       Object obj = PatchProxy.applyOneRefs(p0, uoa1, uoa, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "$this$toBundleMeta");
       a uoa2 = new a(p0.a(), null, null, p0.h(), p0.f(), 6, null);
       obj.a = new File(p0.e(), "resource.tex");
       obj.taskId = p0.g();
       obj.version = p0.i();
       uoa = PatchProxy.applyOneRefs(p0, uoa1, uoa, "2");
       if (uoa != patchProxyRe) {
       }else {
          try{
             a.p(p0, "$this$getBundleExtraInfo");
             if (p0.d() != null) {
                JSONObject jSONObject = p0.d();
                a.m(jSONObject);
                c uoc1 = c.b();
                a.o(uoc1, "KrnManager.get\(\)");
                JSONObject jSONObject1 = p0.d();
                a.m(jSONObject1);
                JSONObject jSONObject2 = p0.d();
                a.m(jSONObject2);
                uoa = new a(jSONObject.optBoolean("shareEngine", uoc1.f().b()), jSONObject1.optString("degradeWebUrl", uoa1), jSONObject2.optString("minAppVersion", uoa1));
             }
          }catch(java.lang.Exception e0){
             d.k("parse extraInfo failed, bundleEntity:"+p0, e0);
          }
          uoa = uoa1;
       }
       if (uoa != null) {
          p0 = uoa.shareEngine;
       }else {
          c uoc = c.b();
          a.o(uoc, "KrnManager.get\(\)");
          boolean b = uoc.f().b();
       }
       obj.c = p0;
       p0 = (uoa != null)? uoa.degradeWebUrl: uoa1;
       obj.d = p0;
       if (uoa != null) {
          uoa1 = uoa.minAppVersion;
       }
       obj.e = uoa1;
       return obj;
    }
}
