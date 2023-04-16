package com.kuaishou.tuna_core.plugin.a;
import nmc.b;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.net.Uri;
import xkd.b;
import android.app.Activity;
import nmc.b$a;
import com.kuaishou.tuna_core.plugin.a$c;
import com.kuaishou.tuna_core.plugin.TunaQigsawPluginReporter;
import java.util.Objects;
import com.kuaishou.tuna_core.plugin.TunaCodPluginReporter;
import android.os.SystemClock;
import com.kuaishou.tuna_core.plugin.TunaCodPluginReporter$a;
import com.kuaishou.tuna_core.plugin.n;
import f05.a;
import java.lang.Runnable;
import ekd.k1;
import com.kuaishou.tuna_core.plugin.a$a;
import kotlin.jvm.internal.a;
import lnc.a1;
import f05.g;
import com.kuaishou.tuna_core.plugin.n$a;
import com.kwai.plugin.dva.Dva;
import com.kwai.plugin.dva.install.b;
import com.kwai.dva.design.PluginInstallerUIHandler;
import com.kwai.dva.design.PluginInstallerUIHandler$a;
import com.kwai.dva.design.PluginInstallerUIHandler$b;
import com.kwai.dva.design.PluginInstallerUIHandler$d;
import ae6.h;
import com.kwai.framework.plugin.downloader.PluginDownloadExtension;
import jd6.g;
import com.kuaishou.tuna_core.plugin.TunaCodPluginReporter$Companion;
import e17.i;
import com.kuaishou.tuna_core.plugin.a$b;
import com.kuaishou.tuna_core.plugin.b;
import com.kwai.plugin.dva.install.a;

public class a implements b	// class@001115
{
    public boolean b;

    public void a(){
       super();
       this.b = false;
    }
    public boolean AA(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (TextUtils.x(p0)) {
          return false;
       }
       Uri uri = b.g(p0);
       if (uri != null) {
          return TextUtils.n(uri.getHost(), "codcontainer");
       }
       return false;
    }
    public void HX(Activity p0,b$a p1){
       n a;
       String str = "2";
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, str)) {
          return;
       }
       a$c uoc = new a$c();
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, uoc, a$c.class, "1")) {
          uoc.a.a();
          a$c b = uoc.b;
          Objects.requireNonNull(b);
          if (!PatchProxy.applyVoid(objArray, b, TunaCodPluginReporter.class, str)) {
             b.a = SystemClock.elapsedRealtime();
             boolean d = TunaCodPluginReporter.d;
             b.a().a = d;
             if (d) {
                b.a().c = b.a - TunaCodPluginReporter.c;
             }
          }
       }
       a = n.a;
       if (a.b("tuna_cod_container")) {
          uoc.a(true);
          uoc.b();
          uoc.c();
          Objects.requireNonNull(p1);
          k1.o(new a(p1));
       }else {
          uoc.a(false);
          this.n();
          a$a uoa = new a$a(this, uoc, p1);
          Objects.requireNonNull(a);
          if (!PatchProxy.applyVoidThreeRefs(p0, "tuna_cod_container", uoa, a, n.class, "3")) {
             a.p(p0, "activity");
             a.p("tuna_cod_container", "moduleName");
             if (!a1.i(p0)) {
                uoa.onFailed("tuna_cod_container");
             }else {
                Dva uDva = Dva.instance();
                a.o(uDva, "Dva.instance\(\)");
                b pluginInstal = uDva.getPluginInstallManager();
                a.o(pluginInstal, "Dva.instance\(\).pluginInstallManager");
                h.a(pluginInstal, "tuna_cod_container", PluginInstallerUIHandler.s.b(p0).d(new g(uoa, "tuna_cod_container")));
                PluginDownloadExtension.k.a("tuna_cod_container");
             }
          }
       }
       return;
    }
    public boolean Ji(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return g.d("tuna_cod_container");
    }
    public void Qf(){
       n a;
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, null, TunaCodPluginReporter.class, "10")) {
          TunaCodPluginReporter$Companion e = TunaCodPluginReporter.e;
          Objects.requireNonNull(e);
          if (!PatchProxy.applyVoid(null, e, TunaCodPluginReporter$Companion.class, "1") && TunaCodPluginReporter.c <= 0) {
             TunaCodPluginReporter.c = SystemClock.elapsedRealtime();
          }
       }
       a = n.a;
       if (a.b("tuna_cod_container")) {
          return;
       }else {
          this.n();
          a.a("tuna_cod_container", null, false);
          return;
       }
    }
    public void hc(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "3")) {
          return;
       }
       i.e(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f103ce2), 0);
       return;
    }
    public boolean isAvailable(){
       return true;
    }
    public synchronized final void n(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "5")) {
          return;
       }
       if (this.b == null) {
          this.b = true;
          a$b uob = new a$b();
          if (!PatchProxy.applyVoid(objArray, uob, a$b.class, "4")) {
             Dva.instance().getPluginInstallManager().o(new b(uob));
          }
       }
       return;
    }
}
