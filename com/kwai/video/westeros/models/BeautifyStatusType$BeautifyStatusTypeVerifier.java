package com.kwai.video.westeros.models.BeautifyStatusType$BeautifyStatusTypeVerifier;
import com.google.protobuf.Internal$EnumVerifier;
import java.lang.Object;
import com.kwai.video.westeros.models.BeautifyStatusType;

public final class BeautifyStatusType$BeautifyStatusTypeVerifier implements Internal$EnumVerifier	// class@000eaf
{
    public static final Internal$EnumVerifier INSTANCE;

    static {
       BeautifyStatusType$BeautifyStatusTypeVerifier.INSTANCE = new BeautifyStatusType$BeautifyStatusTypeVerifier();
    }
    public void BeautifyStatusType$BeautifyStatusTypeVerifier(){
       super();
    }
    public boolean isInRange(int p0){
       boolean b = (BeautifyStatusType.forNumber(p0) != null)? true: false;
       return b;
    }
}
