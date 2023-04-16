package com.kuaishou.tuna_core.plugin.TunaQigsawPluginReporter;
import com.kuaishou.tuna_core.plugin.TunaQigsawPluginReporter$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.kuaishou.tuna_core.plugin.TunaQigsawPluginReporter$PluginState;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.System;
import java.util.Objects;
import com.kuaishou.tuna_core.plugin.SampleRateModel;
import com.kwai.sdk.switchconfig.a;
import java.lang.reflect.Type;
import ssd.e;
import ssd.e$a;
import lnc.i3;
import java.lang.Long;
import java.lang.Number;
import java.lang.Integer;
import k2b.u1;

public final class TunaQigsawPluginReporter	// class@001111
{
    public long a;
    public TunaQigsawPluginReporter$PluginState b;
    public String c;
    public static SampleRateModel d;
    public static boolean e;
    public static final TunaQigsawPluginReporter$a f;

    static {
       TunaQigsawPluginReporter.f = new TunaQigsawPluginReporter$a(null);
    }
    public void TunaQigsawPluginReporter(String p0){
       a.p(p0, "moduleName");
       super();
       this.c = p0;
       this.b = TunaQigsawPluginReporter$PluginState.UNKNOWN;
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, TunaQigsawPluginReporter.class, "2")) {
          return;
       }
       this.a = System.currentTimeMillis();
       return;
    }
    public final void b(TunaQigsawPluginReporter$PluginState p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TunaQigsawPluginReporter.class, "3")) {
          return;
       }
       a.p(p0, "status");
       this.b = p0;
       return;
    }
    public final void c(){
       SampleRateModel d;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, TunaQigsawPluginReporter.class, "4")) {
          return;
       }
       try{
          TunaQigsawPluginReporter$a f = TunaQigsawPluginReporter.f;
          Objects.requireNonNull(f);
          if (!PatchProxy.applyVoid(objArray, f, TunaQigsawPluginReporter$a.class, "1") && !TunaQigsawPluginReporter.e) {
             TunaQigsawPluginReporter.e = true;
             d = new SampleRateModel();
             d = a.t().getValue("tunaPluginReportRate", SampleRateModel.class, d);
             TunaQigsawPluginReporter.d = e0;
          }
       }catch(java.lang.Exception e0){
       }
       d = TunaQigsawPluginReporter.d;
       int i = 100;
       int sampleRateBy = (d != null)? d.getSampleRateByPluginName(this.c): 100;
       if (sampleRateBy >= i || e.b.l(i) < sampleRateBy) {
          i3 oi3 = i3.f();
          oi3.d("module", this.c);
          oi3.c("time_cost", Long.valueOf((System.currentTimeMillis() - this.a)));
          oi3.c("status", Integer.valueOf(this.b.getValue()));
          u1.R("TunaQigsawPlugin", oi3.e(), 10);
       }
       return;
    }
}
