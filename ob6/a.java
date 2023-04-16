package ob6.a;
import pb6.o;
import java.lang.Object;
import wkd.b;
import java.lang.String;
import kotlin.jvm.internal.a;
import ob6.p;
import ob6.a$a;
import ob6.p$b;
import ob6.p$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ob6.f;
import java.lang.Number;
import pb6.b;
import com.google.gson.JsonObject;
import ob6.h;
import com.kuaishou.gifshow.platform.network.keyconfig.FeatureConfig;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import brd.a0;
import ob6.a$b;
import erd.o;
import com.kwai.framework.network.keyconfig.BaseConfig;

public class a implements o	// class@001fe4
{
    public final p b;

    public void a(){
       super();
       Object obj = b.a(0x36463d96);
       a.o(obj, "Singleton.get\(KeyConfigManager::class.java\)");
       this.b = obj;
       p.a.a(new a$a());
    }
    public boolean a(){
       Object obj = PatchProxy.apply(null, this, a.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b.a();
    }
    public boolean b(){
       Object obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b.i().b();
    }
    public int c(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.c();
    }
    public b d(){
       Object obj = PatchProxy.apply(null, this, a.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.d();
    }
    public JsonObject e(){
       Object[] objArray = null;
       h obj = PatchProxy.apply(objArray, this, a.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b.f();
       if (obj != null) {
          obj = obj.mFeatureConfig;
          if (obj != null) {
             objArray = obj.mResolveConfig;
          }
       }
       return objArray;
    }
    public a0 f(RequestTiming p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "requestTiming");
       a0 uoa0 = this.b.j(p0).C(a$b.b);
       a.o(uoa0, "keyConfigManager.request¡­eConfig\n                }");
       return uoa0;
    }
    public boolean g(){
       Object obj = PatchProxy.apply(null, this, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b.b();
    }
    public long getServerTimestamp(){
       Object obj = PatchProxy.apply(null, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.b.getServerTimestamp();
    }
    public int getVersion(){
       Object obj = PatchProxy.apply(null, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.getVersion();
    }
    public BaseConfig h(){
       Object[] objArray = null;
       h obj = PatchProxy.apply(objArray, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b.f();
       if (obj != null) {
          objArray = obj.mBaseConfig;
       }
       return objArray;
    }
}
