package com.kwai.video.westeros.models.BodySlimmingAdjustType$BodySlimmingAdjustTypeVerifier;
import com.google.protobuf.Internal$EnumVerifier;
import java.lang.Object;
import com.kwai.video.westeros.models.BodySlimmingAdjustType;

public final class BodySlimmingAdjustType$BodySlimmingAdjustTypeVerifier implements Internal$EnumVerifier	// class@000ebf
{
    public static final Internal$EnumVerifier INSTANCE;

    static {
       BodySlimmingAdjustType$BodySlimmingAdjustTypeVerifier.INSTANCE = new BodySlimmingAdjustType$BodySlimmingAdjustTypeVerifier();
    }
    public void BodySlimmingAdjustType$BodySlimmingAdjustTypeVerifier(){
       super();
    }
    public boolean isInRange(int p0){
       boolean b = (BodySlimmingAdjustType.forNumber(p0) != null)? true: false;
       return b;
    }
}
