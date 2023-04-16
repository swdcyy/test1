package com.kwai.video.westeros.models.EffectHintType$EffectHintTypeVerifier;
import com.google.protobuf.Internal$EnumVerifier;
import java.lang.Object;
import com.kwai.video.westeros.models.EffectHintType;

public final class EffectHintType$EffectHintTypeVerifier implements Internal$EnumVerifier	// class@000f24
{
    public static final Internal$EnumVerifier INSTANCE;

    static {
       EffectHintType$EffectHintTypeVerifier.INSTANCE = new EffectHintType$EffectHintTypeVerifier();
    }
    public void EffectHintType$EffectHintTypeVerifier(){
       super();
    }
    public boolean isInRange(int p0){
       boolean b = (EffectHintType.forNumber(p0) != null)? true: false;
       return b;
    }
}
