package com.kwai.sdk.eve.internal.inference.EveInferenceManager$directInferAsync$3;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.String;
import ml5.a;
import zn7.a;
import java.lang.Object;
import java.lang.Throwable;
import sm7.l;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kwai.sdk.eve.internal.common.models.InferenceCanceled;
import com.kwai.sdk.eve.InferenceState;
import com.kwai.sdk.eve.AbortException;
import ao7.a;
import sm7.p;
import java.util.Map;

public final class EveInferenceManager$directInferAsync$3 extends Lambda implements l	// class@00154b
{
    public final String $inferenceId;
    public final String $pipeline;
    public final a $task;
    public final a $trigger;

    public void EveInferenceManager$directInferAsync$3(String p0,String p1,a p2,a p3){
       this.$inferenceId = p0;
       this.$pipeline = p1;
       this.$trigger = p2;
       this.$task = p3;
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final l invoke(Throwable p0){
       InferenceState obj = PatchProxy.applyOneRefs(p0, this, EveInferenceManager$directInferAsync$3.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "error");
       if (p0 instanceof InferenceCanceled) {
          obj = InferenceState.CANCEL;
       }else if(p0 instanceof AbortException){
          obj = InferenceState.ABORT;
       }else {
          obj = InferenceState.ERROR;
       }
       InferenceState inferenceSta = obj;
       EveInferenceManager$directInferAsync$3 t$inferenceI = this.$inferenceId;
       EveInferenceManager$directInferAsync$3 t$pipeline = this.$pipeline;
       EveInferenceManager$directInferAsync$3 t$trigger = this.$trigger;
       a uoa = this.$task.h();
       p op = (uoa != null)? uoa.S3(): null;
       l ol = new l(inferenceSta, t$inferenceI, t$pipeline, null, p0, t$trigger, op, null);
       return obj;
    }
}
