package com.kwai.sdk.eve.internal.inference.EveInferenceManagerKt$idGenerator$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import en7.t;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kwai.sdk.eve.internal.inference.EveInferenceManagerKt$idGenerator$2$1;

public final class EveInferenceManagerKt$idGenerator$2 extends Lambda implements l	// class@001563
{
    public static final EveInferenceManagerKt$idGenerator$2 INSTANCE;

    static {
       EveInferenceManagerKt$idGenerator$2.INSTANCE = new EveInferenceManagerKt$idGenerator$2();
    }
    public void EveInferenceManagerKt$idGenerator$2(){
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final l invoke(t p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EveInferenceManagerKt$idGenerator$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       return EveInferenceManagerKt$idGenerator$2$1.INSTANCE;
    }
}
