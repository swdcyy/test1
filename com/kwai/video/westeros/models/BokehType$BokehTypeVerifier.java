package com.kwai.video.westeros.models.BokehType$BokehTypeVerifier;
import com.google.protobuf.Internal$EnumVerifier;
import java.lang.Object;
import com.kwai.video.westeros.models.BokehType;

public final class BokehType$BokehTypeVerifier implements Internal$EnumVerifier	// class@000ecd
{
    public static final Internal$EnumVerifier INSTANCE;

    static {
       BokehType$BokehTypeVerifier.INSTANCE = new BokehType$BokehTypeVerifier();
    }
    public void BokehType$BokehTypeVerifier(){
       super();
    }
    public boolean isInRange(int p0){
       boolean b = (BokehType.forNumber(p0) != null)? true: false;
       return b;
    }
}
