package bt3.j$c;
import la4.b;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity;
import java.lang.String;
import java.lang.Object;
import java.lang.Exception;
import la4.a;
import com.kwai.dva.design.PluginInstallerUIHandler$d;
import vi5.h;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import tkd.b;
import tkd.d;
import kt3.a;
import android.content.Context;
import com.kwai.dva.design.PluginInstallerUIHandler$e;

public final class j$c implements b	// class@000445
{
    public final KwaiYodaWebViewActivity b;
    public final String c;

    public void j$c(KwaiYodaWebViewActivity p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void a(Exception p0){
       a.b(this, p0);
    }
    public void b(){
       h.h(this);
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, j$c.class, "1")) {
          return;
       }
       a uoa = d.a(-2094541956);
       if (uoa != null && uoa.isAvailable()) {
          uoa.ll(this.b, this.c);
       }
       return;
    }
    public void e(){
       a.a(this);
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
       a.c(this);
    }
    public void p(){
       h.c(this);
    }
}
