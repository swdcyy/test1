package com.kwai.video.westeros.models.EffectMakeupPenBrushType$EffectMakeupPenBrushTypeVerifier;
import com.google.protobuf.Internal$EnumVerifier;
import java.lang.Object;
import com.kwai.video.westeros.models.EffectMakeupPenBrushType;

public final class EffectMakeupPenBrushType$EffectMakeupPenBrushTypeVerifier implements Internal$EnumVerifier	// class@000f32
{
    public static final Internal$EnumVerifier INSTANCE;

    static {
       EffectMakeupPenBrushType$EffectMakeupPenBrushTypeVerifier.INSTANCE = new EffectMakeupPenBrushType$EffectMakeupPenBrushTypeVerifier();
    }
    public void EffectMakeupPenBrushType$EffectMakeupPenBrushTypeVerifier(){
       super();
    }
    public boolean isInRange(int p0){
       boolean b = (EffectMakeupPenBrushType.forNumber(p0) != null)? true: false;
       return b;
    }
}
