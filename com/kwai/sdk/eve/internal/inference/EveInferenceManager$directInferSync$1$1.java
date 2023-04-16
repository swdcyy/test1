package com.kwai.sdk.eve.internal.inference.EveInferenceManager$directInferSync$1$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import brd.v;
import java.lang.Object;
import sm7.l;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import brd.g;

public final class EveInferenceManager$directInferSync$1$1 extends Lambda implements l	// class@00155c
{
    public final v $source;

    public void EveInferenceManager$directInferSync$1$1(v p0){
       this.$source = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(l p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EveInferenceManager$directInferSync$1$1.class, "1")) {
          return;
       }
       a.p(p0, "result");
       this.$source.onNext(p0);
       this.$source.onComplete();
       return;
    }
}
