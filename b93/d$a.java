package b93.d$a;
import d93.b;
import b93.d;
import java.lang.Class;
import b93.e;
import java.lang.Object;
import com.kuaishou.live.service.ServiceProvider;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;

public class d$a implements b	// class@000374
{
    public boolean a;
    public final Class b;
    public final e c;
    public final b d;
    public final d e;

    public void d$a(d p0,Class p1,e p2,b p3){
       this.e = p0;
       this.c = p2;
       this.d = p3;
       super();
       this.a = true;
       this.b = p1;
    }
    public void c(Class p0,ServiceProvider p1){
       d$a uoa = d$a.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uoa, "1")) {
          return;
       }
       if (this.a == null) {
          throw new IllegalStateException("只能在onRegisterService回调内注册service");
       }
       if (!this.c.a(uoa, p0)) {
          throw new IllegalStateException("Register ["+p0+"] does not config for ["+this.b+"] in PresenterRegistry, \nplease check LiveLiteMainPresenterRegistry or LiveLitPluginPresenterRegistry");
       }
       this.e.s.add(p0);
       this.d.c(p0, p1);
       return;
    }
    public void d(Class p0,Object p1){
       d$a uoa = d$a.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uoa, "2")) {
          return;
       }
       if (this.a == null) {
          throw new IllegalStateException("只能在onRegisterService回调内注册service");
       }
       if (!this.c.a(uoa, p0)) {
          throw new IllegalStateException("Register ["+p0+"] does not config for ["+this.b+"] in PresenterRegistry, \nplease check LiveLiteMainPresenterRegistry or LiveLitPluginPresenterRegistry");
       }
       this.e.s.add(p0);
       this.d.d(p0, p1);
       return;
    }
}
