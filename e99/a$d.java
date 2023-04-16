package e99.a$d;
import com.kwai.dva.design.PluginInstallerUIHandler$d;
import e99.a;
import java.lang.Object;
import java.lang.Exception;
import vi5.h;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.dva.design.PluginInstallerUIHandler$e;

public final class a$d implements PluginInstallerUIHandler$d	// class@002151
{
    public final a b;

    public void a$d(a p0){
       this.b = p0;
       super();
    }
    public void a(Exception p0){
       h.f(this, p0);
    }
    public void b(){
       h.h(this);
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, a$d.class, "1")) {
          return;
       }
       this.b.d9();
       return;
    }
    public void e(){
       h.e(this);
    }
    public void f(boolean p0){
       h.d(this, p0);
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
