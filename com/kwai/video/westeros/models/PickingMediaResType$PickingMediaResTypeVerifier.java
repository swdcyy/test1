package com.kwai.video.westeros.models.PickingMediaResType$PickingMediaResTypeVerifier;
import com.google.protobuf.Internal$EnumVerifier;
import java.lang.Object;
import com.kwai.video.westeros.models.PickingMediaResType;

public final class PickingMediaResType$PickingMediaResTypeVerifier implements Internal$EnumVerifier	// class@001000
{
    public static final Internal$EnumVerifier INSTANCE;

    static {
       PickingMediaResType$PickingMediaResTypeVerifier.INSTANCE = new PickingMediaResType$PickingMediaResTypeVerifier();
    }
    public void PickingMediaResType$PickingMediaResTypeVerifier(){
       super();
    }
    public boolean isInRange(int p0){
       boolean b = (PickingMediaResType.forNumber(p0) != null)? true: false;
       return b;
    }
}
