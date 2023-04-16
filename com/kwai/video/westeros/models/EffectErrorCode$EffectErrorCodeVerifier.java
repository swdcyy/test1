package com.kwai.video.westeros.models.EffectErrorCode$EffectErrorCodeVerifier;
import com.google.protobuf.Internal$EnumVerifier;
import java.lang.Object;
import com.kwai.video.westeros.models.EffectErrorCode;

public final class EffectErrorCode$EffectErrorCodeVerifier implements Internal$EnumVerifier	// class@000f1c
{
    public static final Internal$EnumVerifier INSTANCE;

    static {
       EffectErrorCode$EffectErrorCodeVerifier.INSTANCE = new EffectErrorCode$EffectErrorCodeVerifier();
    }
    public void EffectErrorCode$EffectErrorCodeVerifier(){
       super();
    }
    public boolean isInRange(int p0){
       boolean b = (EffectErrorCode.forNumber(p0) != null)? true: false;
       return b;
    }
}
