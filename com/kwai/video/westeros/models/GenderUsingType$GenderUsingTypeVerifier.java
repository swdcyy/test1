package com.kwai.video.westeros.models.GenderUsingType$GenderUsingTypeVerifier;
import com.google.protobuf.Internal$EnumVerifier;
import java.lang.Object;
import com.kwai.video.westeros.models.GenderUsingType;

public final class GenderUsingType$GenderUsingTypeVerifier implements Internal$EnumVerifier	// class@000f7e
{
    public static final Internal$EnumVerifier INSTANCE;

    static {
       GenderUsingType$GenderUsingTypeVerifier.INSTANCE = new GenderUsingType$GenderUsingTypeVerifier();
    }
    public void GenderUsingType$GenderUsingTypeVerifier(){
       super();
    }
    public boolean isInRange(int p0){
       boolean b = (GenderUsingType.forNumber(p0) != null)? true: false;
       return b;
    }
}
