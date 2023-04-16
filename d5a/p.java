package d5a.p;
import java.lang.Runnable;
import com.yxcorp.gifshow.detail.presenter.landscape.LandscapeEntranceVMPresenter;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import d5a.s;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.plugin.dva.Dva;
import com.kwai.plugin.dva.install.b;
import d5a.p$a;
import com.kwai.plugin.dva.work.c;
import com.kwai.plugin.dva.work.c$c;

public final class p implements Runnable	// class@001e8b
{
    public final LandscapeEntranceVMPresenter b;
    public final long c;

    public void p(LandscapeEntranceVMPresenter p0,long p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       s os = s.class;
       if (PatchProxy.applyVoid(null, this, p.class, "1")) {
          return;
       }
       p$a obj = PatchProxy.apply(null, null, os, "2");
       boolean b = (obj != patchProxyRe)? obj.booleanValue(): Dva.instance().getPluginInstallManager().g("landscape");
       if (b) {
          obj = new p$a(this);
          if (PatchProxy.applyOneRefs(obj, null, os, "3") != patchProxyRe) {
          }else {
             Dva.instance().getPluginInstallManager().j("landscape").a(obj);
          }
       }
       return;
    }
}
