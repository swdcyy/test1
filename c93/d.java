package c93.d;
import c93.b;
import com.kuaishou.live.lite.basic.model.LiveLiteModelManager;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import z1.k;

public final class d implements b	// class@0004fa
{
    public final LiveLiteModelManager a;

    public void d(LiveLiteModelManager p0){
       a.p(p0, "modelManager");
       super();
       this.a = p0;
    }
    public Object a(Class p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "clazz");
       return this.a.c(p0, "");
    }
    public Object b(Class p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "clazz");
       return this.a.d(p0, "");
    }
    public k c(Class p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "clazz");
       return this.a.e(p0);
    }
    public k d(Class p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "clazz");
       return this.a.f(p0);
    }
}
