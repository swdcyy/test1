package com.kwai.video.westeros.models.EffectPerformance$EffectPerformanceVerifier;
import com.google.protobuf.Internal$EnumVerifier;
import java.lang.Object;
import com.kwai.video.westeros.models.EffectPerformance;

public final class EffectPerformance$EffectPerformanceVerifier implements Internal$EnumVerifier	// class@000f38
{
    public static final Internal$EnumVerifier INSTANCE;

    static {
       EffectPerformance$EffectPerformanceVerifier.INSTANCE = new EffectPerformance$EffectPerformanceVerifier();
    }
    public void EffectPerformance$EffectPerformanceVerifier(){
       super();
    }
    public boolean isInRange(int p0){
       boolean b = (EffectPerformance.forNumber(p0) != null)? true: false;
       return b;
    }
}
