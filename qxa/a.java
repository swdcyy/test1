package qxa.a;
import java.lang.Object;
import java.util.Collection;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.init.CoreInitModule;
import java.util.Iterator;
import com.kwai.framework.init.a;
import kotlin.jvm.internal.a;
import java.util.List;
import com.kwai.performance.fluency.startup.scheduler.task.base.DependencyTask;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.ArrayList;
import wkd.b;
import com.kwai.framework.initmodule.FoundationInfoInitModule;
import com.kwai.framework.switchs.SwitchConfigInitModule;
import com.kwai.framework.initmodule.AzerothInitModule;
import com.yxcorp.gifshow.performance.monitor.PerformanceMonitorInitModule;
import com.yxcorp.gifshow.init.module.BinderProxyInitModule;
import com.yxcorp.gifshow.init.module.DebugLogInitModule;
import com.kwai.framework.initmodule.ActivityContextInitModule;
import com.kwai.framework.initmodule.RxJavaErrorHandlerInitModule;
import com.kwai.framework.abtest.ABTestInitModule;
import com.kwai.framework.initmodule.ResourceManagerInitModule;
import com.yxcorp.gifshow.init.module.AsyncLogDelegateInitModule;
import com.kwai.framework.network.degrade.DegradeInitModule;
import com.kwai.framework.ui.popupmanager.PopupConfigInitModule;
import com.kwai.feature.platform.misc.priavykit.PrivacyKitInitModule;
import com.kwai.feature.platform.misc.albumcontrol.AlbumControlInitModule;
import com.yxcorp.gifshow.push.init.NotificationManagerInitModule;
import o56.a;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;
import tkd.b;
import tkd.d;
import m85.a;
import com.kwai.framework.initmodule.ProcessBroadCastInitModel;

public abstract class a	// class@0022ea
{

    public void a(){
       super();
    }
    public final void a(Collection p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, a.class, "5")) {
          return;
       }
       CoreInitModule uCoreInitMod = new CoreInitModule();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          a uoa = iterator.next();
          a.q(uoa, "dependencyTask");
          uCoreInitMod.u().add(uoa);
       }
       p0.add(uCoreInitMod);
       PatchProxy.onMethodExit(a.class, "5");
       return;
    }
    public final Collection b(){
       Object obj = PatchProxy.applyWithListener(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(a.class, "2");
       return this.c(false);
    }
    public final Collection c(boolean p0){
       ArrayList obj;
       if (PatchProxy.isSupport2(a.class, "1")) {
          obj = PatchProxy.applyOneRefsWithListener(Boolean.valueOf(p0), this, a.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new ArrayList(64);
       obj.add(b.a(-2098776724));
       obj.add(new FoundationInfoInitModule());
       obj.add(new SwitchConfigInitModule());
       obj.add(new AzerothInitModule());
       obj.add(new PerformanceMonitorInitModule());
       obj.add(new BinderProxyInitModule());
       obj.add(new DebugLogInitModule());
       obj.add(new ActivityContextInitModule());
       if (!p0) {
          obj.add(new RxJavaErrorHandlerInitModule());
          obj.add(new ABTestInitModule());
          obj.add(new ResourceManagerInitModule());
          obj.add(new AsyncLogDelegateInitModule());
          obj.add(new DegradeInitModule());
       }
       this.a(obj);
       if (!p0) {
          obj.add(new PopupConfigInitModule());
       }
       obj.add(new PrivacyKitInitModule());
       obj.add(new AlbumControlInitModule());
       obj.add(new NotificationManagerInitModule());
       String t = a.t;
       a.o(t, "AppEnv.BUILD_PARAMS");
       if (StringsKt__StringsKt.O2(t, "CollectClass", false, 2, null)) {
          b uob = d.a(-1842031987);
          a.o(uob, "PluginManager.get\(\n     ¡­ctInitPlugin::class.java\)");
          obj.add(uob.I9());
       }
       obj.add(new ProcessBroadCastInitModel());
       PatchProxy.onMethodExit(a.class, "1");
       return obj;
    }
    public abstract Collection d();
}
