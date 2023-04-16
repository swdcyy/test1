package com.kwai.video.westeros.models.AdjustEffectType$AdjustEffectTypeVerifier;
import com.google.protobuf.Internal$EnumVerifier;
import java.lang.Object;
import com.kwai.video.westeros.models.AdjustEffectType;

public final class AdjustEffectType$AdjustEffectTypeVerifier implements Internal$EnumVerifier	// class@000e95
{
    public static final Internal$EnumVerifier INSTANCE;

    static {
       AdjustEffectType$AdjustEffectTypeVerifier.INSTANCE = new AdjustEffectType$AdjustEffectTypeVerifier();
    }
    public void AdjustEffectType$AdjustEffectTypeVerifier(){
       super();
    }
    public boolean isInRange(int p0){
       boolean b = (AdjustEffectType.forNumber(p0) != null)? true: false;
       return b;
    }
}
