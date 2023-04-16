package com.kwai.sdk.eve.internal.inference.EveInferenceManager$directInferAsync$4;
import msd.p;
import kotlin.jvm.internal.Lambda;
import java.lang.String;
import ml5.a;
import zn7.a;
import java.lang.Object;
import com.kwai.sdk.eve.internal.inference.a$a;
import java.util.Map;
import sm7.l;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kwai.sdk.eve.InferenceState;
import ao7.a;
import sm7.p;
import java.lang.Throwable;

public final class EveInferenceManager$directInferAsync$4 extends Lambda implements p	// class@00154c
{
    public final String $inferenceId;
    public final String $pipeline;
    public final a $task;
    public final a $trigger;

    public void EveInferenceManager$directInferAsync$4(String p0,String p1,a p2,a p3){
       this.$inferenceId = p0;
       this.$pipeline = p1;
       this.$trigger = p2;
       this.$task = p3;
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1);
    }
    public final l invoke(a$a p0,Map p1){
       a$a a;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, EveInferenceManager$directInferAsync$4.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "resultWithUpload");
       a.p(p1, "processorResult");
       InferenceState sUCCESS = InferenceState.SUCCESS;
       EveInferenceManager$directInferAsync$4 t$inferenceI = this.$inferenceId;
       EveInferenceManager$directInferAsync$4 t$pipeline = this.$pipeline;
       a = p0.a;
       EveInferenceManager$directInferAsync$4 t$trigger = this.$trigger;
       a uoa = this.$task.h();
       p op = (uoa != null)? uoa.S3(): 0;
       l ol = new l(sUCCESS, t$inferenceI, t$pipeline, a, null, t$trigger, op, p1);
       return obj;
    }
}
