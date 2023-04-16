package com.kwai.dva.design.PluginInstallerUIHandler$b;
import java.lang.Object;
import nsd.u;
import android.content.Context;
import vi5.c;
import yi5.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.dva.design.PluginInstallerUIHandler;
import android.app.Application;
import android.app.Activity;
import com.kwai.dva.design.PluginInstallerUIHandler$a;
import com.kwai.robust.PatchProxyResult;
import vi5.a$a;
import qrd.p;
import vi5.a;
import java.lang.IllegalStateException;

public final class PluginInstallerUIHandler$b	// class@000acc
{

    public void PluginInstallerUIHandler$b(){
       super();
    }
    public void PluginInstallerUIHandler$b(u p0){
       super();
    }
    public synchronized final void a(Context p0,c p1,c p2,a p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, PluginInstallerUIHandler$b.class, "9")) {
          return;
       }
       a.p(p0, "context");
       a.p(p1, "installerDialog");
       a.p(p2, "installerPage");
       a.p(p3, "installerUIReporter");
       if (PluginInstallerUIHandler.A) {
          return;
       }
       if (!p0 instanceof Application) {
          p0 = p0.getApplicationContext();
          a.o(p0, "{\n                contex¡­tionContext\n            }");
       }
       PluginInstallerUIHandler.B = p0;
       PluginInstallerUIHandler.t = p1;
       PluginInstallerUIHandler.u = p2;
       PluginInstallerUIHandler.C = p3;
       PluginInstallerUIHandler.A = true;
       return;
    }
    public final PluginInstallerUIHandler$a b(Activity p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       PluginInstallerUIHandler$b uob = PluginInstallerUIHandler$b.class;
       PluginInstallerUIHandler$a obj = PatchProxy.applyOneRefs(p0, this, uob, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "activity");
       if (!PluginInstallerUIHandler.A) {
          throw new IllegalStateException("init\(\) should be called.");
       }
       obj = new PluginInstallerUIHandler$a(p0);
       Object[] objArray = null;
       a$a uoa = PatchProxy.apply(objArray, this, uob, "2");
       if (uoa != patchProxyRe) {
       }else {
          uoa = new a$a();
          String str = PatchProxy.apply(objArray, this, uob, "4");
          if (str == patchProxyRe) {
             str = PluginInstallerUIHandler.v.getValue();
          }
          uoa = uoa.e(str);
          str = PatchProxy.apply(objArray, this, uob, "5");
          if (str == patchProxyRe) {
             str = PluginInstallerUIHandler.w.getValue();
          }
          uoa = uoa.c(str);
          uoa.g(true);
          Object obj1 = PatchProxy.apply(objArray, this, uob, "8");
          if (obj1 != patchProxyRe) {
          }else {
             obj1 = PluginInstallerUIHandler.z.getValue();
          }
          uoa = uoa.h(obj1);
       }
       PluginInstallerUIHandler$a uoa1 = obj.b(uoa.a());
       c t = PluginInstallerUIHandler.t;
       if (t == null) {
          a.S("sInstallerDialog");
       }else {
          objArray = t;
       }
       return uoa1.c(objArray);
    }
}
