package com.kwai.video.westeros.models.BokehQuality$BokehQualityVerifier;
import com.google.protobuf.Internal$EnumVerifier;
import java.lang.Object;
import com.kwai.video.westeros.models.BokehQuality;

public final class BokehQuality$BokehQualityVerifier implements Internal$EnumVerifier	// class@000eca
{
    public static final Internal$EnumVerifier INSTANCE;

    static {
       BokehQuality$BokehQualityVerifier.INSTANCE = new BokehQuality$BokehQualityVerifier();
    }
    public void BokehQuality$BokehQualityVerifier(){
       super();
    }
    public boolean isInRange(int p0){
       boolean b = (BokehQuality.forNumber(p0) != null)? true: false;
       return b;
    }
}
