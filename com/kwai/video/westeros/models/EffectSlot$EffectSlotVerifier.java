package com.kwai.video.westeros.models.EffectSlot$EffectSlotVerifier;
import com.google.protobuf.Internal$EnumVerifier;
import java.lang.Object;
import com.kwai.video.westeros.models.EffectSlot;

public final class EffectSlot$EffectSlotVerifier implements Internal$EnumVerifier	// class@000f44
{
    public static final Internal$EnumVerifier INSTANCE;

    static {
       EffectSlot$EffectSlotVerifier.INSTANCE = new EffectSlot$EffectSlotVerifier();
    }
    public void EffectSlot$EffectSlotVerifier(){
       super();
    }
    public boolean isInRange(int p0){
       boolean b = (EffectSlot.forNumber(p0) != null)? true: false;
       return b;
    }
}
