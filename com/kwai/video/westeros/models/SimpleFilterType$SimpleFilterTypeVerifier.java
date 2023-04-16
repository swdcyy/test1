package com.kwai.video.westeros.models.SimpleFilterType$SimpleFilterTypeVerifier;
import com.google.protobuf.Internal$EnumVerifier;
import java.lang.Object;
import com.kwai.video.westeros.models.SimpleFilterType;

public final class SimpleFilterType$SimpleFilterTypeVerifier implements Internal$EnumVerifier	// class@001042
{
    public static final Internal$EnumVerifier INSTANCE;

    static {
       SimpleFilterType$SimpleFilterTypeVerifier.INSTANCE = new SimpleFilterType$SimpleFilterTypeVerifier();
    }
    public void SimpleFilterType$SimpleFilterTypeVerifier(){
       super();
    }
    public boolean isInRange(int p0){
       boolean b = (SimpleFilterType.forNumber(p0) != null)? true: false;
       return b;
    }
}
