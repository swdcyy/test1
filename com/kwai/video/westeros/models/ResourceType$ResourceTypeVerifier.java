package com.kwai.video.westeros.models.ResourceType$ResourceTypeVerifier;
import com.google.protobuf.Internal$EnumVerifier;
import java.lang.Object;
import com.kwai.video.westeros.models.ResourceType;

public final class ResourceType$ResourceTypeVerifier implements Internal$EnumVerifier	// class@00102b
{
    public static final Internal$EnumVerifier INSTANCE;

    static {
       ResourceType$ResourceTypeVerifier.INSTANCE = new ResourceType$ResourceTypeVerifier();
    }
    public void ResourceType$ResourceTypeVerifier(){
       super();
    }
    public boolean isInRange(int p0){
       boolean b = (ResourceType.forNumber(p0) != null)? true: false;
       return b;
    }
}
