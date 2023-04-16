package fsa.a;
import com.yxcorp.gifshow.homepage.presenter.HomeTabChannelForegroundSwitchPresenter;
import java.lang.Runnable;
import msd.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import hn5.n;
import hn5.m;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import android.content.Context;
import m56.f;

public final class a extends HomeTabChannelForegroundSwitchPresenter	// class@0029e0
{
    public final Runnable r;
    public final a s;

    public void a(Runnable p0,a p1){
       a.p(p0, "switcher");
       a.p(p1, "isSelectTopChannel");
       super();
       this.r = p0;
       this.s = p1;
    }
    public void R8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.r.run();
       return;
    }
    public final boolean S8(){
       Object obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       ActivityContext uActivityCon = ActivityContext.g();
       a.o(uActivityCon, "ActivityContext.getInstance\(\)");
       if (!m.a().U3(uActivityCon.e())) {
          return false;
       }
       return this.s.invoke().booleanValue();
    }
    public void onBackground(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       a.p(p0, "event");
       if (this.S8()) {
          super.onBackground(p0);
       }
       return;
    }
}
