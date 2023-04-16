package b93.f;
import c93.b;
import java.lang.Class;
import java.util.List;
import z1.i;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import z1.k;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;

public class f implements b	// class@000378
{
    public boolean a;
    public Class b;
    public b c;
    public List d;
    public i e;

    public void f(Class p0,b p1,List p2,i p3){
       super();
       this.a = true;
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public Object a(Class p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c(p0).get();
    }
    public Object b(Class p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d(p0).get();
    }
    public k c(Class p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.e();
       if (!this.e.test(p0)) {
          throw new IllegalStateException("Inject ["+p0+"] does not config for ["+this.b+"] in PresenterRegistry, \nplease check LiveLiteMainPresenterRegistry or LiveLitPluginPresenterRegistry");
       }
       this.d.add(p0);
       return this.c.c(p0);
    }
    public k d(Class p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.e();
       if (!this.e.test(p0)) {
          throw new IllegalStateException("Inject ["+p0+"] does not config for ["+this.b+"] in PresenterRegistry, \nplease check LiveLiteMainPresenterRegistry or LiveLitPluginPresenterRegistry");
       }
       this.d.add(p0);
       return this.c.d(p0);
    }
    public final void e(){
       if (PatchProxy.applyVoid(null, this, f.class, "5")) {
          return;
       }
       if (this.a != null) {
          return;
       }
       throw new IllegalStateException("只能在onInjectService回调内get/getOptional");
    }
}
