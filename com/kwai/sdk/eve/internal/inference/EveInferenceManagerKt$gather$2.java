package com.kwai.sdk.eve.internal.inference.EveInferenceManagerKt$gather$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import en7.t;
import msd.p;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kwai.sdk.eve.internal.inference.EveInferenceManagerKt$gather$2$1;

public final class EveInferenceManagerKt$gather$2 extends Lambda implements l	// class@001561
{
    public static final EveInferenceManagerKt$gather$2 INSTANCE;

    static {
       EveInferenceManagerKt$gather$2.INSTANCE = new EveInferenceManagerKt$gather$2();
    }
    public void EveInferenceManagerKt$gather$2(){
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final p invoke(t p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EveInferenceManagerKt$gather$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       return EveInferenceManagerKt$gather$2$1.INSTANCE;
    }
}
