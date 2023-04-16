package com.kwai.sdk.eve.internal.inference.EveInferenceManager$buildInference$$inlined$mapIndexed$lambda$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kwai.sdk.eve.internal.inference.EveInferenceManager;
import zn7.a;
import com.kwai.sdk.eve.internal.inference.a;
import kotlin.jvm.internal.Ref$ObjectRef;
import rk.a0;
import java.lang.Object;
import java.lang.String;
import sm7.h;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.util.Map;
import com.kwai.sdk.eve.internal.inference.EveInferenceManagerKt;

public final class EveInferenceManager$buildInference$$inlined$mapIndexed$lambda$1 extends Lambda implements l	// class@001547
{
    public final a0 $graph$inlined;
    public final a $inference$inlined;
    public final Ref$ObjectRef $last$inlined;
    public final Ref$ObjectRef $processor$inlined;
    public final Ref$ObjectRef $singlePipelineExecutable$inlined;
    public final a $this_buildInference$inlined;
    public final EveInferenceManager this$0;

    public void EveInferenceManager$buildInference$$inlined$mapIndexed$lambda$1(EveInferenceManager p0,a p1,a p2,Ref$ObjectRef p3,Ref$ObjectRef p4,a0 p5,Ref$ObjectRef p6){
       this.this$0 = p0;
       this.$this_buildInference$inlined = p1;
       this.$inference$inlined = p2;
       this.$singlePipelineExecutable$inlined = p3;
       this.$processor$inlined = p4;
       this.$graph$inlined = p5;
       this.$last$inlined = p6;
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final h invoke(String p0){
       Object obj = PatchProxy.applyOneRefsWithListener(p0, this, EveInferenceManager$buildInference$$inlined$mapIndexed$lambda$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       p0 = EveInferenceManagerKt.d(this.$this_buildInference$inlined).get(p0);
       a.m(p0);
       PatchProxy.onMethodExit(EveInferenceManager$buildInference$$inlined$mapIndexed$lambda$1.class, "1");
       return p0;
    }
}
