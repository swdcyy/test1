package com.kwai.framework.plugin.usecase.PluginConfigReadyInterceptor;
import com.kwai.plugin.dva.install.a;
import com.kwai.framework.plugin.usecase.PluginConfigReadyInterceptor$a;
import nsd.u;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import qj7.d;
import jd6.g;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.framework.plugin.feature.KwaiFeatureUpdateManager;
import com.kwai.plugin.dva.repository.store.a;
import com.kwai.plugin.dva.Dva;
import qrd.l1;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import nsd.r0;
import zd6.b;
import zd6.b$a;
import java.util.Arrays;
import android.net.Uri;
import com.kwai.framework.plugin.usecase.PluginConfigReadyInterceptor$b;
import io.reactivex.i;
import brd.a0;
import java.util.concurrent.TimeUnit;
import brd.z;
import lrd.b;

public final class PluginConfigReadyInterceptor implements a	// class@000ccf
{
    public boolean a;
    public final Context b;
    public static final PluginConfigReadyInterceptor$a c;

    static {
       PluginConfigReadyInterceptor.c = new PluginConfigReadyInterceptor$a(null);
    }
    public void PluginConfigReadyInterceptor(Context p0){
       a.p(p0, "mAppContext");
       super();
       this.b = p0;
    }
    public void a(String p0){
       int b;
       if (PatchProxy.applyVoidOneRefs(p0, this, PluginConfigReadyInterceptor.class, "1")) {
          return;
       }
       a.p(p0, "plugin");
       if (this.a != null) {
          return;
       }
       if (PluginConfigReadyInterceptor.c.a(this.b)) {
          d.c("isAppUpdated=true, need to wait for main process to async init.");
          this.c();
       }
       g i = g.i;
       Objects.requireNonNull(i);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       i = PatchProxy.apply(objArray, i, g.class, "12");
       if (i != patchProxyRe) {
          b = i.booleanValue();
       }else {
          KwaiFeatureUpdateManager e = g.e;
          Objects.requireNonNull(e);
          Object obj = PatchProxy.apply(objArray, e, KwaiFeatureUpdateManager.class, "5");
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else {
             e = a.c().i(e.f());
             b = (e == null || !e.length())? 1: 0;
             b = b ^ true;
          }
       }
       if (b) {
          d.c("hasFeaturesThatToBeUpdated=true, need to wait for main process to async init.");
          this.c();
       }
       if (this.a == null) {
          _monitor_enter(this);
          if (this.a == null) {
             Dva.instance().refreshCachePluginSource();
          }
          this.a = true;
          _monitor_exit(this);
       }
       return;
    }
    public final void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PluginConfigReadyInterceptor.class, "3")) {
          return;
       }
       ExceptionHandler.handleCaughtException(p0);
       return;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, PluginConfigReadyInterceptor.class, "2")) {
          return;
       }
       d.c("waitMainProcessInit start.");
       Object[] objArray = new Object[]{b.c.a(this.b),"plugin/config"};
       String str = String.format("content://%s/%s", Arrays.copyOf(objArray, 2));
       a.o(str, "java.lang.String.format\(format, *args\)");
       a0.k(new PluginConfigReadyInterceptor$b(this, Uri.parse(str))).U(5, TimeUnit.SECONDS).T(b.c()).e();
       return;
    }
}
