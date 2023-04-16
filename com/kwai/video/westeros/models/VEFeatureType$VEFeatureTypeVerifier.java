package com.kwai.video.westeros.models.VEFeatureType$VEFeatureTypeVerifier;
import com.google.protobuf.Internal$EnumVerifier;
import java.lang.Object;
import com.kwai.video.westeros.models.VEFeatureType;

public final class VEFeatureType$VEFeatureTypeVerifier implements Internal$EnumVerifier	// class@001085
{
    public static final Internal$EnumVerifier INSTANCE;

    static {
       VEFeatureType$VEFeatureTypeVerifier.INSTANCE = new VEFeatureType$VEFeatureTypeVerifier();
    }
    public void VEFeatureType$VEFeatureTypeVerifier(){
       super();
    }
    public boolean isInRange(int p0){
       boolean b = (VEFeatureType.forNumber(p0) != null)? true: false;
       return b;
    }
}
