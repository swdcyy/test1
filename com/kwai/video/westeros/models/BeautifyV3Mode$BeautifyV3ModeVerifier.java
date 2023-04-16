package com.kwai.video.westeros.models.BeautifyV3Mode$BeautifyV3ModeVerifier;
import com.google.protobuf.Internal$EnumVerifier;
import java.lang.Object;
import com.kwai.video.westeros.models.BeautifyV3Mode;

public final class BeautifyV3Mode$BeautifyV3ModeVerifier implements Internal$EnumVerifier	// class@000eb2
{
    public static final Internal$EnumVerifier INSTANCE;

    static {
       BeautifyV3Mode$BeautifyV3ModeVerifier.INSTANCE = new BeautifyV3Mode$BeautifyV3ModeVerifier();
    }
    public void BeautifyV3Mode$BeautifyV3ModeVerifier(){
       super();
    }
    public boolean isInRange(int p0){
       boolean b = (BeautifyV3Mode.forNumber(p0) != null)? true: false;
       return b;
    }
}
