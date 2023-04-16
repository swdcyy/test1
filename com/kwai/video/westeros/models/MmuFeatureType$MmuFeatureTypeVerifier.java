package com.kwai.video.westeros.models.MmuFeatureType$MmuFeatureTypeVerifier;
import com.google.protobuf.Internal$EnumVerifier;
import java.lang.Object;
import com.kwai.video.westeros.models.MmuFeatureType;

public final class MmuFeatureType$MmuFeatureTypeVerifier implements Internal$EnumVerifier	// class@000fd6
{
    public static final Internal$EnumVerifier INSTANCE;

    static {
       MmuFeatureType$MmuFeatureTypeVerifier.INSTANCE = new MmuFeatureType$MmuFeatureTypeVerifier();
    }
    public void MmuFeatureType$MmuFeatureTypeVerifier(){
       super();
    }
    public boolean isInRange(int p0){
       boolean b = (MmuFeatureType.forNumber(p0) != null)? true: false;
       return b;
    }
}
