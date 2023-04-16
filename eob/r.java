package eob.r;
import com.kwai.dva.design.PluginInstallerUIHandler$d;
import eob.t;
import brd.v;
import java.lang.Object;
import java.lang.Exception;
import vi5.h;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import hob.a;
import java.lang.Integer;
import brd.g;
import java.lang.Boolean;
import com.kwai.dva.design.PluginInstallerUIHandler$e;

public class r implements PluginInstallerUIHandler$d	// class@00279a
{
    public final long b;
    public final v c;
    public final t d;

    public void r(t p0,long p1,v p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void a(Exception p0){
       h.f(this, p0);
    }
    public void b(){
       h.h(this);
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, r.class, "1")) {
          return;
       }
       a.a(false, true, this.b);
       this.c.onNext(Integer.valueOf(2));
       this.c.onComplete();
       return;
    }
    public void e(){
       h.e(this);
    }
    public void f(boolean p0){
       r or = r.class;
       if (PatchProxy.isSupport(or) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, or, "2")) {
          return;
       }
       if (!p0) {
          a.a(false, false, this.b);
          this.c.onNext(Integer.valueOf(-1));
          this.c.onComplete();
       }
       return;
    }
    public void n(PluginInstallerUIHandler$e p0){
       h.a(this, p0);
    }
    public void o(){
       h.b(this);
    }
    public void onStart(){
       h.g(this);
    }
    public void p(){
       h.c(this);
    }
}
