package com.kuaishou.tuna_core.plugin.a$c;
import java.lang.Object;
import com.kuaishou.tuna_core.plugin.TunaQigsawPluginReporter;
import java.lang.String;
import com.kuaishou.tuna_core.plugin.TunaCodPluginReporter;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.util.Objects;
import com.kuaishou.tuna_core.plugin.TunaCodPluginReporter$a;
import com.kuaishou.tuna_core.plugin.TunaQigsawPluginReporter$PluginState;
import com.kwai.robust.PatchProxyResult;
import com.kwai.plugin.dva.install.PluginUrlManager;
import kotlin.jvm.internal.a;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Integer;
import lnc.i3;
import java.lang.Long;
import java.lang.Number;
import com.kuaishou.tuna_logger.KsLogTunaCodDynamicLogTag;
import java.util.List;
import com.kuaishou.tuna_core.plugin.TunaCodPluginReporter$report$1;
import msd.a;
import c15.b;
import com.kuaishou.tuna_core.plugin.TunaCodPluginReporter$Companion;
import tkd.b;
import tkd.d;
import xx5.g;
import zx5.c;
import zx5.e;
import zx5.c$a;
import zx5.a;
import com.kuaishou.tuna_core.plugin.TunaCodPluginReporter$report$2;
import zx5.a$a;

public class a$c	// class@001114
{
    public TunaQigsawPluginReporter a;
    public TunaCodPluginReporter b;

    public void a$c(){
       super();
       this.a = new TunaQigsawPluginReporter("tuna_cod_container");
       this.b = new TunaCodPluginReporter();
    }
    public void a(boolean p0){
       a$c uoc = a$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "7")) {
          return;
       }
       uoc = this.b;
       Objects.requireNonNull(uoc);
       TunaCodPluginReporter tunaCodPlugi = TunaCodPluginReporter.class;
       if (!PatchProxy.isSupport(tunaCodPlugi) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), uoc, tunaCodPlugi, "3")) {
          uoc.a().b = p0;
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, a$c.class, "2")) {
          return;
       }
       this.a.b(TunaQigsawPluginReporter$PluginState.INSTALL_SUCCESS);
       this.b.b(1);
       return;
    }
    public void c(){
       boolean b;
       PluginUrlManager a;
       Object[] objArray = null;
       String str = "8";
       if (PatchProxy.applyVoid(objArray, this, a$c.class, str)) {
          return;
       }
       this.a.c();
       a$c tb = this.b;
       Objects.requireNonNull(tb);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (!PatchProxy.applyVoid(objArray, tb, TunaCodPluginReporter.class, str)) {
          TunaCodPluginReporter$a uoa = tb.a();
          Objects.requireNonNull(uoa);
          str = PatchProxy.apply(objArray, uoa, TunaCodPluginReporter$a.class, "1");
          String str1 = "3";
          if (str != patchProxyRe) {
          }else {
             a = PluginUrlManager.a;
             String str2 = "tuna_cod_container";
             Objects.requireNonNull(a);
             Integer integer = PatchProxy.applyOneRefs(str2, a, PluginUrlManager.class, str1);
             if (integer == patchProxyRe) {
                a.p(str2, "pluginName");
                integer = PluginUrlManager.b.get(str2);
             }
             int i = (integer != null)? integer.intValue(): 2;
             i3 oi3 = i3.f();
             oi3.a("first_use", Boolean.valueOf(uoa.a));
             oi3.a("ready_when_use", Boolean.valueOf(uoa.b));
             oi3.c("first_use_time", Long.valueOf(uoa.c));
             oi3.c("load_result", Integer.valueOf(uoa.d));
             oi3.c("fail_dialog_retry_click_count", Integer.valueOf(uoa.e));
             oi3.c("fail_dialog_cancel_click_count", Integer.valueOf(uoa.f));
             oi3.c("plugin_loading_cancel_click_count", Integer.valueOf(uoa.g));
             oi3.c("plugin_url_type", Integer.valueOf(i));
             str = oi3.e();
             a.o(str, "builder.build\(\)");
          }
          b.f(KsLogTunaCodDynamicLogTag.PLUGIN.appendTag("TunaCodPluginReporter"), new TunaCodPluginReporter$report$1(str));
          TunaCodPluginReporter$Companion e = TunaCodPluginReporter.e;
          Objects.requireNonNull(e);
          g obj = PatchProxy.apply(objArray, e, TunaCodPluginReporter$Companion.class, str1);
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else {
             obj = d.a(-174493078);
             c uoc = (obj != null)? obj.PB(c.class): objArray;
             if (uoc != null) {
                b = c$a.a(uoc, "tunaCodPluginSampling", false, 2, objArray);
             }else {
                b = false;
             }
          }
          if (b) {
             obj = d.a(-174493078);
             if (obj != null) {
                objArray = obj.PB(a.class);
             }
             Object[] objArray1 = objArray;
             if (objArray1 != null) {
                a$a.a(objArray1, "cod_plugin_load", false, new TunaCodPluginReporter$report$2(str), 2, null);
             }
             TunaCodPluginReporter.d = false;
          }
       }
       return;
    }
}
