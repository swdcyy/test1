package com.kwai.video.westeros.models.LiquifyType$LiquifyTypeVerifier;
import com.google.protobuf.Internal$EnumVerifier;
import java.lang.Object;
import com.kwai.video.westeros.models.LiquifyType;

public final class LiquifyType$LiquifyTypeVerifier implements Internal$EnumVerifier	// class@000f97
{
    public static final Internal$EnumVerifier INSTANCE;

    static {
       LiquifyType$LiquifyTypeVerifier.INSTANCE = new LiquifyType$LiquifyTypeVerifier();
    }
    public void LiquifyType$LiquifyTypeVerifier(){
       super();
    }
    public boolean isInRange(int p0){
       boolean b = (LiquifyType.forNumber(p0) != null)? true: false;
       return b;
    }
}
