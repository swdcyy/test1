package com.kuaishou.tuna_core.plugin.f;
import com.kuaishou.tuna_core.plugin.n$a;
import com.kuaishou.tuna_core.plugin.g;
import com.kuaishou.tuna_core.plugin.TunaQigsawPluginReporter;
import brd.v;
import java.lang.Object;
import java.lang.Exception;
import f05.f;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.tuna_core.plugin.TunaQigsawPluginReporter$PluginState;
import com.kuaishou.tuna_logger.KsLogTunaProfileTag;
import java.util.List;
import com.kuaishou.tuna_core.plugin.d;
import msd.a;
import c15.b;
import brd.g;
import com.kuaishou.tuna_core.plugin.e;
import tkd.b;
import tkd.d;
import nmc.e;

public class f implements n$a	// class@00111a
{
    public final TunaQigsawPluginReporter a;
    public final v b;
    public final g c;

    public void f(g p0,TunaQigsawPluginReporter p1,v p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void a(Exception p0){
       f.c(this, p0);
    }
    public void b(){
       f.d(this);
    }
    public void c(){
       f.a(this);
    }
    public void d(){
       f.b(this);
    }
    public void onFailed(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "2")) {
          return;
       }
       this.a.b(TunaQigsawPluginReporter$PluginState.INSTALL_FAIL);
       this.a.c();
       b.f(KsLogTunaProfileTag.TUNA_TAB.appendTag("getTunaTabFragmentClass"), d.b);
       this.b.onNext("Tuna plugin load fail");
       this.b.onComplete();
       return;
    }
    public void onSuccess(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
          return;
       }
       this.a.b(TunaQigsawPluginReporter$PluginState.INSTALL_SUCCESS);
       this.a.c();
       b.f(KsLogTunaProfileTag.TUNA_TAB.appendTag("getTunaTabFragmentClass"), e.b);
       this.b.onNext(d.a(0x48215b73).mJ());
       this.b.onComplete();
       return;
    }
}
