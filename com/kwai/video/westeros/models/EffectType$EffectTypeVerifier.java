package com.kwai.video.westeros.models.EffectType$EffectTypeVerifier;
import com.google.protobuf.Internal$EnumVerifier;
import java.lang.Object;
import com.kwai.video.westeros.models.EffectType;

public final class EffectType$EffectTypeVerifier implements Internal$EnumVerifier	// class@000f47
{
    public static final Internal$EnumVerifier INSTANCE;

    static {
       EffectType$EffectTypeVerifier.INSTANCE = new EffectType$EffectTypeVerifier();
    }
    public void EffectType$EffectTypeVerifier(){
       super();
    }
    public boolean isInRange(int p0){
       boolean b = (EffectType.forNumber(p0) != null)? true: false;
       return b;
    }
}
