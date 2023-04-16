package com.kuaishou.tuna_core.tuna_canary.TunaCanaryFeaturesManager$updateExceptionsClues$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.google.gson.JsonArray;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class TunaCanaryFeaturesManager$updateExceptionsClues$1 extends Lambda implements a	// class@001129
{
    public final JsonArray $featuresJsonArray;

    public void TunaCanaryFeaturesManager$updateExceptionsClues$1(JsonArray p0){
       this.$featuresJsonArray = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       Object obj = PatchProxy.apply(null, this, TunaCanaryFeaturesManager$updateExceptionsClues$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "exception clues updated: "+this.$featuresJsonArray;
    }
}
