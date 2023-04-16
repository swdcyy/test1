package com.kwai.sdk.eve.internal.inference.EveInferenceManager$startInference$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import zn7.a;
import java.lang.Object;
import sm7.l;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import io.reactivex.subjects.PublishSubject;

public final class EveInferenceManager$startInference$1 extends Lambda implements l	// class@00155e
{
    public final a $task;

    public void EveInferenceManager$startInference$1(a p0){
       this.$task = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(l p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EveInferenceManager$startInference$1.class, "1")) {
          return;
       }
       a.p(p0, "result");
       this.$task.m().onNext(p0);
       return;
    }
}
