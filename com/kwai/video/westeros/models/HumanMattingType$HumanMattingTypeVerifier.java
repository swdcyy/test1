package com.kwai.video.westeros.models.HumanMattingType$HumanMattingTypeVerifier;
import com.google.protobuf.Internal$EnumVerifier;
import java.lang.Object;
import com.kwai.video.westeros.models.HumanMattingType;

public final class HumanMattingType$HumanMattingTypeVerifier implements Internal$EnumVerifier	// class@000f8c
{
    public static final Internal$EnumVerifier INSTANCE;

    static {
       HumanMattingType$HumanMattingTypeVerifier.INSTANCE = new HumanMattingType$HumanMattingTypeVerifier();
    }
    public void HumanMattingType$HumanMattingTypeVerifier(){
       super();
    }
    public boolean isInRange(int p0){
       boolean b = (HumanMattingType.forNumber(p0) != null)? true: false;
       return b;
    }
}
