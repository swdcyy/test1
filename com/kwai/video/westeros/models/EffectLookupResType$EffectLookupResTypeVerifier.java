package com.kwai.video.westeros.models.EffectLookupResType$EffectLookupResTypeVerifier;
import com.google.protobuf.Internal$EnumVerifier;
import java.lang.Object;
import com.kwai.video.westeros.models.EffectLookupResType;

public final class EffectLookupResType$EffectLookupResTypeVerifier implements Internal$EnumVerifier	// class@000f2b
{
    public static final Internal$EnumVerifier INSTANCE;

    static {
       EffectLookupResType$EffectLookupResTypeVerifier.INSTANCE = new EffectLookupResType$EffectLookupResTypeVerifier();
    }
    public void EffectLookupResType$EffectLookupResTypeVerifier(){
       super();
    }
    public boolean isInRange(int p0){
       boolean b = (EffectLookupResType.forNumber(p0) != null)? true: false;
       return b;
    }
}
