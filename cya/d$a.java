package cya.d$a;
import com.kwai.dva.design.PluginInstallerUIHandler$d;
import cya.d;
import android.view.View;
import java.lang.Object;
import java.lang.Exception;
import vi5.h;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.dva.design.PluginInstallerUIHandler$e;

public class d$a implements PluginInstallerUIHandler$d	// class@002403
{
    public final View b;
    public final d c;

    public void d$a(d p0,View p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void a(Exception p0){
       h.f(this, p0);
    }
    public void b(){
       h.h(this);
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, d$a.class, "1")) {
          return;
       }
       this.c.c(this.b);
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
