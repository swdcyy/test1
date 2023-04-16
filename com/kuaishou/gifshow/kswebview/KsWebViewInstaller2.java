package com.kuaishou.gifshow.kswebview.KsWebViewInstaller2;
import com.kuaishou.gifshow.kswebview.KsWebViewInstaller2$a;
import nsd.u;
import kotlin.LazyThreadSafetyMode;
import com.kuaishou.gifshow.kswebview.KsWebViewInstaller2$Companion$instance$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import p80.j;
import com.kuaishou.gifshow.kswebview.KsWebViewInstallException;
import java.util.Set;
import p80.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.yxcorp.utility.Log;
import com.kwai.framework.plugin.downloader.PluginDownloadExtension;
import qrd.l1;
import com.kwai.plugin.dva.Dva;
import kotlin.jvm.internal.a;
import com.kwai.plugin.dva.install.b;
import com.kwai.plugin.dva.work.c;
import com.kuaishou.gifshow.kswebview.KsWebViewInstaller2$b;
import com.kwai.plugin.dva.work.c$c;
import java.lang.Float;
import java.util.Iterator;
import java.lang.StringBuilder;
import java.lang.Exception;
import p80.i;
import p80.v;
import com.kwai.plugin.dva.entity.Plugin;
import com.kwai.plugin.dva.repository.model.PluginInfo;
import java.lang.CharSequence;
import android.text.TextUtils;
import p80.l;
import java.lang.Runnable;
import java.util.concurrent.Future;
import t45.c;

public final class KsWebViewInstaller2	// class@0019e6
{
    public final j a;
    public static final p b;
    public static final KsWebViewInstaller2$a c;

    static {
       KsWebViewInstaller2.c = new KsWebViewInstaller2$a(null);
       KsWebViewInstaller2.b = s.b(LazyThreadSafetyMode.NONE, KsWebViewInstaller2$Companion$instance$2.INSTANCE);
    }
    public void KsWebViewInstaller2(){
       super();
       j oj = new j(0, 0, false, null, null, 31, null);
       this.a = v8;
    }
    public final void a(b p0,boolean p1){
       KsWebViewInstaller2 ksWebViewIns = KsWebViewInstaller2.class;
       if (PatchProxy.isSupport(ksWebViewIns) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, ksWebViewIns, "4")) {
          return;
       }
       ksWebViewIns = this.a;
       _monitor_enter(ksWebViewIns);
       if (p0 != null) {
          this.a.a().add(p0);
       }
       int i = this.a.c();
       KsWebViewInstallException ksWebViewIns1 = null;
       if (i) {
          if (i != 1) {
             if (i != 2) {
                if (i == 3) {
                   Log.g("KsWebView", "installFromDva: retry after installing failed, go on");
                   KsWebViewInstaller2 ta = this.a;
                   ta.b = ta.b() + 1;
                }
             }else {
                Log.g("KsWebView", "installFromDva: already installed, return");
                this.c(1, ksWebViewIns1);
                _monitor_exit(ksWebViewIns);
                return;
             }
          }else if(p1){
             PluginDownloadExtension.k.s("kswebview_so_group", 40);
          }
          Log.g("KsWebView", "installFromDva: already in installing, return");
          _monitor_exit(ksWebViewIns);
          return;
       }else {
          Log.g("KsWebView", "installFromDva: first install, go on");
       }
       this.a.f(1);
       this.a.e(ksWebViewIns1);
       i.c = false;
       _monitor_exit(ksWebViewIns);
       Dva uDva = Dva.instance();
       a.o(uDva, "Dva.instance\(\)");
       uDva.getPluginInstallManager().j("kswebview_so_group").a(new KsWebViewInstaller2$b(this));
       if (p1) {
          PluginDownloadExtension.k.s("kswebview_so_group", 40);
       }
       return;
    }
    public final void b(float p0){
       KsWebViewInstaller2 ksWebViewIns = KsWebViewInstaller2.class;
       if (PatchProxy.isSupport(ksWebViewIns) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, ksWebViewIns, "10")) {
          return;
       }
       ksWebViewIns = this.a;
       _monitor_enter(ksWebViewIns);
       Iterator iterator = this.a.a().iterator();
       while (iterator.hasNext()) {
          iterator.next().b(p0);
       }
       _monitor_exit(ksWebViewIns);
       return;
    }
    public final void c(boolean p0,KsWebViewInstallException p1){
       KsWebViewInstaller2 ksWebViewIns = KsWebViewInstaller2.class;
       if (PatchProxy.isSupport(ksWebViewIns) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, ksWebViewIns, "9")) {
          return;
       }
       Log.g("KsWebView", "notifyInstallResult "+p0+", "+p1);
       ksWebViewIns = this.a;
       _monitor_enter(ksWebViewIns);
       KsWebViewInstaller2 ta = this.a;
       int i = (p0)? 2: 3;
       ta.f(i);
       this.a.e(p1);
       Iterator iterator = this.a.a().iterator();
       while (iterator.hasNext()) {
          b uob = iterator.next();
          boolean b = (this.a.c() == 2)? true: false;
          uob.a(b, this.a.d);
       }
       this.a.a().clear();
       _monitor_exit(ksWebViewIns);
       return;
    }
    public final void d(boolean p0,KsWebViewInstallException p1){
       int i;
       String message;
       KsWebViewInstaller2 ksWebViewIns = KsWebViewInstaller2.class;
       if (PatchProxy.isSupport(ksWebViewIns) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, ksWebViewIns, "8")) {
          return;
       }
       ksWebViewIns = this.a;
       _monitor_enter(ksWebViewIns);
       this.c(p0, p1);
       if (p0) {
          i = 0x30da4;
       }else if(p1 != null){
          i = p1.getResultCode();
       }else {
          i = 0x30dac;
       }
       if (p1 != null) {
          message = p1.getMessage();
          if (message != null) {
          label_003d :
             i oi = new i(p0, i, message, this.a.b(), null, 16, null);
             message.a();
             _monitor_exit(ksWebViewIns);
             return;
          }
       }
       message = "";
       goto label_003d ;
    }
    public final void e(boolean p0,String p1){
       KsWebViewInstaller2 ksWebViewIns = KsWebViewInstaller2.class;
       if (PatchProxy.isSupport(ksWebViewIns) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, ksWebViewIns, "5")) {
          return;
       }
       v.e("plugin_install", String.valueOf(p0), p1);
       Log.g("KsWebView", "install: onDvaPluginInstallFinished "+p0);
       if (p0) {
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, this, ksWebViewIns, "6")) {
             Plugin plugin = Dva.instance().getPlugin("kswebview_so_group");
             if (plugin != null) {
                PluginInfo pluginInfo = plugin.getPluginInfo();
                if (pluginInfo != null) {
                   objArray = pluginInfo.soDir;
                }
             }
             Log.g("KsWebView", "install kernel src path "+objArray);
             if (TextUtils.isEmpty(objArray)) {
                Log.g("KsWebView", "install: installKernel directory is empty");
                this.d(false, new KsWebViewInstallException(0x30da7, "Failed to get download directory"));
             }else {
                c.k(new l(this, objArray));
             }
          }
       }else if(p1 != null){
          p1 = "";
       }
       this.d(false, new KsWebViewInstallException(0x30da6, p1));
       return;
    }
}
