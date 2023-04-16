package com.kwai.video.westeros.models.EffectMakeupPenTouchType$EffectMakeupPenTouchTypeVerifier;
import com.google.protobuf.Internal$EnumVerifier;
import java.lang.Object;
import com.kwai.video.westeros.models.EffectMakeupPenTouchType;

public final class EffectMakeupPenTouchType$EffectMakeupPenTouchTypeVerifier implements Internal$EnumVerifier	// class@000f35
{
    public static final Internal$EnumVerifier INSTANCE;

    static {
       EffectMakeupPenTouchType$EffectMakeupPenTouchTypeVerifier.INSTANCE = new EffectMakeupPenTouchType$EffectMakeupPenTouchTypeVerifier();
    }
    public void EffectMakeupPenTouchType$EffectMakeupPenTouchTypeVerifier(){
       super();
    }
    public boolean isInRange(int p0){
       boolean b = (EffectMakeupPenTouchType.forNumber(p0) != null)? true: false;
       return b;
    }
}
