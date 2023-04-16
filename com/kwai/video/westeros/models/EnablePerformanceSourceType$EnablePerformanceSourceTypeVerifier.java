package com.kwai.video.westeros.models.EnablePerformanceSourceType$EnablePerformanceSourceTypeVerifier;
import com.google.protobuf.Internal$EnumVerifier;
import java.lang.Object;
import com.kwai.video.westeros.models.EnablePerformanceSourceType;

public final class EnablePerformanceSourceType$EnablePerformanceSourceTypeVerifier implements Internal$EnumVerifier	// class@000f4e
{
    public static final Internal$EnumVerifier INSTANCE;

    static {
       EnablePerformanceSourceType$EnablePerformanceSourceTypeVerifier.INSTANCE = new EnablePerformanceSourceType$EnablePerformanceSourceTypeVerifier();
    }
    public void EnablePerformanceSourceType$EnablePerformanceSourceTypeVerifier(){
       super();
    }
    public boolean isInRange(int p0){
       boolean b = (EnablePerformanceSourceType.forNumber(p0) != null)? true: false;
       return b;
    }
}
