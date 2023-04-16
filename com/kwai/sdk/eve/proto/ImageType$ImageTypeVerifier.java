package com.kwai.sdk.eve.proto.ImageType$ImageTypeVerifier;
import com.google.protobuf.Internal$EnumVerifier;
import java.lang.Object;
import com.kwai.sdk.eve.proto.ImageType;

public final class ImageType$ImageTypeVerifier implements Internal$EnumVerifier	// class@0015ef
{
    public static final Internal$EnumVerifier INSTANCE;

    static {
       ImageType$ImageTypeVerifier.INSTANCE = new ImageType$ImageTypeVerifier();
    }
    public void ImageType$ImageTypeVerifier(){
       super();
    }
    public boolean isInRange(int p0){
       boolean b = (ImageType.forNumber(p0) != null)? true: false;
       return b;
    }
}
