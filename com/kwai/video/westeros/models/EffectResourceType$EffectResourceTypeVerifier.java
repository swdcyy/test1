package com.kwai.video.westeros.models.EffectResourceType$EffectResourceTypeVerifier;
import com.google.protobuf.Internal$EnumVerifier;
import java.lang.Object;
import com.kwai.video.westeros.models.EffectResourceType;

public final class EffectResourceType$EffectResourceTypeVerifier implements Internal$EnumVerifier	// class@000f41
{
    public static final Internal$EnumVerifier INSTANCE;

    static {
       EffectResourceType$EffectResourceTypeVerifier.INSTANCE = new EffectResourceType$EffectResourceTypeVerifier();
    }
    public void EffectResourceType$EffectResourceTypeVerifier(){
       super();
    }
    public boolean isInRange(int p0){
       boolean b = (EffectResourceType.forNumber(p0) != null)? true: false;
       return b;
    }
}
