package bw9.c;
import bw9.a;
import java.lang.Thread$UncaughtExceptionHandler;
import java.lang.Thread;
import java.lang.Object;
import android.content.Context;
import com.yxcorp.gifshow.AppLike;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.utility.SystemUtil;
import oe6.k;
import pkd.a;
import o56.a;
import android.app.Application;
import bw9.b;
import com.kwai.framework.initmodule.FoundationInfoInitModule;
import com.yxcorp.gifshow.init.module.ChannelInitializer;
import pxa.d;
import com.kwai.framework.network.RetrofitInitModule;
import com.kwai.framework.initmodule.AzerothInitModule;
import com.kwai.framework.debuglog.g;
import com.kwai.framework.switchs.SwitchConfigInitModule;
import com.kwai.framework.abtest.ABTestInitModule;
import com.yxcorp.gifshow.message.init.KLinkInitManager;
import com.yxcorp.gifshow.push.init.NotificationManagerInitModule;
import com.yxcorp.gifshow.push.init.PushSdkInitModuleForSubProcess;
import java.lang.CharSequence;
import tkd.b;
import tkd.d;
import m85.a;
import com.kwai.framework.init.a;
import com.yxcorp.gifshow.performance.monitor.PerformanceMonitorInitModule;
import com.yxcorp.gifshow.performance.monitor.crash.CrashMonitorInitModule;

public class c implements a	// class@000369
{
    public static final c a;
    public static final Thread$UncaughtExceptionHandler b;

    static {
       c.a = new c();
       c.b = Thread.getDefaultUncaughtExceptionHandler();
    }
    public void c(){
       super();
    }
    public static c d(){
       return c.a;
    }
    public boolean a(Context p0,AppLike p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!this.c(p0)) {
          return false;
       }
       SystemUtil.r(p0);
       new k().a();
       a.v = a.h;
       a.F = p0;
       a.C = p1;
       return true;
    }
    public boolean b(AppLike p0){
       p0 = PatchProxy.applyOneRefs(p0, this, c.class, "2");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       if (!this.c(a.b())) {
          return false;
       }
       Thread.setDefaultUncaughtExceptionHandler(b.a);
       new FoundationInfoInitModule().n();
       new ChannelInitializer().a();
       d.b();
       new RetrofitInitModule().n();
       new AzerothInitModule().n();
       g.a(a.b());
       new SwitchConfigInitModule().n();
       new ABTestInitModule().n();
       KLinkInitManager.a().b();
       new NotificationManagerInitModule().n();
       new PushSdkInitModuleForSubProcess().n();
       if ((a.t).contains("CollectClass")) {
          d.a(-1842031987).I9().n();
       }
       PerformanceMonitorInitModule.l0(a.b());
       new CrashMonitorInitModule().n();
       return true;
    }
    public boolean c(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (SystemUtil.r(p0)).endsWith("messagesdk");
    }
}
