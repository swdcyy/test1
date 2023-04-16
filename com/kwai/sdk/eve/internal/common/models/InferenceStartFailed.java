package com.kwai.sdk.eve.internal.common.models.InferenceStartFailed;
import java.lang.Exception;
import com.kwai.sdk.eve.internal.task.EveTaskLifecycle;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;

public final class InferenceStartFailed extends Exception	// class@00147f
{

    public void InferenceStartFailed(EveTaskLifecycle p0,String p1){
       a.p(p0, "lifecycle");
       a.p(p1, "happened");
       super("lifecycle wrong "+p0+" when "+p1);
    }
}
