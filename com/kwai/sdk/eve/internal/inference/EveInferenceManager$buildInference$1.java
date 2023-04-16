package com.kwai.sdk.eve.internal.inference.EveInferenceManager$buildInference$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import zn7.a;
import java.lang.String;
import com.kwai.sdk.eve.internal.inference.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class EveInferenceManager$buildInference$1 extends Lambda implements a	// class@001548
{
    public final String $id;
    public final a $inference;
    public final String $pipeline;
    public final a $this_buildInference;

    public void EveInferenceManager$buildInference$1(a p0,String p1,String p2,a p3){
       this.$this_buildInference = p0;
       this.$id = p1;
       this.$pipeline = p2;
       this.$inference = p3;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       Object obj = PatchProxy.apply(null, this, EveInferenceManager$buildInference$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "EveInferenceManager#buildInference "+this.$this_buildInference.n()+" id="+this.$id+", pipeline="+this.$pipeline+" inferenceId="+this.$inference.h();
    }
}
