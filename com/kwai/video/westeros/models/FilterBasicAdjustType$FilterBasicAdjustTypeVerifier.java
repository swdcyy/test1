package com.kwai.video.westeros.models.FilterBasicAdjustType$FilterBasicAdjustTypeVerifier;
import com.google.protobuf.Internal$EnumVerifier;
import java.lang.Object;
import com.kwai.video.westeros.models.FilterBasicAdjustType;

public final class FilterBasicAdjustType$FilterBasicAdjustTypeVerifier implements Internal$EnumVerifier	// class@000f78
{
    public static final Internal$EnumVerifier INSTANCE;

    static {
       FilterBasicAdjustType$FilterBasicAdjustTypeVerifier.INSTANCE = new FilterBasicAdjustType$FilterBasicAdjustTypeVerifier();
    }
    public void FilterBasicAdjustType$FilterBasicAdjustTypeVerifier(){
       super();
    }
    public boolean isInRange(int p0){
       boolean b = (FilterBasicAdjustType.forNumber(p0) != null)? true: false;
       return b;
    }
}
