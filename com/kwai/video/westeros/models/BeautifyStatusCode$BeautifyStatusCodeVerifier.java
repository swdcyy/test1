package com.kwai.video.westeros.models.BeautifyStatusCode$BeautifyStatusCodeVerifier;
import com.google.protobuf.Internal$EnumVerifier;
import java.lang.Object;
import com.kwai.video.westeros.models.BeautifyStatusCode;

public final class BeautifyStatusCode$BeautifyStatusCodeVerifier implements Internal$EnumVerifier	// class@000eac
{
    public static final Internal$EnumVerifier INSTANCE;

    static {
       BeautifyStatusCode$BeautifyStatusCodeVerifier.INSTANCE = new BeautifyStatusCode$BeautifyStatusCodeVerifier();
    }
    public void BeautifyStatusCode$BeautifyStatusCodeVerifier(){
       super();
    }
    public boolean isInRange(int p0){
       boolean b = (BeautifyStatusCode.forNumber(p0) != null)? true: false;
       return b;
    }
}
