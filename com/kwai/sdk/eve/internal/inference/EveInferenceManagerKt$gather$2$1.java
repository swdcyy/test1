package com.kwai.sdk.eve.internal.inference.EveInferenceManagerKt$gather$2$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import sm7.i;
import ml5.a;
import com.kwai.sdk.eve.internal.inference.DataBundle;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class EveInferenceManagerKt$gather$2$1 extends Lambda implements p	// class@001560
{
    public static final EveInferenceManagerKt$gather$2$1 INSTANCE;

    static {
       EveInferenceManagerKt$gather$2$1.INSTANCE = new EveInferenceManagerKt$gather$2$1();
    }
    public void EveInferenceManagerKt$gather$2$1(){
       super(2);
    }
    public final DataBundle invoke(i p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, EveInferenceManagerKt$gather$2$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "<anonymous parameter 0>");
       a.p(p1, "<anonymous parameter 1>");
       return new DataBundle();
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1);
    }
}
