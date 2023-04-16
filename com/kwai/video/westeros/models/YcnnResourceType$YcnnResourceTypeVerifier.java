package com.kwai.video.westeros.models.YcnnResourceType$YcnnResourceTypeVerifier;
import com.google.protobuf.Internal$EnumVerifier;
import java.lang.Object;
import com.kwai.video.westeros.models.YcnnResourceType;

public final class YcnnResourceType$YcnnResourceTypeVerifier implements Internal$EnumVerifier	// class@0010ad
{
    public static final Internal$EnumVerifier INSTANCE;

    static {
       YcnnResourceType$YcnnResourceTypeVerifier.INSTANCE = new YcnnResourceType$YcnnResourceTypeVerifier();
    }
    public void YcnnResourceType$YcnnResourceTypeVerifier(){
       super();
    }
    public boolean isInRange(int p0){
       boolean b = (YcnnResourceType.forNumber(p0) != null)? true: false;
       return b;
    }
}
