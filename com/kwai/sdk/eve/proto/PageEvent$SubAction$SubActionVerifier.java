package com.kwai.sdk.eve.proto.PageEvent$SubAction$SubActionVerifier;
import com.google.protobuf.Internal$EnumVerifier;
import java.lang.Object;
import com.kwai.sdk.eve.proto.PageEvent$SubAction;

public final class PageEvent$SubAction$SubActionVerifier implements Internal$EnumVerifier	// class@0015f7
{
    public static final Internal$EnumVerifier INSTANCE;

    static {
       PageEvent$SubAction$SubActionVerifier.INSTANCE = new PageEvent$SubAction$SubActionVerifier();
    }
    public void PageEvent$SubAction$SubActionVerifier(){
       super();
    }
    public boolean isInRange(int p0){
       boolean b = (PageEvent$SubAction.forNumber(p0) != null)? true: false;
       return b;
    }
}
