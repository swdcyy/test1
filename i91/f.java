package i91.f;
import com.kwai.dva.design.PluginInstallerUIHandler$d;
import com.kuaishou.live.common.core.basic.arya.b;
import brd.v;
import java.lang.Object;
import java.lang.Exception;
import vi5.h;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.Boolean;
import brd.g;
import com.kwai.dva.design.PluginInstallerUIHandler$e;

public class f implements PluginInstallerUIHandler$d	// class@002860
{
    public final v b;
    public final b c;

    public void f(b p0,v p1){
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
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       b.Z(LiveLogTag.LIVE_ARYA_SO_LOAD, "PluginInstallerListener onSucceed");
       return;
    }
    public void e(){
       h.e(this);
    }
    public void f(boolean p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uof, "2")) {
          return;
       }
       b.c0(LiveLogTag.LIVE_ARYA_SO_LOAD, "PluginInstallerListener onComplete", "isSucceed", Boolean.valueOf(p0));
       if (!this.b.isDisposed()) {
          this.b.onComplete();
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
