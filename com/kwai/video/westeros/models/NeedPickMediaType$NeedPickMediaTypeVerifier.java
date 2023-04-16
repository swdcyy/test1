package com.kwai.video.westeros.models.NeedPickMediaType$NeedPickMediaTypeVerifier;
import com.google.protobuf.Internal$EnumVerifier;
import java.lang.Object;
import com.kwai.video.westeros.models.NeedPickMediaType;

public final class NeedPickMediaType$NeedPickMediaTypeVerifier implements Internal$EnumVerifier	// class@000fe9
{
    public static final Internal$EnumVerifier INSTANCE;

    static {
       NeedPickMediaType$NeedPickMediaTypeVerifier.INSTANCE = new NeedPickMediaType$NeedPickMediaTypeVerifier();
    }
    public void NeedPickMediaType$NeedPickMediaTypeVerifier(){
       super();
    }
    public boolean isInRange(int p0){
       boolean b = (NeedPickMediaType.forNumber(p0) != null)? true: false;
       return b;
    }
}
