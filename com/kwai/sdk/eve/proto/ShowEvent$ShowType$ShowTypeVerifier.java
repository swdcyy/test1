package com.kwai.sdk.eve.proto.ShowEvent$ShowType$ShowTypeVerifier;
import com.google.protobuf.Internal$EnumVerifier;
import java.lang.Object;
import com.kwai.sdk.eve.proto.ShowEvent$ShowType;

public final class ShowEvent$ShowType$ShowTypeVerifier implements Internal$EnumVerifier	// class@001605
{
    public static final Internal$EnumVerifier INSTANCE;

    static {
       ShowEvent$ShowType$ShowTypeVerifier.INSTANCE = new ShowEvent$ShowType$ShowTypeVerifier();
    }
    public void ShowEvent$ShowType$ShowTypeVerifier(){
       super();
    }
    public boolean isInRange(int p0){
       boolean b = (ShowEvent$ShowType.forNumber(p0) != null)? true: false;
       return b;
    }
}
