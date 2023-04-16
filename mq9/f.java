package mq9.f;
import com.kwai.dva.design.PluginInstallerUIHandler$d;
import cm5.d;
import java.lang.Object;
import java.lang.Exception;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import vi5.h;
import com.kwai.dva.design.PluginInstallerUIHandler$e;

public class f implements PluginInstallerUIHandler$d	// class@003072
{
    public final d b;

    public void f(d p0){
       this.b = p0;
       super();
    }
    public void a(Exception p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "2")) {
          return;
       }
       if (p0 != null) {
          p0.getMessage();
       }
       this.b.a(p0);
       return;
    }
    public void b(){
       h.h(this);
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       this.b.onSuccess();
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
