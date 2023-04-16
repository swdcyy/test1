package com.kwai.video.westeros.models.EffectCommandType$EffectCommandTypeVerifier;
import com.google.protobuf.Internal$EnumVerifier;
import java.lang.Object;
import com.kwai.video.westeros.models.EffectCommandType;

public final class EffectCommandType$EffectCommandTypeVerifier implements Internal$EnumVerifier	// class@000f07
{
    public static final Internal$EnumVerifier INSTANCE;

    static {
       EffectCommandType$EffectCommandTypeVerifier.INSTANCE = new EffectCommandType$EffectCommandTypeVerifier();
    }
    public void EffectCommandType$EffectCommandTypeVerifier(){
       super();
    }
    public boolean isInRange(int p0){
       boolean b = (EffectCommandType.forNumber(p0) != null)? true: false;
       return b;
    }
}
