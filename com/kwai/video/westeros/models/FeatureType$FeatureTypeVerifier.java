package com.kwai.video.westeros.models.FeatureType$FeatureTypeVerifier;
import com.google.protobuf.Internal$EnumVerifier;
import java.lang.Object;
import com.kwai.video.westeros.models.FeatureType;

public final class FeatureType$FeatureTypeVerifier implements Internal$EnumVerifier	// class@000f71
{
    public static final Internal$EnumVerifier INSTANCE;

    static {
       FeatureType$FeatureTypeVerifier.INSTANCE = new FeatureType$FeatureTypeVerifier();
    }
    public void FeatureType$FeatureTypeVerifier(){
       super();
    }
    public boolean isInRange(int p0){
       boolean b = (FeatureType.forNumber(p0) != null)? true: false;
       return b;
    }
}
