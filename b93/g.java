package b93.g;
import d93.a;
import java.lang.Class;
import java.util.List;
import z1.i;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import ip3.a;

public class g implements a	// class@000379
{
    public boolean a;
    public Class b;
    public a c;
    public List d;
    public i e;

    public void g(Class p0,a p1,List p2,i p3){
       super();
       this.a = true;
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public Object a(Class p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.c();
       if (!this.e.test(p0)) {
          throw new IllegalStateException("Inject ["+p0+"] does not config for ["+this.b+"] in PresenterRegistry, \nplease check LiveLiteMainPresenterRegistry or LiveLitPluginPresenterRegistry");
       }
       this.d.add(p0);
       return this.c.a(p0);
    }
    public Object b(Class p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.c();
       return this.c.b(p0);
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, g.class, "4")) {
          return;
       }
       if (this.a != null) {
          return;
       }
       throw new IllegalStateException("只能在onInjectService回调内get/getOptional");
    }
    public a e(Class p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.c();
       if (!this.e.test(p0)) {
          throw new IllegalStateException("Inject ["+p0+"] does not config for ["+this.b+"] in PresenterRegistry, \nplease check LiveLiteMainPresenterRegistry or LiveLitPluginPresenterRegistry");
       }
       this.d.add(p0);
       return this.c.e(p0);
    }
}
