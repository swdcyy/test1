package com.kwai.video.westeros.models.HairDyeingMode$HairDyeingModeVerifier;
import com.google.protobuf.Internal$EnumVerifier;
import java.lang.Object;
import com.kwai.video.westeros.models.HairDyeingMode;

public final class HairDyeingMode$HairDyeingModeVerifier implements Internal$EnumVerifier	// class@000f89
{
    public static final Internal$EnumVerifier INSTANCE;

    static {
       HairDyeingMode$HairDyeingModeVerifier.INSTANCE = new HairDyeingMode$HairDyeingModeVerifier();
    }
    public void HairDyeingMode$HairDyeingModeVerifier(){
       super();
    }
    public boolean isInRange(int p0){
       boolean b = (HairDyeingMode.forNumber(p0) != null)? true: false;
       return b;
    }
}
