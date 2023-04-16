package d76.f;
import x97.n;
import com.kwai.framework.initmodule.AzerothInitModule;
import java.lang.Object;
import x97.k;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import d76.f$a;
import java.util.List;
import x97.m;
import java.lang.Boolean;
import c97.d;
import o56.c;
import o56.a;
import xf6.h;
import java.util.Map;
import wkd.b;
import ob6.p;
import ob6.h;
import com.yxcorp.retrofit.model.LocationConfigModel;
import com.kwai.framework.network.keyconfig.BaseConfig;
import ujd.c;
import xf6.l;
import java.lang.CharSequence;
import android.text.TextUtils;
import okhttp3.OkHttpClient$Builder;
import com.kwai.framework.azeroth.RequestTimingInterceptor;
import com.kwai.framework.network.keyconfig.KeyConfigBlockingInterceptor;
import okhttp3.Interceptor;
import com.kwai.framework.network.keyconfig.degrade.APIDegradeInterceptor;
import com.kwai.framework.network.etag.ETagInterceptor;
import com.kwai.framework.abtest.kmonkey.ABTestInterceptor;
import com.kuaishou.aegon.okhttp.CronetInterceptor;
import com.kwai.framework.model.router.RouteType;
import java.util.ArrayList;
import ekd.j;

public class f implements n	// class@001478
{
    public final AzerothInitModule a;

    public void f(AzerothInitModule p0){
       this.a = p0;
       super();
    }
    public k a(){
       Object obj = PatchProxy.apply(null, this, f.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new f$a(this);
    }
    public List b(){
       return m.d(this);
    }
    public boolean c(){
       Object obj = PatchProxy.apply(null, this, f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!d.a().j() && (!d.a().i() && !a.a().c()))? true: false;
       return b;
    }
    public boolean d(){
       Object obj = PatchProxy.apply(null, this, f.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (h.p() ^ 0x01);
    }
    public boolean e(){
       return m.b(this);
    }
    public void f(String p0,Map p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f.class, "7")) {
          return;
       }
       h oh = b.a(0x36463d96).f();
       if (oh != null) {
          oh = oh.mBaseConfig;
          if (oh != null) {
             c.b(p1, p0, oh.d());
          }
       }
       return;
    }
    public String g(){
       String obj = PatchProxy.apply(null, this, f.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (a.a().c()) {
          obj = l.g("trace-context", "");
          if (!TextUtils.isEmpty(obj)) {
             return obj;
          }
       }
       return null;
    }
    public void h(OkHttpClient$Builder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "3")) {
          return;
       }
       p0.interceptors().add(0, new RequestTimingInterceptor());
       p0.addInterceptor(new KeyConfigBlockingInterceptor());
       p0.addInterceptor(new APIDegradeInterceptor());
       p0.addInterceptor(new ETagInterceptor());
       if (a.a().c()) {
          p0.addInterceptor(new ABTestInterceptor());
       }
       p0.addInterceptor(new CronetInterceptor(RouteType.ZT.mName));
       return;
    }
    public List i(){
       String obj = PatchProxy.apply(null, this, f.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!a.d()) {
          return m.e(this);
       }
       String str = "api.kuaishouzt.com";
       obj = l.g("key_azeroth_debug_hsot", str);
       if (!TextUtils.isEmpty(obj)) {
          str = obj;
       }
       String[] stringArray = new String[]{str};
       return j.a(stringArray);
    }
}
