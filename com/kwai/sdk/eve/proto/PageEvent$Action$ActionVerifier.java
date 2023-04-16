package com.kwai.sdk.eve.proto.PageEvent$Action$ActionVerifier;
import com.google.protobuf.Internal$EnumVerifier;
import java.lang.Object;
import com.kwai.sdk.eve.proto.PageEvent$Action;

public final class PageEvent$Action$ActionVerifier implements Internal$EnumVerifier	// class@0015f3
{
    public static final Internal$EnumVerifier INSTANCE;

    static {
       PageEvent$Action$ActionVerifier.INSTANCE = new PageEvent$Action$ActionVerifier();
    }
    public void PageEvent$Action$ActionVerifier(){
       super();
    }
    public boolean isInRange(int p0){
       boolean b = (PageEvent$Action.forNumber(p0) != null)? true: false;
       return b;
    }
}
