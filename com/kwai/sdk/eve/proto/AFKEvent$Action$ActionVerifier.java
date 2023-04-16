package com.kwai.sdk.eve.proto.AFKEvent$Action$ActionVerifier;
import com.google.protobuf.Internal$EnumVerifier;
import java.lang.Object;
import com.kwai.sdk.eve.proto.AFKEvent$Action;

public final class AFKEvent$Action$ActionVerifier implements Internal$EnumVerifier	// class@0015d6
{
    public static final Internal$EnumVerifier INSTANCE;

    static {
       AFKEvent$Action$ActionVerifier.INSTANCE = new AFKEvent$Action$ActionVerifier();
    }
    public void AFKEvent$Action$ActionVerifier(){
       super();
    }
    public boolean isInRange(int p0){
       boolean b = (AFKEvent$Action.forNumber(p0) != null)? true: false;
       return b;
    }
}
