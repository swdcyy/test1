package com.kwai.video.westeros.models.ARSpec$ARSpecVerifier;
import com.google.protobuf.Internal$EnumVerifier;
import java.lang.Object;
import com.kwai.video.westeros.models.ARSpec;

public final class ARSpec$ARSpecVerifier implements Internal$EnumVerifier	// class@000e92
{
    public static final Internal$EnumVerifier INSTANCE;

    static {
       ARSpec$ARSpecVerifier.INSTANCE = new ARSpec$ARSpecVerifier();
    }
    public void ARSpec$ARSpecVerifier(){
       super();
    }
    public boolean isInRange(int p0){
       boolean b = (ARSpec.forNumber(p0) != null)? true: false;
       return b;
    }
}
