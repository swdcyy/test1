package com.kuaishou.tuna_core.plugin.a$a;
import com.kuaishou.tuna_core.plugin.n$a;
import com.kuaishou.tuna_core.plugin.a;
import com.kuaishou.tuna_core.plugin.a$c;
import nmc.b$a;
import java.lang.Object;
import java.lang.Exception;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.tuna_logger.KsLogTunaCodDynamicLogTag;
import java.util.List;
import f05.b;
import msd.a;
import c15.b;
import java.util.Objects;
import com.kuaishou.tuna_core.plugin.TunaCodPluginReporter;
import com.kuaishou.tuna_core.plugin.TunaCodPluginReporter$a;
import com.kuaishou.tuna_core.plugin.TunaQigsawPluginReporter$PluginState;
import com.kuaishou.tuna_core.plugin.TunaQigsawPluginReporter;

public class a$a implements n$a	// class@001112
{
    public final a$c a;
    public final b$a b;
    public final a c;

    public void a$a(a p0,a$c p1,b$a p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void a(Exception p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "5")) {
          return;
       }
       b.d(KsLogTunaCodDynamicLogTag.PLUGIN.appendTag("TunaCodDvaPluginImpl"), new b(p0));
       return;
    }
    public void b(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a$a.class, "6")) {
          return;
       }
       a$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(objArray, ta, a$c.class, "6")) {
          a$c b = ta.b;
          Objects.requireNonNull(b);
          if (!PatchProxy.applyVoid(objArray, b, TunaCodPluginReporter.class, "6")) {
             TunaCodPluginReporter$a uoa = b.a();
             uoa.g = uoa.g + 1;
          }
       }
       return;
    }
    public void c(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a$a.class, "3")) {
          return;
       }
       a$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(objArray, ta, a$c.class, "5")) {
          a$c b = ta.b;
          Objects.requireNonNull(b);
          if (!PatchProxy.applyVoid(objArray, b, TunaCodPluginReporter.class, "5")) {
             TunaCodPluginReporter$a uoa = b.a();
             uoa.f = uoa.f + 1;
          }
       }
       return;
    }
    public void d(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a$a.class, "4")) {
          return;
       }
       a$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(objArray, ta, a$c.class, "4")) {
          a$c b = ta.b;
          Objects.requireNonNull(b);
          if (!PatchProxy.applyVoid(objArray, b, TunaCodPluginReporter.class, "4")) {
             TunaCodPluginReporter$a uoa = b.a();
             uoa.e = uoa.e + 1;
          }
       }
       return;
    }
    public void onFailed(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "2")) {
          return;
       }
       a$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(null, ta, a$c.class, "3")) {
          ta.a.b(TunaQigsawPluginReporter$PluginState.INSTALL_FAIL);
          ta.b.b(2);
       }
       this.a.c();
       this.b.onFail();
       return;
    }
    public void onSuccess(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
          return;
       }
       this.a.b();
       this.a.c();
       this.b.onSuccess();
       return;
    }
}
