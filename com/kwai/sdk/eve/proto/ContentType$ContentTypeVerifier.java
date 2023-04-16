package com.kwai.sdk.eve.proto.ContentType$ContentTypeVerifier;
import com.google.protobuf.Internal$EnumVerifier;
import java.lang.Object;
import com.kwai.sdk.eve.proto.ContentType;

public final class ContentType$ContentTypeVerifier implements Internal$EnumVerifier	// class@0015e3
{
    public static final Internal$EnumVerifier INSTANCE;

    static {
       ContentType$ContentTypeVerifier.INSTANCE = new ContentType$ContentTypeVerifier();
    }
    public void ContentType$ContentTypeVerifier(){
       super();
    }
    public boolean isInRange(int p0){
       boolean b = (ContentType.forNumber(p0) != null)? true: false;
       return b;
    }
}
